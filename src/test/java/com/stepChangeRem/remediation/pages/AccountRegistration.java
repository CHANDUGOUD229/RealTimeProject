package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.*;
import com.stepchange.atf.data.SoleClientaFinancialSol_SC89933_Obj;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.testdata.SoleClientFinancialSolutionsTestData;
import com.stepchange.atf.utilities.RandomGenerators;
import org.openqa.selenium.By;

public class AccountRegistration extends Control {
	GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
	final String email = RandomGenerators.getRandomString();
	public String finalValue = "test"+ email;

	private Div AccountRegistrationHeader;
	private Dropdown Title;
	private TextField firstName;
	private TextField SurName;
	private TextField Dateofbirth;
	private TextField Emailaddress;
	private AutoComplete domain;
	private TextField domain1;
	private Button domainValue;
	private TextField Phonenumber;
	private Dropdown Phonetype;
	private TextField Enteryourpostcode;
	private Button Search;
	private Button Email;
	private Button Phone;
	private Button Post;
	private Button createaccount;
	private Dropdown selectyouraddress;
	private Button domainSearchField;



	//others
	private Checkbox EmailDoNotContactCheckBox;
	private Checkbox PhoNeNumberDoNotContactCheckBox;
	private Link EnterAddressManuallyLink;
	private Checkbox happyForUsToRecordYesCheckBox;
	private Checkbox happyForUsToRecordNoCheckBox;
	private Checkbox SubscribeCheckBox;
	private Button AddRepresentativeButton;
	private Button cancelButton;
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

	//client2
	private Button CreateAccountForPartner;
	private Dropdown TitleClient2;
	private TextField DateofbirthClient2;
	private TextField EmailaddressClient2;
	private AutoComplete domainClient2;
//	private AutoComplete domainClient2;
	private TextField domain2;
	private TextField PhonenumberClient2;
	private Dropdown PhonetypeClient2;
	private Button EmailClient2;

	private Dropdown PhonetypeClient1for89949;
	public Dropdown getPhonetypeClient1for89949() { return PhonetypeClient1for89949; }

	public Div getAccountRegistrationHeader() {return AccountRegistrationHeader;}
	public Dropdown getTitle() {return Title;}
	public TextField getDateofbirth() {return Dateofbirth;}
	public TextField getEmailaddress() {return Emailaddress;}
	public AutoComplete getDomain() {return domain;}
	public TextField getPhonenumber() {return Phonenumber;}
	public Dropdown getPhonetype() {return Phonetype;}
	public TextField getEnteryourpostcode() {return Enteryourpostcode;}
	public Button getSearch() {return Search;}
	public Dropdown getSelectyouraddress() {return selectyouraddress;}
	public Button getEmail() {return Email;}
	public Button getCreateaccount() {return createaccount;}
	public Button getDomainValue() {return domainValue;}
	public Button getDomainSearchField() {return domainSearchField;}

	//others
	public Checkbox getEmailDoNotContactCheckBox() {return EmailDoNotContactCheckBox;}
	public Checkbox getPhoNeNumberDoNotContactCheckBox() {return PhoNeNumberDoNotContactCheckBox;}
	public Link getEnterAddressManuallyLink() {return EnterAddressManuallyLink;}
	public Checkbox getHappyForUsToRecordYesCheckBox() {return happyForUsToRecordYesCheckBox;}
	public Checkbox getHappyForUsToRecordNoCheckBox() {return happyForUsToRecordNoCheckBox;}
	public Checkbox getSubscribeCheckBox() {return SubscribeCheckBox;}
	public Button getAddRepresentativeButton() {return AddRepresentativeButton;}
	public Button getCancelButton() {return cancelButton;}
	public Button getJurisdictionButton() {return JurisdictionButton;}
	public Button getConsiderationsButton() {return ConsiderationsButton;}
	public Button getVulnerabilityButton() {return VulnerabilityButton;}
	public Button getSignpostingButton() {return SignpostingButton;}
	public Button getMoreIconButton() {return moreIconButton;}
	public TextField getCommentsTextBox() {return commentsTextBox;}
	public Button getPostButton() {return postButton;}
	public Button getRefreshButton() {return refreshButton;}
	public Button getHistoryAndAttachmentsButton() {return HistoryAndAttachmentsButton;}
	public Button getNonProceedCaseButton() {return NonProceedCaseButton;}
	public Button getEnquiriesButton() {return EnquiriesButton;}
	public Button getToggleBudgetOnlyButton() {return ToggleBudgetOnlyButton;}
	public Button getSendCorrespondenceButton() {return SendCorrespondenceButton;}
	public Button getReferToEarlyInterventionButton() {return ReferToEarlyInterventionButton;}
	public Button getReviewButton() {return reviewButton;}
	public Button getPrintButton() {return printButton;}
	public Button getPhone() {return Phone;}
	public Button getPost() {return Post;}

