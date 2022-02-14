package com.stepchange.atf.controls;

import com.stepchange.atf.utilities.AAssert;
import org.openqa.selenium.By;

/**
 * Div control class - Use when a div needs to be checked or when a chile element needs ti be interacted
 */

public class Div extends Container {

	public Div(String section) {
		String selectorString = "div[param_name*='"+ section + "']";
		this.setSelector(By.cssSelector(selectorString));
		
	
	}
	public  Div(By by) {
		this.setSelector(by); 
		}
	public void verifyDivContains(String expectedText) {
		verifyContainerContains(expectedText, "Div"); 
		}
	public void verifyDivNotContains (String doesNotContain){ 
		verifyContainerNotContains(doesNotContain, "Div") ; 
		}
	public void verifyChildContains(Control controlObject , String expectedText) {
		verifyChildContains(controlObject,expectedText, "Div");
	}

	/**
	 * Get Text From a Div and Remove new line and Required
	 *
	 * @return Text from Div
	 */
	public String getDivText() {
		String actualText;
		actualText = this.getElement().getText().replaceAll("\n", " ");
		actualText = actualText.replaceAll("Required", "");
		//System.out.println("Actual text:*************"+actualText);
		return actualText;
	}


	/**
	 * Method to verify a DIV contains the expected text
	 *
	 * @param text     Enables the text to be passed in via the test method
	 * @param label    Enables the label to be passed in via the test method
	 * @param expected Enables the expected value to be passed in via the test method
	 */
	public void verifyDIVContainsExpectedText(String text, String label, String expected) {

		AAssert.assertTrue(text.contains((label + " " + expected).trim()), "ERROR: " + label + " " + expected + " not found '" + text + "' found", "PASS: " + label + " " + expected + " found");
	}


	/**
	 * Method to verify a DIV does not contain the expected text
	 *
	 * @param text     Enables the text to be passed in via the test method
	 * @param label    Enables the label to be passed in via the test method
	 * @param expected Enables the expected value to be passed in via the test method
	 */
	public void verifyDIVDoesNotContainsExpectedText(String text, String label, String expected) {

		AAssert.assertFalse(text.contains((label + " " + expected).trim()), "ERROR: " + label + " " + expected + " found '" + text + "' found", "PASS: " + label + " " + expected + " not found");
	}

}
