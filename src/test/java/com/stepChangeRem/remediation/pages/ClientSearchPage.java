package com.stepChangeRem.remediation.pages;

import org.openqa.selenium.By;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Link;
import com.stepchange.atf.controls.TextField;

public class ClientSearchPage extends Control {
//	YouAreAllDonePage youAreAllDone=new YouAreAllDonePage();
	YouAreAllDonePage youAreAllDonePage=new YouAreAllDonePage();
	private Button selectCaseTypeOption;
	private Button createNewDebtAdviceCaseButton;
	private Button createNewPersistentDebtCase ;
	private Link clearSearchLink;
	private TextField clientRefNumberTextField;
	private TextField DAvNumberTextField;
	private TextField firstNameTextField;
	private TextField surNameTextField;
	private TextField postCodeTextField;
	private TextField emailAddressTextField;
	private TextField phoneNumberField;
	private Button searchButton;
	private Button moreIconButton;
	private Button refreshButton;
	private Button HistoryAndAttachmentsButton;
	private Button EndSessionButton;
	private Button reviewButton;
	private Button printButton;
	private Link phoneCallLink;
	private Link firstNameRowClick;
	private Button OpenOfcase;
	private Button PassedDPA;
	private Button RecentcaseClick;


//	public Button getPassedDPA() {
//		return PassedDPA;
//	}
//
//	private Button PassedDPA;
//
//	public Button getOpenOfcase() {
//		return OpenOfcase;
//	}
//
//	private Button OpenOfcase;
//	private Link firstNameRowClick;


//	public YouAreAllDonePage getYouAreAllDone() {
//		return youAreAllDone;
//	}

//	private Link getfirstNameRowClick() {return firstNameRowClick;}


	public Button getSelectCaseTypeOption() { return selectCaseTypeOption;}
	public Button getCreateNewDebtAdviceCaseButton() { return createNewDebtAdviceCaseButton;}
	public Button getCreateNewPersistentDebtCase() {return createNewPersistentDebtCase;}
	public Link getClearSearchLink() {return clearSearchLink;}
	public TextField getClientRefNumberTextField() {return clientRefNumberTextField;}
	public TextField getDAvNumberTextField() {return DAvNumberTextField;}
	public TextField getFirstNameTextField() {return firstNameTextField;}
	public TextField getSurNameTextField() {return surNameTextField;}
	public TextField getPostCodeTextField() {return postCodeTextField;}
	public TextField getEmailAddressTextField() {return emailAddressTextField;}
	public TextField getPhoneNumberField() {return phoneNumberField;}
	public Button getSearchButton() {return searchButton;}
	public Button getMoreIconButton() {return moreIconButton;}
	public Button getRefreshButton() {return refreshButton;}
	public Button getHistoryAndAttachmentsButton() {return HistoryAndAttachmentsButton;}
	public Button getEndSessionButton() {return EndSessionButton;}
	public Button getReviewButton() {return reviewButton;}
	public Button getPrintButton() {return printButton;}
	public Link getPhoneCallLink() {return phoneCallLink;}
	private Link getfirstNameRowClick() {return firstNameRowClick;}
	public Button getOpenOfcase() {return OpenOfcase;}
	public Button getPassedDPA() {return PassedDPA;}
	public Button getRecentcaseClick() {return RecentcaseClick;}
	private TextField ClientReferenceNumberTextBox;
	public TextField getClientReferenceNumberTextBox() {
		return ClientReferenceNumberTextBox;
	}
	private Button SelectFirstOption;
	public Button getSelectFirstOption() {
		return SelectFirstOption;
	}
	private Button OpenButton;
	public Button getOpenButton() {
		return OpenButton;
	}
	public ClientSearchPage()
	{
		selectCaseTypeOption=new Button(By.xpath("//a[text()='Select case type ']"));
		createNewDebtAdviceCaseButton =new Button(By.xpath("//span[text()='Create new debt advice case']"));
		createNewPersistentDebtCase =new Button(By.xpath("//span[text()='Create new persistent debt case']"));
		clearSearchLink=new Link(By.xpath("//a[text()='Clear search']"));
		clientRefNumberTextField =new TextField(By.xpath("//input[@name='$PD_FolderCase_pa4310862631427783pz$pCaseReferenceNumber']"));
		DAvNumberTextField =new TextField(By.xpath("//input[@name='$PD_SCMWork$ppyID']"));
		firstNameTextField =new TextField(By.xpath("//input[@name='$PD_Client_pa4310862682145377pz$ppyFirstName']"));
		surNameTextField =new TextField(By.xpath("//input[@name='$PD_Client_pa4310862682145377pz$ppyLastName']"));
		postCodeTextField =new TextField(By.xpath("//input[@name='$PD_Client_pa4310862682145377pz$ppyPostalCode']"));
		emailAddressTextField =new TextField(By.xpath("//input[@name='$PD_Client_pa4310862682145377pz$ppyEmailAddress']"));
		phoneNumberField =new TextField(By.xpath("//input[@name='$PD_Client_pa4310862682145377pz$ppyPhoneNumber']"));
		searchButton=new Button(By.xpath("//button[text()='Search']"));
		moreIconButton=new Button(By.xpath("//button[@title='Other actions']/i"));
		refreshButton=new Button(By.xpath("//span[text()='Refresh']"));
		HistoryAndAttachmentsButton=new Button(By.xpath("//span[text()='History and Attachments']"));
		EndSessionButton=new Button(By.xpath("//span[text()='End Session']"));
		reviewButton=new Button(By.xpath("//span[text()='Review']"));
		printButton=new Button(By.xpath("//span[text()='Print']"));
		phoneCallLink=new Link(By.xpath("(//*[text()='Phone Call'])[1]"));
		firstNameRowClick=new Link(By.xpath("(//td[@class='gridCell gridCellSelected'])[1]"));
		OpenOfcase=new Button(By.xpath("//button[text()='Open  ']"));
		PassedDPA=new Button(By.xpath("//button[text()='Passed DPA']"));
		RecentcaseClick=new Button(By.xpath("//div[@class='flex  content  pointer  layout-content-default content-default padding-2x']"));
		OpenOfcase=new Button(By.xpath("//button[text()='Open  ']"));
		PassedDPA=new Button(By.xpath("//button[text()='Passed DPA']"));
		ClientReferenceNumberTextBox = new TextField(By.xpath("(//input[@class='leftJustifyStyle'])[1]"));
		SelectFirstOption = new Button(By.xpath("(//tr[@class='oddRow cellCont'])//td[@data-attribute-name='First name']"));


	}
	
