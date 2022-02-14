package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class YourHouseHoldPage extends Control{
	GenericMethodsRemediation  GenericMethod = new GenericMethodsRemediation();
	
    private Button BackToDashboard;
	private Dropdown HouseStatus;	
	private Checkbox LivesinNonStandardHouseChb;
	private Dropdown MaritalStatus;
	private Button ChildrenUnder16LivingWithClientAddButton;
	private Button ChildrenUnder16LivingWithClientSubstractButton;
	private Button ChildrenUnder16and18LivingWithClientAddButton;
	private Button ChildrenUnder16and18LivingWithClientSubstractButton;
	private Button AdultsLivingWithClientToAddButton;
	private Button AdultsLivingWithClientToSubstractButton;
	private Checkbox IstheirHouseholdAware;
	private Dropdown ClientEmployementStatus;
	private Dropdown ClientPartnerEmploymentStatus;
	private Button VehiclesdoesclientPayAddButton;
	private Button VehiclesdoesclientPaySubstractButton;
	private Button YourHouseholdContinueButton;
	private Button YourHouseholdPagebackButton;
	private TextField YourHouseholdCommentsArea;
	private Button YourHouseholdCommentsPostButton;
	private Button HousHoldPopUpText;
	private Div HouseholdPopupNumberOfpeopleDiv;
	private Button HouseHoldSummaryConfirm;
    private Dropdown EmploymentStatusClientTwo;
    private TextField vehiclesDoesTheClientPay;

    private TextField ChildrenUnder16TextBox;
	public TextField  getChildrenUnder16TextBox() {
		return ChildrenUnder16TextBox;
	}
	///Gettermethods

	public Button getBackToDashBoard() {return BackToDashboard;}
	public Dropdown getHouseStatus() { return HouseStatus;}
	public Checkbox getLivesinNonStandardHouseChb() {return LivesinNonStandardHouseChb;}
	public Dropdown getMaritalStatus() { return MaritalStatus; }
	public Button getChildrenUnder16LivingWithClientAddButton() {return ChildrenUnder16LivingWithClientAddButton; }
	public Button getChildrenUnder16LivingWithClientSubstractButton() {return ChildrenUnder16LivingWithClientSubstractButton; }
	public Button getChildrenUnder16and18LivingWithClientAddButton() {return ChildrenUnder16and18LivingWithClientAddButton;}
	public Button getChildrenUnder16and18LivingWithClientSubstractButton() {return ChildrenUnder16and18LivingWithClientSubstractButton;}
	public Button getAdultsLivingWithClientToAddButton() {return AdultsLivingWithClientToAddButton;}
	public Button getAdultsLivingWithClientToSubstractButton() {return AdultsLivingWithClientToSubstractButton;}
	public Checkbox getIstheirHouseholdAware() {return IstheirHouseholdAware;}
	public Dropdown getClientEmployementStatus() {return ClientEmployementStatus;}
	public Dropdown getClientPartnerEmploymentStatus() {return ClientPartnerEmploymentStatus;}
	public Button getVehiclesdoesclientPayAddButton() {return VehiclesdoesclientPayAddButton;}
	public Button getVehiclesdoesclientPaySubstractButton() {return VehiclesdoesclientPaySubstractButton;}
	public Button getYourHouseholdContinueButton() {return YourHouseholdContinueButton;}
    public Button getYourHouseholdPagebackButton() {return YourHouseholdPagebackButton;}
    public TextField getYourHouseholdCommentsArea() {return YourHouseholdCommentsArea;}
	public Button getYourHouseholdCommentsPostButton() {return YourHouseholdCommentsPostButton;}
	public Button getHousHoldPopUpText() {return HousHoldPopUpText;}
	public Div getHouseholdPopupNumberOfpeopleDiv() {return HouseholdPopupNumberOfpeopleDiv; }
	public Button getHouseHoldSummaryConfirm() {return HouseHoldSummaryConfirm;	}
	public Dropdown getEmploymentStatusClientTwo()	{return EmploymentStatusClientTwo;}
	public TextField getVehiclesDoesTheClientPay() {
		return vehiclesDoesTheClientPay;
	}
	//Constructor
	public YourHouseHoldPage() {
		BackToDashboard=new Button(By.xpath("//a[text()='Back to dashboard']"));
		HouseStatus = new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pHouseholdComposition$pHousingTenure']"));
		LivesinNonStandardHouseChb=new Checkbox(By.xpath("//label[text()='Lives in a non-standard house']"));
		MaritalStatus = new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pClientDetails$l1$pMaritalStatus']"));	
        ChildrenUnder16LivingWithClientAddButton=new Button(By.xpath("(//span[@class='inc-button ico-fill-plus'])[1]"));
		ChildrenUnder16LivingWithClientSubstractButton=new Button(By.xpath("(//span[@class='dec-button ico-fill-minus disabled'])[1]"));
		ChildrenUnder16and18LivingWithClientAddButton=new Button(By.xpath("(//span[@class='inc-button ico-fill-plus'])[2]"));
		ChildrenUnder16and18LivingWithClientSubstractButton=new Button(By.xpath("(//span[@class='dec-button ico-fill-minus disabled'])[2]"));
		AdultsLivingWithClientToAddButton = new Button(By.xpath("(//span[@class='inc-button ico-fill-plus'])[3]"));
		AdultsLivingWithClientToSubstractButton= new Button(By.xpath("(//span[@class='dec-button ico-fill-minus disabled'])[3]"));
		IstheirHouseholdAware=new Checkbox(By.xpath("//label[text()='Their household is not aware']"));
		ClientEmployementStatus = new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pClientDetails$l1$pCurrentEmploymentStatusUI']"));
		ClientPartnerEmploymentStatus=new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pClientDetails$l2$pCurrentEmploymentStatusUI']"));
		VehiclesdoesclientPayAddButton=new Button(By.xpath("(//span[@class='inc-button ico-fill-plus'])[3]"));
		VehiclesdoesclientPaySubstractButton=new Button(By.xpath("(//span[@class='dec-button ico-fill-minus disabled'])[3]"));
		YourHouseholdContinueButton  = new Button(By.xpath("//button[@class='SC_Button_Primary pzhc pzbutton']"));
		YourHouseholdPagebackButton=new Button(By.xpath("//button[text()='Back']"));
		YourHouseholdCommentsArea=new TextField(By.xpath("//textarea[@name='$PD_pxRenderPosts_pa4389216431140625pz$ppyPostPage$ppyMessage']"));
		YourHouseholdCommentsPostButton=new Button(By.xpath("//button[text()='Post']"));
		HousHoldPopUpText = new Button (By.xpath("//span[@id='modaldialog_hd_title']"));
		HouseholdPopupNumberOfpeopleDiv=new Div(By.xpath("//span[@data-test-id='20200630233027018422969']"));
		HouseHoldSummaryConfirm = new Button(By.xpath("//button[text()='Confirm']"));
		EmploymentStatusClientTwo=new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pClientDetails$l2$pCurrentEmploymentStatusUI']"));
		vehiclesDoesTheClientPay = new TextField(By.name("$PpyWorkPage$pHouseholdComposition$pVehiclesInBudget"));
		ChildrenUnder16TextBox = new TextField(By.xpath("//input[@name='$PpyWorkPage$pHouseholdComposition$pChildrenUnder16']"));
	}

	public void ActionSetYourHouseHold89934() {
		this.getHouseStatus().selectFromDropdownByIndex(3);
		this.getMaritalStatus().selectFromDropdownByIndex(3);
		for (int i = 0; i < 2; i++){
			this.getChildrenUnder16LivingWithClientAddButton().click();
			}
		this.getClientEmployementStatus().selectFromDropdownByIndex(6);
		this.getYourHouseholdContinueButton().click();
		this.getHouseHoldSummaryConfirm().click();
	}
	public void ActionSetYourHouseHold89937() {
		this.getHouseStatus().selectFromDropdownByIndex(9);
		this.getMaritalStatus().selectFromDropdownByIndex(6);
//		for (int i = 0; i < 2; i++){
//			this.getChildrenUnder16LivingWithClientAddButton().click();
//		}
		this.getClientEmployementStatus().selectFromDropdownByIndex(5);
		this.getYourHouseholdContinueButton().click();
		this.getHouseHoldSummaryConfirm().click();
	}
	public void SelectHouseStatusFromDropDown(String HouseStatusText) {
		GenericMethod.selectByText(HouseStatus, HouseStatusText);
	}
	public void SelectmaritalStatusFromDropDown(String MaritalStatustext) {
		GenericMethod.selectByText(MaritalStatus, MaritalStatustext);

	}

	public void SelectClientEmployementStatusFromDropDown(String ClientEmployeeStatusText) {
		GenericMethod.selectByText(ClientEmployementStatus,ClientEmployeeStatusText );

	}

	public void ClickAdultsLivingWithClientToAddButton() {
		this.getAdultsLivingWithClientToAddButton().click();
	}

	public void ClickYourHouseholdContinueButton() {
		this.getYourHouseholdContinueButton().click();
	}

	public void ClickOnHousHoldPopUpTextField() {
		this.getHousHoldPopUpText().click();
	}

	public void ClickHouseHoldSummaryConfirmButton() {
		this.getYourHouseholdContinueButton().click();
	}

	//Lavanya-89929
	public void SelectClientEmploymentStatusClientTwo(String ClientTwoEmployeeStatus) {
		GenericMethod.selectByText(this.getEmploymentStatusClientTwo(),ClientTwoEmployeeStatus);
	}
	public void FillClient01Client02Details()
	{
		GenericMethod.selectByText(this.getHouseStatus(), "Owns property outright");
		GenericMethod.selectByText(this.getMaritalStatus(), "Married");
		GenericMethod.selectByText(this.getClientEmployementStatus(),"Retired" );
		GenericMethod.selectByText(this.getClientEmployementStatus(),"Retired");
		GenericMethod.selectByText(this.getEmploymentStatusClientTwo(),"Retired");
		this.getYourHouseholdContinueButton().click();
		GenericMethod.implicitWait(2000);
		this.getHouseHoldSummaryConfirm().click();
	}

	public void submitHouseHoldPageWithValidDataForAllScenarios(String Scenario){
		switch (Scenario) {
			case "89936":
				GenericMethod.implicitWait(2000);
				this.getHouseStatus().selectFromDropdownByIndex(10);
				GenericMethod.implicitWait(2000);
				this.getMaritalStatus().selectFromDropdownByIndex(5);
				GenericMethod.implicitWait(2000);
				this.getChildrenUnder16LivingWithClientAddButton().click();
				this.getChildrenUnder16and18LivingWithClientAddButton().click();
				GenericMethod.implicitWait(2000);
				this.getClientEmployementStatus().selectFromDropdownByIndex(3);
				this.getClientEmployementStatus().selectFromDropdownByText("Zero hour contract");
				break;
			case "89924":
				GenericMethod.implicitWait(2000);
				this.getHouseStatus().selectFromDropdown("TNR0001");
				GenericMethod.implicitWait(2000);
				this.getMaritalStatus().selectFromDropdown("PMA0006");
				GenericMethod.implicitWait(2000);
				this.getClientEmployementStatus().selectFromDropdown("EMS0001");
				break;
			case "89933":
			GenericMethod.implicitWait(2000);
			this.getHouseStatus().selectFromDropdownByIndex(5);
			GenericMethod.implicitWait(2000);
			this.getMaritalStatus().selectFromDropdownByIndex(1);
			GenericMethod.implicitWait(2000);
			this.getChildrenUnder16and18LivingWithClientAddButton().click();
			GenericMethod.implicitWait(2000);
			GenericMethod.implicitWait(2000);
			this.getClientEmployementStatus().selectFromDropdownByIndex(1);


		}
		this.getYourHouseholdContinueButton().click();
		GenericMethod.implicitWait(2000);
		this.getHouseHoldSummaryConfirm().click();

	}






	public void submitHouseHoldPageWithValidData(){
		GenericMethod.implicitWait(2000);
		this.getHouseStatus().selectFromDropdownByText("Renting - Council");
		this.getMaritalStatus().selectFromDropdownByText("Cohabiting");
		this.getClientEmployementStatus().selectFromDropdownByText("Full-time employed");
		this.getClientPartnerEmploymentStatus().selectFromDropdownByText("Unemployed: not looking for work");
		this.getYourHouseholdContinueButton().click();
		GenericMethod.implicitWait(2000);
		this.getHouseHoldSummaryConfirm().click();



	}


	public void submitHouseHoldPageWithValidData89925(){
		GenericMethod.implicitWait(10000);
		getBrowser().sleep(100);
		this.getHouseStatus().selectFromDropdownByIndex(8);
//		this.getHouseStatus().enter();
//		this.getHouseStatus().tab();
		getBrowser().sleep(100);
		GenericMethod.implicitWait(20000);
		this.getMaritalStatus().selectFromDropdownByIndex(4);
		this.getClientEmployementStatus().selectFromDropdownByIndex(1);
		this.getVehiclesDoesTheClientPay().enterText("2");
		this.getYourHouseholdContinueButton().click();
		GenericMethod.implicitWait(2000);
		this.getHouseHoldSummaryConfirm().click();
	}



	public void EnterChildrensUnder16(String count) {
		this.getChildrenUnder16TextBox().enterText(count);
	}
	public void SelectPartnerEmployementStatusfromDropdown(String PartnerEmployeStatus) {
		GenericMethod.selectByText(ClientEmployementStatus,PartnerEmployeStatus );
	}


	public void FillHouseHoldPageWithValidData89949(){
		GenericMethod.implicitWait(2000);
		GenericMethod.selectByIndex(HouseStatus,7);
		GenericMethod.implicitWait(5000);
		GenericMethod.selectByIndex(MaritalStatus,5);
		GenericMethod.implicitWait(5000);
		GenericMethod.selectByIndex(ClientEmployementStatus,6);
		GenericMethod.implicitWait(2000);
		GenericMethod.selectByIndex(ClientPartnerEmploymentStatus,6);
		GenericMethod.implicitWait(2000);
		this.getYourHouseholdContinueButton().click();
		GenericMethod.implicitWait(2000);
		this.getHouseHoldSummaryConfirm().click();
	}

	public void submitHouseHoldPageWithValidData89939(){
		GenericMethod.implicitWait(10000);
		getBrowser().sleep(100);
		this.getHouseStatus().selectFromDropdownByText("Renting - private landlord");
//		this.getHouseStatus().enter();
//		this.getHouseStatus().tab();
		getBrowser().sleep(100);
		GenericMethod.implicitWait(20000);
//		this.getMaritalStatus().selectFromDropdownByText("Married");
		this.getMaritalStatus().selectFromDropdownByIndex(1);
//		this.getClientEmployementStatus().selectFromDropdownByText("Part-time employed");
		scrollElementIntoView();
		this.getClientEmployementStatus().selectFromDropdownByIndex(2);
//		this.getClientPartnerEmploymentStatus().selectFromDropdownByText("Student");
		this.getClientPartnerEmploymentStatus().selectFromDropdownByIndex(6);
//		this.getVehiclesDoesTheClientPay().enterText("2");
		this.getYourHouseholdContinueButton().click();
		GenericMethod.implicitWait(2000);
		this.getHouseHoldSummaryConfirm().click();
		getBrowser().sleep(5000);
		GenericMethod.implicitWait(2000);
//		scrollElementIntoView();
		scrollIntoViewElement(By.xpath("(//button[normalize-space()='Continue'])[2]"));

	}

}

