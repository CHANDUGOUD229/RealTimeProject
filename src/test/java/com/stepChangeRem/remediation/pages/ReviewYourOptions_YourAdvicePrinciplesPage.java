package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Div;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class ReviewYourOptions_YourAdvicePrinciplesPage extends Control {
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
	private Button BackToDashboard;
	private Div OurAdvicePrinciplesDiv;
	private Div AvailableDebtSolParagraphDiv;
	private Button YourAdvicePrinciplesBackButton;
	private Button OurAdvicePrinciplesButton ;
	private Button CreateAccountGuestuser;
	private Button continueButton;
	//getters

	public Button getContinueButton() {
		return continueButton=new Button(By.xpath("//button[.='Continue']"));
	}

	public Button getBackToDashboard() {return BackToDashboard;}
	public Div getOurAdvicePrinciplesDiv() {return OurAdvicePrinciplesDiv;}
	public Div getAvailableDebtSolParagraphDiv() {return AvailableDebtSolParagraphDiv;}
	public Button getYourAdvicePrinciplesBackButton() {return YourAdvicePrinciplesBackButton;}
	public Button getOurAdvicePrinciplesButton() {return OurAdvicePrinciplesButton;}
	public Button getCreateAccountGuestuser() {return CreateAccountGuestuser;}


	public ReviewYourOptions_YourAdvicePrinciplesPage() {
		BackToDashboard=new Button(By.xpath("//button[text()='Back to dashboard']"));
		OurAdvicePrinciplesDiv=new Div(By.xpath("//div[@class='content-item content-label item-1 remove-top-spacing remove-left-spacing remove-bottom-spacing remove-right-spacing flex flex-row heading_1_dataLabelWrite dataLabelWrite heading_1_dataLabelWrite']"));
		OurAdvicePrinciplesButton = new Button(By.xpath("//button[@name='ExplainCharityPolicies_pyWorkPage_32']"));
		AvailableDebtSolParagraphDiv=new Div(By.xpath("(//div[@class='flex-paragraph'])[2]"));
		YourAdvicePrinciplesBackButton=new Button(By.xpath("//button[text()='Back']"));
		CreateAccountGuestuser=new Button(By.xpath("//button[text()='Create an account']"));
	}


	public void ClickOnOurAdvicePrinciplesPageContinueButton() {
		genericMethodsCvp.implicitWait(1000);
		switchToActiveFrame();
		this.getOurAdvicePrinciplesButton().click();
		genericMethodsCvp.implicitWait(10000);
	}

	public void CreateAccountAsaGuestuser()
	{
		this.getCreateAccountGuestuser().click();

	}
	public void ClickOnOurAdvicePronciplesPageContinueButton() {
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(2000);
		this.getOurAdvicePrinciplesButton().click();
		genericMethodsCvp.implicitWait(5000);
	}
	
}
