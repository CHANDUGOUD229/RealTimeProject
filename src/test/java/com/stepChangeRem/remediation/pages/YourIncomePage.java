package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.*;
import com.stepchange.atf.data.IncomeDataObjects;
import com.stepchange.atf.data.SoleClientaFinancialSol_SC89933_Obj;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.testdata.IncomeTestData;
import com.stepchange.atf.testdata.SoleClientFinancialSolutionsTestData;
import org.openqa.selenium.By;

public class YourIncomePage<RemovePrivatePension2> extends Control {
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();

	private TextField monthlyWagsEarnings;

	private Dropdown   monthlyDrop;
	private Dropdown   monthlyDrop2;
	private Checkbox allIncome;
	private Button continueYourIncomeButton;
	private Button OtherIncomesNonDependentRemoveButton;
	private TextField childTaxCredit;
	private Dropdown childTaxCreditDropdown;

	private TextField JSAContribution;
	private Button JSAContributionButton;
	private TextField JSAContributionTextBox89934;
	private Dropdown JSAContributionDrop89934;

	private Button universalCreditRemoveButton;
	private Dropdown fortnightlyDropDown;

	private TextField UniversalCreditTextBox;
	private Dropdown UniversalCreditMonthlyDropDown;
	private Button ClientNoCaptureButton;
	private Button WorkingTaxremoveButton;
	private TextField monthlyWagsEarnings02;
	private TextField OtherEarning;
	private Button JSIncomeBasedRemove;

	public Button getOtherIncome() {
		return otherIncome;
	}

	public TextField getChildTaxCredit() {
		return childTaxCredit;
	}

	private Button otherIncome;
	private Dropdown weeklyotherearning;

	public TextField getMonthlyWagsEarnings() {return monthlyWagsEarnings;}
	public Dropdown getMonthly() {return monthlyDrop;}
	public Dropdown getMonthly2() {return monthlyDrop2;}

	public Dropdown getChildTaxCreditDropdown() {
		return childTaxCreditDropdown;
	}

	public Button getOtherIncomesNonDependentContinueButton() {return OtherIncomesNonDependentRemoveButton;}

	public Checkbox getAllIncome() {return allIncome;}
	public Button getContinueYourIncomeButton() {return continueYourIncomeButton;}
	public TextField getJSAContribution() {	return JSAContribution;	}
	public Button getJSAContributionButton() {return JSAContributionButton;	}
	//JSAContributionTextBox89934;
	//	private Dropdown JSAContributionDrop89934;
	public TextField getJSAContributionTextBox89934() {return JSAContributionTextBox89934;}
	public Dropdown getJSAContributionDrop89934() {return JSAContributionDrop89934;}
	public Button getuniversalCreditRemoveButton() {
		return universalCreditRemoveButton;	}
	public Dropdown getfortnightlyDropDown() {
		return fortnightlyDropDown;	}
	public TextField getUniversalCreditTextBox() {
		return UniversalCreditTextBox;	    }
	public Dropdown getUniversalCreditMonthlyDropDown() {
		return UniversalCreditMonthlyDropDown;		}
	public Button getWorkingTaxremoveButton() {return WorkingTaxremoveButton;}

	public TextField getMonthlyWagsEarnings02() {
		return monthlyWagsEarnings02;
	}
	public TextField getOtherEarning() {
		return OtherEarning;
	}
	public Button getotherIncome() {
		return otherIncome;
	}
	public Dropdown getweeklyotherearning() {
		return weeklyotherearning;
	}

	public TextField getChaildMaintenanceTextFiled() {
		return ChaildMaintenanceTextFiled;
	}

	public Dropdown getChaildMaintenanceDropDown34() {
		return ChaildMaintenanceDropDown34;
	}

	public Button getRemoveChaildTexCreditButton() {
		return RemoveChaildTexCreditButton;
	}

	public Button getRemoveWorkingTaxCreditButton() {
		return RemoveWorkingTaxCreditButton;
	}

	public Button getRemoveLocalHousingAllowanceBenefitButton() {
		return RemoveLocalHousingAllowanceBenefitButton;
	}


	private Link YourSpendinglink;
	private TextField JSContributionBasedText;
	private Button OtherEarningsButton;

	private Button WagesremoveButton;
	private Button ChildTaxCreditremoveButton;
	private Button WorkingtaxCreditremoveButton;
	private Button UniversalCreditremoveButton;
	private Button JSAIncomeBasedremoveButton;

	private TextField OtherEarningTextbox;
	private TextField HousingBenfit;
	private TextField studentLoan;
	private TextField ChildBenfit;

	private Dropdown OtherEarningDropdown;
	private Dropdown HousingBenfitDropdown;
	private Dropdown ChildBenfitDropdown;
	private Dropdown studentLoanDropdown;
	private Dropdown JSAContributionDropdown;

	private Dropdown OtherEarningOwnerDropdown;
	private Dropdown HousingBenfitOwnerDropdown;
	private Dropdown ChildBenfitOwnerDropdown;
	private Dropdown studentLoanOwnerDropdown;
	private Dropdown JSAContributionOwnerDropdown;