	public void createNewDebtAdviceCase() throws InterruptedException {
		Thread.sleep(3000);
		switchToActiveFrame();
//		getBrowser().sleep(getBrowser().getTimeout());
		this.getSelectCaseTypeOption().click();
//		getBrowser().sleep(getBrowser().getTimeout());
		this.getCreateNewDebtAdviceCaseButton().click();
	}
	public void verifyTheSoleClientCase()
	{
		switchToActiveFrame();
		this.getPhoneCallLink().click();
		this.getClientRefNumberTextField().enterTextField(youAreAllDonePage.ClientNumber);
		this.getSearchButton().click();
		this.getfirstNameRowClick().click();
		this.getOpenOfcase().click();
		switchToActiveFrame();
		this.getPassedDPA().click();


	}
	public void EnterClientReferenceNumber(String data) {
		switchToActiveFrame();
		getBrowser().sleep(2000);
		this.getClientReferenceNumberTextBox().enterText(data);
	}


	public void ClickSearchButton() {
		getBrowser().sleep(2000);
		this.getSearchButton().click();

	}

	public void ClickFirstOptionButton() {
		getBrowser().sleep(2000);
		this.getSelectFirstOption().click();

	}

	public void ClickOnOPenButton() {
		getBrowser().sleep(2000);
		this.getOpenButton().click();

	}

	/*public void verifyTheSoleClientCase()
	{
		switchToActiveFrame();
		this.getPhoneCallLink().click();
		this.getClientRefNumberTextField().enterTextField(youAreAllDone.ClientNumber);
		this.getSearchButton().click();
		this.getfirstNameRowClick().click();
		this.getOpenOfcase().click();
		switchToActiveFrame();
		this.getPassedDPA().click();


	}*/
}