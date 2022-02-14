package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.*;
import com.stepchange.atf.data.SoleClientaFinancialSol_SC89933_Obj;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.testdata.SoleClientFinancialSolutionsTestData;
import org.openqa.selenium.By;
import org.seleniumhq.jetty7.util.log.Log;

public class EstablishClientNeedsPage extends Control
{

	GenericMethodsRemediation GenericMethods=new GenericMethodsRemediation();

	private Div DAVNumber;
	private Dropdown financialDifficulty;
	//client01
	private TextField firstNameClient01;
	private TextField surNameClient01;
	//where do they live-client01
	private Button locationClient01England;
	private Button locationClient01Wales;
	private Button locationClient01Scotland;
	private Button locationClient01NorthrnIreland;
	private Button locationClient01NorthrnIreland89934;
	private Button locationClient01Elsewhere;
	//Is UK debt-client01
	private Button isUKDebtClient01Yes;
	private Button isUKDebtClient01No;
	//Insolvency solutions-client01
	private Button isInsolvencySolutionsClient01No;
	private Button isInsolvencySolutionsClient01IVA;
	private Button isInsolvencySolutionsClient01DPP;
	private Button isInsolvencySolutionsClient01PTD;
	//Age Textfield-Client01
	private TextField AgeClient01;
	//Are they selfemployed-Client01
	private Button selfEmployedNo;
	private Button selfEmployedYes;
	private Button addClient2Button;
	private Checkbox permissionGivenByClientCheckbox;
	//anyhealth conditions or ability to deal with debts-Client01
	private Button abilityToDealWithTheirDebtsNo;
	private Button abilityToDealWithTheirDebtsYes;

	//add client Button
	private Button addClientButton;
	//addClient popup 
	private Button addClientTwoSpeakWithUsYes;
	private Button addClientTwoSpeakWithUsNo;
	private Button addClientPermissionToPartnerInfoYes;
	private Button addClientPermissionToPartnerInfoNo;
	private Checkbox permissionGivenByClientTwo;
	private Button AddClientTwoPopupConfirmButton;
	private Button AddClientTwoPopupCancelButton;

	//Client02
	private TextField firstNameClient02;
	private TextField surNameClient02;
	//Do client2 live same location as client01
	private Button Sameasclient1LocationClient02Yes;
	private Button Sameasclient1LocationClient02No;
	//Do client02 have UK debt
	private Button isUKDebtClient02Yes;
	private Button isUKDebtClient02No;
	//Insolvency solutions-client01
	private Button isInsolvencySolutionsClient02No;
	private Button isInsolvencySolutionsClient02IVA;
	private Button isInsolvencySolutionsClient02DPP;
	private Button isInsolvencySolutionsClient02PTD;
	//Age-client02
	private TextField AgeClient02;
	//Is client02 self Employed
	private Button selfEmployedClient02No;
	private Button selfEmployedClient02Yes;
	//Client02-health conditions or sensitive circumstances
	private Button currentHealthIssuesClient02No;
	private Button currentHealthIssuesClient02Yes;
	//Remove Client02
	private Button RemoveClient02;
	//Continue Button on Establish client
	private Button continueButtonEstablishclient;
	private Button isInsolvencySolutions;

	private Link RemovePersonlink;
	public Link getRemovePersonlink() {
		return RemovePersonlink;
	}

