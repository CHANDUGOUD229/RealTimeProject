package com.stepchange.atf.controls;

import java.util.logging.Level;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;

import com.stepchange.atf.utilities.AAssert;
/**
 * Class for defining text fields for use in screen objects
 *
 */

public class RadioButton  extends Control {
	

public RadioButton(By selector) { this.setSelector(selector); }

	public RadioButton(By selector , By labelSelector, String labelText) {
		this(selector);
		this.setLabelSelector(labelSelector);
		this.setLabelText(labelText);
		
	}
	
	public RadioButton(By selector, By labelSelector, String labelText, String textErrorMessage) {
		this(selector);
		this.setLabelSelector(labelSelector);
		this.setLabelText(labelText);
		this.setErrorText(textErrorMessage);
	}
	
	
	public RadioButton(By selector, By labelSelector, String labelText , String textErrorMessage, String ghostText) {
		this(selector);
		this.setLabelSelector(labelSelector);
		this.setLabelText(labelText);
		this.setErrorText(textErrorMessage);
		this.setGhostText(ghostText);
	}
		/* public void selecRadiobutton (Boolean text) {
		 int iterationCounter = 0;
		 while (iterationCounter < getMaxAttempts()) {
			  try {
				  getElementWhenReady(getSelector()).clear();
				  break;
			  } catch (StaleElementReferenceException e) {
				  log( "Caught StaleElementReferenceException in selectRadiobutton method" , Level.FINE); }
			  		sleep(getTimeout()/10);
		 		}
		 		selectedRadiobutton(getSelector(), text); }
		*/
		 		//click the radio button

		public void click(boolean click){
			if(click) {
				int iterationCounter = 0;
				getBrowser().waitForElementToBeClickable(getSelector());
				getBrowser().sleep(50);
				while (iterationCounter < getBrowser().getMaxAttempts()) {
					try {
						getBrowser().getElementWhenReady(getSelector()).click();
						if (getBrowser().getElementWhenReady(getSelector()).isSelected()) { return; }
					} catch  (NullPointerException e) {
						getBrowser().sleep(50);
						getBrowser().getLogWriter().log("Caught NullPointerException trying to click radio button" , Level.FINE);
					} catch (StaleElementReferenceException f) {
						getBrowser().sleep(50);
						getBrowser().getLogWriter().log("Caught StaleElementReferenceException trying to click radio button", Level.FINE);
						
					}
				}
			}
			else {
				 int iterationCounter = 0;
				 getBrowser().waitForElementToBeClickable(getSelector());
				 getBrowser().sleep(50);
				 while (iterationCounter < getBrowser().getMaxAttempts()) {
					 try { 
						 getBrowser().sleep(2000);
						 getBrowser().getElementWhenReady(getSelector()).click();
						 if(!getBrowser().getElementWhenReady(getSelector()).isSelected()) {return;}
					 } catch (NullPointerException e) {
						 getBrowser().sleep(50);
						 getBrowser().getLogWriter().log(" Caught NullPointException trying to click radio button" , Level.FINE);
					 } catch (StaleElementReferenceException f) {
						 getBrowser().sleep(50);
						 getBrowser().getLogWriter().log(" Caught StaleElementReferenceException trying to click radio button" , Level.FINE);
						 

			
					}
				}
			}
			
		}
				
			
			public void click() { click (true) ; }
			
			public void checkSelected(boolean selected) {
				// If should be selected
				
				if(selected) 
					AAssert.assertTrue(getBrowser().getElementWhenReady(getSelector()).isSelected(), "Radio Button '" +getSelector()+ "' not selected when it should have been " , " Radio Button '" + getSelector() + "' selected as expected");
					else {
						AAssert.assertFalse(getBrowser().getElementWhenReady(getSelector()).isSelected(), " Radio Button'" + getSelector()+ "' selected when it should not have been" , " Radio Button'" + getSelector()+ "' not selected as expected");
					}
				
			}
			
			
}
			
	
	
