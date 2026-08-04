# D3 Task 3 — AI-Assisted Test Generation Report

**Author:** Jasveer (State pattern — booking lifecycle, Req3/4/5/8/9)
**Classes under test:** `Chief_event_coordinator.State.*`
(`PendingState`, `ConfirmedState`, `CheckedInState`, `ExtendedState`,
`CancelledState`, `NoShowState`, `AbstractBookingState`, `BookingStateFactory`,
`IllegalBookingTransitionException`) plus the state-delegation methods on
`Chief_event_coordinator.Classes.Booking`.

**AI assistant used:** Claude (Anthropic), accessed through Claude Code.

**Files in this folder**
| File | What it is |
|------|------------|
| `state/StateAiTest.java` | Final, corrected AI test suite (30 tests, all passing). Measured for coverage. |
| `_drafts/StateAiTest_v1.java.txt` | Raw first-draft AI output (Prompt #1), kept verbatim. Does **not** compile — that is the point. |
| `_drafts/StateAiTest_v2.java.txt` | Draft after fixing only the compile errors (still has the logic bugs), used to capture the runtime/assertion failures. |
| `AI_TEST_REPORT.md` | This document. |

The drafts are stored with a `.txt` extension on purpose so a non-compiling /
failing file is not pulled into the project build; they exist only as evidence.

---

## 1. Methodology

I generated the suite iteratively. Each prompt produced output that I compiled
and ran against the real classes, then I fed the concrete failures back to the
assistant. Three prompt iterations were needed before every test passed and was
verified correct.

---

## 2. The prompts, and how the AI responded

### Prompt #1 (deliberately minimal — what a first attempt usually looks like)

> "Write JUnit tests for a Booking State-pattern in Java. The states are
> PendingState, ConfirmedState, CheckedInState, ExtendedState, CancelledState,
> NoShowState, plus an AbstractBookingState, a BookingStateFactory, and an
> IllegalBookingTransitionException. The context class is Booking. Cover the
> transitions and the illegal ones."

**AI response:** produced `StateAiTest_v1` — 13 tests, JUnit 5, reasonable
structure and naming. But because the prompt gave no source, the AI *guessed*
the API and some of the state-machine rules. It assumed a `new Booking("b1")`
constructor, a `getBookingState()` accessor, a `new Room()` no-arg constructor,
and several transitions that do not exist.

**Result: 8 compile errors** (captured, see §4.1). The suite did not build.

### Prompt #2 (refinement — supply the real API)

After reading the failures I gave the assistant the actual signatures:

> "Corrections: `Booking` has no id-only constructor — use
> `new Booking(String id, Room room)`. `Room` has no no-arg constructor — use
> `new Room(int id)`. The accessor is `getState()`, not `getBookingState()`.
> Regenerate using only these real APIs."

**AI response:** produced `StateAiTest_v2` — the compile errors were gone and the
file built cleanly. **But 4 tests now failed at run time**, because the AI's
*assumptions about the state machine* were still wrong (see §4.2).

### Prompt #3 (refinement — supply the transition rules and exact messages)

> "The state machine rules are: PENDING → {confirmDeposit→CONFIRMED,
> cancel→CANCELLED}; a no-show is only legal from CONFIRMED; a CHECKED_IN booking
> can no longer be cancelled; EXTENDED can be extended again (it stays EXTENDED).
> Rejections throw `IllegalBookingTransitionException` with the message
> `\"Cannot <action> a booking in state <STATUS>.\"` where the action for checkIn
> is the words \"check in\" (with a space). Fix the failing tests and add tests
> for the remaining states and every factory mapping."

**AI response:** produced the final `state/StateAiTest.java` — corrected the four
logic errors, fixed the message string, and expanded to 30 tests covering all
six concrete states, the abstract default, every factory mapping, and the
exception class. **All 30 pass**, verified against the real classes.

---

## 3. Accept / Modify / Reject decisions

Every test the AI produced across the iterations, and what I did with it:

| # | AI-generated test (v1 name) | Decision | Reason |
|---|------------------------------|----------|--------|
| 1 | testPendingConfirmDeposit | **Modify** | Logic correct; only the fake `Booking(String)` constructor needed fixing. |
| 2 | testPendingCancel | **Modify** | Same constructor fix. |
| 3 | testPendingMarkNoShow | **Reject → rewrite** | Wrong rule: expected PENDING→NO_SHOW. A no-show is only legal from CONFIRMED. Rewrote to assert it is rejected. |
| 4 | testConfirmedCheckIn | **Modify** | Correct, but used a non-existent `getBookingState()`; changed to `getState()`. |
| 5 | testCheckedInCanCancel | **Reject → rewrite** | Wrong rule: a checked-in booking cannot be cancelled (Req8). Rewrote to assert rejection. |
| 6 | testExtendedCannotExtendAgain | **Reject → rewrite** | Wrong rule: EXTENDED *is* repeatable. Rewrote to assert it stays EXTENDED. |
| 7 | testPendingCheckInRejected | **Modify** | Right idea, wrong expected string (`"checkIn"` vs `"check in"`). Fixed the message. |
| 8 | testCancelledIsTerminal | **Accept** | Correct as generated. |
| 9 | testNoShowIsTerminal | **Accept** | Correct as generated. |
| 10 | testFactoryPending | **Accept** | Correct. |
| 11 | testFactoryConfirmed | **Accept** | Correct. |
| 12 | testFactoryExtended | **Accept** | Correct. |
| 13 | testExceptionMessage | **Accept** | Correct. |
| 14–30 | (added in Prompt #3: Confirmed markNoShow/cancel, CheckedIn extend/status, Extended cancel, Cancelled/NoShow rejects, Abstract default, factory CheckedIn/Cancelled/NoShow/Active, exception-is-runtime) | **Accept** | Generated correctly once the rules were supplied. |

**Summary:** of the 13 first-draft tests, **6 accepted as-is, 4 modified
(API fixes), 3 rejected and rewritten** for wrong behaviour. The 17 tests added
in the final round were all correct on generation.

---

## 4. Concrete failures (with real tool output)

### 4.1 Failed to compile (Prompt #1 output)

```
StateAiTest_v1.java:37: error: no suitable constructor found for Booking(String)
        Booking booking = new Booking("b1");
    constructor Booking.Booking(String,Room) is not applicable
      (actual and formal argument lists differ in length)
StateAiTest_v1.java:61: error: cannot find symbol
        assertTrue(booking.getBookingState() instanceof CheckedInState);
  symbol:   method getBookingState()
StateAiTest_v1.java:85: error: no suitable constructor found for Room(no arguments)
        Room room = new Room();
...
8 errors
```

*Cause:* the AI hallucinated an id-only `Booking` constructor, a no-arg `Room`
constructor, and a `getBookingState()` method. **Reliability impact:** none of
these tests could run, so they would have contributed **0% coverage** and given
a false sense that "tests exist".

### 4.2 Compiled but failed at run time (Prompt #2 output)

```
testPendingCheckInRejected()  ✘  expected: <Cannot checkIn a booking in state PENDING.>
                                   but was: <Cannot check in a booking in state PENDING.>
testExtendedCannotExtendAgain() ✘ Expected IllegalBookingTransitionException to be thrown,
                                   but nothing was thrown.
testPendingMarkNoShow()       ✘  IllegalBookingTransitionException:
                                   Cannot mark no-show a booking in state PENDING.
testCheckedInCanCancel()      ✘  IllegalBookingTransitionException:
                                   Cannot cancel a booking in state CHECKED_IN.
```

*Two of these are **assertion failures*** (wrong expected value): the message
string, and the false assumption that EXTENDED is terminal. *Two are **runtime
errors*** where the AI drove the booking through a transition the state machine
forbids (PENDING→NO_SHOW, and cancelling after check-in).

**Reliability impact:** the two "expected success" bugs are the dangerous kind —
had they been accepted, the suite would have *encoded incorrect behaviour as the
expected behaviour*, so a future correct change to the code would look like a
regression. This is exactly why the AI output had to be checked against the
source, not trusted.

### 4.3 Successful, meaningful tests (final suite)

Examples that passed and add real value:

```java
// legal transition, verified against Booking + ConfirmedState
@Test public void testConfirmedMarkNoShowGoesToNoShow() {
    Booking booking = newBooking();
    booking.confirmDeposit();
    booking.markNoShow();
    assertTrue(booking.getState() instanceof NoShowState);
}

// corrected rule: EXTENDED is repeatable and stays EXTENDED
@Test public void testExtendedCanExtendAgain() {
    Booking booking = newBooking();
    booking.confirmDeposit(); booking.checkIn(); booking.extend(); booking.extend();
    assertEquals(BookingStatus.EXTENDED, booking.getStatus());
}
```

---

## 5. Where my understanding differed from the AI's

The conflicts were all about the *domain rules*, not the code mechanics:

1. **No-show from PENDING.** The AI modelled a no-show as reachable any time
   before check-in. My understanding (from Req4) is that a no-show only makes
   sense once a deposit has been paid — i.e. only from CONFIRMED. **Resolution:**
   confirmed against `PendingState.java` (it does not override `markNoShow`, so
   the abstract default rejects it). The AI was wrong; test rewritten.
2. **Cancelling after check-in.** The AI assumed cancel is always available. Req8
   allows cancellation only *before the start time*, and `CheckedInState` does
   not override `cancel()`. **Resolution:** verified in source; test rewritten to
   expect rejection.
3. **Extending an already-extended booking.** The AI assumed EXTENDED was
   terminal. `ExtendedState.extend()` explicitly transitions to a new
   `ExtendedState` so observers are notified of each extra hour. **Resolution:**
   verified in source; test rewritten to expect it stays EXTENDED.

In every conflict I treated the production source as ground truth and adjusted
the AI's test, never the other way around.

## 6. How correctness was verified

- Compiled every draft against the real compiled classes (`--release 21`).
- Ran each draft on the JUnit 5 console launcher and read the pass/fail tree.
- For each disputed transition, opened the corresponding `*State.java` to confirm
  which actions it overrides (legal) vs. inherits from `AbstractBookingState`
  (rejected).
- Re-ran the final suite under JaCoCo to confirm coverage (below).

## 7. Final coverage

The corrected AI suite (`state/StateAiTest.java`) — **30 tests, all passing** —
achieves **81.2% instruction coverage** on the `Chief_event_coordinator.State`
package (screenshot: `AI_assistant/coverage-ai.png`). The uncovered
remainder is the same structurally-unreachable code every suite hits: JaCoCo's
always-throws probe artifact on the one-line delegator methods, and the dead
`default:` branch in `BookingStateFactory`.

## 8. Reflection — strengths, limitations, lessons

**Strengths.** The AI was fast at scaffolding: naming conventions, JUnit
structure, `assertThrows` usage, and the *mechanical* half of the tests (factory
mappings, terminal-state rejections, the exception class) were correct on the
first or second try. It covered breadth quickly once given the rules.

**Limitations.** Without the source it hallucinated APIs (fake constructors, a
non-existent accessor) and, more importantly, it invented plausible-but-wrong
*domain rules*. The most dangerous outputs were the tests that **passed a wrong
expectation as correct** — those would have baked incorrect behaviour into the
suite. Coverage alone would not have caught this; only reading the source did.

**Lessons.**
1. AI test generation is only as good as the context it is given — supplying the
   real signatures and the state-machine rules turned a broken suite into a
   correct one.
2. Always compile *and run* AI tests against the real code, and diff the
   assertions against the source; a green suite that encodes the wrong behaviour
   is worse than no suite.
3. AI is best used to generate the tedious, mechanical tests and to broaden
   coverage, with a human owning the correctness of every non-trivial assertion.