	//client2
	public Button getCreateAccountForPartner() {return CreateAccountForPartner;}
	public Dropdown getTitleClient2() {return TitleClient2;}
	public TextField getDateofbirthClient2() {return DateofbirthClient2;}
	public TextField getEmailaddressClient2() {return EmailaddressClient2;}
	public AutoComplete getDomainClient2() {return domainClient2;}
	public TextField getPhonenumberClient2() {return PhonenumberClient2;}
	public Dropdown getPhonetypeClient2() {return PhonetypeClient2;}
	public Button getEmailClient2() {return EmailClient2;}
	public TextField getFirstName() { return firstName; }
	public TextField getSurName() { return SurName; }
	public TextField getdomain1(){return domain1;}
	public TextField getdomain2(){return domain2;}
	public AccountRegistration()
	{
		AccountRegistrationHeader=new Div(By.xpath("//div[text()='Account Registration']"));
		Title=new Dropdown(By.xpath("//Select[@name='$PpyWorkPage$pClientDetails$l1$pTitle']"));
		Dateofbirth=new TextField(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pDateOfBirth']"));
		Emailaddress=new TextField(By.xpath("//input[@title='Email address']"));
		domain=new AutoComplete(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pEmailAddressList$l1$pEmailDomain']"));
		domain1=new TextField(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pEmailAddressList$l1$pEmailDomain']"));
		Phonenumber=new TextField(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pTelephoneNumbers$l1$ppyPhoneNumber']"));
		Phonetype=new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pClientDetails$l1$pTelephoneNumbers$l1$pCommunicationChannelType']"));
		Enteryourpostcode=new TextField(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pAddresses$l1$ppyPostalCode']"));
		Search=new Button(By.xpath("//button[@name='CaptureAddressDetails_pyWorkPage.ClientDetails(1).Addresses(1)_9']"));
		selectyouraddress=new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pClientDetails$l1$pAddresses$l1$pIndex']"));
		Email=new Button(By.xpath("//label[text()='Email']"));
		Phone=new Button(By.xpath("//label[text()='Phone']"));
		Post=new Button(By.xpath("//label[text()='Post']"));
		createaccount=new Button(By.xpath("//button[text()='Create account']"));
		domainValue=new Button(By.xpath("(//div[@class='cellIn'])[1]/span"));
		domainSearchField = new Button(By.className("match-highlight"));
		//client2
		CreateAccountForPartner = new Button(By.xpath("//button[text()='Create account for your partner']"));
		TitleClient2=new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pClientDetails$l2$pTitle']"));
		DateofbirthClient2=new TextField(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l2$pDateOfBirth']"));
		EmailaddressClient2=new TextField(By.xpath("(//input[@title='Email address'])[2]"));
		domainClient2=new AutoComplete(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l2$pEmailAddressList$l1$pEmailDomain']"));
		domain2=new TextField(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l2$pEmailAddressList$l1$pEmailDomain']"));
		PhonenumberClient2=new TextField(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l2$pTelephoneNumbers$l1$ppyPhoneNumber']"));
		PhonetypeClient2=new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pClientDetails$l2$pTelephoneNumbers$l1$pCommunicationChannelType']"));
		EmailClient2=new Button(By.xpath("(//label[text()='Email'])[2]"));
		firstName = new TextField(By.id("bfcfe4d3"));
		SurName = new TextField(By.id("c555364c"));
		PhonetypeClient1for89949=new Dropdown(By.xpath("//div[text()='Phone number']//following::select"));
		//others
		
		EmailDoNotContactCheckBox = new Checkbox(By.xpath("(//label[text()='Do not contact via this method'])[1]"));
		PhoNeNumberDoNotContactCheckBox = new Checkbox(By.xpath("(//label[text()='Do not contact via this method'])[2]"));
		EnterAddressManuallyLink = new Link(By.xpath("//button[text()='Enter address manually']"));
		happyForUsToRecordYesCheckBox = new Checkbox(By.xpath("//label[text()='Yes']"));
		happyForUsToRecordNoCheckBox = new Checkbox(By.xpath("//label[text()='No']"));
		SubscribeCheckBox = new Checkbox(By.xpath("//label[text()='Subscribe']"));
		AddRepresentativeButton = new Button(By.xpath("//button[text()='Add representative']"));
		cancelButton = new Button(By.xpath("(//button[text()='Cancel'])[3]"));
		commentsTextBox = new TextField(By.xpath("//textarea[@placeholder='Write a message...']"));
		postButton = new Button(By.xpath("//button[text()='Post']"));
		JurisdictionButton = new Button(By.xpath("//div[text()='Jurisdiction']"));
		ConsiderationsButton = new Button(By.xpath("//div[text()='Considerations']"));
		VulnerabilityButton = new Button(By.xpath("//div[text()='Vulnerability']"));
		SignpostingButton = new Button(By.xpath("//div[text()='Signposting']"));
		moreIconButton = new Button(By.xpath("//i[@class='pi pi-more pi-blue pi-medium']"));
		refreshButton = new Button(By.xpath("//span[text()='Refresh']"));
		HistoryAndAttachmentsButton = new Button(By.xpath("//span[text()='History and Attachments']"));
		NonProceedCaseButton = new Button(By.xpath("//span[text()='Non proceed case']"));
		EnquiriesButton = new Button(By.xpath("//span[text()='Enquiries']"));
		ToggleBudgetOnlyButton = new Button(By.xpath("//span[text()='Toggle Budget Only']"));
		SendCorrespondenceButton = new Button(By.xpath("//span[text()='Send Correspondence']"));
		ReferToEarlyInterventionButton = new Button(By.xpath("//span[text()='Refer To Early Intervention Team']"));
		reviewButton = new Button(By.xpath("//span[text()='Review']"));
		printButton = new Button(By.xpath("//span[text()='Print']"));


		
	}

	public void isAccountRegistrationFormDisplayed()
	{	
		//getBrowser().sleep(3000);
		//Assert.assertTrue(AccountRegistrationHeader.isElementDisplayed(), "Account Registration Form is not Displayed");
	}

	public void fillAccountRegnForm()
	{
		SoleClientaFinancialSol_SC89933_Obj dataObject = SoleClientFinancialSolutionsTestData.getClientDetails();
		this.getTitle().selectFromDropdownByIndex(1);
		GenericMethods_cvp.implicitWait(2000);
		this.getDateofbirth().enterText("10101990");
		GenericMethods_cvp.implicitWait(2000);
		this.getEmailaddress().enterText(finalValue);
		GenericMethods_cvp.implicitWait(2000);
		this.getDomain().getElement().click();
		GenericMethods_cvp.implicitWait(4000);
		getBrowser().waitForElementToBeClickable(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pEmailAddressList$l1$pEmailDomain']"));
		this.getDomain().enterTextThenSelectFromAutoComplete("gmail.com");
		getBrowser().sleep(getBrowser().getTimeout()/10);
	//	getDriver().findElement(By.id("$PD_ReferenceData_pa-5546708755109443192pz$ppxResults$l12")).click();
		this.getDomain().tab();
		this.getPhonenumber().enterText("+44 7944423456");
		this.getPhonetype().selectFromDropdownByIndex(1);
		getBrowser().sleep(getBrowser().getTimeout()/10);
		this.getEnteryourpostcode().enterTextField("PO16 7GZ");
		this.getSearch().click();
		getBrowser().sleep(getBrowser().getTimeout()/10);
		this.getSelectyouraddress().selectFromDropdownByIndex(1);
		this.getEmail().click();
		getBrowser().sleep(getBrowser().getTimeout()/10);
	}

	public void fillAccountRegnFormClient1()
	{
		SoleClientaFinancialSol_SC89933_Obj dataObject = SoleClientFinancialSolutionsTestData.getClientDetails();
		this.getTitle().selectFromDropdownByIndex(1);
		GenericMethods_cvp.implicitWait(3000);
		this.getDateofbirth().enterText("10101990");
		GenericMethods_cvp.implicitWait(3000);
		this.getEmailaddress().enterText(finalValue);
		GenericMethods_cvp.implicitWait(3000);
		this.getDomain().getElement().click();
		GenericMethods_cvp.implicitWait(3000);
		getBrowser().waitForElementToBeClickable(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pEmailAddressList$l1$pEmailDomain']"));
		GenericMethods_cvp.implicitWait(3000);
		this.getDomain().enterTextThenSelectFromAutoComplete("gmail.com");
		GenericMethods_cvp.implicitWait(3000);
		getBrowser().sleep(getBrowser().getTimeout()/10);
		GenericMethods_cvp.implicitWait(3000);
		this.getDomain().tab();
		this.getPhonenumber().enterText("+44 7944423456");
		GenericMethods_cvp.implicitWait(3000);
		this.getPhonetype().selectFromDropdownByIndex(1);
		GenericMethods_cvp.implicitWait(3000);
		getBrowser().sleep(getBrowser().getTimeout()/10);
		this.getEnteryourpostcode().enterText("PO16 7GZ");
		GenericMethods_cvp.implicitWait(3000);
		getBrowser().sleep(getBrowser().getTimeout()/10);
		this.getSearch().click();
		getBrowser().sleep(getBrowser().getTimeout()/10);
		GenericMethods_cvp.implicitWait(3000);
		this.getSelectyouraddress().selectFromDropdownByIndex(1);
		GenericMethods_cvp.implicitWait(3000);
		this.getEmail().click();
		GenericMethods_cvp.implicitWait(3000);
		getBrowser().sleep(getBrowser().getTimeout()/10);
	}


	public void createAccount()
	{
		scrollElementIntoView();
		GenericMethods_cvp.implicitWait(4000);
		this.getCreateaccount().click();
		GenericMethods_cvp.implicitWait(3000);
		getBrowser().sleep(3000);
	}

	public void fillAccountRegnFormClient2()
	{
//		this.fillConfirmEmailAddressDetails();
		this.getCreateAccountForPartner().click();
		GenericMethods_cvp.implicitWait(3000);
		this.getTitleClient2().selectFromDropdownByIndex(1);
		GenericMethods_cvp.implicitWait(3000);
		this.getDateofbirthClient2().enterText("10111980");
		GenericMethods_cvp.implicitWait(3000);
		this.getEmailaddressClient2().enterText(finalValue+"1");
		GenericMethods_cvp.implicitWait(2000);
		this.getDomainClient2().getElement().click();
		GenericMethods_cvp.implicitWait(3000);
		getBrowser().waitForElementToBeClickable(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l2$pEmailAddressList$l1$pEmailDomain']"));
		getBrowser().sleep(5000);
		GenericMethods_cvp.implicitWait(3000);
		this.getDomainClient2().enterTextThenSelectFromAutoComplete("gmail.com");
		this.getDomainClient2().tab();
		GenericMethods_cvp.implicitWait(3000);
		this.getPhonenumberClient2().enterText("+44 7944423456");
		GenericMethods_cvp.implicitWait(3000);
		this.getPhonetypeClient2().selectFromDropdownByIndex(1);
		GenericMethods_cvp.implicitWait(3000);
		this.getEmailClient2().click();
		GenericMethods_cvp.implicitWait(3000);
	}
	public void fillAccountRegnFormGuestUser()
	{

		this.getTitle().selectFromDropdownByText("Mr");
		this.getDateofbirth().enterText("10101990");
		this.getEmailaddress().enterText("Remo10");
		getBrowser().waitForElementToBeClickable(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pEmailAddressList$l1$pEmailDomain']"));
		this.getDomain().enterText("aol.com");
		GenericMethods_cvp.implicitWait(2000);
		this.getDomain().enterText("aol.com");
		getBrowser().sleep(getBrowser().getTimeout()/10);
		this.getDomain().tab();
		this.getPhonenumber().enterText("+44 7944423456");
		this.getPhonetype().selectFromDropdownByText("Mobile");
		this.getEnteryourpostcode().enterText("PO167GZ");
		this.getSearch().click();
		this.getSelectyouraddress().selectFromDropdownByIndex(1);
		this.getEmail().click();
		this.getCreateaccount().click();
		//this.getCreateaccount().click();
	}

	public void fillConfirmEmailAddressDetails() {
		getBrowser().sleep(getBrowser().getTimeout()/10);
		ConfirmEmailAddressPage confirmEmailAddressPage = new ConfirmEmailAddressPage();
		confirmEmailAddressPage.getEmailAddressClient01().enterCharByChar(finalValue +"@gmail.com");
		confirmEmailAddressPage.getConfirmEmailTitle().click();
		GenericMethods_cvp.implicitWait(2000);
		confirmEmailAddressPage.getConfirmBtn().click();
		GenericMethods_cvp.implicitWait(2000);

	}

	public void fillUserDetailsAsJointMPA()
	{
		switchToActiveFrame();
		this.getTitle().selectFromDropdownByIndex(1);
		this.getDateofbirth().enterText("10101990");
		this.getEmailaddress().enterText("Annie605");
		getBrowser().sleep(getBrowser().getTimeout()/10);
		this.getDomain().getElement().click();
		getBrowser().waitForElementToBeClickable(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pEmailAddressList$l1$pEmailDomain']"));
		this.getdomain1().enterCharByChar("gmail.com");
		getBrowser().sleep(getBrowser().getTimeout()/10);
		this.getdomain1().enterTextField("gmail.com");
		getBrowser().sleep(getBrowser().getTimeout()/10);
		//	getDriver().findElement(By.id("$PD_ReferenceData_pa-5546708755109443192pz$ppxResults$l12")).click();
		this.getDomain().tab();
		this.getPhonenumber().enterText("+44 7944423456");
		this.getPhonetype().selectFromDropdownByIndex(1);
		getBrowser().sleep(getBrowser().getTimeout()/10);
		this.getEnteryourpostcode().enterTextField("PO16 7GZ");
		this.getSearch().click();
		getBrowser().sleep(getBrowser().getTimeout()/10);
		this.getSelectyouraddress().selectFromDropdownByIndex(1);
		this.getEmail().click();
		getBrowser().sleep(getBrowser().getTimeout()/10);

	}
	public void fillAccountRegnFormSC89934()
	{
		SoleClientaFinancialSol_SC89933_Obj dataObject = SoleClientFinancialSolutionsTestData.getClientDetails();
		this.getTitle().selectFromDropdownByIndex(1);
		this.getDateofbirth().enterText("10101975");
		this.getEmailaddress().enterText(finalValue);
		GenericMethods_cvp.implicitWait(2000);
		this.getDomain().getElement().click();
		getBrowser().waitForElementToBeClickable(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pEmailAddressList$l1$pEmailDomain']"));
		getBrowser().sleep(500);
		this.getDomain().enterTextThenSelectFromAutoComplete("gmail.com");
		this.getDomain().enterTextThenSelectFromAutoComplete("gmail.com");
		this.getDomain().tab();
		GenericMethods_cvp.implicitWait(2000);
//		getDriver().findElement(By.id("$PD_ReferenceData_pa-5546708755109443192pz$ppxResults$l12")).click();
		this.getDomain().tab();
		this.getPhonenumber().enterText("+44 7944423456");
		this.getPhonetype().selectFromDropdownByIndex(1);
		this.getEnteryourpostcode().enterText("PO167GZ");
		this.getSearch().click();
		this.getSelectyouraddress().selectFromDropdownByIndex(1);
		this.getEmail().click();
		getBrowser().sleep(getBrowser().getTimeout()/10);
		getBrowser().waitForElementToBeClickable(By.name("AccountRegistration_pyWorkPage_35"));
		getDriver().findElement(By.name("AccountRegistration_pyWorkPage_35")).click();
	}
	public void fillAccountRegnFormSC89937()
	{
		SoleClientaFinancialSol_SC89933_Obj dataObject = SoleClientFinancialSolutionsTestData.getClientDetails();
		this.getTitle().selectFromDropdownByIndex(1);
		this.getDateofbirth().enterText("10101993");
		this.getEmailaddress().enterText(finalValue);
		GenericMethods_cvp.implicitWait(2000);
		this.getDomain().getElement().click();
		getBrowser().waitForElementToBeClickable(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pEmailAddressList$l1$pEmailDomain']"));
		getBrowser().sleep(500);
		this.getDomain().enterTextThenSelectFromAutoComplete("gmail.com");
		this.getDomain().enterTextThenSelectFromAutoComplete("gmail.com");
		this.getDomain().tab();
		GenericMethods_cvp.implicitWait(2000);
//		getDriver().findElement(By.id("$PD_ReferenceData_pa-5546708755109443192pz$ppxResults$l12")).click();
		this.getDomain().tab();
		this.getPhonenumber().enterText("+44 7944423456");
		this.getPhonetype().selectFromDropdownByIndex(1);
		this.getEnteryourpostcode().enterText("PO167GZ");
		this.getSearch().click();
		this.getSelectyouraddress().selectFromDropdownByIndex(1);
		this.getEmail().click();
		getBrowser().sleep(getBrowser().getTimeout()/10);
//		getBrowser().waitForElementToBeClickable(By.name("AccountRegistration_pyWorkPage_35"));
//		getDriver().findElement(By.name("AccountRegistration_pyWorkPage_35")).click();
	}

	public void fillAccountRegnFormofClient1For89949()
	{

		this.getTitle().selectFromDropdownByText("Mr");
		this.getDateofbirth().enterText("10102002");
		this.getEmailaddress().enterText("Sele");
		getBrowser().waitForElementToBeClickable(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pEmailAddressList$l1$pEmailDomain']"));
		this.getDomain().enterText("aol.com");
		GenericMethods_cvp.implicitWait(2000);
		this.getDomain().enterText("aol.com");
		this.getDomain().tab();
		this.getPhonenumber().enterText("+44 7895763456");
		this.getPhonetypeClient1for89949().selectFromDropdownByText("Mobile");
		this.getEnteryourpostcode().enterText("ls84hy");
		this.getSearch().click();
		GenericMethods_cvp.selectByIndex(getSelectyouraddress(),1);
		this.getEmail().click();
	}

	public void fillAccountRegnFormClient2for89949()
	{
		this.getCreateAccountForPartner().click();
		this.getTitleClient2().selectFromDropdownByText("Mr");
		this.getDateofbirthClient2().enterText("10112002");
		this.getEmailaddressClient2().enterText("Jain");
		getBrowser().waitForElementToBeClickable(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l2$pEmailAddressList$l1$pEmailDomain']"));
		this.getDomainClient2().enterText("aol.com");
		GenericMethods_cvp.implicitWait(2000);
		this.getDomainClient2().enterText("aol.com");
		this.getDomainClient2().tab();
		this.getPhonenumberClient2().enterText("+44 7909423456");
		this.getPhonetypeClient2().selectFromDropdownByText("Mobile");
		this.getEmailClient2().click();

	}


}
