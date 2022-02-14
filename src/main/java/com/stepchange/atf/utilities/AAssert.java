package com.stepchange.atf.utilities;

import com.stepchange.atf.drivers.SupportedDriver;
import org.testng.Assert;
import org.testng.internal.EclipseInterface;

import java.lang.reflect.Array;
import java.util.logging.Level;


public class AAssert extends Assert {

	private static void log(String message) {
		
		SupportedDriver.getBrowsers().get(Thread.currentThread().getId()).getLogWriter().log(message);
	}

	/**
	 * Takes a screenshot and writes it into the log file, with a level to log at
	 * @param level The level to log the screenshot at
	 */
	private static void logScreenshot(Level level){
		SupportedDriver.getBrowsers().get(Thread.currentThread().getId()).getLogWriter().logScreenshot(level);
//        EvidenceLog.logScreenshot(level);
	}
	/**
	 * Writes a message to the log file, with the ability to set the level
	 * @param message The message to log
	 * @param level The level to log the message at
	 */
	private static void log(String message, Level level){
		SupportedDriver.getBrowsers().get(Thread.currentThread().getId()).getLogWriter().log(message, level);
	}

	public static void assertEquals(Object actual, Object expected, String message, String testID) {
		
		if(expected != null || actual != null) {
			if(expected != null) {
				if(expected.getClass().isArray()) {
					assertArrayEquals(actual, expected, message);
					return;
				}
				
				if(expected.equals(actual)) {
					if(testID != null) {
						log(testID + ": Test Passed");
					}else {
						log("Test Passed, but no ID provided");
					}
					return;
				}
			}
			
			failNotEquals(actual, expected, message);
		}
	}
	
	
	public static void assertEquals(Object actual, Object expected, String message) {
		assertEquals(actual, expected, message, null);
	}
	
	public static void assertEquals(Object actual, Object expected) {
		assertEquals(actual, expected, null);
	}
	
	public static void assertEquals(int actual, int expected, String message, String testID) {
		assertEquals((Object) Integer.valueOf(actual), (Object) Integer.valueOf(expected), message, testID);
	}
	
	public static void assertEquals(int actual, int expected, String message) {
		assertEquals(actual, expected, message, null);
	}
	
	public static void assertEquals(int actual, int expected) {
		assertEquals(actual, expected, null);
	}
	
	public static void assertTrue(boolean condition, String message, String testID) {
		if(!condition) {
			failNotEquals(Boolean.FALSE, Boolean.TRUE, message);
		}else {
			if(testID != null) {
				log(testID + ": Test Passed");
			}else {
				log("Test Passed, but no ID provided");
			}
		}
	}
	
	public static void assertTrue(boolean condition, String message) {
		assertTrue(condition, message, null);
	}
	
	
	
	public static void assertTrue(boolean condition) {
		assertTrue(condition, null);
	}
	
	
	public static void assertFalse(boolean condition, String message, String testID) {
		if(condition) {
			failNotEquals(Boolean.TRUE, Boolean.FALSE, message);
		}else {
			if(testID != null) {
				log(testID + ": Test Passed");
			}else {
				log("Test Passed, but no ID provided");
			}
		}
	}
	
	public static void assertFalse(boolean condition, String message) {
		assertFalse(condition, message, null);
	}
	
	
	
	public static void assertFalse(boolean condition) {
		assertFalse(condition, null);
	}
	
	
	
	
	public static void assertContains(String actual, String expected, String message, String testID) {

		
		if(expected != null || actual != null) {
			if(expected!=null) {
				if(actual.contains(expected)) {
					if(testID != null) {
						log(testID + ":Test Passed - Expected = '" + expected + " : Actual = ' " + actual + "' ");
					}else {
						log("Test passed, but no ID provided - Expected = ' " + expected + " ' : Actual = '" + actual + "'");
					}
					
					return;
				}
			}
			
			failNotEquals(actual, expected, message);
		}
	}
	
	
	public static boolean assertContains(String actual, String expected, boolean istest) {
		boolean isMatched = false;
		
		if(expected != null || actual != null) {
			if(expected != null) {
				if(expected.contains(actual) || actual.contains(expected)) {
					isMatched = true;
				}
			}
		}
		
		return isMatched;
	}
	
	
	public static void assertContains(String actual, String expected, String message) {
		assertContains(actual, expected, message, null);
	}
	
	
	public static void assertContains(String actual, String expected) {
		assertContains(actual,expected, null);
	}
	
	
	public static void assertNotCotains(String actual, String doesNotContain, String message, String testID) {
		if(doesNotContain != null || actual != null) {
			if(doesNotContain != null) {
				if(!actual.contains(doesNotContain)) {
					if(testID != null) {
						log(testID + ":Test passed - Actual(' " + actual + " ' ) does not contain ' " + doesNotContain + " '");
					}else {
						log("Test passed, but no ID provided - Actual (' " + actual + " ' ) does not contain ' " + doesNotContain + " ' ");
					}
					return;
				}
			}
			
			failNotEquals(actual, doesNotContain, message);
		}
	}
	
	
	public static void assertNotContains(String actual, String doesNotContain, String message) {
		assertNotCotains(actual, doesNotContain, message, null);
	}
	
