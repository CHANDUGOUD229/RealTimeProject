package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Dropdown;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class CaptureReasonForNonProceedPage extends Control {
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
	
	private Dropdown ClientNotProceeding;
	private Button CaptureresonePageSubmitButton;
	
	public Dropdown getClientNotProceeding() {	return ClientNotProceeding;	}
	public Button getCaptureresonePageSubmitButton() {	return CaptureresonePageSubmitButton;	}
	
	public CaptureReasonForNonProceedPage() {
		
		ClientNotProceeding = new Dropdown(By.xpath("//select [@name='$PpyWorkPage$pNonProceedReason']"));
		CaptureresonePageSubmitButton = new Button(By.xpath("//button[normalize-space()='Submit']"));
	}
    public void SetOfActionOnCaptureReasoneNonProceed() {
    	this.getClientNotProceeding().selectFromDropdownByIndex(1);
    	this.getCaptureresonePageSubmitButton().click();
    }
}
