package com.stepchange.atf.controls;

/**
* Represents an option which can be selected from a dropdown
* you would create a list.
 */

public class DropdownOption {
private String codeValue;
private String screenValue;


public DropdownOption(String codeValue, String screenValue) {
	this.codeValue = codeValue;
	this.screenValue = screenValue;
}


public String getCodeValue() { return codeValue; }



public String getScreenValue() { return screenValue;}
	

	}


