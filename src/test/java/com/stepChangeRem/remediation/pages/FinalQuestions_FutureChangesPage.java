package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Checkbox;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class FinalQuestions_FutureChangesPage extends Control{
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
	private Checkbox AllChangeshavebeenCapturedCheckBox;
	private Button FutureChangesPageContinueButton;
	private Checkbox AllChangescaptureCheckboc89941;


	public Checkbox getAllChangeshavebeenCapturedCheckBox() {
		return AllChangeshavebeenCapturedCheckBox;
	}
	public Button getFutureChangesPageContinueButton() {
		return FutureChangesPageContinueButton;
	}
	public Checkbox getAllChangescaptureCheckboc89941(){return AllChangescaptureCheckboc89941;}
	
	public FinalQuestions_FutureChangesPage() {
		AllChangeshavebeenCapturedCheckBox = new Checkbox(By.xpath("(//label[@class=' cb_standard'])[2]"));
		FutureChangesPageContinueButton = new Button(By.xpath("//button[text()='Continue']"));
		AllChangescaptureCheckboc89941=new Checkbox(By.xpath("//label[text()='All changes have been captured']"));
	}

	public void FutureChanges89941()
	{
		genericMethodsCvp.implicitWait(1000);
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(2000);
		this.getAllChangescaptureCheckboc89941().click();
		genericMethodsCvp.implicitWait(2000);
		this.getFutureChangesPageContinueButton().click();
	}
	
	public void ClickAllChangeshavebeenapturedCheckBox() {
		//genericMethodsCvp.implicitWait(1000);
		//switchToActiveFrame();
		genericMethodsCvp.implicitWait(5000);
		//getBrowser().waitForElementToBeClickable(By.xpath("//label[@class=' cb_standard']"));
	    this.getAllChangeshavebeenCapturedCheckBox().click();
	}
	
	public void ClickFutureChangesPageContinueButton() {

		genericMethodsCvp.implicitWait(5000);
		this.getFutureChangesPageContinueButton().click();
		genericMethodsCvp.implicitWait(5000);
		this.getAllChangescaptureCheckboc89941().click();
		genericMethodsCvp.implicitWait(5000);
		this.getFutureChangesPageContinueButton().click();

	}
	public void ClickFutureChangesPageContinueButton89941() {

		//genericMethodsCvp.implicitWait(5000);
		//this.getFutureChangesPageContinueButton().click();
		genericMethodsCvp.implicitWait(10000);
		this.getAllChangescaptureCheckboc89941().click();
		genericMethodsCvp.implicitWait(5000);
		this.getFutureChangesPageContinueButton().click();
		genericMethodsCvp.implicitWait(5000);

	}

	public void FutureChangesContinueGuestUser()
	{
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(10000);
		this.getAllChangescaptureCheckboc89941().click();
		genericMethodsCvp.implicitWait(5000);
		this.getFutureChangesPageContinueButton().click();
		genericMethodsCvp.implicitWait(5000);

//		genericMethodsCvp.implicitWait(3000);
//		this.getAllChangeshavebeenCapturedCheckBox().click();
//		genericMethodsCvp.implicitWait(3000);
//		this.ClickFutureChangesPageContinueButton();
//		genericMethodsCvp.implicitWait(3000);
	}
	
	
}
