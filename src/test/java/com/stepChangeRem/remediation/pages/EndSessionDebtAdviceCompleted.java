package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Dropdown;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class EndSessionDebtAdviceCompleted extends Control{
	
	GenericMethodsRemediation GenericMethods_cvp=new GenericMethodsRemediation();
	private Button endSessionButton ;
	private Button SaveClientData;
	private Dropdown reasonForEndingSession;
	private Button isprovideGeneralAdvise;
	private Button continueBtn;
	
	public Button getEndSessionButton() {return endSessionButton;}
	public Button getSaveClientData() {return SaveClientData;}
	public Dropdown getReasonForEndingSession() {return reasonForEndingSession;}
	public Button getIsprovideGeneralAdvise() {return isprovideGeneralAdvise;}
	public Button getContinueBtn() {return continueBtn;}
	
	public EndSessionDebtAdviceCompleted()
	{
		endSessionButton=new Button(By.xpath("(//Button [@title='Wrap Up'])[1]"));
		SaveClientData=new Button(By.xpath("(//label[text()='No'])[1]"));
		reasonForEndingSession=new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pReasonForInteraction']"));
		isprovideGeneralAdvise=new Button(By.xpath("(//label[text()='No'])[2]"));
		continueBtn=new Button(By.xpath("//button[text()='Submit']"));
	}
	
	public void clickOnEndSessionButton()
	{
		GenericMethods_cvp.implicitWait(2000);
		this.getEndSessionButton().click();
		GenericMethods_cvp.implicitWait(4000);
	}
	
	public void clickOnSaveClientData()
	{	
		GenericMethods_cvp.implicitWait(2000);
		switchToActiveFrame();
		GenericMethods_cvp.implicitWait(1000);
		this.getSaveClientData().click();
		GenericMethods_cvp.implicitWait(3000);	
	}

	public void selectReasonForEndingSession()
	{
		GenericMethods_cvp.implicitWait(3000);
		this.getReasonForEndingSession().selectFromDropdownByText("Full session");
		GenericMethods_cvp.implicitWait(3000);
		this.getReasonForEndingSession().selectFromDropdownByText("Full Session");
		this.getReasonForEndingSession().selectFromDropdownByText("Full session");
	}


	public void submitProvideGeneralAdvise()
	{	
		GenericMethods_cvp.implicitWait(3000);
		this.getIsprovideGeneralAdvise().click();
		GenericMethods_cvp.implicitWait(3000);
	}
	
	public void clickOnSubmitButton()
	{
		GenericMethods_cvp.implicitWait(3000);
		this.getContinueBtn().click();
		GenericMethods_cvp.implicitWait(3000);
		
	}
	public void selectReasonForEndingSessionByIndex()
	{
		GenericMethods_cvp.implicitWait(3000);
		this.getReasonForEndingSession().selectFromDropdownByIndex(1);
		GenericMethods_cvp.implicitWait(3000);
	}
}