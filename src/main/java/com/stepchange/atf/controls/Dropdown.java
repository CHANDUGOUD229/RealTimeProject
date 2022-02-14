package com.stepchange.atf.controls;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import com.stepchange.atf.drivers.DriverType;
import com.stepchange.atf.utilities.AAssert;
import com.stepchange.atf.utilities.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;



/**
 * Dropdown class contain information about a specified dropdown - selector, values, text
 */

public class Dropdown extends Control {

	/*private YesNoDrop yesNo;*/
	private List<DropdownOption> options;
	
	public List<DropdownOption> getValues() {
		return options; 
	}
	
	public void addValue(String codeValue, String screenValue) {
		options.add(new DropdownOption(codeValue,screenValue));
		}

	public void addDropDownOption(DropdownOption ddOption) {
		options.add(ddOption);
		
	}
	
	
	public Dropdown(By selector)
	{
		
		this.setSelector(selector);
		
		//values = new HashMap<>();
		options = new ArrayList<>();
		this.setLabelSelector(null);
		this.setLabelText(null);
	}

	
	
	public Dropdown(By selector, String propName) {
		this.setSelector(selector);
		//values = new HashMap<>();
		options = new ArrayList<>();
		this.setPropertyName(propName);
		this.setLabelSelector(null);
		this.setLabelText(null);
	}
	
	public Dropdown(By selector, By labelSelector, String labelText ) {
		this(selector);
		//values = new HashMap<>();
		this.setLabelSelector(labelSelector);
		this.setLabelText(labelText);
		
	}
	
	public void verifyDropdownNotContains(DropdownOption dropdownOption) {
		AAssert.assertFalse(checkIfOptionExists(dropdownOption),"FAIL: checked option is in dropdown", "Option" + dropdownOption.getScreenValue() + "is not in the dropdown");
		}
	
	
	public void verifyDropdownContains(DropdownOption dropdownOption) {
		AAssert.assertTrue(checkIfOptionExists(dropdownOption),"FAIL: checked option is not in dropdown", "Option" + dropdownOption.getScreenValue() + "is in the dropdown");
		}
	
	public List getAllSelectableOptions() {
		WebElement dropdownElement = this.getElement();
		List<WebElement>optionList = dropdownElement.findElements(By.tagName("option"));
		return optionList;
	}
	
	private boolean checkIfOptionExists(DropdownOption dropdownOption) {
		WebElement dropdownElement = this.getElement();
		List<WebElement>optionList = dropdownElement.findElements(By.tagName("option"));
		String attribute;
		for(WebElement optionElement : optionList) {
			if(optionElement.getAttribute("value").equals("")) {
				attribute = "title";
			}else {
				attribute = "value";
			}
			if(optionElement.getAttribute(attribute).equals(dropdownOption.getCodeValue())|| optionElement.getText().equals(dropdownOption.getScreenValue())) {
				return true;
			}
		}
		return false;
	}
	
