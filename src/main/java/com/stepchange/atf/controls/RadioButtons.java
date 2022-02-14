package com.stepchange.atf.controls;


import java.util.HashMap;

import org.openqa.selenium.By;

public class RadioButtons extends Container {

	private HashMap<String, RadioButton> radioButtons;
	// public RadioButtons(By selector) {
	//this.setSelector(selector); }
	
	public RadioButtons(By selector , String... radioButtonValues) {
		this.setSelector(selector);
		this.radioButtons = new HashMap<>();
		for(String radioButtonValue : radioButtonValues) { 
			this.radioButtons.put(radioButtonValue, new RadioButton(By.cssSelector("input[type='radio'] [class ='Radio'][value'" + radioButtonValue + "']")));
		}

	}
	public void selectRadioButton(String value) { this.clickChildElement(radioButtons.get(value)); }
	
	
	public HashMap<String, RadioButton> getRadioButtons() { return radioButtons; }





}