	private Button AreYouhappythatClientsYesButton;
	private Button studentGrantBursaryRemoveButton;

	private Dropdown JSContributionBasedDropDwn;
	private Dropdown JSSharedContributionBasedDropDwn;
	private Button wagsEarningButton;
	private TextField ChaildBenifitTextBox;
	private Dropdown ChaildBenifitDropdown;
	private Button StudentLoanButton;
	private TextField StudentLoanTextField;
	private Dropdown StudentLoanDropDown;
	private Button ChaildMaintenanceButton;
	private TextField ChaildMaintenanceTextFiled;
	private Dropdown ChaildMaintenanceDropDown34;
	private Button RemoveChaildTexCreditButton;
	private Button RemoveWorkingTaxCreditButton;
	private Button RemoveLocalHousingAllowanceBenefitButton;
	private Button RemoveStudentGrantButton;

	public Button getRemoveStudentGrantButton(){return RemoveStudentGrantButton;}
	public Button getwagsEarningButton(){return wagsEarningButton;}
	public TextField getChaildBenifitTextBox() {
		return ChaildBenifitTextBox;
	}

	public Dropdown getChaildBenifitDropdown() {
		return ChaildBenifitDropdown;
	}

	public Button getStudentLoanButton() {
		return StudentLoanButton;
	}

	public TextField getStudentLoanTextField() {
		return StudentLoanTextField;
	}

	public Dropdown getStudentLoanDropDown() {
		return StudentLoanDropDown;
	}

	public Button getChaildMaintenanceButton() {
		return ChaildMaintenanceButton;
	}

	private TextField PrivatepensionTextbox02;
	private Dropdown Privatepensionweekly02;
	private Dropdown Privatepensionowner02;

	public Button getCarersallowanceRemove1(){return CarersallowanceRemove1;}
	public Button getCarersallowanceRemove2(){return CarersallowanceRemove2; }
	public Button getPensionCreditRemove(){return PensionCreditRemove;}
	public Button getPrivatePensionAdd(){return PrivatePensionAdd;}

	public Dropdown getOtherEarningDropdown() {
		return OtherEarningDropdown;
	}
	public TextField getstudentLoan() {
		return studentLoan;
	}	public Dropdown getstudentLoanDropdown() {
		return studentLoanDropdown;
	}	public Dropdown getstudentLoanOwnerDropdown() {
		return studentLoanOwnerDropdown;
	}	public Dropdown getHousingBenfitDropdown() {
		return HousingBenfitDropdown;
	}
	public Dropdown getChildBenfitDropdown() {
		return ChildBenfitDropdown;
	}
	public Dropdown getJSAContributionDropdown() {
		return JSAContributionDropdown;
	}

	private Button RemovePrivatePension2;
	private Button RemovePensionCredit;
	private TextField StatepensionTextbox01;
	private Dropdown Statepensionweekly01;
	private Dropdown Statepensionowner01;

	private TextField StatepensionTextbox02;
	private Dropdown Statepensionweekly02;
	private Dropdown Statepensionowner02;

	private TextField PrivatepensionTextbox01;
	private Dropdown Privatepensionweekly01;
	private Dropdown Privatepensionowner01;

	private Button CarersallowanceRemove1;
	private Button CarersallowanceRemove2;
	private Button PensionCreditRemove;
	private Button PrivatePensionAdd;

	public Button getAreYouhappythatClientsYesButton() {
		return AreYouhappythatClientsYesButton;
	}
	public Dropdown getOtherEarningOwnerDropdown() {
		return OtherEarningOwnerDropdown;
	}
	public Dropdown getHousingBenfitOwnerDropdown() {
		return HousingBenfitOwnerDropdown;
	}
	public Dropdown getChildBenfitOwnerDropdown() {
		return ChildBenfitOwnerDropdown;
	}
	public Dropdown getJSAContributionOwnerDropdown() {
		return JSAContributionOwnerDropdown;
	}



	public TextField getOtherEarningTextbox() {
		return OtherEarningTextbox;
	}
	public TextField getHousingBenfitTextbox() {
		return HousingBenfit;
	}
	public TextField getChildBenfitTextbox() {
		return ChildBenfit;
	}
	public TextField getJSAContributionTextbox() {
		return JSAContribution;
	}
	public Button getJSIncomeBasedRemove(){
		return JSIncomeBasedRemove;
	}



	public Button getWagesremoveButton() {
		return WagesremoveButton;
	}
	public Button getChildTaxCreditremoveButton() {
		return ChildTaxCreditremoveButton;
	}
	public Button getWorkingtaxCreditremoveButton() {
		return WorkingtaxCreditremoveButton;
	}
	public Button getUniversalCreditremoveButton() {
		return UniversalCreditremoveButton;
	}
	public Button getJSAIncomeBasedremoveButton() {
		return JSAIncomeBasedremoveButton;
	}
	public Button getOtherEarningsButton() {
		return OtherEarningsButton;
	}
	public Button getstudentGrantBursaryRemoveButton() {
		return studentGrantBursaryRemoveButton;
	}

