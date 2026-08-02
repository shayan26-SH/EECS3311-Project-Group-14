package Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class GUIRandoopRegressionTest0 {

	public static boolean debug = false;

	public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
		if (expectedArray.length != actualArray.length) {
			throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
		}
		for (int i = 0; i < expectedArray.length; i++) {
			if (expectedArray[i] != actualArray[i]) {
				throw new AssertionError(
						"Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
			}
		}
	}

	@Test
	public void test01() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test01");
		int int0 = java.awt.Frame.S_RESIZE_CURSOR;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
	}

	@Test
	public void test02() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test02");
		int int0 = java.awt.Frame.NE_RESIZE_CURSOR;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
	}

	@Test
	public void test03() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test03");
		java.awt.Window[] windowArray0 = java.awt.Window.getWindows();
		org.junit.Assert.assertNotNull(windowArray0);
		// org.junit.Assert.assertArrayEquals(windowArray0, new java.awt.Window[] {});
	}

	@Test
	public void test04() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test04");
		int int0 = java.awt.Frame.MAXIMIZED_BOTH;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
	}

	@Test
	public void test05() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test05");
		float float0 = java.awt.Component.TOP_ALIGNMENT;
		org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
	}

	@Test
	public void test06() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test06");
		int int0 = java.awt.image.ImageObserver.SOMEBITS;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
	}

	@Test
	public void test07() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test07");
		float float0 = java.awt.Component.BOTTOM_ALIGNMENT;
		org.junit.Assert.assertTrue("'" + float0 + "' != '" + 1.0f + "'", float0 == 1.0f);
	}

	@Test
	public void test08() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test08");
		int int0 = java.awt.Frame.ICONIFIED;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
	}

	@Test
	public void test09() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test09");
		int int0 = java.awt.Frame.NW_RESIZE_CURSOR;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
	}

	@Test
	public void test10() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test10");
		int int0 = javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
	}

	@Test
	public void test11() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test11");
		int int0 = java.awt.image.ImageObserver.HEIGHT;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
	}

	@Test
	public void test12() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test12");
		float float0 = java.awt.Component.LEFT_ALIGNMENT;
		org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.0f + "'", float0 == 0.0f);
	}

	@Test
	public void test13() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test13");
		int int0 = java.awt.Frame.SE_RESIZE_CURSOR;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
	}

	@Test
	public void test14() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test14");
		java.awt.Window[] windowArray0 = java.awt.Window.getOwnerlessWindows();
		java.lang.Class<?> wildcardClass1 = windowArray0.getClass();
		org.junit.Assert.assertNotNull(windowArray0);

		org.junit.Assert.assertNotNull(wildcardClass1);
	}

	@Test
	public void test15() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test15");
		javax.swing.JFrame.setDefaultLookAndFeelDecorated(true);
	}

	@Test
	public void test16() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test16");
		int int0 = java.awt.Frame.SW_RESIZE_CURSOR;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
	}

	@Test
	public void test17() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test17");
		float float0 = java.awt.Component.CENTER_ALIGNMENT;
		org.junit.Assert.assertTrue("'" + float0 + "' != '" + 0.5f + "'", float0 == 0.5f);
	}

	@Test
	public void test18() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test18");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.PopupMenu popupMenu1 = null;
		// The following exception was thrown during execution in test generation
		try {
			roomSchedulerGUI0.add(popupMenu1);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.NullPointerException; message: Cannot read field \"parent\" because \"popup\" is null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
	}

	@Test
	public void test19() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test19");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.beans.PropertyChangeListener propertyChangeListener3 = null;
		roomSchedulerGUI0.removePropertyChangeListener(propertyChangeListener3);
		roomSchedulerGUI0.transferFocusDownCycle();
	}

	@Test
	public void test20() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test20");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.InputMethodListener inputMethodListener3 = null;
		roomSchedulerGUI0.removeInputMethodListener(inputMethodListener3);
		java.awt.Dimension dimension5 = roomSchedulerGUI0.minimumSize();
		roomSchedulerGUI0.transferFocusBackward();
		org.junit.Assert.assertNotNull(dimension5);
	}

	@Test
	public void test21() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test21");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		roomSchedulerGUI0.validate();
		roomSchedulerGUI0.setState((int) (short) 100);
	}

	@Test
	public void test22() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test22");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.Graphics graphics3 = roomSchedulerGUI0.getGraphics();
		org.junit.Assert.assertNull(graphics3);
	}

	@Test
	public void test23() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test23");
		int int0 = java.awt.Frame.NORMAL;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
	}

	@Test
	public void test24() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test24");
		int int0 = java.awt.Frame.CROSSHAIR_CURSOR;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
	}

	@Test
	public void test25() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test25");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.event.FocusListener[] focusListenerArray1 = roomSchedulerGUI0.getFocusListeners();
		boolean boolean2 = roomSchedulerGUI0.isPreferredSizeSet();
		java.awt.event.FocusListener[] focusListenerArray3 = roomSchedulerGUI0.getFocusListeners();
		java.awt.event.MouseListener[] mouseListenerArray4 = roomSchedulerGUI0.getMouseListeners();
		org.junit.Assert.assertNotNull(focusListenerArray1);
		org.junit.Assert.assertArrayEquals(focusListenerArray1, new java.awt.event.FocusListener[] {});
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
		org.junit.Assert.assertNotNull(focusListenerArray3);
		org.junit.Assert.assertArrayEquals(focusListenerArray3, new java.awt.event.FocusListener[] {});
		org.junit.Assert.assertNotNull(mouseListenerArray4);
	}

	@Test
	public void test26() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test26");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.InputMethodListener inputMethodListener3 = null;
		roomSchedulerGUI0.removeInputMethodListener(inputMethodListener3);
		roomSchedulerGUI0.setLocationByPlatform(false);
		boolean boolean7 = roomSchedulerGUI0.isAlwaysOnTop();
		java.awt.event.KeyListener[] keyListenerArray8 = roomSchedulerGUI0.getKeyListeners();
		java.awt.Component component11 = roomSchedulerGUI0.locate((int) 'a', (int) (short) 0);
		Demo.RoomSchedulerGUI roomSchedulerGUI12 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension13 = null;
		roomSchedulerGUI12.setMinimumSize(dimension13);
		java.awt.event.InputMethodListener inputMethodListener15 = null;
		roomSchedulerGUI12.removeInputMethodListener(inputMethodListener15);
		roomSchedulerGUI12.setLocationByPlatform(false);
		roomSchedulerGUI0.setLocationRelativeTo((java.awt.Component) roomSchedulerGUI12);
		roomSchedulerGUI0.requestFocus();
		org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
		org.junit.Assert.assertNotNull(keyListenerArray8);
		org.junit.Assert.assertArrayEquals(keyListenerArray8, new java.awt.event.KeyListener[] {});
		org.junit.Assert.assertNotNull(component11);
	}

	@Test
	public void test27() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test27");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.MouseListener mouseListener3 = null;
		roomSchedulerGUI0.removeMouseListener(mouseListener3);
		java.awt.event.MouseMotionListener[] mouseMotionListenerArray5 = roomSchedulerGUI0.getMouseMotionListeners();
		org.junit.Assert.assertNotNull(mouseMotionListenerArray5);
	}

	@Test
	public void test28() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test28");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.MouseListener mouseListener3 = null;
		roomSchedulerGUI0.removeMouseListener(mouseListener3);
		boolean boolean5 = roomSchedulerGUI0.isShowing();
		java.io.PrintWriter printWriter6 = null;
		// The following exception was thrown during execution in test generation
		try {
			roomSchedulerGUI0.list(printWriter6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintWriter.println(Object)\" because \"out\" is null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
	}

	@Test
	public void test29() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test29");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		roomSchedulerGUI0.validate();
		roomSchedulerGUI0.transferFocus();
		javax.swing.JLayeredPane jLayeredPane5 = roomSchedulerGUI0.getLayeredPane();
		java.awt.event.WindowStateListener[] windowStateListenerArray6 = roomSchedulerGUI0.getWindowStateListeners();
		org.junit.Assert.assertNotNull(jLayeredPane5);
		org.junit.Assert.assertNotNull(windowStateListenerArray6);
		org.junit.Assert.assertArrayEquals(windowStateListenerArray6, new java.awt.event.WindowStateListener[] {});
	}

	@Test
	public void test30() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test30");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		int int1 = roomSchedulerGUI0.countComponents();
		java.awt.Image image2 = null;
		Demo.RoomSchedulerGUI roomSchedulerGUI3 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension4 = null;
		roomSchedulerGUI3.setMinimumSize(dimension4);
		java.awt.event.InputMethodListener inputMethodListener6 = null;
		roomSchedulerGUI3.removeInputMethodListener(inputMethodListener6);
		roomSchedulerGUI3.setLocationByPlatform(false);
		boolean boolean10 = roomSchedulerGUI3.isAlwaysOnTop();
		java.awt.event.KeyListener[] keyListenerArray11 = roomSchedulerGUI3.getKeyListeners();
		java.awt.Component component14 = roomSchedulerGUI3.locate((int) 'a', (int) (short) 0);
		Demo.RoomSchedulerGUI roomSchedulerGUI15 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension16 = null;
		roomSchedulerGUI15.setMinimumSize(dimension16);
		java.awt.event.InputMethodListener inputMethodListener18 = null;
		roomSchedulerGUI15.removeInputMethodListener(inputMethodListener18);
		boolean boolean20 = roomSchedulerGUI3.isAncestorOf((java.awt.Component) roomSchedulerGUI15);
		roomSchedulerGUI15.addNotify();
		boolean boolean22 = roomSchedulerGUI0.prepareImage(image2, (java.awt.image.ImageObserver) roomSchedulerGUI15);
		org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
		org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
		org.junit.Assert.assertNotNull(keyListenerArray11);
		org.junit.Assert.assertArrayEquals(keyListenerArray11, new java.awt.event.KeyListener[] {});
		org.junit.Assert.assertNotNull(component14);
		org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
		org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
	}

	@Test
	public void test31() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test31");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.InputMethodListener inputMethodListener3 = null;
		roomSchedulerGUI0.removeInputMethodListener(inputMethodListener3);
		roomSchedulerGUI0.setLocationByPlatform(false);
		boolean boolean7 = roomSchedulerGUI0.isAlwaysOnTop();
		java.beans.PropertyChangeListener[] propertyChangeListenerArray9 = roomSchedulerGUI0
				.getPropertyChangeListeners("hi!");
		javax.swing.TransferHandler transferHandler10 = null;
		roomSchedulerGUI0.setTransferHandler(transferHandler10);
		org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
		org.junit.Assert.assertNotNull(propertyChangeListenerArray9);
		org.junit.Assert.assertArrayEquals(propertyChangeListenerArray9, new java.beans.PropertyChangeListener[] {});
	}

	@Test
	public void test32() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test32");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.InputMethodListener inputMethodListener3 = null;
		roomSchedulerGUI0.removeInputMethodListener(inputMethodListener3);
		roomSchedulerGUI0.setLocationByPlatform(false);
		boolean boolean7 = roomSchedulerGUI0.isAlwaysOnTop();
		javax.swing.TransferHandler transferHandler8 = roomSchedulerGUI0.getTransferHandler();
		org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
		org.junit.Assert.assertNull(transferHandler8);
	}

	@Test
	public void test33() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test33");
		int int0 = java.awt.Frame.MOVE_CURSOR;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
	}

	@Test
	public void test34() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test34");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.InputMethodListener inputMethodListener3 = null;
		roomSchedulerGUI0.removeInputMethodListener(inputMethodListener3);
		roomSchedulerGUI0.setLocationByPlatform(false);
		boolean boolean7 = roomSchedulerGUI0.isAlwaysOnTop();
		java.awt.event.KeyListener[] keyListenerArray8 = roomSchedulerGUI0.getKeyListeners();
		java.awt.Component component11 = roomSchedulerGUI0.locate((int) 'a', (int) (short) 0);
		Demo.RoomSchedulerGUI roomSchedulerGUI12 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension13 = null;
		roomSchedulerGUI12.setMinimumSize(dimension13);
		java.awt.event.InputMethodListener inputMethodListener15 = null;
		roomSchedulerGUI12.removeInputMethodListener(inputMethodListener15);
		boolean boolean17 = roomSchedulerGUI0.isAncestorOf((java.awt.Component) roomSchedulerGUI12);
		java.lang.String str18 = roomSchedulerGUI0.getTitle();
		org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
		org.junit.Assert.assertNotNull(keyListenerArray8);
		org.junit.Assert.assertArrayEquals(keyListenerArray8, new java.awt.event.KeyListener[] {});
		org.junit.Assert.assertNotNull(component11);
		org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
		org.junit.Assert.assertEquals("'" + str18 + "' != '" + "YorkU Conference Room Scheduler" + "'", str18,
				"YorkU Conference Room Scheduler");
	}

	@Test
	public void test35() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test35");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.MouseListener mouseListener3 = null;
		roomSchedulerGUI0.removeMouseListener(mouseListener3);
		boolean boolean5 = roomSchedulerGUI0.isShowing();
		java.awt.event.MouseMotionListener[] mouseMotionListenerArray6 = roomSchedulerGUI0.getMouseMotionListeners();
		java.awt.Dialog.ModalExclusionType modalExclusionType7 = roomSchedulerGUI0.getModalExclusionType();
		org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
		org.junit.Assert.assertNotNull(mouseMotionListenerArray6);
		org.junit.Assert.assertTrue(
				"'" + modalExclusionType7 + "' != '" + java.awt.Dialog.ModalExclusionType.NO_EXCLUDE + "'",
				modalExclusionType7.equals(java.awt.Dialog.ModalExclusionType.NO_EXCLUDE));
	}

	@Test
	public void test36() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test36");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.InputMethodListener inputMethodListener3 = null;
		roomSchedulerGUI0.removeInputMethodListener(inputMethodListener3);
		roomSchedulerGUI0.setLocationByPlatform(false);
		boolean boolean7 = roomSchedulerGUI0.isAlwaysOnTop();
		java.awt.event.KeyListener[] keyListenerArray8 = roomSchedulerGUI0.getKeyListeners();
		java.awt.Component component11 = roomSchedulerGUI0.locate((int) 'a', (int) (short) 0);
		roomSchedulerGUI0.setAutoRequestFocus(false);
		org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
		org.junit.Assert.assertNotNull(keyListenerArray8);
		org.junit.Assert.assertArrayEquals(keyListenerArray8, new java.awt.event.KeyListener[] {});
		org.junit.Assert.assertNotNull(component11);
	}

	@Test
	public void test37() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test37");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		roomSchedulerGUI0.setDefaultCloseOperation(2);
	}

	@Test
	public void test38() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test38");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.InputMethodListener inputMethodListener3 = null;
		roomSchedulerGUI0.removeInputMethodListener(inputMethodListener3);
		roomSchedulerGUI0.setLocationByPlatform(false);
		boolean boolean7 = roomSchedulerGUI0.isAlwaysOnTop();
		java.awt.event.KeyListener[] keyListenerArray8 = roomSchedulerGUI0.getKeyListeners();
		java.awt.Component component11 = roomSchedulerGUI0.locate((int) 'a', (int) (short) 0);
		Demo.RoomSchedulerGUI roomSchedulerGUI12 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension13 = null;
		roomSchedulerGUI12.setMinimumSize(dimension13);
		java.awt.event.InputMethodListener inputMethodListener15 = null;
		roomSchedulerGUI12.removeInputMethodListener(inputMethodListener15);
		boolean boolean17 = roomSchedulerGUI0.isAncestorOf((java.awt.Component) roomSchedulerGUI12);
		roomSchedulerGUI12.addNotify();
		java.awt.Component component19 = roomSchedulerGUI12.getGlassPane();
		org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
		org.junit.Assert.assertNotNull(keyListenerArray8);
		org.junit.Assert.assertArrayEquals(keyListenerArray8, new java.awt.event.KeyListener[] {});
		org.junit.Assert.assertNotNull(component11);
		org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
		org.junit.Assert.assertNotNull(component19);
	}

	@Test
	public void test39() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test39");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.event.FocusListener[] focusListenerArray1 = roomSchedulerGUI0.getFocusListeners();
		boolean boolean2 = roomSchedulerGUI0.isFontSet();
		java.awt.Font font3 = null;
		// The following exception was thrown during execution in test generation
		try {
			java.awt.FontMetrics fontMetrics4 = roomSchedulerGUI0.getFontMetrics(font3);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"Object.hashCode()\" because \"key\" is null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(focusListenerArray1);
		org.junit.Assert.assertArrayEquals(focusListenerArray1, new java.awt.event.FocusListener[] {});
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
	}

	@Test
	public void test40() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test40");
		int int0 = javax.swing.WindowConstants.HIDE_ON_CLOSE;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
	}

	@Test
	public void test41() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test41");
		int int0 = java.awt.Frame.HAND_CURSOR;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
	}

	@Test
	public void test42() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test42");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.InputMethodListener inputMethodListener3 = null;
		roomSchedulerGUI0.removeInputMethodListener(inputMethodListener3);
		roomSchedulerGUI0.setLocationByPlatform(false);
		boolean boolean7 = roomSchedulerGUI0.isAlwaysOnTop();
		java.beans.PropertyChangeListener[] propertyChangeListenerArray9 = roomSchedulerGUI0
				.getPropertyChangeListeners("hi!");
		javax.swing.JLayeredPane jLayeredPane10 = roomSchedulerGUI0.getLayeredPane();
		org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
		org.junit.Assert.assertNotNull(propertyChangeListenerArray9);
		org.junit.Assert.assertArrayEquals(propertyChangeListenerArray9, new java.beans.PropertyChangeListener[] {});
		org.junit.Assert.assertNotNull(jLayeredPane10);
	}

	@Test
	public void test43() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test43");
		int int0 = java.awt.Frame.N_RESIZE_CURSOR;
		org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
	}

	@Test
	public void test44() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test44");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.MouseListener mouseListener3 = null;
		roomSchedulerGUI0.removeMouseListener(mouseListener3);
		boolean boolean5 = roomSchedulerGUI0.isShowing();
		java.awt.Color color6 = null;
		roomSchedulerGUI0.setBackground(color6);
		org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
	}

	@Test
	public void test45() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test45");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.InputMethodListener inputMethodListener3 = null;
		roomSchedulerGUI0.removeInputMethodListener(inputMethodListener3);
		roomSchedulerGUI0.setLocationByPlatform(false);
		boolean boolean7 = roomSchedulerGUI0.isAlwaysOnTop();
		java.awt.event.KeyListener[] keyListenerArray8 = roomSchedulerGUI0.getKeyListeners();
		java.awt.Component component11 = roomSchedulerGUI0.locate((int) 'a', (int) (short) 0);
		Demo.RoomSchedulerGUI roomSchedulerGUI12 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension13 = null;
		roomSchedulerGUI12.setMinimumSize(dimension13);
		java.awt.event.InputMethodListener inputMethodListener15 = null;
		roomSchedulerGUI12.removeInputMethodListener(inputMethodListener15);
		boolean boolean17 = roomSchedulerGUI0.isAncestorOf((java.awt.Component) roomSchedulerGUI12);
		java.awt.Toolkit toolkit18 = roomSchedulerGUI0.getToolkit();
		org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
		org.junit.Assert.assertNotNull(keyListenerArray8);
		org.junit.Assert.assertArrayEquals(keyListenerArray8, new java.awt.event.KeyListener[] {});
		org.junit.Assert.assertNotNull(component11);
		org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
		org.junit.Assert.assertNotNull(toolkit18);
	}

	@Test
	public void test46() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test46");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.beans.PropertyChangeListener propertyChangeListener3 = null;
		roomSchedulerGUI0.removePropertyChangeListener(propertyChangeListener3);
		java.awt.event.HierarchyListener hierarchyListener5 = null;
		roomSchedulerGUI0.removeHierarchyListener(hierarchyListener5);
	}

	@Test
	public void test47() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test47");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.event.FocusListener[] focusListenerArray1 = roomSchedulerGUI0.getFocusListeners();
		boolean boolean2 = roomSchedulerGUI0.isFontSet();
		java.beans.PropertyChangeListener propertyChangeListener3 = null;
		roomSchedulerGUI0.addPropertyChangeListener(propertyChangeListener3);
		roomSchedulerGUI0.setResizable(true);
		org.junit.Assert.assertNotNull(focusListenerArray1);
		org.junit.Assert.assertArrayEquals(focusListenerArray1, new java.awt.event.FocusListener[] {});
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
	}

	@Test
	public void test48() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test48");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.MouseListener mouseListener3 = null;
		roomSchedulerGUI0.removeMouseListener(mouseListener3);
		boolean boolean5 = roomSchedulerGUI0.isShowing();
		boolean boolean6 = roomSchedulerGUI0.isAlwaysOnTop();
		org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
		org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
	}

	@Test
	public void test49() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test49");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.InputMethodListener inputMethodListener3 = null;
		roomSchedulerGUI0.removeInputMethodListener(inputMethodListener3);
		roomSchedulerGUI0.setLocationByPlatform(false);
		int int7 = roomSchedulerGUI0.getWidth();
		org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1280 + "'", int7 == 1280);
	}

	@Test
	public void test50() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test50");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.InputMethodListener inputMethodListener3 = null;
		roomSchedulerGUI0.removeInputMethodListener(inputMethodListener3);
		java.awt.Dimension dimension5 = roomSchedulerGUI0.minimumSize();
		Demo.RoomSchedulerGUI roomSchedulerGUI6 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension7 = null;
		roomSchedulerGUI6.setMinimumSize(dimension7);
		java.awt.event.MouseListener mouseListener9 = null;
		roomSchedulerGUI6.removeMouseListener(mouseListener9);
		java.awt.ComponentOrientation componentOrientation11 = roomSchedulerGUI6.getComponentOrientation();
		roomSchedulerGUI0.applyComponentOrientation(componentOrientation11);
		java.awt.Graphics graphics13 = null;
		roomSchedulerGUI0.printComponents(graphics13);
		java.awt.ImageCapabilities imageCapabilities17 = null;
		java.awt.image.VolatileImage volatileImage18 = roomSchedulerGUI0.createVolatileImage((int) (byte) 100, (-1),
				imageCapabilities17);
		org.junit.Assert.assertNotNull(dimension5);
		org.junit.Assert.assertNotNull(componentOrientation11);
		org.junit.Assert.assertNull(volatileImage18);
	}

	@Test
	public void test51() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test51");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		roomSchedulerGUI0.validate();
		roomSchedulerGUI0.transferFocus();
		boolean boolean5 = roomSchedulerGUI0.isShowing();
		java.awt.Image image6 = null;
		roomSchedulerGUI0.setIconImage(image6);
		org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
	}

	@Test
	public void test52() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test52");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		roomSchedulerGUI0.validate();
		roomSchedulerGUI0.transferFocus();
		java.awt.Component.BaselineResizeBehavior baselineResizeBehavior5 = roomSchedulerGUI0
				.getBaselineResizeBehavior();
		org.junit.Assert.assertTrue(
				"'" + baselineResizeBehavior5 + "' != '" + java.awt.Component.BaselineResizeBehavior.OTHER + "'",
				baselineResizeBehavior5.equals(java.awt.Component.BaselineResizeBehavior.OTHER));
	}

	@Test
	public void test53() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test53");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		roomSchedulerGUI0.validate();
		roomSchedulerGUI0.transferFocus();
		javax.swing.JLayeredPane jLayeredPane5 = roomSchedulerGUI0.getLayeredPane();
		java.awt.Image image6 = null;
		roomSchedulerGUI0.setIconImage(image6);
		roomSchedulerGUI0.resize((-1), (int) (short) -1);
		org.junit.Assert.assertNotNull(jLayeredPane5);
	}

	@Test
	public void test54() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test54");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.event.InputMethodListener inputMethodListener3 = null;
		roomSchedulerGUI0.removeInputMethodListener(inputMethodListener3);
		java.awt.Dimension dimension5 = roomSchedulerGUI0.minimumSize();
		Demo.RoomSchedulerGUI roomSchedulerGUI6 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension7 = null;
		roomSchedulerGUI6.setMinimumSize(dimension7);
		java.awt.event.MouseListener mouseListener9 = null;
		roomSchedulerGUI6.removeMouseListener(mouseListener9);
		java.awt.ComponentOrientation componentOrientation11 = roomSchedulerGUI6.getComponentOrientation();
		roomSchedulerGUI0.applyComponentOrientation(componentOrientation11);
		java.awt.Event event13 = null;
		boolean boolean15 = roomSchedulerGUI0.keyDown(event13, 9);
		float float16 = roomSchedulerGUI0.getAlignmentY();
		org.junit.Assert.assertNotNull(dimension5);
		org.junit.Assert.assertNotNull(componentOrientation11);
		org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
		org.junit.Assert.assertTrue("'" + float16 + "' != '" + 0.5f + "'", float16 == 0.5f);
	}

	@Test
	public void test55() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test55");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.event.FocusListener[] focusListenerArray1 = roomSchedulerGUI0.getFocusListeners();
		boolean boolean2 = roomSchedulerGUI0.isPreferredSizeSet();
		java.awt.event.FocusListener[] focusListenerArray3 = roomSchedulerGUI0.getFocusListeners();
		java.awt.event.WindowFocusListener windowFocusListener4 = null;
		roomSchedulerGUI0.removeWindowFocusListener(windowFocusListener4);
		org.junit.Assert.assertNotNull(focusListenerArray1);
		org.junit.Assert.assertArrayEquals(focusListenerArray1, new java.awt.event.FocusListener[] {});
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
		org.junit.Assert.assertNotNull(focusListenerArray3);
		org.junit.Assert.assertArrayEquals(focusListenerArray3, new java.awt.event.FocusListener[] {});
	}

	@Test
	public void test56() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test56");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		roomSchedulerGUI0.validate();
		roomSchedulerGUI0.transferFocus();
		Demo.RoomSchedulerGUI roomSchedulerGUI5 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension6 = null;
		roomSchedulerGUI5.setMinimumSize(dimension6);
		java.beans.PropertyChangeListener propertyChangeListener8 = null;
		roomSchedulerGUI5.removePropertyChangeListener(propertyChangeListener8);
		boolean boolean10 = roomSchedulerGUI5.isShowing();
		java.awt.Dimension dimension11 = roomSchedulerGUI5.getMaximumSize();
		roomSchedulerGUI0.setMinimumSize(dimension11);
		org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
		org.junit.Assert.assertNotNull(dimension11);
	}

	@Test
	public void test57() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test57");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		roomSchedulerGUI0.validate();
		roomSchedulerGUI0.transferFocus();
		boolean boolean5 = roomSchedulerGUI0.isShowing();
		Demo.RoomSchedulerGUI roomSchedulerGUI6 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension7 = null;
		roomSchedulerGUI6.setMinimumSize(dimension7);
		java.awt.event.MouseListener mouseListener9 = null;
		roomSchedulerGUI6.removeMouseListener(mouseListener9);
		boolean boolean11 = roomSchedulerGUI6.isShowing();
		java.awt.event.MouseMotionListener[] mouseMotionListenerArray12 = roomSchedulerGUI6.getMouseMotionListeners();
		// The following exception was thrown during execution in test generation
		try {
			java.awt.Component component14 = roomSchedulerGUI0.add((java.awt.Component) roomSchedulerGUI6, 1);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.IllegalArgumentException; message: adding a window to a container");
		} catch (java.lang.IllegalArgumentException e) {
			// Expected exception.
		}
		org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
		org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
		org.junit.Assert.assertNotNull(mouseMotionListenerArray12);
	}

	@Test
	public void test58() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test58");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension1 = null;
		roomSchedulerGUI0.setMinimumSize(dimension1);
		java.awt.Graphics graphics3 = null;
		roomSchedulerGUI0.paintComponents(graphics3);
		java.awt.Insets insets5 = roomSchedulerGUI0.insets();
		java.io.PrintStream printStream6 = null;
		// The following exception was thrown during execution in test generation
		try {
			roomSchedulerGUI0.list(printStream6);
			org.junit.Assert.fail(
					"Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.PrintStream.println(Object)\" because \"out\" is null");
		} catch (java.lang.NullPointerException e) {
			// Expected exception.
		}
		org.junit.Assert.assertNotNull(insets5);
	}

	@Test
	public void test59() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test59");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		java.awt.event.FocusListener[] focusListenerArray1 = roomSchedulerGUI0.getFocusListeners();
		boolean boolean2 = roomSchedulerGUI0.isPreferredSizeSet();
		Demo.RoomSchedulerGUI roomSchedulerGUI3 = new Demo.RoomSchedulerGUI();
		java.awt.Dimension dimension4 = null;
		roomSchedulerGUI3.setMinimumSize(dimension4);
		roomSchedulerGUI3.validate();
		roomSchedulerGUI3.transferFocus();
		boolean boolean8 = roomSchedulerGUI3.isShowing();
		int int9 = roomSchedulerGUI0.getComponentZOrder((java.awt.Component) roomSchedulerGUI3);
		roomSchedulerGUI0.resize(2, 7);
		org.junit.Assert.assertNotNull(focusListenerArray1);
		org.junit.Assert.assertArrayEquals(focusListenerArray1, new java.awt.event.FocusListener[] {});
		org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
		org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
		org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
	}

	@Test
	public void test60() throws Throwable {
		if (debug)
			System.out.format("%n%s%n", "GUIRandoopRegressionTest0.test60");
		Demo.RoomSchedulerGUI roomSchedulerGUI0 = new Demo.RoomSchedulerGUI();
		int int1 = roomSchedulerGUI0.getWidth();
		java.awt.event.FocusEvent.Cause cause2 = null;
		boolean boolean3 = roomSchedulerGUI0.requestFocusInWindow(cause2);
		boolean boolean4 = roomSchedulerGUI0.isValid();
		java.awt.Event event5 = null;
		boolean boolean8 = roomSchedulerGUI0.mouseEnter(event5, (int) (byte) 10, (int) 'a');
		org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1280 + "'", int1 == 1280);
		org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
		org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
		org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
	}
}
