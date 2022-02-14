package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Div;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.junit.Assert;
import org.openqa.selenium.By;

public class YouAreAllDonePage extends Control {
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
	private Button EndSessionButton;
	public String ClientNumber;
	private Div ClientNumberDiv;
	private Div ResolvedNonProceedtext;


	public Div getResolvedNonProceedtext() {
		return ResolvedNonProceedtext;
	}
//	public Div getClientNumberDiv() {
//		return ClientNumberDiv;
//	}
//
//
//	private Div ClientNumberDiv;
//	public String ClientNumber;

	public Button getEndSessionButton() {
		return EndSessionButton;
	}
	public Div getClientNumberDiv() {
		return ClientNumberDiv;
	}
	public YouAreAllDonePage() {
	EndSessionButton= new Button(By.xpath("//button[@name='EndSession_D_Interaction_pa2851567396883437pz_3']"));
		ClientNumberDiv=new Div(By.xpath("//div[@class='content-item content-field item-3 remove-bottom-spacing remove-right-spacing flex flex-row dataValueRead']"));
		ResolvedNonProceedtext = new Div(By.xpath("//span[text()='Resolved-NonProceed']"));


	}
	
	public void ClickOnEndSessionButton() {
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(1000);
		this.getEndSessionButton().click();
	}
	public void CaptureClientNumber()
	{
		switchToActiveFrame();
		ClientNumber=this.getClientNumberDiv().getText();
		this.getEndSessionButton().click();
	}
	public void VerifyResolvedNonProceedTextFromYouareAllDonePage() {
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(1000);
		String text =this.getResolvedNonProceedtext().getText();
		Assert.assertEquals(text, "Resolved-NonProceed");
	}


}