	public Button getRemovePrivatePension2(){return RemovePrivatePension2;};
	public Button getRemovePensionCredit(){return RemovePensionCredit;}
	public TextField getStatepensionTextbox01(){return StatepensionTextbox01;}
	public Dropdown getStatepensionweekly01(){return Statepensionweekly01;}
	public Dropdown getStatepensionowner01(){return Statepensionowner01;}

	public TextField getStatepensionTextbox02(){return StatepensionTextbox02;}
	public Dropdown getStatepensionweekly02(){return Statepensionweekly02;}
	public Dropdown getStatepensionowner02(){return Statepensionowner02;}


	public TextField getPrivatepensionTextbox01(){return PrivatepensionTextbox01;}
	public Dropdown getPrivatepensionweekly01(){return Privatepensionweekly01;}
	public Dropdown getPrivatepensionowner01(){return Privatepensionowner01;}

	public TextField getPrivatepensionTextbox02(){return PrivatepensionTextbox02;}
	public Dropdown getPrivatepensionweekly02(){return Privatepensionweekly02;}
	public Dropdown getPrivatepensionowner02(){return Privatepensionowner02; }


	public Link getYourSpendinglink() {
		return YourSpendinglink;
	}
	public TextField getJSContributionBasedText(){
		return JSContributionBasedText;
	}

	public Dropdown getJSContributionBasedDropDwn(){
		return JSContributionBasedDropDwn;
	}

	public Dropdown getJSSharedContributionBasedDropDwn(){
		return JSSharedContributionBasedDropDwn;
	}

	private TextField Studentloans1;
	private TextField Studentloans2;
	private Button Studentgrant1button;
	private Button Studentgrant2button;
	private Dropdown Studentloans1Dropdown1;
	private Dropdown Studentloans1Dropdown2;

	public Dropdown getStudentloans1Dropdown1() {	return Studentloans1Dropdown1;}
	public Dropdown getStudentloans1Dropdown2() {	return Studentloans1Dropdown2;}
	public TextField getStudentloans1() {return Studentloans1;}
	public TextField getStudentloans2() {	return Studentloans2;}
	public Button getStudentgrant1button() {	return Studentgrant1button;}
	public Button getStudentgrant2button() {return Studentgrant2button;}



