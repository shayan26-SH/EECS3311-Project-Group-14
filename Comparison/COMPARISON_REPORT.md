# D3 Task 4 — Comparing the three test suites

**By:** Jasveer
**Classes I'm testing:** my State pattern for the booking lifecycle
(`Chief_event_coordinator.State.*` — `PendingState`, `ConfirmedState`,
`CheckedInState`, `ExtendedState`, `CancelledState`, `NoShowState`,
`AbstractBookingState`, `BookingStateFactory`,
`IllegalBookingTransitionException`), plus the state methods on `Booking`.

This is the comparison between the three test suites I built for these classes:
my own hand-written JUnit tests, the tests Randoop generated, and the tests I
got out of an AI assistant. I look at four things the deliverable asks for:
coverage, mutation score, readability and usefulness.

Quick note on tools: I measured line/branch coverage with JaCoCo (that's what
EclEmma uses under the hood) and mutation score with PITest. Both are pointed
only at my State package so the numbers are about my classes and nothing else.

Where the suites live:
- Manual: `Test/state_manual/` (10 test classes, 102 tests)
- Randoop: `Randoop/state/` (2 generated classes, 542 tests)
- AI: `AI_assistant/state/StateAiTest.java` (30 tests)

---

## The numbers up front

| | Manual | Randoop | AI |
|---|---|---|---|
| Number of tests | 102 | 542 | 30 |
| Instruction coverage (JaCoCo) | 81% | 81% | 81% |
| Line coverage on mutated classes (PITest) | 84% | 84% | 84% |
| Mutants generated | 24 | 24 | 24 |
| Mutants killed | 24 | 24 | 22 |
| **Mutation score** | **100%** | **100%** | **92%** |

Screenshots for all of this are in `Comparison/images/` (coverage-*.png and
mutation-*.png).

---

## 1. Code coverage

All three suites land on the exact same 81% instruction coverage, which
honestly surprised me at first. When I dug into what's left uncovered, it turns
out none of the three can do any better, and it's not their fault:

1. **The always-throws methods.** My concrete states delegate the illegal
   actions to `reject()` in `AbstractBookingState`, and `reject()` always
   throws. JaCoCo puts its coverage probe at the *normal* end of a method, and a
   method that always throws never gets there, so it shows the one-line
   `checkIn()`/`extend()`/etc. delegators as "not covered" even though the tests
   absolutely run them (you can see `reject()` itself is 100% green). This is a
   JaCoCo quirk, not a hole in the tests.
2. **The dead `default:` branch in `BookingStateFactory`.** The switch already
   handles every value of the `BookingStatus` enum, so the `default:` that
   throws is unreachable. No test can hit it because you can't build an enum
   value that isn't in the enum.

So coverage on its own is a bit of a dead heat and doesn't really tell them
apart. That's the whole reason mutation score matters here.

## 2. Mutation score

