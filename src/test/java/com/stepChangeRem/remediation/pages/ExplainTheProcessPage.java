package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class ExplainTheProcessPage extends Control
{
	GenericMethodsRemediation GenericMethods_cvp=new GenericMethodsRemediation();
	private By createAnAccount;
	private Button continueAsGuest;
	private Button continueButton;
	private Button createAccount;

	//getters
	public By getcreateAnAccount() {return createAnAccount; }
	public Button getContinueAsGuest() {
		return continueAsGuest;
	}
	//Constructor
	public ExplainTheProcessPage() {
		createAnAccount = By.xpath("//button[text()='Create an account']");
		createAccount = new Button(By.xpath("//button[text()='Create account']"));
		continueButton=new Button(By.xpath("//button[.='Continue']"));
		continueAsGuest = new Button(By.xpath("//button[text()='Continue as a guest']"));
	}
	public void createAccount()	{
	    GenericMethods_cvp.clickOnElementJse(this.getcreateAnAccount());
	    
	}
	public void clickCreateAccount()
	{
		this.getCreateAccount().click();

	}
	public void clickContinurButton()
	{
		this.getContinueButton().click();
	}

	public Button getContinueButton() {
		return continueButton;
	}

	public Button getCreateAccount() {
		return createAccount;
	}
}