	public YourIncomePage() {
		childTaxCreditDropdown = new Dropdown(By.name("//div[text()='Child Tax Credit']//following::select[1]"));
		monthlyWagsEarnings = new TextField(By.xpath("//div[text()='Wage']//following::input[2]"));
		monthlyDrop = new Dropdown(By.xpath("//div[text()='Wage']//following::select[1]"));
		monthlyDrop2 = new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l16$pFrequency')]"));
		OtherIncomesNonDependentRemoveButton = new Button(By.xpath("//div[text()='Non-dependant contribution']//following::button[3]"));
		allIncome = new Checkbox(By.xpath("//label[normalize-space()='All income items are complete']"));
		continueYourIncomeButton = new Button(By.name("pyCaseActionAreaButtons_pyWorkPage_33"));
		monthlyWagsEarnings02=new TextField(By.xpath("//input[contains(@name,'$ppxResults$l16$pAmount')]"));
		OtherEarning=new TextField(By.name("//input[contains(@name,'$ppxResults$l17$pAmount')]"));


		universalCreditRemoveButton = new Button(By.xpath("//div[text()='Universal Credit']//following::button[3]"));
		//Amit-Replacing Xpath for JSA Button not working
		JSAContributionButton = new Button(By.xpath("//button[normalize-space()='JSA (contribution-based)']"));
		JSAContributionTextBox89934 = new TextField(By.xpath("//input[contains(@name,'pz$ppxResults$l9$pAmount')]"));
		JSAContributionDrop89934 = new Dropdown(By.xpath("//select[contains(@name,'pz$ppxResults$l9$pFrequency')]"));
		//JSAContributionButton = new Button(By.xpath("//button[@name='IncomeItemButton_D_IncomeItemList_pa4142005926848554pz.pxResults(22)_1']"));
		JSAContribution = new TextField(By.xpath("//input[contains(@name,'pz$ppxResults$l9$pAmount')]"));
		fortnightlyDropDown = new Dropdown(By.xpath("//select[contains(@name,'pz$ppxResults$l9$pFrequency')]"));
		//Above Both xPath are changing need to change exact relative xPath
		UniversalCreditTextBox = new TextField(By.xpath("//div[text()='Universal Credit']//following::input[2]"));
		UniversalCreditMonthlyDropDown = new Dropdown(By.xpath("//div[text()='Universal Credit']//following::select[1]"));

		ClientNoCaptureButton = new Button(By.xpath("//div[@class='flex-paragraph']"));
		WorkingTaxremoveButton=new Button(By.xpath("//div[text()='Working Tax Credit' ]//following::button[3]"));

		YourSpendinglink = new Link(By.xpath("(//a[text()='Your spending'])[1]"));

		OtherEarningsButton = new Button(By.xpath("(//button[@class='SC_Tag_Small pzhc pzbutton'])[2]"));

		WagesremoveButton = new Button(By.xpath("//div[text()='Wage']//following::button[3]"));
		ChildTaxCreditremoveButton= new Button(By.xpath("//div[text()='Child Tax Credit']//following::button[3]"));
		WorkingtaxCreditremoveButton= new Button(By.xpath("//div[text()='Working Tax Credit']//following::button[3]"));
		UniversalCreditremoveButton= new Button(By.xpath("//div[text()='Universal Credit']//following::button[3]"));
		JSAIncomeBasedremoveButton= new Button(By.xpath("(//button[@class='SC_Button_Quinary pzhc pzbutton'])[13]"));
		studentGrantBursaryRemoveButton= new Button(By.xpath("(//div[text()='Student grant/bursary'])//following::button[3]"));

		OtherEarningTextbox = new TextField(By.xpath("//div[text()='Other earnings']//following::input[2]"));
		HousingBenfit= new TextField(By.xpath("//div[text()='Local Housing Allowance/Housing Benefit']//following::input[2]"));
		ChildBenfit= new TextField(By.xpath("//div[text()='Child Benefit']//following::input[2]"));
		childTaxCredit= new TextField(By.xpath("//div[text()='Child Tax Credit']//following::input[2]"));
		JSAContribution= new TextField(By.xpath("(//input[@validationtype='isnonnegative,decimal'])[1]"));

		OtherEarningDropdown = new Dropdown(By.xpath("//div[text()='Other earnings']//following::select[1]"));
		HousingBenfitDropdown= new Dropdown(By.xpath("//div[text()='Local Housing Allowance/Housing Benefit']//following::select[1]"));
		studentLoan= new TextField(By.xpath("//div[text()='Student loans']//following::input[2]"));
		studentLoanDropdown= new Dropdown(By.xpath("//div[text()='Student loans']//following::select[1]"));
		studentLoanOwnerDropdown= new Dropdown(By.xpath("//div[text()='Student loans']//following::select[2]"));
		ChildBenfitDropdown= new Dropdown(By.xpath("//div[text()='Child Benefit']//following::select[1]"));
		JSAContributionDropdown= new Dropdown(By.xpath("(//option[text()='fortnightly']//following::select)[14]"));

		OtherEarningOwnerDropdown= new Dropdown(By.xpath("//div[text()='Other earnings']//following::select[2]"));
		HousingBenfitOwnerDropdown= new Dropdown(By.xpath("//div[text()='Local Housing Allowance/Housing Benefit']//following::select[2]"));
		ChildBenfitOwnerDropdown= new Dropdown(By.xpath("//div[text()='Child Benefit']//following::select[2]"));
		JSAContributionOwnerDropdown= new Dropdown(By.xpath("(//option[text()='fortnightly']//following::select)[15]"));
		AreYouhappythatClientsYesButton = new Button(By.xpath("//label[text()='Yes']"));

		ChaildBenifitTextBox = new TextField(By.xpath("//div[text()='Child Benefit']//following::input[2]"));
		ChaildBenifitDropdown = new Dropdown(By.xpath("//div[text()='Child Benefit']//following::select[1]"));

		StudentLoanButton = new Button(By.xpath("//button[normalize-space()='student loan']"));
		StudentLoanTextField = new TextField(By.xpath("//div[text()='Student loans']//following::input[2]"));
		StudentLoanDropDown = new Dropdown(By.xpath("//div[text()='Student loans']//following::select[1]"));

		ChaildMaintenanceButton = new Button(By.xpath("//button[normalize-space()='child support/maintenance']"));
		ChaildMaintenanceTextFiled = new TextField(By.xpath("//div[text()='Child support/maintenance']//following::input[2]"));
		ChaildMaintenanceDropDown34 = new Dropdown(By.xpath("//div[text()='Child support/maintenance']//following::select[1]"));
		RemoveChaildTexCreditButton = new Button(By.xpath("//div[text()='Child Tax Credit']//following::button[3]"));
		RemoveWorkingTaxCreditButton = new Button(By.xpath("//div[text()='Working Tax Credit']//following::button[3]"));
		RemoveLocalHousingAllowanceBenefitButton = new Button(By.xpath("//div[text()='Local Housing Allowance/Housing Benefit']//following::button[3]"));
		RemoveStudentGrantButton = new Button(By.xpath("//div[text()='Student grant/bursary']//following::button[3]"));

		RemovePrivatePension2=new Button(By.xpath("(//div[text()='Private/work pension' ]//following::button[3])[2]"));
		RemovePensionCredit=new Button(By.xpath("//div[text()='Pension Credit' ]//following::button[3]"));
//		StatepensionTextbox01=new TextField(By.xpath("(//div[text()='State Pension']//following::input[2])[1]"));
//		Statepensionweekly01=new Dropdown(By.xpath("(//div[text()='State Pension']//following::select[1])[1]"));
//		Statepensionowner01=new Dropdown(By.xpath("(//div[text()='Child Benefit']//following::select[2])[1]"));

		StatepensionTextbox02=new TextField(By.xpath("(//div[text()='State Pension']//following::input[2])[2]"));
		Statepensionweekly02=new Dropdown(By.xpath("(//div[text()='State Pension']//following::select[1])[2]"));
		Statepensionowner02=new Dropdown(By.xpath("(//div[text()='Child Benefit']//following::select[2])[2]"));


		StatepensionTextbox01=new TextField(By.xpath("//div[text()='State Pension']//following::input[2]"));
		Statepensionweekly01=new Dropdown(By.xpath("//div[text()='State Pension']//following::select[1]"));
		Statepensionowner01=new Dropdown(By.xpath("//div[text()='State Pension']//following::select[2]"));

		CarersallowanceRemove1=new Button(By.xpath("//div[text()='Carer's Allowance']//following::button[3]"));

		PrivatePensionAdd=new Button(By.xpath("//button[text()='private/work pension']"));

		PrivatepensionTextbox02=new TextField(By.xpath("(//div[text()='Private/work pension']//following::input[2])[2]"));
		Privatepensionweekly02=new Dropdown(By.xpath("(//div[text()='Private/work pension']//following::select[1])[2]"));
		Privatepensionowner02=new Dropdown(By.xpath("(//div[text()='Private/work pension']//following::select[2])[2]"));

		PrivatepensionTextbox01=new TextField(By.xpath("(//div[text()='Private/work pension']//following::input[2])[1]"));
		Privatepensionweekly01=new Dropdown(By.xpath("(//div[text()='Private/work pension']//following::select[1])[1]"));
		Privatepensionowner01=new Dropdown(By.xpath("(//div[text()='Private/work pension']//following::select[2])[1]"));
		JSIncomeBasedRemove = new Button(By.xpath(("(//div[contains(text(),'income-based')]//following::button)[3]")));
		JSContributionBasedText = new TextField(By.xpath("(//div[contains(text(),'contribution-based')]//following::input)[2]"));
		JSContributionBasedDropDwn = new Dropdown(By.xpath("(//div[contains(text(),'contribution')]//following::select)[1]"));
		JSSharedContributionBasedDropDwn= new Dropdown(By.xpath("(//div[contains(text(),'contribution')]//following::select)[2]"));

		Studentloans1 = new TextField(By.xpath("(//div[text()='Student loans']//following::input[2])[1]"));
		Studentloans2= new TextField(By.xpath("(//div[text()='Student loans']//following::input[2])[2]"));
		Studentgrant1button= new Button(By.xpath("(//div[text()='Student grant/bursary']//following::button[3])[1]"));
		Studentgrant2button= new Button(By.xpath("(//div[text()='Student grant/bursary']//following::button[3])[2]"));
		Studentloans1Dropdown1 =new Dropdown(By.xpath("(//div[text()='Student loans']//following::select[1])[1]"));
		Studentloans1Dropdown2=new Dropdown(By.xpath("(//div[text()='Student loans']//following::select[1])[2]"));
		wagsEarningButton= new Button(By.xpath("//button[normalize-space()='wage']"));
	}

