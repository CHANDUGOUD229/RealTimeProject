package com.stepchange.atf.controls;

import org.openqa.selenium.*;

public class Button  extends Control {

	String buttonAction;
	/**
	 * Can Potentially be extended to add more button types when needed
	 */
	public enum ButtonType {
		GRID();

	}
	private ButtonType myButton;
	 //Constructors
	/**
	 * Takes a ButtonType enum , there is currently only one, this can be extend, called the method for  creating a grid button
	 * @param button -Button Type (No pun intended)
	 */
	public Button(ButtonType button) {
		this.setButtonType(button);
		switch(myButton) {
		case GRID:
		setButtonSelectorGrid();
		break;
		}
}
	/**
	 * set button selector by action, this should be the action value in data-click!
	 * @param action - action in data-click class, use chrome inspector to find
	 */

public Button(String action) {
	setButtonSelectorByAction(action);
}
/**
 * Lightweight constructor just takes a by
 * @param by - custom by
 
 */

public Button(By by) {
	setSelector(by);
	
}
//getters setters
public ButtonType getButtonType() { return myButton; }
public void setButtonType (ButtonType buttonType) {this.myButton = buttonType;}

//Method
/**
 * Used internally to set Grid button selector
 */

private void setButtonSelectorGrid() {
	this.setSelector(By.cssSelector("button[data-click*='doGridAction"));
			this.buttonAction = "doGridAction";
}

/** 
 * internal , sets selector based on data click action 
 * @param action
 */
			private void setButtonSelectorByAction(String action) {
				this.setSelector(By.cssSelector("button[data-click*='"+ action +"'"));
				this.buttonAction = action;
			}
			/**
			 * clicks button v/ error handling
			 */
			
			public void click() {
		            if (this.buttonAction !=null) {
		               scrollElementIntoView();
		               clickButtonByAction(buttonAction);
		            }else {
		               getBrowser().waitForElementToBeClickable(this.getSelector());
		               scrollElementIntoView();
		               int iterationCounter = 0;
		               while (iterationCounter < getBrowser().getMaxAttempts()) {
		                  try {
		                     verifyOverLayDisplayed();
		                     highLighterMethod();
		                     this.getElement().click();
//		                   verifyOverLayDisplayed();
		                     break;
		                  } catch ( StaleElementReferenceException e) {
		                     iterationCounter++;
		                     getBrowser().sleep(getTimeout());
		                     getBrowser().getLogWriter().log ("Caught StaleElementReferenceException in click method");
		                  }catch (ElementNotVisibleException exception)
		                  {
		                     getBrowser().sleep(getTimeout());
		                     iterationCounter++;
		                     getBrowser().getLogWriter().log ("Caught ElementNotVisibleException in click method");
		                  }
		                  catch (WebDriverException e)
		                  {
		                     getBrowser().sleep(getTimeout());
		                     iterationCounter++;
		                     getBrowser().getLogWriter().log ("Caught WebDriverException in click method");
		                  }catch (Exception e)
		                  {
		                     getBrowser().sleep(getTimeout());
		                     iterationCounter++;
		                     getBrowser().getLogWriter().log (e.getMessage());
		                  }
		               }
		               if(iterationCounter == getBrowser().getMaxAttempts())
		               {
		                  getBrowser().getLogWriter().log ("Caught WebDriverException in click method");
		                  throw new WebDriverException("Unable to click on Button");
		               }
		            }
		   
		            }
	

	public void highLighterMethod(){
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", this.getElement());
	}
	/**
	 * Method to click a button but this will not throw an error only to be used
	 * for methods where it is not crucial if the button is clicked or not i.e. when deleting the case.
	 */
	public boolean clickWithoutError() {
		boolean error = false;
		try {
			this.getElement().click();
		} catch (Exception e) {
			log("Error Clicking " + this.getElement());
			error = true;
		}

		return error;
	}

	/**
	 * Method to click a button but this will not throw an error only to be used
	 * for methods where it is not crucial if the button is clicked or not i.e. when deleting the case.
	 */
	public boolean checkButtonEnabled() {
		boolean error = false;
		try {
			this.getElement().isEnabled();
		} catch (Exception e) {
			log("Error Clicking " + this.getElement());
			error = true;
		}

		return error;
	}
}

