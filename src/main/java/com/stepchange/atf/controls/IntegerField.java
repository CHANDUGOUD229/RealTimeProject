package com.stepchange.atf.controls;

import org.openqa.selenium.By;

/**
 * Just use TextField all this funtionality exsists in there , better to maintain in one place.
 */

public class IntegerField extends TextField {

	public IntegerField(By selector) { super (selector); }

	public IntegerField(By selector, By labelSelector, String labelText) {
		this(selector);
		this.setLabelSelector(labelSelector);
		this.setLabelText(labelText);
	}
public IntegerField(By selector, By labelSelector , String labelText, String textErrorMessage) {
	this(selector);
	this.setLabelSelector(labelSelector);
	this.setLabelText(labelText);
	this.setErrorText(textErrorMessage);
}
public void enterText(Integer value) {
	getBrowser().getElementWhenReady(getSelector()).clear();
	enterText(getSelector(), value.toString());

}
}