	private void or(By id) {
		// TODO Auto-generated method stub

	}

	public void ActionOnIncomePageSC89937() {

	}
	public void YourIncomePageActionSC89937() {

		genericMethodsCvp.implicitWait(5000);
		this.getuniversalCreditRemoveButton().click();
		this.getuniversalCreditRemoveButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(5000);
		this.getJSAContributionButton().click();
		switchToActiveFrame();
		//getBrowser().sleep(getBrowser().getTimeout()/10);
		//this.getJSAContributionTextBox89934().clear();
		this.getJSAContributionTextBox89934().enterText("146.20");
		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByIndex(JSAContributionDrop89934, 2);
		//genericMethodsCvp.selectByText(fortnightlyDropDown, "fortnighlty");
		genericMethodsCvp.implicitWait(5000);
		this.getAllIncome().click();
		genericMethodsCvp.implicitWait(2000);
		this.getContinueYourIncomeButton().click();
		genericMethodsCvp.implicitWait(5000);
	}

	public void EnterWagsEarning02()
	{
		genericMethodsCvp.implicitWait(2000);
		this.getMonthlyWagsEarnings02().clear();
		genericMethodsCvp.implicitWait(2000);
		this.getMonthlyWagsEarnings02().enterTextField("370");
		this.getMonthlyWagsEarnings02().tab();
		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByIndex(monthlyDrop2, 4);
	}

	public void YourIncomePageActionSC8993() {

		genericMethodsCvp.implicitWait(2000);
		this.getMonthlyWagsEarnings().enterText("800");
		genericMethodsCvp.implicitWait(1000);
		genericMethodsCvp.selectByIndex(monthlyDrop, 4);
		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByIndex(JSAContributionDrop89934, 2);
		//genericMethodsCvp.selectByText(fortnightlyDropDown, "fortnighlty");
		genericMethodsCvp.implicitWait(5000);
		this.getAllIncome().click();
		genericMethodsCvp.implicitWait(2000);
		this.getContinueYourIncomeButton().click();
		genericMethodsCvp.implicitWait(4000);

	}
	public void EnterWagsEarning()	{
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(2000);
		this.getMonthlyWagsEarnings().clear();
		genericMethodsCvp.implicitWait(2000);
		this.getMonthlyWagsEarnings().enterTextField("1000");
	}
	public void SelectMonthlyDropdown () {
		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByIndex(monthlyDrop, 4);
	}