This is where they actually split. PITest generated 24 mutants across my State
classes (they're small classes, so 24 is all there is). Two kinds of mutant show
up: removing a `void` call (so a transition like `booking.changeState(...)`
silently does nothing) and making a method return `null` (so `getStatus()` or
`fromStatus()` returns null instead of the real value).

- **Manual: 24/24 (100%).**
- **Randoop: 24/24 (100%).** I didn't expect this. But it makes sense — Randoop
  wrote 542 tests and it slaps a regression assertion on basically everything it
  touches, including the exact `getStatus()` value and the state object type
  after every call. With that much brute force it ends up pinning down every
  mutant, even if the tests are unreadable.
- **AI: 22/24 (92%).** The AI suite missed two:
  1. `ConfirmedState.getStatus()` returning null. My AI tests check the
     transitions by asserting the *state object type* (`instanceof
     ConfirmedState`) but I never wrote a plain
     `assertEquals(CONFIRMED, new ConfirmedState().getStatus())`, so nothing
     noticed when `getStatus()` was changed to return null.
  2. `ExtendedState.extend()` with its `changeState` call removed. My AI test
     `testExtendedCanExtendAgain` only checks the status is still EXTENDED after
     extending again — but if the transition does nothing, it's *also* still
     EXTENDED, so the test passes anyway and the mutant lives.

The second one is the interesting bit for the "usefulness" question below. My
manual suite kills that same mutant because `extendingAgainSwapsTheStateObject`
uses `assertNotSame` to check a brand-new state object got swapped in — so if
the transition silently does nothing, that test fails and the mutant dies.

### Manual mutation calculation (a few classes by hand)

The deliverable also wants a couple of classes worked out by hand instead of
just trusting PITest, so here's the manual math for three of them against my
own suite. Mutation score = killed / (total − equivalent).

**PendingState — 3 mutants**
| Mutant | What it does | Killed? | By which test |
|---|---|---|---|
| `confirmDeposit` void-call removed | staying PENDING instead of going CONFIRMED | Yes | `confirmDepositGoesToConfirmed` asserts it becomes `ConfirmedState` |
| `cancel` void-call removed | staying PENDING instead of CANCELLED | Yes | `cancelGoesToCancelled` asserts CANCELLED |
| `getStatus` returns null | null instead of PENDING | Yes | `statusIsPending` asserts equals PENDING |

3 killed / 3 = **100%**.

**BookingStateFactory — 6 mutants** (one `null`-return per switch case)
Every case is covered by a factory test that asserts the returned object is an
`instanceof` the right state. `null instanceof X` is false, so each null-return
mutant fails its test and dies. 6 killed / 6 = **100%**.

**ExtendedState — 2 mutants**
| Mutant | Killed by manual? | Killed by AI? |
|---|---|---|
| `extend` void-call removed | Yes — `extendingAgainSwapsTheStateObject` (`assertNotSame`) | **No** — AI test only checks status stayed EXTENDED |
| `getStatus` returns null | Yes — `statusIsExtended` | Yes |

Manual = 2/2 (**100%**), AI = 1/2 (**50%**) on this class. This one class is
basically the whole 100% vs 92% gap.

My hand numbers match what PITest reported, which is a good sanity check.

## 3. Readability

This is where the manual and AI suites win big and Randoop loses badly.

- **Manual.** One small test class per state, tests named after the behaviour
  (`cannotCancelAfterCheckIn`, `confirmDepositGoesToConfirmed`), a couple of
  `//` comments where something is non-obvious. If a test breaks you know
  exactly what's wrong from the name. Around 10 tests per class.
- **AI.** Also pretty readable — clear `testXxx` names, one file, grouped by
  state with header comments. A bit more verbose than mine but easy to follow.
- **Randoop.** Basically unreadable. It's two machine-generated files with 542
  tests full of things like `var0`, `var3`, long chains of setup calls and
  auto-generated comments. Here's a real taste of it:

  ```java
  @Test
  public void test005() throws Throwable {
      NoShowState noShowState0 = new Chief_event_coordinator.State.NoShowState();
      BookingStatus bookingStatus1 = noShowState0.getStatus();
      BookingState bookingState2 = BookingStateFactory.fromStatus(bookingStatus1);
      org.junit.Assert.assertTrue("'" + bookingStatus1 + "' != '" + ... NO_SHOW ...);
      // Regression assertion (captures the current behavior of the code)
      org.junit.Assert.assertNotNull(bookingState2);
  }
  ```

  (that's a real one from `StateRegressionTest0.java`, only the package prefixes
  trimmed so it fits.) The name is `test005`, and the last line just says "this
  isn't null". You cannot look at it and tell what rule it's checking. If one
  fails you'd have no idea what it means without reverse-engineering it.

## 4. Usefulness

By usefulness I mean: does the test actually catch real bugs, and does it check
something meaningful instead of just "it didn't crash".

- **Manual — most useful.** Every test targets a specific rule of the state
  machine (you can't cancel after check-in, a no-show only happens from
  confirmed, extending is repeatable, etc.), and the assertions are strong
  enough to kill 100% of mutants. The `assertNotSame` test is a good example of
  an assertion that catches a bug a weaker test would miss.
- **AI — useful but a bit weaker.** The tests are aimed at the right behaviours,
  but a couple of assertions were too loose and let real mutants through
  (the ExtendedState one). Still, 92% with only 30 readable tests is solid, and
  the misses were easy to explain and would be easy to fix.
- **Randoop — technically effective, practically not very useful.** It got 100%
  mutation score, but it's characterization testing — it just records whatever
  the code currently does and asserts that. It has no idea what the *intended*
  behaviour is. So if my code had a bug, Randoop would happily lock the bug in
  as the "expected" result. It's also 542 tests of noise to get the same signal
  my 102 tests give, and nobody is going to maintain that.

---

## What I take away from this

Coverage alone couldn't separate the three suites — they all hit the same 81%.
Mutation score was the real tie-breaker, and even there Randoop matched my
manual suite on the number (100%) purely by brute force. But once you factor in
readability and usefulness, the manual suite is clearly the best of the three:
same coverage, top mutation score, and tests a human can actually read and
maintain. The AI suite is a close and much cheaper second — readable and 92%
mutation with barely any tests — as long as you review its assertions, because
that's exactly where it was weak. Randoop is good as a safety net for catching
regressions but it's not something I'd hand to a teammate as documentation of
what the code is supposed to do.

If I had to rank them for this project: **Manual > AI > Randoop**, and the
reason isn't coverage, it's whether the tests actually check the right thing in
a way someone can read.
