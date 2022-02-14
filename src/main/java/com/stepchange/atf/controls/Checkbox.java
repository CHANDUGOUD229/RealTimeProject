package com.stepchange.atf.controls;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriverException;

import com.stepchange.atf.utilities.AAssert;

import java.util.logging.Level;

/**
 * Check box class is for Checkbox UI objects
 */

public class Checkbox extends Control {

	/**
	 * Lightweight constructor just takes a by
	 * @param selector - usually a by.id with the prop name
	 */
	
	public Checkbox(By selector) { this.setSelector(selector); 	}
	
	public void click(boolean click) {
		if(click) {
			int iterationCounter = 0;
			while (iterationCounter < getBrowser().getMaxAttempts()) {
				try {
					scrollElementIntoView();;
					getBrowser().getElementWhenReady(getSelector()).click();
					return;
				} catch (NullPointerException e) {
					
					getBrowser().sleep(50);
					getBrowser().getLogWriter().log("caught NullPointer Exception trying to click checkbox", Level.FINE);
					
					
				}catch (StaleElementReferenceException f) {
					
					getBrowser().sleep(50);
					getBrowser().getLogWriter().log("caught StaleElementReferenceException Exception trying to click checkbox", Level.FINE);
							
			} catch (WebDriverException g) {
				if(g.getMessage().contains("Element is not clickable at point")) {
					
					getBrowser().scrollDown();
				}
		    }
		}
	}
	}

	/**
	 * click the checkbox
	 * 
	 */
	
	public void click() { click(true);}
	
	/**
	 * checks if the checkbox is selected/not selected
	 * @param selected -selected or not
	 * 
	 */
	
	public void checkSelected(boolean selected) {
		
		//If Should be selected
		
		if (selected) {
			
			AAssert.assertTrue(getBrowser().getElementWhenReady(getSelector()).isSelected(),"checkbox' " + getSelector() + " ' not selected when it should have been", "checkbox ' " +getSelector() + " ' selected as expected");
		} else {
			AAssert.assertFalse(getBrowser().getElementWhenReady(getSelector()).isSelected(),"checkbox' " + getSelector() + " ' selected when it should not have been", "checkbox ' " +getSelector() + " ' not selected as expected");
		}
	}
	
	/**
	 * return the state of the checkbox as True or False
	 */
	
	public boolean isCheckboxSelected() { return (getBrowser().getElementWhenReady(getSelector()).isSelected());}
	
	/**
	 * Method to verify if checkbox is mandatory
	 */
	
	public void isFieldMandatory() {
		String failMsg = "FAIL: Field is not marked as required: '";
		String passMsg = "PASS: Maximum length is as expected with selector: ' ";
		AAssert.assertEquals(this.getElement().getAttribute("validationtype"), "required", failMsg + this.getSelector() + "'",
				passMsg + this.getSelector() + "'");
	}
	
	/**
	 * Method to verify if checkbox is mandatory
	 */
	public void isFieldOptional() {
		String failMsg = "FAIL: Field is marked as required: '";
		String passMsg = "PASS: Validation type was not marked as optional:";
		AAssert.assertFalse(this.getElement().getAttribute("validationtype") == "required", failMsg + this.getSelector() + "'", passMsg + this.getSelector() + "'");

	}
	
	/**
	 * Select Check Box if required
	 * @param check - whether or to check the checkbox
	 */
	
	public void check(boolean check) {

		this.waitForElementToBeClickable();
		//If check required make sure it is checked
		if (check) {
			if (!this.getBrowser().getElementWhenReady(getSelector()).isSelected()) {
				this.getBrowser().getElementWhenReady(getSelector()).click();
				getBrowser().sleep(1000);
				if (!this.getElementWhenReady(getSelector()).isSelected()) {
					getElementWhenReady(getSelector()).click();
					log("Clicked Again");
				}
				this.getBrowser().getLogWriter().log("Checkbox ' " + this.getSelector() + " ' checked", Level.INFO);
			}

		} else {
			if (this.getBrowser().getElementWhenReady(getSelector()).isSelected()) {
				this.getBrowser().getElementWhenReady(getSelector()).click();
				getBrowser().sleep(500);
				if (this.getElementWhenReady(getSelector()).isSelected()) {
					getElementWhenReady(getSelector()).click();
					getBrowser().getLogWriter().log("Checkbox ' " + this.getSelector() + " ' unchecked", Level.INFO);
				}
			}
		}


	}
}