	public void ClickOtherIncomesNonDependentRemoveButton() {
		switchToActiveFrame();
		this.getOtherIncomesNonDependentContinueButton().click();
	}
	public void ClickgetAllincomeChekcbox() {
		this.getAllIncome().click();
	}
	public void ClickYourIncomePageContinueButton() {
		genericMethodsCvp.implicitWait(2000);
		this.getContinueYourIncomeButton().click();
		genericMethodsCvp.implicitWait(4000);

	}

	public void removeWorkingTax()
	{
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(2000);
		this.getWorkingTaxremoveButton().click();
	}
	public void otherearning()
	{
//		this.getotherIncome().click();
		this.getOtherEarning().enterTextField("125");
		this.getweeklyotherearning().selectFromDropdownByIndex(4);

	}

	public void EnterWagesGuestUser()
	{
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(2000);
		this.getMonthlyWagsEarnings().clear();
		genericMethodsCvp.implicitWait(2000);
		genericMethodsCvp.implicitWait(10000);
		this.getMonthlyWagsEarnings().enterTextField("888");
		this.getMonthlyWagsEarnings().enter();
		this.getMonthlyWagsEarnings().tab();
		genericMethodsCvp.implicitWait(10000);
		genericMethodsCvp.selectByIndex(monthlyDrop,4);
		this.getAllIncome().click();
		this.getContinueYourIncomeButton().click();

	}

	public void  FillIncomeJointMPA()
	{
		System.out.println("Enter in to Income===========================");
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(2000);
		//	this.getRemovePrivatePension2().click();
		this.getRemovePensionCredit().click();
		genericMethodsCvp.implicitWait(10000);
		this.getStatepensionTextbox01().enterTextField("674.40");
		genericMethodsCvp.implicitWait(5000);
		this.getStatepensionTextbox01().enterTextField("674.40");
		genericMethodsCvp.implicitWait(5000);
		this.getStatepensionweekly01().selectFromDropdownByIndex(3);
		genericMethodsCvp.implicitWait(10000);
		this.getPrivatePensionAdd();
		genericMethodsCvp.implicitWait(10000);
		this.getPrivatepensionTextbox01().enterTextField("120");
		genericMethodsCvp.implicitWait(5000);
		this.getPrivatepensionweekly01().selectFromDropdownByIndex(1);
		genericMethodsCvp.implicitWait(10000);
		this.getPrivatepensionowner01().selectFromDropdownByIndex(2);
		genericMethodsCvp.implicitWait(5000);
		this.getPrivatePensionAdd();
		genericMethodsCvp.implicitWait(10000);
		this.getPrivatepensionTextbox02().enterTextField("150");
		genericMethodsCvp.implicitWait(5000);
		this.getPrivatepensionweekly02().selectFromDropdownByIndex(1);
		genericMethodsCvp.implicitWait(10000);
		this.getPrivatepensionowner02().selectFromDropdownByIndex(2);
		genericMethodsCvp.implicitWait(3000);
		this.getAllIncome().click();
		genericMethodsCvp.implicitWait(4000);
		this.getContinueYourIncomeButton().click();



	}
	public void ClickYourSpendingLink() {
		this.getYourSpendinglink().click();
	}

	public void clickOnOtherEarnings() {
		this.getOtherEarningsButton().click();
		genericMethodsCvp.implicitWait(2000);

	}



	public void clickOnOYesforAreYouHappythatsClientQuestions() {
		this.getAreYouhappythatClientsYesButton().click();;
		genericMethodsCvp.implicitWait(2000);

	}

	public void EnterOtherearnings(String data) {
		this.getOtherEarningTextbox().enterText(data);
	}
	public void EnterHousingbenfit(String data) {
		this.getHousingBenfitTextbox().enterText(data);
	}
	public void EnterChildBenfit(String data) {
		this.getChildBenfitTextbox().enterText(data);
	}
	public void EnterJSAContribution(String data) {
		this.getJSAContributionTextbox().enterText(data);
	}



	public void SelectWeekfromOtherearningsDropdown() {

		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(OtherEarningDropdown, "weekly");
	}

	public void SelectWeekfromHousingBenfitDropdown() {

		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(HousingBenfitDropdown, "weekly");
	}

	public void SelectWeekfromChildBenfitDropdown() {

		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(ChildBenfitDropdown, "weekly");
	}
	public void SelectfortnightlyfromJSAContributionDropdown() {

		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(JSAContributionDropdown, "weekly");
	}



	public void SelectClient2fromOtherEarningOwnerDropdown() {

		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(OtherEarningOwnerDropdown, "Client2");
	}

	public void SelectSharedfromHousingBenfitOwnerDropdown() {

		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(HousingBenfitOwnerDropdown, "Shared");
	}