	public void checkDropDown() {
		if (getLabelSelector() != null && getLabelText()!= null) {
			testLabel();
		}
		WebElement theDropDownWebElement = this.getElement();
		try {
			theDropDownWebElement.click();
	/*	}catch (ElementNotVisibleException e) {
			scrollDown();
			theDropDownWebElement.click();
	*/	
			}catch (WebDriverException f) {
				getBrowser().scrollDown();
				theDropDownWebElement.click();
			}
		List<WebElement> optionElementList = null;
		int iterationCounter = 0;
		while (iterationCounter < getBrowser().getMaxAttempts()){
			try {
				optionElementList = theDropDownWebElement.findElements(By.tagName("option"));
				break;
			}catch(StaleElementReferenceException e) {
				theDropDownWebElement = this.getElement();
				getBrowser().getLogWriter().log("Caught staleElementReferenceException in CheckDropDown");
			}
			
		}
		boolean optionIsInList;
		String attribute = null;
		AAssert.assertEquals(optionElementList.size(),options.size(), "FAIL: Dropdown list is not the specified size", "Dropdown size test");
		String screenValue = null;
		for(WebElement optionElement: optionElementList) {
			optionIsInList = false;
			for(DropdownOption option : options) {
				if(optionElement.getAttribute("value").equals("")) {
					attribute = "title";
				}else {
					attribute = "value";
				}
				
				String dropdownValue = optionElement.getAttribute(attribute);
				if(dropdownValue.equals("")) {
					dropdownValue = optionElement.getText();
				}
				if(dropdownValue.equals(option.getCodeValue())) {
					optionIsInList = true;
					screenValue = option.getScreenValue();
					AAssert.assertContains(option.getScreenValue(), (optionElement.getText()),"FAIL: option text does not match for the code value" + option.getCodeValue() + option.getScreenValue(), option.getCodeValue() + "Text Test");
				}
			}
			if(!optionIsInList) {
				for(DropdownOption option : options) {
					if(optionElement.getAttribute("value").equals("")) {
						attribute = "title";
					}else {
						attribute = "value";
					}
					if(optionElement.getAttribute(attribute).contains(option.getCodeValue())) {
						optionIsInList = true;
						screenValue = option.getScreenValue();
						AAssert.assertContains(option.getScreenValue(), (optionElement.getText()),"FAIL: option text does not match for the code value" + option.getCodeValue() + option.getScreenValue(), option.getCodeValue() + "Text Test");
					}
				}
			}
			
			if(!optionIsInList) {
				AAssert.assertTrue(false, "FAIL: Dropdown selected by" + getSelector() + "options are wrong, option failed on was " + optionElement.getText() + "Expected" + screenValue + "using attribute " + attribute);
			}
		}
		this.selectFromDropdown(options.get(this.getValues().size() -1).getCodeValue());
	}
	
	
	/*public void populateYesNoDropDown() {
		for(YesNoDrop yesnotemp: yesNo.values()) {
			this.addValue(yesnotemp.getValue, yesnotemp.getDescription());
		}
	}*/
	
	public void selectFromDropdown(DropdownOption dropdownOption) {
		selectFromDropdown(dropdownOption.getCodeValue());
	}
	

	
	public void selectFromDropdown(String selectValue) {
	
		List<WebElement> optionList;
		int iterationCounter = 0;
		String text;
		getBrowser().waitForElementToBeClickable(this.getSelector());
		scrollElementIntoView();
		while(iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				WebElement comboBox = getBrowser().getElementWhenReady(this.getSelector());
				int clickAttemptCounter = 0;
				while(clickAttemptCounter < getBrowser().getMaxAttempts()) {
					try {
						comboBox.click();
						getBrowser().sleep(100);
						break;
					}catch (NullPointerException e) {
						clickAttemptCounter++;
						if(getBrowser().getDriverType().equals(DriverType.WINIE)) {
							getBrowser().sleep(getBrowser().getTimeout());
						}else {
							getBrowser().sleep(200);
						}
					}
				}
				
				iterationCounter++;
				optionList = comboBox.findElements(By.xpath("./option"));
				Select comboBoxValue = new Select(comboBox);
				if ((optionList.size() > 1) || (optionList.size() == 1 && optionList.get(0).getAttribute("value").contains(selectValue))) {
					for(WebElement option: optionList) {
						if(option.getAttribute("value").equals("")) {
							if(option.getAttribute("title").equals(" ")) {
								text = option.getText();
							}else {
								text = option.getAttribute("title");
							}
						}else {
							text = option.getAttribute("value");
						}
							if (text.equals(selectValue)) {
								option.click();
								if(getBrowser().getDriverType().equals(DriverType.WINIE)) {
									this.leaveElement();
									tab();
								}
								return;
								
							}
						}
						break;
					}
					else {
						getBrowser().sleep(20);
					}
				}catch (StaleElementReferenceException e) {
					getBrowser().getLogWriter().log(e.getMessage() + "Caught Stale Element ", Level.FINE);
					getBrowser().sleep(20);
				}
				catch (NullPointerException e) {
					getBrowser().getLogWriter().log(e.getMessage() + "Caught Null Pointer Exception ", Level.FINE);
					getBrowser().sleep(20);
				}
			}
			