	public static void assertNotContains(String actual, String doesNotContain) {
		assertNotContains(actual, doesNotContain, null);
	}
	
	
	public static void assertEmpty(Object object, String message, String testID) {
		
		if(!object.equals(" ")) {
			failNotSame(object, null, message);
		}
		
		if(testID != null) {
			log(testID + ": Test Passed");
		}else {
			log("Test passed, but on ID provided");
		}
	}

	public static void assertNull(Object object, String message, String testID) {
		if(object != null) {
			failNotSame(object, null, message);
		}
		
		if(testID != null) {
			log(testID + ": Test passed");
		}else {
			log("Test passed, but no ID provided");
		}
	}
	
	
	public static void assertNull(Object object, String message) {
		
		assertNull(object, message, null);
	}
	
	
	public static void assertNull(Object object) {
		assertNull(object, null);
	}
	
	
	private static void assertArrayEquals(Object actual, Object expected, String message) {
		if(actual.getClass().isArray()) {
			int expectedLength = Array.getLength(expected);
			if(expectedLength == Array.getLength(actual)) {
				for(int i = 0; i < expectedLength; ++i) {
					Object _actual = Array.get(actual, i);
					Object _expected = Array.get(expected, i);
					
					try {
						assertEquals(_actual, _expected);
					}catch(AssertionError var8) {
						failNotEquals(actual, expected, message == null? "" : message + "(values as index" + i + " are not the same)" );
					}
				}
				
				return;
			}
			failNotEquals(Integer.valueOf(Array.getLength(actual)), Integer.valueOf(expectedLength), message == null ? "" :message + " (Array lengths are not the same)");
		}
		
		failNotEquals(actual, expected, message);
	}
	
	
	private static void failNotEquals(Object actual, Object expected, String message) {
		fail(format(actual, expected, message));
	}
	
	private static void failNotSame(Object actual, Object expected, String message) {
		String formatted = "";
		if(message != null) {
			formatted = message + " ";
		}
		
		fail(formatted + EclipseInterface.ASSERT_LEFT + expected + EclipseInterface.ASSERT_MIDDLE + actual + EclipseInterface.ASSERT_RIGHT);
	}
	
	static String format(Object actual, Object expected, String message) {
		String formatted = "";
		if(null != message) {
			formatted = message + " ";
		}
		
		return formatted + EclipseInterface.ASSERT_LEFT + expected + EclipseInterface.ASSERT_MIDDLE + actual + EclipseInterface.ASSERT_RIGHT;
	}
	
	
	public static void assertEquals(boolean actual, boolean expected, String message, String testID) {
		assertEquals((Object)Boolean.valueOf(actual), (Object)Boolean.valueOf(expected),message, testID);
	}
	
	public static void assertEquals(boolean actual, boolean expected, String message) {
		assertEquals((Object)Boolean.valueOf(actual), (Object)Boolean.valueOf(expected),message, null);
	}
	
	public static void assertEquals(boolean actual, boolean expected) {
		assertEquals((Object)Boolean.valueOf(actual), (Object)Boolean.valueOf(expected), null, null);
	}

	/**
	 * Specialized version of the fail method - Used to automatically log a message and a screenshot when a test fails.
	 * <p>This is also an extension point - If we do not want the tests to stop on failure, a version of this can be created which does not throw the exception</p>
	 * @param message The message to write to the logs when a test fails
	 */
	public static void fail(String message) {
		log("Test failed: " + message, Level.SEVERE);
		logScreenshot(Level.SEVERE);
		throw new AssertionError(message);
	}
}