	public void SelectSharedfromChildBenfitOwnerDropdown() {

		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(ChildBenfitOwnerDropdown, "Shared");
	}

	public void SelectSharedfromJSAContributionOwnerDropdown() {

		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(JSAContributionOwnerDropdown, "Shared");
	}





	public void enterDataFor89939() throws InterruptedException {
		genericMethodsCvp.implicitWait(3000);
		getBrowser().scrollDown();
		genericMethodsCvp.waitForAnObjectToBeVisible(By.xpath("//div[text()='Local Housing Allowance/Housing Benefit']//following::input[2]"),100000);
		getHousingBenfitTextbox().enterText("400");
		genericMethodsCvp.implicitWait(3000);
//		getHousingBenfitDropdown().selectFromDropdownByText("monthly");
		getHousingBenfitDropdown().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(3000);
		getstudentLoan().enterText("1200");
		genericMethodsCvp.implicitWait(3000);
		getstudentLoanDropdown().selectFromDropdownByIndex(1);
		genericMethodsCvp.implicitWait(3000);
		studentLoanOwnerDropdown.selectFromDropdownByIndex(2);
		genericMethodsCvp.implicitWait(3000);
		removeWorkingTax();
		genericMethodsCvp.implicitWait(3000);
		getBrowser().sleep(5000);
//		removeUnwantedOptionsFromIncomePage();
		getstudentGrantBursaryRemoveButton().click();
		getBrowser().sleep(5000);
		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.waitForAnObjectToBeClickable(By.xpath("//*[@name='$PpyWorkPage$pGenericFlag$gIncomeComplete']/../label"),9000);
		genericMethodsCvp.scrollIntoViewElement(By.xpath("//*[@name='$PpyWorkPage$pGenericFlag$gIncomeComplete']/../label"));
		getDriver().findElement(By.xpath("//*[@name='$PpyWorkPage$pGenericFlag$gIncomeComplete']/../label")).click();
		genericMethodsCvp.implicitWait(3000);
		getDriver().findElement(By.xpath("//a[contains(@name,'BackToDashboard_pyWorkPage')]")).click();
		genericMethodsCvp.implicitWait(3000);
		getBrowser().sleep(10000);
	}


	public void clickWagesremoveButton() {
		this.getWagesremoveButton().click();
		genericMethodsCvp.implicitWait(2000);

	}

	public void clickChildTaxCreditremoveButton() {
		this.getChildTaxCreditremoveButton().click();
		genericMethodsCvp.implicitWait(2000);

	}
	public void clickWorkingtaxCreditremoveButton() {
		this.getWorkingtaxCreditremoveButton().click();
		genericMethodsCvp.implicitWait(2000);

	}

	public void clickUniversalCreditremoveButton() {
		this.getUniversalCreditremoveButton().click();
		genericMethodsCvp.implicitWait(2000);

	}

	public void clickJSAIncomeBasedremoveButton() {
		this.getJSAIncomeBasedremoveButton().click();
		genericMethodsCvp.implicitWait(2000);

	}

	public void removeUnwantedOptionsFromIncomePage() {
		clickWagesremoveButton();
		genericMethodsCvp.implicitWait(3000);
		clickChildTaxCreditremoveButton();
		genericMethodsCvp.implicitWait(3000);
		clickWorkingtaxCreditremoveButton();
		genericMethodsCvp.implicitWait(3000);
		clickUniversalCreditremoveButton();
		genericMethodsCvp.implicitWait(3000);
		clickJSAIncomeBasedremoveButton();
		genericMethodsCvp.implicitWait(3000);
	}

