package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class CaptureReferralPage extends Control {
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();

	private Button DirectButton;
	private AutoComplete WhoReferredthemDropdown;
	private Button WhoReferredthemDropdownValue;
	private Button ContinueButton;
	private Button errButton;
	private Dropdown ErrWhoReferdDrop;
	private Button referralRoutePACEButton;
	private Button JurisdictionButton;
	private Button ConsiderationsButton;
	private Button VulnerabilityButton;
	private Button SignpostingButton;
	private Button moreIconButton;
	private TextField commentsTextBox;
	private Button postButton;
	private Button refreshButton;
	private Button HistoryAndAttachmentsButton;
	private Button NonProceedCaseButton;
	private Button EnquiriesButton;
	private Button ToggleBudgetOnlyButton;
	private Button SendCorrespondenceButton;
	private Button ReferToEarlyInterventionButton;
	private Button reviewButton;
	private Button printButton;
	private Button selectSecondValue;
	private Dropdown whoReferredThem;

	public Dropdown getWhoReferredThem() {
		return whoReferredThem=new Dropdown(By.name("$PpyWorkPage$pReferrer$pCode"));
	}

	public Button getDirectButton() {
		return DirectButton;
	}

	public AutoComplete getWhoReferredthemDropdown() {
		return WhoReferredthemDropdown;
	}

	public Button getContinueButton() {
		return ContinueButton;
	}

	public Button getWhoReferredthemDropdownValue() {
		return WhoReferredthemDropdownValue;
	}

	public Button geterrButton() {
		return errButton;
	}

	public Dropdown getErrWhoReferdDrop() {
		return ErrWhoReferdDrop;
	}

	public Button getReferralRoutePACEButton() {
		return referralRoutePACEButton;
	}

	public Button getJurisdictionButton() {
		return JurisdictionButton;
	}

	public Button getConsiderationsButton() {
		return ConsiderationsButton;
	}

	public Button getVulnerabilityButton() {
		return VulnerabilityButton;
	}

	public Button getSignpostingButton() {
		return SignpostingButton;
	}

	public Button getMoreIconButton() {
		return moreIconButton;
	}

	public TextField getCommentsTextBox() {
		return commentsTextBox;
	}

	public Button getPostButton() {
		return postButton;
	}

	public Button getRefreshButton() {
		return refreshButton;
	}

	public Button getHistoryAndAttachmentsButton() {
		return HistoryAndAttachmentsButton;
	}

	public Button getNonProceedCaseButton() {
		return NonProceedCaseButton;
	}

	public Button getEnquiriesButton() {
		return EnquiriesButton;
	}

	public Button getToggleBudgetOnlyButton() {
		return ToggleBudgetOnlyButton;
	}

	public Button getSendCorrespondenceButton() {
		return SendCorrespondenceButton;
	}

	public Button getReferToEarlyInterventionButton() {
		return ReferToEarlyInterventionButton;
	}

	public Button getReviewButton() {
		return reviewButton;
	}

	public Button getPrintButton() {
		return printButton;
	}

	public Button getSelectSecondValue() {
		return selectSecondValue;
	}


	public CaptureReferralPage() {
		DirectButton = new Button(By.xpath("(//label[@class='rb_segmented rb_standard radioLabel'])[1]"));
		WhoReferredthemDropdown = new AutoComplete(By.xpath("//input[@class='autocomplete_input ac_']"));
		errButton = new Button(By.xpath("(//label[@class='rb_segmented rb_standard radioLabel'])[3]"));
		ContinueButton = new Button(By.xpath("//Button[text()='Continue']"));
		WhoReferredthemDropdownValue = new Button(By.xpath("//div[@class='cellIn']"));
		ErrWhoReferdDrop = new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pReferrer$pDescription']"));

		referralRoutePACEButton = new Button(By.xpath("//label[text()='PACE']"));
		JurisdictionButton = new Button(By.xpath("//div[text()='Jurisdiction']"));
		ConsiderationsButton = new Button(By.xpath("//div[text()='Considerations']"));
		VulnerabilityButton = new Button(By.xpath("//div[text()='Vulnerability']"));
		SignpostingButton = new Button(By.xpath("//div[text()='Signposting']"));
		moreIconButton = new Button(By.xpath("//i[@class='pi pi-more pi-blue pi-medium']"));
		commentsTextBox = new TextField(By.xpath("//textarea[@title='Enter your note ...']"));
		postButton = new Button(By.xpath("//button[text()='Post']"));
		refreshButton = new Button(By.xpath("//span[text()='Refresh']"));
		HistoryAndAttachmentsButton = new Button(By.xpath("//span[text()='History and Attachments']"));
		NonProceedCaseButton = new Button(By.xpath("//span[text()='Non proceed case']"));
		EnquiriesButton = new Button(By.xpath("//span[text()='Enquiries']"));
		ToggleBudgetOnlyButton = new Button(By.xpath("//span[text()='Toggle Budget Only']"));
		SendCorrespondenceButton = new Button(By.xpath("//span[text()='Send Correspondence']"));
		ReferToEarlyInterventionButton = new Button(By.xpath("//span[text()='Refer To Early Intervention Team']"));
		reviewButton = new Button(By.xpath("//span[text()='Review']"));
		printButton = new Button(By.xpath("//span[text()='Print']"));
		selectSecondValue = new Button(By.xpath("//*[@data-gargs ='[\"OG10020\",\"ORG1198\",\"Other\"]']"));
	}


public void ClickReferralRouteDirectButton() {
	switchToActiveFrame();
	this.getDirectButton().click();
	genericMethodsCvp.implicitWait(1000);
}
public void ClickReferralRouteErrMethod() {
	getBrowser().waitForElementToBeClickable(By.xpath("(//label[@class='rb_segmented rb_standard radioLabel'])[3]"));
	this.geterrButton().click();

}	

public void EntertextinWhoreferredThemTextField() {

	this.getWhoReferredthemDropdown().enterText("118 118 Money");
	WhoReferredthemDropdownValue.click();


}
	public void EntertextinWhoreferredThemTextField(String s) {

		this.getWhoReferredthemDropdown().enterText("118 118 Money");
		WhoReferredthemDropdownValue.click();


	}
public void SelectERRDropDownValue(String ERRDropDownValue) {

	genericMethodsCvp.implicitWait(5000);  
	genericMethodsCvp.selectByText(ErrWhoReferdDrop, ERRDropDownValue);

    
}	

public void ClickCaptureReferralContinue() {

	ContinueButton.click();
	
}

	public void enterAndSelectValueFromWhoReferredThem(String value) {
		genericMethodsCvp.implicitWait(10000);
		switch (value) {
			case "Other":
				genericMethodsCvp.implicitWait(10000);
//				getBrowser().sleep(getBrowser().getTimeout());
				this.getWhoReferredthemDropdown().enterTextThenSelectFromAutoComplete(value);
//				this.getWhoReferredthemDropdown().clickScreenElement(this.getWhoReferredthemDropdown().getElement());
				genericMethodsCvp.implicitWait(3000);
				this.getWhoReferredthemDropdown().enterTextThenSelectFromAutoComplete(value);
//				JavascriptExecutor js = (JavascriptExecutor) getBrowser().getDriver()	;
//				js.executeScript("arguments[0].setAttribute(arguments[1], arguments[2]);",this.getWhoReferredthemDropdown().getElement(),
//						"value",
//						value);
			//	getBrowser().getTimeout();
				genericMethodsCvp.implicitWait(3000);
				this.getSelectSecondValue().click();
				break;
			case "Who referred them?":
				genericMethodsCvp.implicitWait(10000);
				genericMethodsCvp.implicitWait(3000);
				this.getWhoReferredThem().selectFromDropdownByText(value);
		}

		getBrowser().getTimeout();
		this.ClickCaptureReferralContinue();

	}
	public void captureReferralRoute () {
		this.DirectButton.click();
		genericMethodsCvp.selectByText(ErrWhoReferdDrop, "Other");

	}

		public void fillCaptureReferralpage ()
		{
			switchToActiveFrame();
			scrollElementIntoView();
			this.getDirectButton().click();
			this.getWhoReferredthemDropdownValue().click();
			genericMethodsCvp.selectByText(ErrWhoReferdDrop, "Other");
			this.getContinueButton().click();
		}
	public void fillCaptureReferralpage89934(String value)
	{
		switchToActiveFrame();
		this.getDirectButton().click();
		this.getWhoReferredthemDropdown().enterTextThenSelectFromAutoComplete(value);
		getBrowser().getTimeout();
		selectSecondValue.click();
		this.getContinueButton().click();
	}


	public void EntertextOtherinWhoreferredThemTextField(String data1) {

		this.getWhoReferredthemDropdown().enterText(data1);
		selectSecondValue.click();
		this.getContinueButton().click();
	}

	}

