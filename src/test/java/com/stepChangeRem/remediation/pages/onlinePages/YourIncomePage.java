package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Dropdown;
import com.stepchange.atf.controls.TextField;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class YourIncomePage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    private Button ContinuebuttonforYourIncomePage;
    private Button IhaveAddedEverythingYesRbinDebtPopUp;
    private Button ConfirmButtoninDebtPopUp;
    private Button BenefitsandTaxCredits;
    private Button JSAContributionBased;
    private TextField HowMuchYouReceivedTextbox;
    private Dropdown HowOftendropdownforJSAContribution;
    private Button AddButton;
    private Button earningIncomePage;
    private Button wagesincomePage;
    private TextField wagesEntry;
    private Dropdown HowOften;
    private Button benifitAndTax;
    private Button chaildBefit;
    private TextField chaildBefitTextEntry;
    private Dropdown childBenifitDropdown;
    private Button otherIncome;
    private Button studentLoanButton;
    private TextField studentLoanTextEntry;
    private Dropdown studentLoanDropdown;
    private Button chaildSupportMainteneceButton;
    private TextField chaildSupportMaintTextEntry;
    private Dropdown chaildSupportMainteneceDropdown;
    private Button ContinueButton;
    private Button addedEverythingOption;
    private Button PopUpConfirmButton;


    public Button getEarningIncomePage() {return earningIncomePage;}
    public Button getWagesincomePage() {return wagesincomePage;}
    public TextField getWagesEntry() {return wagesEntry; }
    public Dropdown getHowOften() {return HowOften;}
    public Button getAddButton() {return AddButton;}
    public Button getBenifitAndTax() {return benifitAndTax;}
    public Button getChaildBefit() {return chaildBefit; }
    public TextField getChaildBefitTextEntry() {return chaildBefitTextEntry; }
    public Dropdown getChildBenifitDropdown() {return childBenifitDropdown; }
    public Button getOtherIncome() {return otherIncome; }
    public Button getStudentLoanButton() {return studentLoanButton; }
    public TextField getStudentLoanTextEntry() {return studentLoanTextEntry; }
    public Dropdown getStudentLoanDropdown() {return studentLoanDropdown; }
    public Button getChaildSupportMainteneceButton() {return chaildSupportMainteneceButton;}
    public TextField getChaildSupportMaintTextEntry() {return chaildSupportMaintTextEntry;}
    public Dropdown getChaildSupportMainteneceDropdown() {return chaildSupportMainteneceDropdown; }
    public Button getContinueButton() { return ContinueButton; }
    public Button getAddedEverythingOption() { return addedEverythingOption;}
    public Button getPopUpConfirmButton() { return PopUpConfirmButton; }

    public Button getContinuebuttonforYourIncomePage() {
        return ContinuebuttonforYourIncomePage;
    }
    public Button getIhaveAddedEverythingYesRbinDebtPopUp() {
        return IhaveAddedEverythingYesRbinDebtPopUp;
    }
    public Button getConfirmButtoninDebtPopUp() {
        return ConfirmButtoninDebtPopUp;
    }
    public Button getBenefitsandTaxCredits() {
        return BenefitsandTaxCredits;
    }
    public Button getJSAContributionBased() {
        return JSAContributionBased;
    }
    public TextField getHowMuchYouReceivedTextbox() {
        return HowMuchYouReceivedTextbox;
    }
    public Dropdown getHowOftendropdownforJSAContribution() {
        return HowOftendropdownforJSAContribution;
    }

    public YourIncomePage(){
        ContinuebuttonforYourIncomePage  = new Button(By.xpath("//button[text()='Continue']"));
        IhaveAddedEverythingYesRbinDebtPopUp = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[2]"));
        ConfirmButtoninDebtPopUp = new Button(By.xpath("//button[text()='Confirm']"));
        AddButton = new Button(By.xpath("//button[text()='Add']"));

        BenefitsandTaxCredits = new Button(By.xpath("//div[text()='Benefits and Tax Credits']"));
        JSAContributionBased= new Button(By.xpath("(//span[@class='body_text'])[12]//parent::div"));
        HowMuchYouReceivedTextbox = new TextField(By.xpath("//div[text()='How much do you receive?']//following::input[1]"));
        HowOftendropdownforJSAContribution= new Dropdown(By.xpath("//div[text()='How often?']//following::select"));

        earningIncomePage= new Button(By.xpath("//div[text()='Earnings']"));
        wagesincomePage=new Button(By.xpath("(//div[@data-test-id='202002261830490025723'])[1]"));
        wagesEntry=new TextField(By.xpath("//input[contains(@name,'pz$ppxResults$l15$pAmount') and @class='leftJustifyStyle']"));
        HowOften=new Dropdown(By.xpath("//select[contains(@name,'pz$ppxResults$l15$pFrequency')]"));
        benifitAndTax= new Button(By.xpath("//div[text()='Benefits and Tax Credits']"));
        chaildBefit=new Button(By.xpath("(//span[text()='Child Benefit'])[1]"));
        chaildBefitTextEntry=new TextField(By.xpath("//input[contains(@name,'pz$ppxResults$l1$pAmount') and @class='leftJustifyStyle']"));
        childBenifitDropdown = new Dropdown(By.xpath("//select[contains(@name,'pz$ppxResults$l1$pFrequency')]"));
        otherIncome= new Button(By.xpath("//div[text()='Other income']"));
        studentLoanButton=new Button(By.xpath("(//span[text()='Student loans'])[1]"));
        studentLoanTextEntry=new TextField(By.xpath("//input[contains(@name,'pz$ppxResults$l20$pAmount') and @class='leftJustifyStyle']"));
        studentLoanDropdown=new Dropdown(By.xpath("//select[contains(@name,'pz$ppxResults$l20$pFrequency')]"));
        chaildSupportMainteneceButton=new Button(By.xpath("(//span[text()='Child support/maintenance'])[1]"));
        chaildSupportMaintTextEntry=new TextField(By.xpath("//input[contains(@name,'pz$ppxResults$l19$pAmount') and @class='leftJustifyStyle']"));
        chaildSupportMainteneceDropdown=new Dropdown(By.xpath("//select[contains(@name,'pz$ppxResults$l19$pFrequency')]"));
        ContinueButton = new Button(By.xpath("//button[text()='Continue']"));
        addedEverythingOption = new Button(By.xpath("//label[text()='Yes, I have finished']"));
        PopUpConfirmButton = new Button(By.xpath("//button[text()='Confirm']"));

    }
    public void actionOnIncomeOnline89955(){
        GenericMethods_cvp.implicitWait(10000);
        this.getEarningIncomePage().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getWagesincomePage().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getWagesEntry().enterText("800");
        GenericMethods_cvp.implicitWait(10000);
        this.getHowOften().selectFromDropdownByIndex(4);
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getBenifitAndTax().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getChaildBefit().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getChaildBefitTextEntry().enterText("139.94");
        GenericMethods_cvp.implicitWait(10000);
        this.getChildBenifitDropdown().selectFromDropdownByIndex(2);
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getOtherIncome().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getStudentLoanButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getStudentLoanTextEntry().enterText("683");
        GenericMethods_cvp.implicitWait(10000);
        this.getStudentLoanDropdown().selectFromDropdownByIndex(1);
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getChaildSupportMainteneceButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getChaildSupportMaintTextEntry().enterText("197.66");
        GenericMethods_cvp.implicitWait(10000);
        this.getChaildSupportMainteneceDropdown().selectFromDropdownByIndex(3);
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getContinueButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getAddedEverythingOption().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getPopUpConfirmButton().click();
        GenericMethods_cvp.implicitWait(10000);
    }
    public void FillincomePagedetailsfor89963(String amount,int number){
        GenericMethods_cvp.implicitWait(4000);
        this.getBenefitsandTaxCredits().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getJSAContributionBased().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getHowMuchYouReceivedTextbox().enterText(amount);
        GenericMethods_cvp.implicitWait(5000);
        this.getHowOftendropdownforJSAContribution().selectFromDropdownByIndex(number);
        GenericMethods_cvp.implicitWait(5000);
        this.getAddButton().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getContinuebuttonforYourIncomePage().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getIhaveAddedEverythingYesRbinDebtPopUp().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getConfirmButtoninDebtPopUp().click();

    }
    public void ContinueActionOnIncomePage(){
        GenericMethods_cvp.implicitWait(10000);
        this.getContinueButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getAddedEverythingOption().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getPopUpConfirmButton().click();
        //GenericMethods_cvp.implicitWait(2000);
    }

}