	public void EnterIncomeForAllScenarios(String Scenarios) {
		{
			switch (Scenarios) {
				case "89936":
					IncomeDataObjects incomedataobjects = IncomeTestData.getIncomeTestData89936();
					SoleClientaFinancialSol_SC89933_Obj dataObjects89936 = SoleClientFinancialSolutionsTestData.getIncomeDetails();
					switchToActiveFrame();
					genericMethodsCvp.implicitWait(2000);
					this.getMonthlyWagsEarnings().clear();
					genericMethodsCvp.implicitWait(2000);
					genericMethodsCvp.implicitWait(10000);
					this.getMonthlyWagsEarnings().enterTextField(dataObjects89936.getMonthlyWagsEarning());
					this.getMonthlyWagsEarnings().enter();
					this.getMonthlyWagsEarnings().tab();
					genericMethodsCvp.implicitWait(10000);
					genericMethodsCvp.selectByIndex(monthlyDrop, 4);
					genericMethodsCvp.implicitWait(2000);
					this.getChildBenfitTextbox().clear();
					genericMethodsCvp.implicitWait(2000);
					this.getChildBenfitTextbox().enterCharByChar(dataObjects89936.getChildBenefit());
					this.getChildBenfitTextbox().enter();
					this.getChildBenfitTextbox().tab();
					genericMethodsCvp.selectByIndex(ChildBenfitDropdown, 2);
					genericMethodsCvp.implicitWait(2000);
					this.getChildTaxCredit().clear();
					genericMethodsCvp.implicitWait(2000);
					this.getChildTaxCredit().enterCharByChar(dataObjects89936.getChildTaxCredit());
					this.getChildTaxCredit().enter();
					this.getChildTaxCredit().tab();
					this.getChildTaxCredit().tab();
					getBrowser().sleep(getBrowser().getTimeout()/10);
					//getDriver().findElement(By.xpath("//*[contains(@name,'pz$ppxResults$l1$pFrequency')]")).
					//this.getChildTaxCreditDropdown().selectFromDropdownByIndex(1);
					this.getChildTaxCreditDropdown().clickScreenElement(childTaxCreditDropdown);
					genericMethodsCvp.selectByIndex(childTaxCreditDropdown, 1);
					genericMethodsCvp.implicitWait(2000);
					this.getWorkingTaxCreditTextField(2).clear();
					this.getWorkingTaxCreditTextField(2).enterCharByChar(incomedataobjects.getZeroValue());
					this.getWorkingTaxCreditTextField(2).enter();
					this.getWorkingTaxCreditTextField(2).tab();
					this.getWorkingTaxCreditFrequency(2).selectFromDropdownByIndex(1);
					genericMethodsCvp.implicitWait(2000);
					genericMethodsCvp.implicitWait(2000);
					this.getUniversalCreditTextField(4).clear();
					this.getUniversalCreditTextField(4).enterCharByChar(incomedataobjects.getZeroValue());
					this.getUniversalCreditTextField(4).enter();
					this.getUniversalCreditTextField(4).tab();
					this.getUniversalCreditFrequency(4).selectFromDropdownByIndex(1);
					genericMethodsCvp.implicitWait(2000);
					this.getAllIncome().click();
					this.getContinueYourIncomeButton().click();
					break;
				default:

			}

		}
	}

	public void YourIncomePageActionSC89934() {

		genericMethodsCvp.implicitWait(5000);
		this.getwagsEarningButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getMonthlyWagsEarnings().enterText("800");
		genericMethodsCvp.selectByIndex(monthlyDrop, 4);
		this.getChaildBenifitTextBox().enterText("139.94");
		genericMethodsCvp.selectByIndex(ChaildBenifitDropdown, 2);
		this.getChaildMaintenanceButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getChaildMaintenanceTextFiled().enterText("200");
		genericMethodsCvp.selectByIndex(ChaildMaintenanceDropDown34, 4);
		genericMethodsCvp.implicitWait(2000);
		this.getStudentLoanTextField().enterText("683");
		genericMethodsCvp.selectByIndex(StudentLoanDropDown, 1);
		getBrowser().sleep(4000);
		this.getRemoveChaildTexCreditButton().click();
		//genericMethodsCvp.implicitWait(5000);
		getBrowser().sleep(4000);
		this.getRemoveLocalHousingAllowanceBenefitButton().click();
//		this.getRemoveWorkingTaxCreditButton().click();
		getBrowser().sleep(4000);
		this.getRemoveStudentGrantButton().click();
		//getBrowser().sleep(getBrowser().getTimeout());

		getBrowser().sleep(5000);
		this.getAllIncome().click();
		genericMethodsCvp.implicitWait(2000);
		this.getContinueYourIncomeButton().click();
		genericMethodsCvp.implicitWait(4000);

	}

	public TextField getWorkingTaxCreditTextField(int index) { return new TextField
			(By.name("$PD_IncomeItemList_pa125419707853990pz$ppxResults$l" + index + "pAmount")); }
	public TextField getUniversalCreditTextField(int index) { return new TextField
			(By.name("$PD_IncomeItemList_pa125419707853990pz$ppxResults$l" + index + "$pAmount")); }
	public Dropdown getWorkingTaxCreditFrequency(int index) { return new Dropdown
			(By.name("$PD_IncomeItemList_pa125419707853990pz$ppxResults$l" + index + "$pFrequency")); }
	public Dropdown getUniversalCreditFrequency(int index) { return new Dropdown
			(By.name("$PD_IncomeItemList_pa125419707853990pz$ppxResults$l" + index + "$pFrequency")); }

	public void YourIncomePageActionSC89949() {

		genericMethodsCvp.implicitWait(2000);
		this.getStudentloans1().enterText("2000");
		genericMethodsCvp.implicitWait(1000);
		genericMethodsCvp.selectByIndex(Studentloans1Dropdown1, 1);
		genericMethodsCvp.implicitWait(3000);
		this.getStudentloans2().enterText("2600");
		genericMethodsCvp.implicitWait(2000);
		genericMethodsCvp.selectByIndex(Studentloans1Dropdown2, 1);
		genericMethodsCvp.implicitWait(3000);

		this.getStudentgrant1button().click();
		getBrowser().sleep(getBrowser().getTimeout());
		this.getStudentgrant1button().click();
		genericMethodsCvp.implicitWait(2000);
		this.getAllIncome().click();
		genericMethodsCvp.implicitWait(4000);
		this.getContinueYourIncomeButton().click();
		genericMethodsCvp.implicitWait(2000);
	}
}