	//getters
	public Div getDAVNumber() {return DAVNumber;}
	public Dropdown getfinancialDifficulty() {return financialDifficulty; }
	public TextField getfirstNameClient01() {return firstNameClient01; }
	public TextField getsurNameClient01() {return surNameClient01;}
	public Button getlocationClient01England() {return locationClient01England;}
	public Button getlocationClient01Wales() {return locationClient01Wales;}
	public Button getlocationClient01Scotland() {return locationClient01Scotland;}
	public Button getlocationClient01NorthrnIreland() {return locationClient01NorthrnIreland;}
	public Button getLocationClient01NorthrnIreland89934() {return locationClient01NorthrnIreland89934;}
	public Button getlocationClient01Elsewhere() {return locationClient01Elsewhere; }
	public Button getisUKDebtClient01Yes() {return isUKDebtClient01Yes;}
	public Button getisUKDebtClient01No() {return isUKDebtClient01No;}
	public Button getisInsolvencySolutionsClient01No() {return isInsolvencySolutionsClient01No;}
	public Button getisInsolvencySolutionsClient01IVA() {return isInsolvencySolutionsClient01IVA;}
	public Button getisInsolvencySolutionsClient01DPP() {return isInsolvencySolutionsClient01DPP;}
	public Button getisInsolvencySolutionsClient01PTD() {return isInsolvencySolutionsClient01PTD;}
	public TextField getAgeClient01() {return AgeClient01;}
	public Button getselfEmployedNo() {return selfEmployedNo;}
	public Button getselfEmployedYes() {return selfEmployedYes;}
	public Button getabilityToDealWithTheirDebtsNo() {return abilityToDealWithTheirDebtsNo;}
	public Button getabilityToDealWithTheirDebtsYes() {return abilityToDealWithTheirDebtsYes;}
	public Button getaddClientButton() {return addClientButton;}
	public Button getaddClientTwoSpeakWithUsYes() {return addClientTwoSpeakWithUsYes;}
	public Button getaddClientTwoSpeakWithUsNo() {return addClientTwoSpeakWithUsNo;}
	public Button getaddClientPermissionToPartnerInfoYes() {return addClientPermissionToPartnerInfoYes;}
	public Button getaddClientPermissionToPartnerInfoNo() {return addClientPermissionToPartnerInfoNo;}
	public Checkbox getpermissionGivenByClientTwo() {return permissionGivenByClientTwo; }
	public Button getAddClientTwoPopupConfirmButton() {return AddClientTwoPopupConfirmButton;}
	public Button getAddClientTwoPopupCancelButton() {return AddClientTwoPopupCancelButton;}
	public TextField getfirstNameClient02() {return firstNameClient02; }
	public TextField getsurNameClient02() {return surNameClient02;}
	public Button getSameasclient1LocationClient02Yes() {return Sameasclient1LocationClient02Yes;}
	public Button getSameasclient1LocationClient02No() {return Sameasclient1LocationClient02No;}
	public Button getisUKDebtClient02Yes() {return isUKDebtClient02Yes;}
	public Button getisUKDebtClient02No() {return isUKDebtClient02No;}
	public Button getisInsolvencySolutionsClient02No() {return isInsolvencySolutionsClient02No;}
	public Button getisInsolvencySolutionsClient02IVA() {return isInsolvencySolutionsClient02IVA;}
	public Button getisInsolvencySolutionsClient02DPP() {return isInsolvencySolutionsClient02DPP;}
	public Button getisInsolvencySolutionsClient02PTD() {return isInsolvencySolutionsClient02PTD;}
	public TextField getAgeClient02() {return AgeClient02;}
	public Button getRemoveClient02() {return RemoveClient02; }
	public Button getselfEmployedClient02No() {return selfEmployedClient02No;}
	public Button getselfEmployedClient02Yes() {return selfEmployedClient02Yes;}
	public Button getcurrentHealthIssuesClient02No() {return currentHealthIssuesClient02No;}
	public Button getcurrentHealthIssuesClient02Yes() {return currentHealthIssuesClient02Yes;}
	public Button getcontinueButtonEstablishclient() {return continueButtonEstablishclient;}
	public Button getIsInsolvencySolutions() {return isInsolvencySolutions;}
	public Button getAddClient2Button() { return addClient2Button; }
	public Checkbox getPermissionGivenByClientCheckbox() {
		return permissionGivenByClientCheckbox;
	}
	public Dropdown getFinancialDifficulty() {return financialDifficulty;}