			getBrowser().getLogWriter().log("Failed to find option in the dropdown.Selector: " + getSelector() + ". Requested option: " + selectValue, Level.SEVERE);
			throw new RuntimeException("Failed to find option in dropdown. Selector: " + this.getSelector() + ". Requested option: " + selectValue);
		
	}
	
	
	public void selectFromDropdownInGrid(String value, int gridRow) {
		this.setSelector(By.id(getPropertyName()+ gridRow));
		
		this.selectFromDropdown(value);
	}
	
	
	public void selectFromDropdownByText(String text) {
		try {

			this.selectFromDropdown(getComboValueByText(this.getSelector(), text));
		}catch (WebDriverException wde) {
			try {
				scroll(200);
				this.selectFromDropdown(getComboValueByText(this.getSelector(), text));
			} catch (RuntimeException exc) {
				scroll(200);
				try {
					this.selectFromDropdown(getComboValueByText(this.getSelector(), text));
				}catch (RuntimeException wde2) {
					scroll(200);
					try {
						this.selectFromDropdown(getComboValueByText(this.getSelector(), text));
					}catch (RuntimeException wde3) {
						scroll(-300);
						try {
							this.selectFromDropdown(getComboValueByText(this.getSelector(), text));
						}catch (RuntimeException wde4) {
							scroll(-300);
							try {
								this.selectFromDropdown(getComboValueByText(this.getSelector(), text));
							}catch (RuntimeException wde5) {
								scroll(-300);
								try {
									this.selectFromDropdown(getComboValueByText(this.getSelector(), text));
								}catch (RuntimeException wde6) {
									scroll(-200);
									this.selectFromDropdown(getComboValueByText(this.getSelector(), text));
									}
							}
						}
					}
				}
			}
		}catch (RuntimeException ex)
		{
			try {
				this.selectFromDropdown(getComboValueByText(this.getSelector(), text));
			}catch (RuntimeException ex1)
			{
				this.selectFromDropdown(getComboValueByText(this.getSelector(), text));
			}

		}
	}
				
	public void selectPlaceholder() {
		
	}
	
	
	public void checkSelected(String expected) {
		
		AAssert.assertEquals(getCurrentValue(), expected, "ERROR: Select was " + getCurrentValue() + "when " + expected + "expected", "PASS: Selected as expected" +expected+ " ");
	}
	
	public String getCurrentValue() {
		return new Select(getElement()).getFirstSelectedOption().getText();
	}
	
	public void selectFromDropdownByIndex(int index) {
		getBrowser().sleep(getBrowser().getTimeout());
		getElement().click();
		getBrowser().sleep(500);
		int iterationCounter = 0;
		while(iterationCounter < getBrowser().getMaxAttempts()) {
			try {
				Select select = new Select(getElement());
				select.selectByIndex(index);
				break;
			}catch (StaleElementReferenceException e) {
				getBrowser().getLogWriter().log("Caught StaleElement Reference Exception in select From Dropdown By Index", Level.FINEST);
			}
		}
	}
	
	
	public void isFieldMandatory() {
		String failMsg = "FAIL: Field is not marked as required: ";
		String passMsg = "PASS: Maximum length is as expected with selector: ";
		AAssert.assertEquals(this.getElement().getAttribute("validationType"), "required", failMsg + this.getSelector() + " ", passMsg + this.getSelector() + " ");
	}
	
	protected String getComboValueByText(By comboBy,String innerText ) {
		String value = " ";
		
		WebElement comboBox = getBrowser().getElementWhenReady(comboBy);
		List<WebElement> options = comboBox.findElements(By.tagName("option"));
		for(WebElement option:options) {
			if(Utils.looseStringCompare(option.getText(), innerText)) {
				value = option.getAttribute("value");
				
				if(value.isEmpty()) {
					value = option.getAttribute("title");
				}
			}
		}
		
		if(!value.isEmpty()) {
			return value;
		}
		
		return null;
	}



}


