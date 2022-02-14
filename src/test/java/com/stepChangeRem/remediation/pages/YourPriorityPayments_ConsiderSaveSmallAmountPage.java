package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class YourPriorityPayments_ConsiderSaveSmallAmountPage extends Control{

	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
	private Button WouldYouliketoPutsomeAmountNoButton;
	private Button ConsiderSaveSmallAmountPageContinueButton;
	
	
	public Button getWouldYouliketoPutsomeAmountNoButton() {
		return WouldYouliketoPutsomeAmountNoButton;
	}
	public Button getConsidaerSaveSmallAmountPageButton() {
		return ConsiderSaveSmallAmountPageContinueButton;
	}
	
	
	public YourPriorityPayments_ConsiderSaveSmallAmountPage() {
		WouldYouliketoPutsomeAmountNoButton = new Button(By.xpath("//label[text()='No']"));
		ConsiderSaveSmallAmountPageContinueButton = new Button(By.xpath("//button[text()='Continue']"));
	}
	

	public void ClickWouldYouliketoPutsomeAmountNoButton() {
		this.getWouldYouliketoPutsomeAmountNoButton().click();
		genericMethodsCvp.implicitWait(3000);
	}
	
	public void ClickConsidaerSaveSmallAmountPageContinueButton() {
		this.getConsidaerSaveSmallAmountPageButton().click();
		genericMethodsCvp.implicitWait(3000);
	}

	public void ActionsOnConsidaerSaveSmallAmountPage() {
		ClickWouldYouliketoPutsomeAmountNoButton();
		ClickConsidaerSaveSmallAmountPageContinueButton();
		
	}
	
}