	//Constructor
	public EstablishClientNeedsPage()
	{
		RemovePersonlink = new Link(By.xpath("(//div[text()='Client 2'])[2]//following::button[1]"));
		DAVNumber=new Div(By.xpath("//span[contains(text(),'DAV')]"));
		financialDifficulty =new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pMainCauseOfFinancialDifficulty']"));
		firstNameClient01= new TextField(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$ppyFirstName']"));
		surNameClient01=new TextField(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$ppyLastName']"));
		locationClient01England=new Button(By.xpath("(//label[text()='England'])[1]"));
		locationClient01Wales=new Button(By.xpath("(//label[text()='Wales'])[1]"));
		locationClient01Scotland=new Button(By.xpath("(//label[text()='Scotland'])[1]"));
		locationClient01NorthrnIreland=new Button(By.xpath("(//label[text()='Northern Ireland'])[1]"));
		locationClient01NorthrnIreland89934=new Button(By.xpath("(//label[text()='Northern Ireland'])[1]"));
		locationClient01Elsewhere=new Button(By.xpath("(//label[text()='Elsewhere'])[1]"));
		isUKDebtClient01Yes=new Button(By.xpath("(//input[@name='$PpyWorkPage$pClientDetails$l1$pHasUKDebt']/following::label)[1]"));
		isUKDebtClient01No=new Button(By.xpath("(//input[@name='$PpyWorkPage$pClientDetails$l1$pHasUKDebt']/following::label)[2]"));
		isInsolvencySolutionsClient01No=new Button(By.xpath("(//label[text()='Are they currently on any of these insolvency solutions?']/following::label)[1]"));
		isInsolvencySolutionsClient01IVA=new Button(By.xpath("(//label[text()='Are they currently on any of these insolvency solutions?']/following::label)[2]"));
		isInsolvencySolutionsClient01DPP=new Button(By.xpath("(//label[text()='Are they currently on any of these insolvency solutions?']/following::label)[3]"));
		isInsolvencySolutionsClient01PTD=new Button(By.xpath("(//label[text()='Are they currently on any of these insolvency solutions?']/following::label)[4]"));
		AgeClient01=new TextField(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pAge']"));
		selfEmployedNo=new Button(By.xpath("(//div[text()='Are they self-employed?']/following::label)[3]"));
		selfEmployedYes=new Button(By.xpath("(//div[text()='Are they self-employed?']/following::label)[2]"));
		abilityToDealWithTheirDebtsNo=new Button(By.xpath("(//h2[text()='Why are we asking this?']/following::label)[2]"));
		abilityToDealWithTheirDebtsYes=new Button(By.xpath("(//h2[text()='Why are we asking this?']/following::label)[1]"));


		addClientButton=new Button(By.xpath("//button[@data-test-id='ECNAddClient2Button']"));
		addClientTwoSpeakWithUsYes=new Button(By.xpath("(//label[text()='Yes'])[1]"));
		addClientTwoSpeakWithUsNo=new Button(By.xpath("(//label[text()='No'])[1]"));
		addClientPermissionToPartnerInfoYes=new Button(By.xpath("(//label[text()='Yes'])[1]"));
		addClientPermissionToPartnerInfoNo=new Button(By.xpath("(//label[text()='No'])[1]"));
		permissionGivenByClientTwo=new Checkbox(By.xpath("//label[text()='Permission given by client 2']"));
		AddClientTwoPopupConfirmButton= new Button(By.xpath("//button[@name='AreYouSureYouWantToAddClientTwo_pyWorkPage_99']"));;
		AddClientTwoPopupCancelButton=new Button(By.name("AreYouSureYouWantToAddClientTwo_pyWorkPage_96"));
		firstNameClient02=new TextField(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l2$ppyFirstName']"));
		surNameClient02=new TextField(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l2$ppyLastName']"));
		Sameasclient1LocationClient02Yes=new Button(By.xpath("(//input[@name='$PpyWorkPage$pClientDetails$l2$pSameAddress']/following::label[1])[1]"));
		Sameasclient1LocationClient02No=new Button(By.xpath("(//input[@name='$PpyWorkPage$pClientDetails$l2$pSameAddress']/following::label[1])[2]"));
		isUKDebtClient02Yes=new Button(By.xpath("(//input[@name='$PpyWorkPage$pClientDetails$l2$pHasUKDebt']/following::label[1])[1]"));
		isUKDebtClient02No=new Button(By.xpath("(//input[@name='$PpyWorkPage$pClientDetails$l2$pHasUKDebt']/following::label[1])[2]"));
		isInsolvencySolutionsClient02No=new Button(By.xpath("(//input[@name='$PpyWorkPage$pClientDetails$l2$pInsolvencySolution']/following::label[1])[1]"));
		isInsolvencySolutionsClient02IVA=new Button(By.xpath("(//input[@name='$PpyWorkPage$pClientDetails$l2$pInsolvencySolution']/following::label[1])[2]"));
		isInsolvencySolutionsClient02DPP=new Button(By.xpath("(//input[@name='$PpyWorkPage$pClientDetails$l2$pInsolvencySolution']/following::label[1])[3]"));
		isInsolvencySolutionsClient02PTD=new Button(By.xpath("(//input[@name='$PpyWorkPage$pClientDetails$l2$pInsolvencySolution']/following::label[1])[4]"));
		AgeClient02=new TextField(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l2$pAge']"));
		RemoveClient02=new Button(By.name("ClientDetails_pyWorkPage.ClientDetails(2)_7"));
		selfEmployedClient02No=new Button(By.xpath("(//input[@name='$PpyWorkPage$pClientDetails$l2$pIsSelfEmployed']/following::label[2])[1]"));
		selfEmployedClient02Yes=new Button(By.xpath("(//input[@name='$PpyWorkPage$pClientDetails$l2$pIsSelfEmployed']/following::label[1])[1]"));
		currentHealthIssuesClient02No=new Button(By.xpath("(//input[@name='$PpyWorkPage$pClientDetails$l2$pRequiresAdditionalAssistance']/following::label[2])[1]"));
		currentHealthIssuesClient02Yes=new Button(By.xpath("(//input[@name='$PpyWorkPage$pClientDetails$l2$pRequiresAdditionalAssistance']/following::label[1])[1]"));
		continueButtonEstablishclient=new Button(By.xpath("//button[@name='pyCaseActionAreaButtons_pyWorkPage_32' and @class='SC_Button_Primary pzhc pzbutton']"));;
		isInsolvencySolutions = new Button(By.xpath("(//label[text()='Are they currently on any of these insolvency solutions?']/following::label)[1]"));
		addClient2Button = new Button(By.name("ClientRepTabbedLayout_pyWorkPage_6"));
		permissionGivenByClientCheckbox = new Checkbox(By.xpath("(//*[@data-test-id='201810091118200292234834-Label'])[2]"));
	}

	public void fillClient1andClient2Details(String FirstName ,String SurName , String Client1Age,String Client2FirstName ,String Client2SurName , String Client2Age)
	{
		SelectCauseOfFinancialDifficulty("Unemployment or redundancy");
		this.getfirstNameClient01().enterText(FirstName);
		this.getsurNameClient01().enterText(SurName);
//		this.getWalesLocation().click();
		this.getlocationClient01Wales().click();
		this.getisUKDebtClient01No().click();
		this.getIsInsolvencySolutions().click();
		this.getAgeClient01().enterTextField(Client1Age);
		this.getselfEmployedNo().click();
		this.getabilityToDealWithTheirDebtsNo().click();
		this.getAddClient2Button().click();
//		this.getIsYourPartnerAvailableToSpeakwithUsYesButton().click();
		this.addClientPermissionToPartnerInfoYes.click();
//		this.getPermissionGivenByClient2CheckBox().click();
		this.getpermissionGivenByClientTwo().click();
//		this.getAddClient2ConfirmButton().click();
		this.getAddClientTwoPopupConfirmButton().click();
		this.getfirstNameClient02().enterText(Client2FirstName);
		this.getsurNameClient02().enterText(Client2SurName);
		this.getSameAddressAsClient1(2).click();
		this.getisUKDebtClient02Yes().click();
//		this.getisClient2InsolvencySolutionsNoButton().click();
		this.getisInsolvencySolutionsClient02No().click();
		this.getAgeClient02().enterText(Client2Age);
//		this.getClient2selfEmployedNoButton().click();
		this.selfEmployedClient02No.click();
//		this.getClient2abilityToDealWithTheirDebtsNoButton().click();
		this.abilityToDealWithTheirDebtsNo.click();


	}



	public void fillClient1andClient2Details_89939(String FirstName ,String SurName , String Client1Age,String Client2FirstName ,String Client2SurName , String Client2Age) throws InterruptedException {
		GenericMethods.implicitWait(5000);
		this.getfirstNameClient01().enterText(GenericMethodsRemediation.getRandomAlphanumericText(6));
		GenericMethods.implicitWait(5000);
		this.getsurNameClient01().enterText("Client");
		GenericMethods.implicitWait(5000);
		this.getlocationClient01England().click();
		GenericMethods.implicitWait(5000);
		this.getisUKDebtClient01Yes().click();
		GenericMethods.implicitWait(5000);
		this.getisInsolvencySolutionsClient01No().click();
		GenericMethods.implicitWait(5000);
		this.getAgeClient01().enterText(Client1Age);
		GenericMethods.implicitWait(5000);
		this.getselfEmployedNo().click();
		GenericMethods.implicitWait(5000);
		this.getabilityToDealWithTheirDebtsNo().click();
		GenericMethods.implicitWait(5000);
		this.getAddClient2Button().click();
		GenericMethods.implicitWait(5000);
		this.addClientPermissionToPartnerInfoYes.click();
		GenericMethods.implicitWait(5000);
		this.getpermissionGivenByClientTwo().click();
		GenericMethods.implicitWait(5000);
		this.getAddClientTwoPopupConfirmButton().click();
		GenericMethods.implicitWait(5000);
		Thread.sleep(4000);
		fillClientTwoDetails_89939();
		GenericMethods.implicitWait(5000);
		getBrowser().scrollDown();
		this.getcontinueButtonEstablishclient().click();
	}

	public void SelectCauseOfFinancialDifficulty(String DropDownValue)
	{
		this.getfinancialDifficulty().selectFromDropdownByText(DropDownValue);
	}

	public void ActionSetClientNeedPage89934() {
		this.getfinancialDifficulty().selectFromDropdownByIndex(1);
		this.getfirstNameClient01().enterText("Test89934");
		this.getsurNameClient01().enterText("SC89934");
		this.getLocationClient01NorthrnIreland89934().click();
		this.getisUKDebtClient01Yes().click();
		this.getIsInsolvencySolutions().click();
		for (int i = 0; i < 3; i++) {
			this.getAgeClient01().enterText("45");
			this.getAgeClient01().tab();
		}
		getBrowser().getTimeout();
		this.getselfEmployedNo().click();
		this.getabilityToDealWithTheirDebtsNo().click();
		this.getcontinueButtonEstablishclient().click();
	}

	public void ActionSetClientNeedPage89937() {
		this.getfinancialDifficulty().selectFromDropdownByIndex(1);
		this.getfirstNameClient01().enterText("Test89937");
		this.getsurNameClient01().enterText("SC89937");
		this.getlocationClient01Scotland().click();
		this.getisUKDebtClient01Yes().click();
		this.getIsInsolvencySolutions().click();
		for (int i = 0; i < 3; i++) {
			this.getAgeClient01().enterText("27");
			this.getAgeClient01().tab();
		}
		getBrowser().getTimeout();
		this.getselfEmployedNo().click();
		this.getabilityToDealWithTheirDebtsNo().click();
		this.getcontinueButtonEstablishclient().click();
	}

	public String davNumber()
	{
		String davNo = DAVNumber.getText();
		Log.info("DAV Number is  :: "+davNo);
		return davNo;
	}

	public void SelectCauseOfFinancialDifficulty()
	{
		switchToActiveFrame();
		this.getfinancialDifficulty().selectFromDropdownByText("Unemployment or redundancy");
	}


	public void fillClientDetailsJointMPA() {
		this.getfirstNameClient01().enterText("DemoQa");
		this.getsurNameClient01().enterText("Client");
		GenericMethods.implicitWait(2000);
		this.getlocationClient01NorthrnIreland().click();
		GenericMethods.implicitWait(2000);
		this.getisUKDebtClient01Yes().click();
		GenericMethods.implicitWait(2000);
		this.getisInsolvencySolutionsClient01No().click();
		GenericMethods.implicitWait(2000);
		for (int i = 0; i <= 2; i++) {
			try {
				this.getAgeClient01().enterTextField("67");
				break;
			    } catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

		this.getselfEmployedNo().click();
		GenericMethods.implicitWait(2000);
		this.getabilityToDealWithTheirDebtsNo().click();
		GenericMethods.implicitWait(2000);
		this.getAddClient2Button().click();
		GenericMethods.implicitWait(2000);
	//	getDriver().findElement(By.xpath("(//*[text()='Yes'])[1]")).click();
		this.getaddClientPermissionToPartnerInfoYes().click();
		this.getPermissionGivenByClientCheckbox().click();
		GenericMethods.implicitWait(2000);
		GenericMethods.clickConfirmButton();
		GenericMethods.implicitWait(2000);
		this.getfirstNameClient02().enterText("Avin");
		this.getsurNameClient02().enterText("Mill");
		GenericMethods.implicitWait(2000);
		this.getSameasclient1LocationClient02Yes().click();
		this.getisUKDebtClient02Yes().click();
		GenericMethods.implicitWait(2000);
		this.getisInsolvencySolutionsClient02No().click();
		GenericMethods.implicitWait(2000);
		for (int j= 0; j <= 2; j++) {
			try {
						this.getAgeClient02().enterTextField("57");
						getBrowser().sleep(getBrowser().getTimeout());
						break;
					} catch (Exception e1) {
						System.out.println(e1.getMessage());
					}
		    }
		GenericMethods.implicitWait(2000);
		this.getselfEmployedClient02No().click();
		GenericMethods.implicitWait(2000);
		this.getcurrentHealthIssuesClient02No().click();
		GenericMethods.implicitWait(2000);
		//		getBrowser().scrollDown();
		this.getcontinueButtonEstablishclient().click();

	}


	public void SelectContinueButtonEstablishClientNeed(){
		this.getcontinueButtonEstablishclient().click();
	}

	public void addClient()
	{
		this.getaddClientButton().click();
	}

	public void addClientPopup()
	{
		this.getaddClientTwoSpeakWithUsYes().click();
		this.getpermissionGivenByClientTwo().click();
		this.getAddClientTwoPopupConfirmButton().click();
	}

	public void fillClientTwoDetails()
	{
		this.getfirstNameClient02().enterText("Annie810");
		this.getsurNameClient02().enterText("Missie910");
		this.getSameasclient1LocationClient02Yes().click();
		this.getisUKDebtClient02Yes().click();
		this.getisInsolvencySolutionsClient02No().click();
		GenericMethods.implicitWait(10000);
		this.getAgeClient02().clear();
		for (int i = 0; i <= 2; i++) {
			try {
				this.getAgeClient02().enterText("57");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		this.getselfEmployedClient02No().click();
		this.getcurrentHealthIssuesClient02No().click();

	}

	public void fillClientTwoDetails_89939()
	{
		this.getfirstNameClient02().enterText("Annie810");
		GenericMethods.implicitWait(5000);
		this.getsurNameClient02().enterText("Missie910");
		GenericMethods.implicitWait(5000);
		this.getSameasclient1LocationClient02Yes().click();
		GenericMethods.implicitWait(5000);
		this.getisUKDebtClient02Yes().click();
		GenericMethods.implicitWait(5000);
		this.getisInsolvencySolutionsClient02No().click();
		GenericMethods.implicitWait(5000);
		this.getAgeClient02().clear();
		GenericMethods.implicitWait(5000);
		this.getAgeClient02().enterText("29");
		GenericMethods.implicitWait(5000);
		this.getselfEmployedClient02No().click();
		GenericMethods.implicitWait(5000);
		this.getcurrentHealthIssuesClient02No().click();
		GenericMethods.implicitWait(5000);
	}




	public void fillClientDetailsScotland()
	{

		this.getfirstNameClient01().enterText("DemoQa");
		this.getsurNameClient01().enterText("Client");
		this.getlocationClient01Scotland().click();
		this.getisUKDebtClient01Yes().click();
		this.getisInsolvencySolutionsClient01No().click();
//		this.getAgeClient01().clickScreenElement(getAgeClient01().getElement());
		GenericMethods.implicitWait(10000);
		for (int i = 0; i <= 2; i++) {
			try {
				this.getAgeClient01().enterText("56");
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		this.getselfEmployedNo().click();
		this.getabilityToDealWithTheirDebtsNo().click();
		
	}
	public void clickContinueButtonEstablishclient()
	{
		this.getcontinueButtonEstablishclient().click();

	}

	public void fillClient1Details(String Scenario){

		SoleClientaFinancialSol_SC89933_Obj dataObject = SoleClientFinancialSolutionsTestData.getClientDetails();
		switch (Scenario) {
			case "89936":
			this.getfirstNameClient01().enterText(dataObject.getFirstName());
			this.getsurNameClient01().enterText(dataObject.getSurName());
			this.getlocationClient01England().click();
			this.getisUKDebtClient01Yes().click();
			this.getIsInsolvencySolutions().click();
			GenericMethods.implicitWait(2000);
			for (int i = 0; i <= 2; i++) {
				try {
					this.getAgeClient01().enterText(dataObject.getAge());
					break;
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}break;
			case "89933":
				this.getfirstNameClient01().enterText(dataObject.getFirstName());
				this.getsurNameClient01().enterText(dataObject.getSurName());
				this.getlocationClient01England().click();
				this.getisUKDebtClient01Yes().click();
				this.getIsInsolvencySolutions().click();
				GenericMethods.implicitWait(2000);
				for (int i = 0; i <= 2; i++) {
					try {
						this.getAgeClient01().enterText(dataObject.getAge());
						this.getAgeClient01().enterText(dataObject.getAge());
						break;
					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}break;
	}
		GenericMethods.implicitWait(2000);
		getBrowser().sleep(getBrowser().getTimeout()/10);
		this.getselfEmployedNo().click();
		this.getabilityToDealWithTheirDebtsNo() .click();
		this.getcontinueButtonEstablishclient().click();
	}


	public void AddClient2AndFillClient2Details(){
		SoleClientaFinancialSol_SC89933_Obj dataObject = SoleClientFinancialSolutionsTestData.getSecondClientDetails();
		this.getAddClient2Button().click();
		getBrowser().sleep(getBrowser().getTimeout());
		getDriver().findElement(By.xpath("(//*[text()='Yes'])[1]")).click();
		this.getPermissionGivenByClientCheckbox().click();
		GenericMethods.clickConfirmButton();
		getBrowser().sleep(getBrowser().getTimeout());
		this.getFirstNameTextField(2).enterText(dataObject.getFirstName()+1);
		this.getSurNameTextField(2).enterText(dataObject.getSurName()+1);
		this.getSameAddressAsClient1(2).click();
		this.getOneUKDebt(2).click();
		this.getInsolvencySolutionsButton(2).click();

		getBrowser().sleep(getBrowser().getTimeout());
		this.getAreYouSelfEmployedButton(2).click();

		GenericMethods.implicitWait(2000);
		for(int i=0; i<=2;i++){
			try{
				this.getHowOldAreThey(2).enterText("22");
				break;
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}

		getBrowser().sleep(getBrowser().getTimeout());
		this.getCurrentlyHaveAnyHealthConditions(2).click();
		this.getcontinueButtonEstablishclient().click();

	}

	public TextField getFirstNameTextField(int forClient){
		TextField textField;
		textField = new TextField(By.name("$PpyWorkPage$pClientDetails$l"+forClient+"$ppyFirstName"));
		return textField;

	}

	public TextField getSurNameTextField(int forClient){
		TextField textField;
		textField = new TextField(By.name("$PpyWorkPage$pClientDetails$l"+forClient+"$ppyLastName"));
		return textField;

	}

	public Button getSameAddressAsClient1(int forClient){
		Button button;
		button = new Button(By.xpath("(//*[@name=\"$PpyWorkPage$pClientDetails$l"+forClient+"$pSameAddress\"]/following::label)[1]"));
		return button;
	}

	public Button getOneUKDebt(int forClient){
		Button button;
		button = new Button(By.xpath("(//*[@name=\"$PpyWorkPage$pClientDetails$l"+forClient+"$pHasUKDebt\"]/following::label)[1]"));
		return button;
	}

	public Button getInsolvencySolutionsButton(int forClient){
		Button button;
		button = new Button(By.xpath("(//*[@name=\"$PpyWorkPage$pClientDetails$l"+forClient+"$pInsolvencySolution\"]/following::label)[1]"));
		return button;
	}

	public TextField getHowOldAreThey(int forClient){
		TextField textField;
		textField = new TextField(By.name("$PpyWorkPage$pClientDetails$l"+forClient+"$pAge"));
		return textField;
	}

	public Button getAreYouSelfEmployedButton(int forClient) {
		Button button;
		button = new Button(By.xpath("(//*[@id='48838261false'])/following::label[1]"));
		return button;

	}

	public Button getCurrentlyHaveAnyHealthConditions(int forClient){
		Button button;
		button = new Button(By.xpath("(//*[@id='0e794b7bfalse'])/following::label[1]"));
		return button;
	}
	public void RemoveClient2fromEstablishClientneedspage()	{
		this.getRemovePersonlink().click();
	}
	public void AreuwantToRemoveClient2fromEstablishClientneed2page()	{
		this.getRemovePersonlink().click();
	}


	public void fillClient01andClient02Details()
	{	SelectCauseOfFinancialDifficulty();
		this.getfirstNameClient01().enterText("Sele");
		this.getsurNameClient01().enterText("Sursele1");
		this.getLocationClient01NorthrnIreland89934().click();
		this.getisUKDebtClient01Yes().click();
		this.getisInsolvencySolutionsClient01No().click();
		this.getAgeClient01().enterText("18");
		this.getselfEmployedNo().click();
		this.getabilityToDealWithTheirDebtsNo() .click();
		this.getAddClient2Button().click();
		getBrowser().sleep(getBrowser().getTimeout());
		getDriver().findElement(By.xpath("(//*[text()='Yes'])[1]")).click();
		this.getPermissionGivenByClientCheckbox().click();
		GenericMethods.clickConfirmButton();
		this.getfirstNameClient02().enterText("Jain");
		this.getsurNameClient02().enterText("SurJain");
		this.getSameAddressAsClient1(2).click();
		this.getisUKDebtClient02Yes().click();
		this.getisInsolvencySolutionsClient02No().click();
		this.getAgeClient02().enterText("18");
		this.getselfEmployedClient02No().click();
		this.getCurrentlyHaveAnyHealthConditions(2).click();
		this.getcontinueButtonEstablishclient().click();

	}

}

