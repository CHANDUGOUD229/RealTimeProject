package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourDebtsPage extends Control {
    private final Button ArrearsOrFurtherActionNoButton3;

    public Link getDetailedViewLink3() {
        return DetailedViewLink3;
    }

    public Link getDetailedViewLink3_89940() {
        return detailedViewLink3_89940;
    }

    public Link getDetailedViewLink5_89940() {
        return detailedViewLink5_89940;
    }

    private final Link DetailedViewLink3;
    private final Button AreYouBehindWithPaymentNoButton2JointMPA;
    private final Link detailedViewLink3_89940;
    private final Link detailedViewLink5_89940;
    GenericMethodsRemediation GenericMethod_cvp = new GenericMethodsRemediation();
    private Button ArrearsOrFurtherActionYesButton1;
    private final Link BackToDashBordLink;
    private final Button AddaDebtButton;
    private final Button AreTheyLiableQuestionNoButtonInGlobalQuestionsAlert;
    private final Button SubmitButtonInGlobalQuestionsAlert;
    private Button detailviewLink89939;


    ///Creditor1
    private final AutoComplete CreditorFromutoComplete;
    private final AutoComplete DebtTypFromAutoComplete;
    private final TextField AmountOwedTextField;
    private final Dropdown LiabilityutoComplete;
    private final Dropdown LiabilityComplete2;
    private final Button ArrearsOrFurtherActionNoButton;
    private final Button ArrearsOrFurtherActionYesButton;
    private final Link DetailedViewLink;

    private final TextField OriginalRegularpaymentTextBox;
    private final Dropdown OriginalRegularpaymentTimeSelectionDropdown;
    private final Button AreYouBehindWithpayementNoButton;
    private final Button AreYouBehindWithpayementYesButton;
    private final Button IstheDebtSubjectToAGuarantorNoButton;
    private final Button FurtherAction1;

    private final TextField OriginalRegularpaymentTextBox1;
    private final Dropdown OriginalRegularpaymentTimeSelectionDropdown1;
    private final Button IstheDebtSubjectToAGuarantorNoButtonCred2MPA;
    ////For Creditor2
    private final AutoComplete CreditorFromDropDown2;
    private final AutoComplete DebtTypFromDropdown2;
    private TextField CreditorFromDropDown2MPA;
    private TextField DebtTypFromDropdown2MPA;
    private TextField AmountOwedTextbox2MPA;
    private Dropdown LiabilityDropdown2MPA;
    private final TextField AmountOwedTextbox2;
    private final Dropdown LiabilityDropdown2;
    private final Button ArrearsOrFurtherActionNoButton2;
    private final Link DetailedViewLink2;
    private final Button AreYouBehindWithpayementNoButton2;
    private final Button RepaidArrearsNoButton;
    private final Dropdown MortgagetypeDropDown;
    private final Button IsSVRNoButton;
    private final Button AddLinkedItem;

    private final Button CreditorSupply;
    private final Button ActionTakenByCreditor2;
    private final Button arrangementPlaceToReply;
    private final Button AddLinkItem2;
    private final TextField ElectricityAmount;
    private final Dropdown ElectricityFrequencyDropdown;
    private final Dropdown ElectricityOwnerDropdown;
    private final Button SubmitButton;
    private final AutoComplete CreditorFromDropDown3;

    public Dropdown getRepayingTowardsThisDropDown() {
        return repayingTowardsThisDropDown;
    }

    private final Dropdown repayingTowardsThisDropDown;

    //Creditor3
    private final AutoComplete CreditorType3Name;
    private final AutoComplete DebtTypFromDropdown3;
    private final TextField AmountOwedTextbox3;
    private final Dropdown LiabilityDropdown3;
    private final Button isRelateToCurrentYear;
    private final Button ActionCreditor3;
    private final Button arrangementInPlaceToReply3;
    private final Button creaditorDropDownValueButton3;
    private final Button DebtTypeDropDownValueButton3;
    private final Button SVRNo03;
    private final Button HaveYouRepaidAnyArrearsNoButton03;
    private final Button AreYouBehindWithpayementNoButton03;
    private final Dropdown OwnerDropdown;
    private final Button LinkedPopupAddButton;
    private final Button DoTheyGuarantorWhoWillBecomeResponsibleNoButton;
    private Dropdown liabilitySecond;
    private final Button AreYouBehindWithpaymentNoButton3JointMPA;
    //Creditor4
    private TextField CreditorType4Name;
    private TextField DebtTypFromDropdown4;
    private TextField AmountOwedTextbox4;
    private Dropdown LiabilityDropdown4;
    private Button IstheDebtWiththeCollectionProcessNoButtonCred4MPA;
    private Link DetailedViewLink4;


    public TextField getCreditorFromDropDown2MPA() {
        return CreditorFromDropDown2MPA;
    }

    public TextField getDebtTypFromDropdown2MPA() {
        return DebtTypFromDropdown2MPA;
    }

    public TextField getAmountOwedTextbox2MPA() {
        return AmountOwedTextbox2MPA;
    }

    public Dropdown getLiabilityDropdown2MPA() {
        return LiabilityDropdown2MPA;
    }


    public Link getDetailedViewLink4() {
        return DetailedViewLink4;
    }

    public TextField getCreditorType4Name() {
        return CreditorType4Name;
    }

    public TextField getDebtTypFromDropdown4() {
        return DebtTypFromDropdown4;
    }

    public TextField getAmountOwedTextbox4() {
        return AmountOwedTextbox4;
    }

    public Dropdown getLiabilityDropdown4() {
        return LiabilityDropdown4;
    }

    public Button getIstheDebtWiththeCollectionProcessNoButtonCred4MPA() {
        return IstheDebtWiththeCollectionProcessNoButtonCred4MPA;
    }
    public Button getDetailviewLink89939(){ return detailviewLink89939;}

    private TextField OriginalRegularpaymentTextBoxdebt2;

    public TextField getOriginalRegularpaymentTextBoxdebt2() {
        return OriginalRegularpaymentTextBoxdebt2;
    }

    public Dropdown getLiabilitySecond() {
        return liabilitySecond;
    }

    public Button getAreYouBehindWithpaymentNoButton3JointMPA() {
        return AreYouBehindWithpaymentNoButton3JointMPA;
    }

    public Link getBackToDashBordLink() {
        return BackToDashBordLink;
    }

    public AutoComplete getCreditorType3Name() {
        return CreditorType3Name;
    }

    public AutoComplete getDebtTypFromDropdown3() {
        return DebtTypFromDropdown3;
    }

    public TextField getAmountOwedTextbox3() {
        return AmountOwedTextbox3;
    }

    public Dropdown getLiabilityDropdown3() {
        return LiabilityDropdown3;
    }

    public Button getIsRelateToCurrentYear(int index,String label) {
        return new Button(By.xpath("//input[contains(@name,'$l"+index+"$pIsCurrentYearArrears')]/../label[.='"+label+"']"));
    }

    public Button getActionCreditor3() {
        return ActionCreditor3;
    }

    public Button getArrangementInPlaceToReply3() {
        return arrangementInPlaceToReply3;
    }

    public Button getCreaditorDropDownValueButton3() {
        return creaditorDropDownValueButton3;
    }

    public Button getDebtTypeDropDownValueButton3() {
        return DebtTypeDropDownValueButton3;
    }

    public Button getSVRNo03() {
        return SVRNo03;
    }

    public Button getHaveYouRepaidAnyArrearsNoButton03() {
        return HaveYouRepaidAnyArrearsNoButton03;
    }

    public Button getAreYouBehindWithpaymentNoButton03() {
        return AreYouBehindWithpayementNoButton03;
    }

    public Dropdown getOwnerDropdown() {
        return OwnerDropdown;
    }

    public Button getLinkedPopupAddButton() {
        return LinkedPopupAddButton;
    }

    public Button getDoTheyGuarantorWhoWillBecomeResponsibleNoButton() {
        return DoTheyGuarantorWhoWillBecomeResponsibleNoButton;
    }

    public Button getIstheDebtSubjectToAGuarantorNoButtonCred2MPA() {
        return IstheDebtSubjectToAGuarantorNoButtonCred2MPA;
    }


    ////LinksAlertElement
    private final TextField MortgagePaymentAmountTextBox;
    private final Dropdown FrequencyDropDown;
    private final Dropdown MainHomeDropdown;

    private final TextField MainHomeAmount;
    private final Button MainHomeSave;
    private final Checkbox MainHomeCheckbox;
    private final Button LinksSubmitButton;


    private final Checkbox AllofClientsDebtshavebeencapturedCheckBox;
    private final Button YourDebtsContinueButton;
    ///Alert Elements
    private final Button DoTheyDisputeBalanceNoButton;
    private final Button DoTheyBelieveStatueBarredorPrescribedQuestionNoButton;
    private final Button DoTheyHaveGuarantoNoButton;
    private final Button DoTheyHaveGuarantoNoButton_89940;
    private final Button creaditorDropDownValueButton;
    private final Button DebtTypeDropDownValueButton;
    private final Button creaditorDropDownValueButton2;
    private final Button DebtTypeDropDownValueButton2;
    private Dropdown MortagageTypeDropdown03;
    // for 89940 scenario by bala

    private Button NoFurtherAction;

    //	private TextField OriginalRegularpaymentTextBoxdebt2;
    private Dropdown OriginalRegularpaymentTimeSelectionDropdowndebt2;
    private Button AreYouBehindWithpayementNoButtondebt2;
    private Button IstheDebtSubjectToAGuarantorNoButtondebt2;

    private TextField CreditorFromDropDownfordebt3;
    private TextField DebtTypFromDropdownfordebt3;
    private TextField AmountOwedTextboxfordebt3;
    private Dropdown LiabilityDropdownfordebt3;
    private Link DetailedViewLinkfordebt3;
    private Link DetailedViewLinkfordebt4;
    private Button AreYouBehindWithpayementNoButtonfordebt3;
    private Button IsSVRNoButtonfordebt3;
    private TextField OriginalRegularpaymentTextBoxfordebt3;
    private Dropdown OriginalRegularpaymentTimeSelectionDropdownfordebt3;
    private Button OngoingSuplyNoButton;
    private Button WhatActionTakenByCreditorNoAction;


    public Button getAreYouBehindWithpayementYesButton() {
        return AreYouBehindWithpayementYesButton;
    }

    public Button getAreTheyLiableQuestionNoButtonInGlobalQuestionsAlert() {
        return AreTheyLiableQuestionNoButtonInGlobalQuestionsAlert;
    }

    public Button getAreYouBehindWithpayementNoButtondebt2() {
        return AreYouBehindWithpayementNoButtondebt2;
    }

    public Button getIstheDebtSubjectToAGuarantorNoButtondebt2() {
        return IstheDebtSubjectToAGuarantorNoButtondebt2;
    }


    private Button AreTheyLiableQuestionYesButtonInGlobalQuestionsAlert;

    public Button getAreTheyLiableQuestionYesButtonInGlobalQuestionsAlert() {
        return AreTheyLiableQuestionYesButtonInGlobalQuestionsAlert;
    }

    public Button getSubmitButtonInGlobalQuestionsAlert() {
        return SubmitButtonInGlobalQuestionsAlert;
    }

    public Button getAddaDebtButton() {
        return AddaDebtButton;
    }


    public AutoComplete getCreditorFromutoComplete() {
        return CreditorFromutoComplete;
    }

    public AutoComplete getDebtTypFromAutoComplete() {
        return DebtTypFromAutoComplete;
    }

    public TextField getAmountOwedTextField() {
        return AmountOwedTextField;
    }

    public Dropdown getLiabilityutoComplete() {
        return LiabilityutoComplete;
    }

    public Dropdown getMortagageTypeDropdown03() {
        return MortagageTypeDropdown03;
    }


    public Button getArrearsOrFurtherActionNoButton() {
        return ArrearsOrFurtherActionNoButton;
    }

    public Button getArrearsOrFurtherActionYesButton() {
        return ArrearsOrFurtherActionYesButton;
    }

    public Button getArrearsOrFurtherActionYesButton1() {
        return ArrearsOrFurtherActionYesButton1;
    }

    public Link getDetailedViewLink() {
        return DetailedViewLink;
    }


    public TextField getOriginalRegularpaymentTextBox() {
        return OriginalRegularpaymentTextBox;
    }

    public Dropdown getOriginalRegularpaymentTimeSelectionDropdown() {
        return OriginalRegularpaymentTimeSelectionDropdown;
    }

    public Button getAreYouBehindWithpayementNoButton() {
        return AreYouBehindWithpayementNoButton;
    }

    public Button getIstheDebtSubjectToAGuarantorNoButton() {
        return IstheDebtSubjectToAGuarantorNoButton;
    }

    public Button getFurtherAction1() {
        return FurtherAction1;
    }

    private final AutoComplete CreditorFromDropDown;

    public AutoComplete getCreditorFromDropdown() {
        return CreditorFromDropDown;
    }

    private final TextField AmountOwedTextbox;

    public TextField getAmountOwedTextbox() {
        return AmountOwedTextbox;
    }

    private final TextField AmountOwedTextbox89949;

    public TextField getAmountOwedTextbox89949() {
        return AmountOwedTextbox89949;
    }
    /////For Creditor2

    public AutoComplete getCreditorFromDropDown2() {
        return CreditorFromDropDown2;
    }

    public AutoComplete getCreditorFromDropDown3() {
        return CreditorFromDropDown3;
    }

    public AutoComplete getDebtTypFromDropdown2() {
        return DebtTypFromDropdown2;
    }

    public TextField getAmountOwedTextbox2() {
        return AmountOwedTextbox2;
    }

    public Dropdown getLiabilityDropdown2() {
        return LiabilityDropdown2;
    }

    public Button getArrearsOrFurtherActionNoButton2() {
        return ArrearsOrFurtherActionNoButton2;
    }

    public Link getDetailedViewLink2() {
        return DetailedViewLink2;
    }

    public Button getAreYouBehindWithpayementNoButton2() {
        return AreYouBehindWithpayementNoButton2;
    }

    public Button getRepaidArrearsNoButton() {
        return RepaidArrearsNoButton;
    }

    public Dropdown getMortgagetypeDropDown() {
        return MortgagetypeDropDown;
    }

    public Button getIsSVRNoButton() {
        return IsSVRNoButton;
    }

    public Button getAddLinkedItem() {
        return AddLinkedItem;
    }


    public Button getCreditorSupply() {
        return CreditorSupply;
    }

    public Button getActionTakenByCreditor2() {
        return ActionTakenByCreditor2;
    }

    public Button getArrangementPlaceToReply() {
        return arrangementPlaceToReply;
    }

    public Button getAddLinkItem2() {
        return AddLinkItem2;
    }

    public TextField getElectricityAmount() {
        return ElectricityAmount;
    }

    public Dropdown getElectricityFrequencyDropdown() {
        return ElectricityFrequencyDropdown;
    }

    public Dropdown getElectricityOwnerDropdown() {
        return ElectricityOwnerDropdown;
    }

    public Button getSubmitButton() {
        return SubmitButton;
    }
//	private Button NoFurtherAction;

    public Button getNoFurtherAction() {
        return NoFurtherAction;
    }

    ////LinksAlertGetterMethods

    public TextField getMortgagePaymentAmountTextBox() {
        return MortgagePaymentAmountTextBox;
    }

    public Dropdown getFrequencyDropDown() {
        return FrequencyDropDown;
    }

    public Checkbox getMainHomeCheckbox() {
        return MainHomeCheckbox;
    }

    public Button getLinksSubmitButton() {
        return LinksSubmitButton;
    }

    public Checkbox getAllofClientsDebtshavebeencapturedCheckBox() {
        return AllofClientsDebtshavebeencapturedCheckBox;
    }

    public Button getYourDebtsContinueButton() {
        return YourDebtsContinueButton;
    }

    public Button getDoTheyDisputeBalanceNoButton() {
        return DoTheyDisputeBalanceNoButton;
    }

    public Button getDoTheyBelieveStatueBarredorPrescribedQuestionNoButton() {
        return DoTheyBelieveStatueBarredorPrescribedQuestionNoButton;
    }

    public Dropdown getLiabilityComplete2() {
        return LiabilityComplete2;
    }

    public Button getDoTheyHaveGuarantoNoButton() {
        return DoTheyHaveGuarantoNoButton;
    }

    public Button getDoTheyHaveGuarantoNoButton_89940() {
        return DoTheyHaveGuarantoNoButton_89940;
    }

    public AutoComplete getDebtTypFromDropdown() {
        return DebtTypFromDropdown;
    }

    private final AutoComplete DebtTypFromDropdown;
    private final Dropdown LiabilityDropdown;

    public Dropdown getLiabilityDropdown() {
        return LiabilityDropdown;
    }

    public TextField getCreditorFromDropDownfordebt3() {
        return CreditorFromDropDownfordebt3;
    }


    public TextField getDebtTypFromDropdownfordebt3() {
        return DebtTypFromDropdownfordebt3;
    }


    public TextField getAmountOwedTextboxfordebt3() {
        return AmountOwedTextboxfordebt3;
    }


    public Dropdown getLiabilityDropdownfordebt3() {
        return LiabilityDropdownfordebt3;
    }

    public Dropdown getOriginalRegularpaymentTimeSelectionDropdownfordebt3() {
        return OriginalRegularpaymentTimeSelectionDropdownfordebt3;
    }


    public Link getDetailedViewLinkfordebt3() {
        return DetailedViewLinkfordebt3;
    }


    public Button getAreYouBehindWithpayementNoButtonfordebt3() {
        return AreYouBehindWithpayementNoButtonfordebt3;
    }


    public Button getIsSVRNoButtonfordebt3() {
        return IsSVRNoButtonfordebt3;
    }

    public TextField getOriginalRegularpaymentTextBoxfordebt3() {
        return OriginalRegularpaymentTextBoxfordebt3;
    }

    //private Dropdown OriginalRegularpaymentTimeSelectionDropdowndebt2;
    public Dropdown getOriginalRegularpaymentTimeSelectionDropdowndebt2() {
        return OriginalRegularpaymentTimeSelectionDropdowndebt2;
    }

    public Button getAreYouBehindWithPaymentNoButton2JointMPA() {
        return AreYouBehindWithPaymentNoButton2JointMPA;
    }

    private Button AreuBehindWithNoButton89949;

    public Button getAreuBehindWithNoButton89949() {
        return AreuBehindWithNoButton89949;
    }

    public Button getOngoingSuplyNoButton() {
        return OngoingSuplyNoButton;
    }

    public Button getWhatActionTakenByCreditorNoAction() {
        return WhatActionTakenByCreditorNoAction;
    }

    private Button FurtherActionCourtAction;

    public Button getFurtherActionCourtAction() {
        return FurtherActionCourtAction;
    }

    public YourDebtsPage() {
        AreTheyLiableQuestionYesButtonInGlobalQuestionsAlert = new Button(By.xpath("(//label[@class='rb_segmented rb_standard radioLabel'])[1]"));
        repayingTowardsThisDropDown = new Dropdown(By.xpath("//select[@id='608e3594']"));
        liabilitySecond = new Dropdown(By.xpath("(//option[@value='OWN0001']//parent::select)[2]"));
        BackToDashBordLink = new Link(By.xpath("//a[normalize-space()='Back to dashboard']"));
        AddaDebtButton = new Button(By.xpath("//button[text()='Add a debt']"));
        AreTheyLiableQuestionNoButtonInGlobalQuestionsAlert = new Button(By.xpath("(//label[@class='rb_segmented rb_standard radioLabel'])[2]"));
        SubmitButtonInGlobalQuestionsAlert = new Button(By.xpath("(//button[@class='SC_Button_Primary pzhc pzbutton'])[1]"));
        //CreditorFromDropDown = new TextField(By.xpath("//input[@placeholder='Creditor']"));
        CreditorFromutoComplete = new AutoComplete(By.xpath("//input[@placeholder='Creditor']"));
        DebtTypFromAutoComplete = new AutoComplete(By.xpath("//input[@placeholder='Debt type']"));
        AmountOwedTextField = new TextField(By.xpath("//input[@placeholder='£']"));
        LiabilityutoComplete = new Dropdown(By.xpath("//option[@value='OWN0001']//parent::select"));//select[@data-ctl='[\"Dropdown\"]']
        ArrearsOrFurtherActionYesButton = new Button(By.xpath("(//label[@class='rb_segmented rb_standard radioLabel'])[1]"));
        ArrearsOrFurtherActionYesButton1 = new Button(By.xpath("(//label[@class='rb_segmented rb_standard radioLabel'])[3]"));
        ArrearsOrFurtherActionNoButton = new Button(By.xpath("(//label[@class='rb_segmented rb_standard radioLabel'])[2]"));
        DetailedViewLink = new Link(By.xpath("//a[text()='Detailed view']"));
        FurtherAction1 = new Button(By.xpath("//label[text()='Default notice']"));
        FurtherActionCourtAction = new Button(By.xpath("//label[text()='Court action']']"));
        CreditorFromDropDown = new AutoComplete(By.xpath("//input[@placeholder='Creditor']"));
        AmountOwedTextbox = new TextField(By.xpath("//input[@placeholder='£']"));
        NoFurtherAction = new Button(By.xpath("//label[text()='No action taken (arrears only)']"));
        AmountOwedTextbox89949 = new TextField(By.xpath("(//input[@placeholder='£'])[1]"));


        OriginalRegularpaymentTextBoxdebt2 = new TextField(By.xpath("//div[text()='What was the original regular payment?']//following::input[1]"));

        OriginalRegularpaymentTextBox = new TextField(By.xpath("(//input[@data-ctl='[\"TextInput\"]' and @validationtype='isnonnegative,decimal'])[2]"));
        OriginalRegularpaymentTimeSelectionDropdown = new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l1$pContractualPaymentFrequency')]"));//(//select[@data-ctl='[\"Dropdown\"]'])[2]
        OriginalRegularpaymentTextBox1 = new TextField(By.xpath("//input[contains(@name,'$ppxResults$l2$pContractualPaymentValue')]"));
        OriginalRegularpaymentTimeSelectionDropdown1 = new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l2$pContractualPaymentFrequency')]"));
        AreYouBehindWithpayementNoButton = new Button(By.xpath("(//label[text()='No'])[2]"));
        AreYouBehindWithpayementYesButton = new Button(By.xpath("(//label[text()='Yes'])[2]"));
        IstheDebtSubjectToAGuarantorNoButton = new Button(By.xpath("(//label[text()='No'])[3]"));
        IstheDebtSubjectToAGuarantorNoButtonCred2MPA = new Button(By.xpath("(//label[text()='No'])[4]"));

        ///For Creditor2
        CreditorFromDropDown2 = new AutoComplete(By.xpath("(//input[@placeholder='Creditor'])[2]"));
        DebtTypFromDropdown2 = new AutoComplete(By.xpath("(//input[@placeholder='Debt type'])[2]"));
        AmountOwedTextbox2 = new TextField(By.xpath("(//input[@placeholder='£'])[2]"));
        detailviewLink89939= new Button(By.xpath("(//a[@data-test-id='202007200912530008254489'])[1]"));
        LiabilityDropdown2 = new Dropdown(By.xpath("(//option[@value='OWN0001']//parent::select)[2]"));//select[@data-ctl='[\"Dropdown\"]'])[3]
        ArrearsOrFurtherActionNoButton2 = new Button(By.xpath("(//label[text()='No'])[3]"));
        DetailedViewLink2 = new Link(By.xpath("(//a[text()='Detailed view'])[2]"));
        DetailedViewLink3 = new Link(By.xpath("(//a[text()='Detailed view'])[3]"));

        detailedViewLink3_89940 = new Link(By.xpath("(//a[text()='Detailed view'])[3]"));
        detailedViewLink5_89940 = new Link(By.xpath("(//a[text()='Detailed view'])[5]"));

        CreditorFromDropDown2MPA = new TextField(By.xpath("(//input[@placeholder='Creditor'])[2]"));
        DebtTypFromDropdown2MPA = new TextField(By.xpath("(//input[@placeholder='Debt type'])[2]"));
        AmountOwedTextbox2MPA = new TextField(By.xpath("(//input[@placeholder='£'])[2]"));
        LiabilityDropdown2MPA = new Dropdown(By.xpath("(//option[@value='OWN0001']//parent::select)[2]"));
//		ArrearsOrFurtherActionNoButton2 = new Button(By.xpath("(//label[text()='No'])[5]"));
//		DetailedViewLink2 = new Link(By.xpath("(//a[text()='Detailed view'])[2]"));
        AreYouBehindWithpayementNoButton2 = new Button(By.xpath("(//label[text()='No'])[6]"));
        AreYouBehindWithPaymentNoButton2JointMPA = new Button(By.xpath("(//label[text()='No'])[3]"));
        AreYouBehindWithpaymentNoButton3JointMPA = new Button(By.xpath("(//label[text()='No'])[7]"));
        AreuBehindWithNoButton89949 = new Button(By.xpath("(//label[text()='No'])[4]"));
        RepaidArrearsNoButton = new Button(By.xpath("(//label[text()='No'])[7]"));
        MortgagetypeDropDown = new Dropdown(By.xpath("//option[text()='Repayment']//parent::select"));//(//select[@data-ctl='[\"Dropdown\"]'])[4]
        IsSVRNoButton = new Button(By.xpath("(//label[text()='No'])[8]"));
        AddLinkedItem = new Button(By.xpath("//button[text()='Add linked item']"));

        CreditorSupply = new Button(By.xpath("(//label[text()='Yes'])[4]"));
        ActionTakenByCreditor2 = new Button(By.xpath("(//label[text()='No action taken (arrears only)'])[2]"));
        arrangementPlaceToReply = new Button(By.xpath("(//label[text()='No'])[5]"));
        AddLinkItem2 = new Button(By.xpath("//button[text()='Add linked item']"));
        ElectricityAmount = new TextField(By.xpath("//input[@name='$PD_LinkingItems_pa4288961223158891pz$ppxResults$l1$pAmount']"));
        ElectricityFrequencyDropdown = new Dropdown(By.xpath("//select[@name='$PD_LinkingItems_pa4288961223158891pz$ppxResults$l1$pFrequency']"));
        ElectricityOwnerDropdown = new Dropdown(By.xpath("//select[@name='$PD_LinkingItems_pa4288961223158891pz$ppxResults$l1$pOwnership$pCode']"));
        SubmitButton = new Button(By.xpath("//button[text()='Submit']"));
        OngoingSuplyNoButton = new Button(By.xpath("(//label[text()='No'])[3]"));
        WhatActionTakenByCreditorNoAction = new Button(By.xpath("//label[normalize-space()='No action taken (arrears only)']"));

        ///For Creditor3
        CreditorFromDropDown3 = new AutoComplete(By.xpath("(//input[@placeholder='Creditor'])[3]"));
        CreditorType3Name = new AutoComplete(By.xpath("//input[contains(@name,'$ppxResults$l3$pCreditor$pDescription')]"));
        DebtTypFromDropdown3 = new AutoComplete(By.xpath("//input[contains(@name,'$ppxResults$l3$pDescription')]"));
        AmountOwedTextbox3 = new TextField(By.xpath("(//input[@placeholder='£'])[3]"));
        LiabilityDropdown3 = new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l3$pOwnership$pCode')]"));//select[@data-ctl='[\"Dropdown\"]'])[3]
        isRelateToCurrentYear = new Button(By.xpath("(//label[text()='No'])[7]"));
        ActionCreditor3 = new Button(By.xpath("(//label[text()='No action taken (arrears only)'])[2]"));
        arrangementInPlaceToReply3 = new Button(By.xpath("(//label[text()='No'])[8]"));
        ArrearsOrFurtherActionNoButton3 = new Button(By.xpath("(//input[contains(@name,'$ppxResults$l3$pBooleanVal5')]/../label)[2]"));
        SVRNo03 = new Button(By.xpath("(//input[contains(@name,'$pClientOnStandardVariableRate')]/../label)[2]"));
        DebtTypFromDropdown = new AutoComplete(By.xpath("//input[@placeholder='Debt type']"));
        MortagageTypeDropdown03 = new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l3$pMortgageType')]"));
        MortgagePaymentAmountTextBox = new TextField(By.xpath("(//input[@class='leftJustifyStyle'])[1]"));
        FrequencyDropDown = new Dropdown(By.xpath("//option[text()='monthly']//parent::select"));//(//select[@data-ctl='[\"Dropdown\"]'])[1]
        MainHomeCheckbox = new Checkbox(By.xpath("(//input[@data-ctl='Checkbox' and @class='checkbox chkBxCtl '])[2]"));
        LinksSubmitButton = new Button(By.xpath("//button[text()='Submit']"));
        //AllofClientsDebtshavebeencapturedCheckBox = new Checkbox(By.xpath("//input[@name='$PpyWorkPage$pGenericFlag$gDebtInputComplete']/../label"));
        //AllofClientsDebtshavebeencapturedCheckBox = new Checkbox(By.xpath("//label[@class=' cb_standard']"));
        AllofClientsDebtshavebeencapturedCheckBox = new Checkbox(By.xpath("//*[@name='$PpyWorkPage$pGenericFlag$gDebtInputComplete']/../label"));
        //	AllofClientsDebtshavebeencapturedCheckBox = new Checkbox(By.xpath("//*[@name='$PpyWorkPage$pGenericFlag$gDebtInputComplete']/../label"));
        YourDebtsContinueButton = new Button(By.xpath("(//button[@class='SC_Button_Primary pzhc pzbutton'])[1]"));

        //creditor 4
        CreditorType4Name = new AutoComplete(By.xpath("(//input[@placeholder='Creditor'])[4]"));
        DebtTypFromDropdown4 = new AutoComplete(By.xpath("(//input[@placeholder='Debt type'])[4]"));
        AmountOwedTextbox4 = new TextField(By.xpath("(//input[@placeholder='£'])[4]"));
        LiabilityDropdown4 = new Dropdown(By.xpath("(//option[@value='OWN0001']//parent::select)[4]"));
        DetailedViewLink4 = new Link(By.xpath("(//a[text()='Detailed view'])[6]"));

        IstheDebtWiththeCollectionProcessNoButtonCred4MPA = new Button(By.xpath("(//label[text()='No'])[9]"));
        //DoTheyBeliveGur -created and changed xpath for all other
        DoTheyDisputeBalanceNoButton = new Button(By.xpath("(//input[@name='$PpyWorkPage$pDoesClientDisputeDebt']/../label)[2]"));
        DoTheyBelieveStatueBarredorPrescribedQuestionNoButton = new Button(By.xpath("(//input[@name='$PpyWorkPage$pAreAnyDebtsNotEnforceable']/../label)[2]"));
        DoTheyHaveGuarantoNoButton = new Button(By.xpath("(//label[@class='rb_segmented rb_standard radioLabel'])[7]"));
        DoTheyHaveGuarantoNoButton_89940 = new Button(By.xpath("(//label[@class='rb_segmented rb_standard radioLabel'])[6]"));
        LiabilityDropdown = new Dropdown(By.xpath("//select[contains(@name,'$PD_LiabilityItemList_pa') and contains(@name,'ppxResults$l1')]"));
        LiabilityComplete2 = new Dropdown(By.xpath("//select[contains(@name,'$PD_LiabilityItemList_pa') and contains(@name,'ppxResults$l2')]"));
        OriginalRegularpaymentTimeSelectionDropdowndebt2 = new Dropdown(By.xpath("//div[text()='What was the original regular payment?']//following::select[1]"));
        creaditorDropDownValueButton = new Button(By.xpath("//div[@class='cellIn']"));
        DebtTypeDropDownValueButton = new Button(By.xpath("//span[@class='ac-primary-option']"));
        creaditorDropDownValueButton2 = new Button(By.xpath("//span[text()='HSBC']"));
        DebtTypeDropDownValueButton2 = new Button(By.xpath("(//span[text()='Personal loan'])[1]"));
        creaditorDropDownValueButton3 = new Button(By.xpath("//span[text()='HSBC']"));
        DebtTypeDropDownValueButton3 = new Button(By.xpath("//span[text()='Personal loan']"));
        HaveYouRepaidAnyArrearsNoButton03 = new Button(By.xpath("(//input[contains(@name,'$pPaymentMissedInLast12Months')]/../label)[2]"));
        AreYouBehindWithpayementNoButton03 = new Button(By.xpath("(//input[contains(@name,'$ppxResults$l3$pPaymentMissed')]/../label)[2]	"));
        OwnerDropdown = new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l1$pOwnership$pCode')]"));
        LinkedPopupAddButton = new Button(By.xpath("(//button[@class='SC_Button_Secondary pzhc pzbutton'])[2]"));
        DoTheyGuarantorWhoWillBecomeResponsibleNoButton = new Button(By.xpath("(//input[@name='$PpyWorkPage$pDoesClientHaveGuarantor']/../label)[2]"));


        NoFurtherAction = new Button(By.xpath("//label[text()='No action taken (arrears only)']"));
        // for debt3

        CreditorFromDropDownfordebt3 = new TextField(By.xpath("(//input[@placeholder='Creditor'])[3]"));
        DebtTypFromDropdownfordebt3 = new TextField(By.xpath("(//input[@placeholder='Debt type'])[3]"));
        AmountOwedTextboxfordebt3 = new TextField(By.xpath("(//input[@placeholder='£'])[3]"));
        LiabilityDropdownfordebt3 = new Dropdown(By.xpath("(//option[@value='OWN0001']//parent::select)[3]"));
        DetailedViewLinkfordebt3 = new Link(By.xpath("(//a[text()='Detailed view'])[3]"));
        DetailedViewLinkfordebt4 = new Link(By.xpath("(//a[text()='Detailed view'])[4]"));
        DetailedViewLinkfordebt3 = new Link(By.xpath("(//a[text()='Detailed view'])[4]"));
        AreYouBehindWithpayementNoButtonfordebt3 = new Button(By.xpath("(//label[text()='No'])[7]"));
        IsSVRNoButtonfordebt3 = new Button(By.xpath("(//label[text()='No'])[8]"));
        OriginalRegularpaymentTextBoxfordebt3 = new TextField(By.xpath("(//div[text()='What was the original regular payment?'])[2]//following::input[1]"));
        OriginalRegularpaymentTimeSelectionDropdownfordebt3 = new Dropdown(By.xpath("(//div[text()='every']//following::select)[3]"));
        MainHomeDropdown = new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l1$pCode')]"));
        MainHomeAmount = new TextField(By.xpath("//input[contains(@name,'$ppxResults$l1$pAmount')]"));
        MainHomeSave = new Button(By.xpath("//button[.='Save']"));
        tabClick = new Button(By.xpath("//div[@class='cellIn']"));
        tabdebtsPrimary = new Button(By.xpath("//span[@class='ac-primary-option']"));
        reparingTowardsThisDropdown = new Dropdown(By.xpath("//div[text()='How much are they repaying towards this?']//following::select[1]"));

    }

    public void BackToDashBordLink() {
        this.getBackToDashBordLink().click();
    }

    public void AddDebtDetails89934() {
        GenericMethod_cvp.implicitWait(4000);
        switchToActiveFrame();
        GenericMethod_cvp.implicitWait(200);
        this.getAddaDebtButton().click();
        this.getAreTheyLiableQuestionNoButtonInGlobalQuestionsAlert().click();
        this.getSubmitButtonInGlobalQuestionsAlert().click();
        //this.getCreditorFromDropdown();

    }

    public void navigateToDashBoardpage() {
        GenericMethod_cvp.implicitWait(3000);
        switchToActiveFrame();
        GenericMethod_cvp.implicitWait(3000);
        BackToDashBordLink.click();
        GenericMethod_cvp.implicitWait(5000);
    }
    // SC02 creditor 1
    ///For Creditor Created By Amit

    public void EnterCreditor1Details89934() {
        GenericMethod_cvp.implicitWait(2000);
        this.getCreditorFromutoComplete().enterTextThenSelectFromAutoComplete("Blackhorse");
        creaditorDropDownValueButton.click();
        this.getDebtTypFromAutoComplete().enterTextThenSelectFromAutoComplete("Credit card");
        DebtTypeDropDownValueButton.click();
        this.getAmountOwedTextField().clear();
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getLiabilityutoComplete().getSelector()));
        this.getAmountOwedTextField().enterTextField("15000");
        GenericMethod_cvp.selectByIndex(LiabilityutoComplete, 1);
        this.getArrearsOrFurtherActionNoButton().click();
        GenericMethod_cvp.implicitWait(2000);
        this.getAllofClientsDebtshavebeencapturedCheckBox().click();
        GenericMethod_cvp.implicitWait(4000);
        this.getIstheDebtSubjectToAGuarantorNoButton().click();
        GenericMethod_cvp.implicitWait(1000);
        this.getDoTheyDisputeBalanceNoButton().click();
        GenericMethod_cvp.implicitWait(1000);
        this.getDoTheyBelieveStatueBarredorPrescribedQuestionNoButton().click();
        GenericMethod_cvp.implicitWait(3000);
        this.getSubmitButtonInGlobalQuestionsAlert().click();
        GenericMethod_cvp.implicitWait(5000);
        this.getYourDebtsContinueButton().click();
        GenericMethod_cvp.implicitWait(5000);
    }

    public void EnterCreditor1Details89937() {
        GenericMethod_cvp.implicitWait(2000);
        this.getCreditorFromutoComplete().enterTextThenSelectFromAutoComplete("Natwest");
        creaditorDropDownValueButton.click();
        this.getDebtTypFromAutoComplete().enterTextThenSelectFromAutoComplete("Credit card");
        DebtTypeDropDownValueButton.click();
        this.getAmountOwedTextField().clear();
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getLiabilityutoComplete().getSelector()));
        this.getAmountOwedTextField().enterTextField("2800");
        GenericMethod_cvp.selectByIndex(LiabilityutoComplete, 1);
        this.getArrearsOrFurtherActionNoButton().click();
        GenericMethod_cvp.implicitWait(4000);
        this.getDetailedViewLink().click();
        GenericMethod_cvp.implicitWait(3000);
        this.getAreYouBehindWithpayementYesButton().click();
        GenericMethod_cvp.implicitWait(3000);
        this.getFurtherAction1().click();
        GenericMethod_cvp.implicitWait(3000);
        this.getDetailedViewLink2().waitForElementToBeClickable();
        GenericMethod_cvp.implicitWait(4000);
        this.getDetailedViewLink2().click();
        //Debt-2
        GenericMethod_cvp.implicitWait(5000);
        this.getAddaDebtButton().click();
        //ClickAddaDebtButton();
        GenericMethod_cvp.implicitWait(5000);
        this.getCreditorFromDropDown2().enterText("British Gas");
        creaditorDropDownValueButton.click();
        this.getDebtTypFromDropdown2().enterText("Gas arrears");
        DebtTypeDropDownValueButton.click();
        this.getAmountOwedTextbox2().clear();
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getLiabilityComplete2().getSelector()));
        this.getAmountOwedTextbox2().enterTextField("3000");
        GenericMethod_cvp.selectByIndex(LiabilityComplete2, 2);
        this.getDetailedViewLink2().waitForElementToBeClickable();
        GenericMethod_cvp.implicitWait(4000);
        this.getDetailedViewLink2().click();
        GenericMethod_cvp.implicitWait(3000);
        this.getOngoingSuplyNoButton().click();
        GenericMethod_cvp.implicitWait(3000);
        this.getWhatActionTakenByCreditorNoAction().click();
        GenericMethod_cvp.implicitWait(3000);//till here debt 2 details
        this.getAllofClientsDebtshavebeencapturedCheckBox().click();
        GenericMethod_cvp.implicitWait(4000);
        this.getIstheDebtSubjectToAGuarantorNoButton().click();
        GenericMethod_cvp.implicitWait(2000);
        this.getDoTheyDisputeBalanceNoButton().click();
        GenericMethod_cvp.implicitWait(2000);
        this.getDoTheyBelieveStatueBarredorPrescribedQuestionNoButton().click();
        GenericMethod_cvp.implicitWait(3000);
        this.getSubmitButtonInGlobalQuestionsAlert().click();
        GenericMethod_cvp.implicitWait(5000);
        this.getYourDebtsContinueButton().click();
        GenericMethod_cvp.implicitWait(5000);
    }

    public void ClickAddaDebtButton() {
        //	getBrowser().sleep(5000);
        GenericMethod_cvp.implicitWait(4000);
        switchToActiveFrame();
        this.getAddaDebtButton().click();
        //ClickAddaDebtButton();
        GenericMethod_cvp.implicitWait(2000);
        this.getAreTheyLiableQuestionNoButtonInGlobalQuestionsAlert().click();
        this.getSubmitButtonInGlobalQuestionsAlert().click();

    }

    public void SelectNoFromAretheyLiableInGlobalQuestion() {

        this.getAreTheyLiableQuestionNoButtonInGlobalQuestionsAlert().click();
    }

    public void ClickSubmitButtonInGlobalQuestion() {

        this.getSubmitButtonInGlobalQuestionsAlert().click();
    }


    ///For Creditor

    public void EnterCreditorNameinTextFiled(String CreditorNameDropDownValue) {
        this.getCreditorFromutoComplete().enterTextThenSelectFromAutoComplete(CreditorNameDropDownValue);

    }

    public void EnterDebtTypeNameinTextFiled(String DebtTypeNameDropDownValue) {
        this.getDebtTypFromAutoComplete().enterTextThenSelectFromAutoComplete(DebtTypeNameDropDownValue);
    }

    public void EnterAmountOwedinTextField(String AmountOwedValue) {
        this.getAmountOwedTextField().clear();
        GenericMethod_cvp.implicitWait(1000);
        this.getAmountOwedTextField().enterText(AmountOwedValue);
        GenericMethod_cvp.implicitWait(3000);
    }

    public void SelectLiabilityFromDropDown(String LiabilityDropDownValue) {
        GenericMethod_cvp.selectByText(getLiabilityutoComplete(), LiabilityDropDownValue);
    }//selectByText(LiabilityDropdown, "TestDemoF")

    public void ClickArrearsOrFurtherActionNoButton() {
        this.getArrearsOrFurtherActionNoButton().click();
    }

    public void ClickDetailedViewLink() {
        this.getDetailedViewLink().click();
    }

    public void EnterOriginalRegularPaymentInTextBox(String OriginalRegularPayment) {
        this.getOriginalRegularpaymentTextBox().enterTextField(OriginalRegularPayment);
    }

    public void SelectOriginalRegularpaymentTimeSelectionDropdown(String originalRegularpaymentTimeSelectionDropdown) {
        GenericMethod_cvp.selectByText(OriginalRegularpaymentTimeSelectionDropdown, originalRegularpaymentTimeSelectionDropdown);
        GenericMethod_cvp.implicitWait(3000);
        GenericMethod_cvp.selectByText(OriginalRegularpaymentTimeSelectionDropdown, originalRegularpaymentTimeSelectionDropdown);
        GenericMethod_cvp.implicitWait(3000);
    }

    public void ClickAreYouBehindWithpayementNoButton() {
        this.getAreYouBehindWithpayementNoButton().click();
    }

    public void ClickOnFurtherActionDefaultNotice() {
        this.getFurtherAction1().click();
    }

    public void ClickAreYouBehindWithpayementYesButton() {
        this.getAreYouBehindWithpayementYesButton().click();
    }

    public void ClickIstheDebtSubjectToAGuarantorNoButton() {
        this.getIstheDebtSubjectToAGuarantorNoButton().click();
    }


    ///creditor2


    public void EnterCreditor2NameinTextFiled(String Creditor2Name) {
        this.getCreditorFromDropDown2().enterText(Creditor2Name);
        getBrowser().waitForElementToBeClickable(By.xpath("//span[text()='Nationwide']"));
        creaditorDropDownValueButton2.click();
    }

    public void EnterDebtType2NameinTextFiled(String DebtType2Name) {
        this.getDebtTypFromDropdown2().enterText(DebtType2Name);
        DebtTypeDropDownValueButton2.click();
    }

    //Creditor3
    public void EnterCreditor3NameinTextFiled(String Creditor3Name) {
        this.getCreditorType3Name().enterText(Creditor3Name);
        getBrowser().waitForElementToBeClickable(By.xpath("//span[text()='Leeds City Council']"));
        creaditorDropDownValueButton3.click();
    }

    //Creditor3
    public void EnterDebtType3NameinTextFiled(String DebtType3Name) {
        this.getDebtTypFromDropdown3().enterText(DebtType3Name);
        DebtTypeDropDownValueButton3.click();
    }

    //Creditor3
    public void EnterAmountOwed3inTextField(String AmountOwed3Value) {
        this.getAmountOwedTextbox3().clear();
        GenericMethod_cvp.implicitWait(3000);
        this.getAmountOwedTextbox3().enterTextField(AmountOwed3Value);
        GenericMethod_cvp.implicitWait(2000);
        this.getAmountOwedTextbox3().clear();
        GenericMethod_cvp.implicitWait(1000);
        this.getAmountOwedTextbox3().enterCharByChar(AmountOwed3Value);
        GenericMethod_cvp.implicitWait(3000);
    }

    //Creditor3
    public void SelectLiability3FromDropDown(String LiabilityDropDownValue) {
        GenericMethod_cvp.implicitWait(3000);
        GenericMethod_cvp.selectByText(LiabilityDropdown3, LiabilityDropDownValue);
        GenericMethod_cvp.selectByIndex(LiabilityDropdown3, 3);
    }

    public void fillYourDebtWithThreeCreditors() {
        //creditor1
        ClickAddaDebtButton();
        ClickSubmitButtonInGlobalQuestion();
        GenericMethod_cvp.implicitWait(10000);
        getCreditorFromDropdown().enterTextThenSelectFromAutoComplete("Argos");
        this.getCreditorFromDropdown().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromDropdown().enterTextThenSelectFromAutoComplete("Store");
        this.getCreditorFromDropdown().enter();
        this.getCreditorFromDropdown().tab();
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getLiabilityDropdown().getSelector()));
        GenericMethod_cvp.implicitWait(10000);
        this.getAmountOwedTextbox().enterTextField("100");
        this.getAmountOwedTextbox().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getLiabilityDropdown().selectFromDropdownByIndex(1);
        GenericMethod_cvp.implicitWait(10000);
        this.getArrearsOrFurtherActionNoButton().click();
        GenericMethod_cvp.implicitWait(10000);

        //creditor2
        GenericMethod_cvp.implicitWait(10000);
        ClickAddaDebtButton();
        this.getCreditorFromDropDown2().enterTextThenSelectFromAutoComplete("next");
        this.getCreditorFromDropDown2().tab();
        this.getDebtTypFromDropdown2().enterTextThenSelectFromAutoComplete("catalogue");
        this.getDebtTypFromDropdown2().enter();
        this.getDebtTypFromDropdown2().tab();
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getLiabilityDropdown2().getSelector()));
        this.getAmountOwedTextbox2().enterTextField("1500");
        this.getAmountOwedTextbox2().tab();
        this.getLiabilityDropdown2().selectFromDropdownByIndex(2);
        this.getArrearsOrFurtherActionYesButton1().click();
        this.getDetailedViewLink2().click();
        this.getFurtherAction1().click();

        //creditor3
        ClickAddaDebtButton();
        this.getCreditorType3Name().enterTextThenSelectFromAutoComplete("HSBC");
        this.getCreditorType3Name().tab();
        this.getDebtTypFromDropdown3().enterTextThenSelectFromAutoComplete("mortgage");
        this.getDebtTypFromDropdown3().enter();
        this.getDebtTypFromDropdown3().tab();
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getLiabilityDropdown3().getSelector()));
        this.getAmountOwedTextbox3().enterTextField("90000");
        this.getAmountOwedTextbox3().tab();
        this.getLiabilityDropdown3().selectFromDropdownByIndex(3);
        this.getDetailedViewLinkfordebt4().click();
        this.getArrearsOrFurtherActionNoButton3().click();
        this.getAreYouBehindWithpaymentNoButton03().click();
        this.getHaveYouRepaidAnyArrearsNoButton03().click();
        this.getMortagageTypeDropdown03().selectFromDropdownByIndex(2);
        GenericMethod_cvp.selectByText(this.getLiabilityDropdown3(), "Client1 & Client2");
        this.getArrearsOrFurtherActionNoButton().click();
        this.getDetailedViewLink().click();
        this.getMortagageTypeDropdown03().selectFromDropdownByText("Repayment");
        this.getSVRNo03().click();
        this.getHaveYouRepaidAnyArrearsNoButton03().click();
        this.getAreYouBehindWithpaymentNoButton03().click();
        this.getAddLinkedItem().click();
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getFrequencyDropDown().getSelector()));
        this.getMortgagePaymentAmountTextBox().enterTextField("310");
        this.getFrequencyDropDown().selectFromDropdownByIndex(4);
        this.getOwnerDropdown().selectFromDropdownByIndex(3);
        this.getLinkedPopupAddButton().click();
        this.getMainHomeCheckbox().click();
        this.getMainHomeDropdown().selectFromDropdownByIndex(1);
        this.getMainHomeAmount().enterText("310");
        this.getOwnerDropdown().selectFromDropdownByIndex(3);
        this.getMainHomeSave().click();
        this.getMainHomeCheckbox().click();
        this.getLinksSubmitButton().click();
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getAllofClientsDebtshavebeencapturedCheckBox().getSelector()));
        this.getAllofClientsDebtshavebeencapturedCheckBox().click();
        this.getDoTheyGuarantorWhoWillBecomeResponsibleNoButton().click();
        this.getDoTheyDisputeBalanceNoButton().click();
        this.getDoTheyBelieveStatueBarredorPrescribedQuestionNoButton().click();
        this.getYourDebtsContinueButton().click();
        this.getYourDebtsContinueButton().click();
    }


    public void EnterAmountOwed2inTextField(String AmountOwed2Value) {
        this.getAmountOwedTextbox2().clear();
        GenericMethod_cvp.implicitWait(3000);
        this.getAmountOwedTextbox2().enterTextField(AmountOwed2Value);
        GenericMethod_cvp.implicitWait(2000);
        this.getAmountOwedTextbox2().clear();
        GenericMethod_cvp.implicitWait(1000);
        this.getAmountOwedTextbox2().enterCharByChar(AmountOwed2Value);
        GenericMethod_cvp.implicitWait(3000);
    }


    public void SelectLiability2FromDropDown(String LiabilityDropDownValue) {
        GenericMethod_cvp.implicitWait(3000);
        GenericMethod_cvp.selectByText(LiabilityDropdown2, LiabilityDropDownValue);
        GenericMethod_cvp.selectByIndex(LiabilityDropdown2, 1);
    }


    public void ClickArrearsOrFurtherActionNoButton2() {
        this.getArrearsOrFurtherActionNoButton2().click();
    }


    public void ClickDetailedViewLink2() {
        getBrowser().waitForElementToBeClickable(By.xpath("(//a[text()='Detailed view'])[3]"));
        this.getDetailedViewLink2().click();
    }

    public void ClickAreYouBehindWithpayementNoButton2() {
        this.getAreYouBehindWithpayementNoButton2().click();
    }


    public void ClickRepaidArrearsNoButton() {
        this.getRepaidArrearsNoButton().click();
    }

    public void SelectMortgageTypeFromDropDown(String MortgageTypeDropDownValue) {
        GenericMethod_cvp.selectByText(MortgagetypeDropDown, MortgageTypeDropDownValue);
        GenericMethod_cvp.implicitWait(3000);
        GenericMethod_cvp.selectByText(MortgagetypeDropDown, MortgageTypeDropDownValue);
        GenericMethod_cvp.implicitWait(3000);

    }

    public void ClickIsSVRNoButton() {
        this.getIsSVRNoButton().click();
    }

    public void ClickAddLinkeditemButton() {
        this.getAddLinkedItem().click();
    }


    public void EnterMortgagePaymentAmountInTextBox(String MortgagePaymentAmount) {
        this.getMortgagePaymentAmountTextBox().enterTextField(MortgagePaymentAmount);
    }

    public void SelectFrequencyFromDropDown(String FrequencyDropDownValue, String MortgagePaymentAmount) {
        GenericMethod_cvp.selectByText(FrequencyDropDown, FrequencyDropDownValue);
        this.getMortgagePaymentAmountTextBox().enterTextField(MortgagePaymentAmount);
        GenericMethod_cvp.implicitWait(3000);
        GenericMethod_cvp.selectByText(FrequencyDropDown, FrequencyDropDownValue);
        GenericMethod_cvp.implicitWait(3000);
    }

    public void ClickMainHomeCheckBox() {
        this.getMainHomeCheckbox().click();
    }

    public void ClickLinksAlertSubmitButton() {
        this.getLinksSubmitButton().click();
    }

    public void ClickAllOfClientsDebtshavebeenCapturedCheckBox() {
        this.getAllofClientsDebtshavebeencapturedCheckBox().click();
    }


    public void ClickyourDebtsPageContinueButton() {
        GenericMethod_cvp.implicitWait(3000);
        this.getAmountOwedTextField().clear();
        GenericMethod_cvp.implicitWait(1000);
        this.getAmountOwedTextField().enterCharByChar("6000");
        GenericMethod_cvp.implicitWait(3000);
        scrollElementIntoView();
        this.getYourDebtsContinueButton().click();
    }

    public void ClickDoTheyDisputebalanceNoButtonInGlobalQuestionAlert() {
        this.getDoTheyDisputeBalanceNoButton().click();
    }


    public void ClickDoTheyBelieveStatueBarredorPrescribedQuestionNoButtonInGlobalQuestionAlert() {
        this.getDoTheyBelieveStatueBarredorPrescribedQuestionNoButton().click();
    }

    public Dropdown getReparingTowardsThisDropdown() {
        return reparingTowardsThisDropdown;
    }

    private Dropdown reparingTowardsThisDropdown;


    public void yourDebtsWithMultipleCreditor_89939(String CreditorNameDropDownValue1,
                                                    String AmountOwedValue1,
                                                    String Creditor2Name,
                                                    String DebtType2Name,
                                                    String AmountOwed2Value,
                                                    String Creditor3Name,
                                                    String DebtType3Name,
                                                    String AmountOwed3Value
    ) {
        ClickAddaDebtButton();
//        getBrowser().scrollUp();
//        getBrowser().sleep(3000);
        GenericMethod_cvp.implicitWait(5000);
        this.getCreditorFromutoComplete().enterTextThenSelectFromAutoComplete(CreditorNameDropDownValue1);
        GenericMethod_cvp.verifyOverLayDisplayed();
        this.getCreditorFromutoComplete().downArrow();
        this.getCreditorFromutoComplete().enter();
        this.getCreditorFromutoComplete().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromAutoComplete().enterText("personal loan");
        GenericMethod_cvp.implicitWait(5000);
        GenericMethod_cvp.verifyOverLayDisplayed();
        GenericMethod_cvp.implicitWait(5000);
        DebtTypeDropDownValueButton.click();
        GenericMethod_cvp.implicitWait(5000);
//		this.getDebtTypFromAutoComplete().enterTextThenSelectFromAutoComplete(DebtTypeNameDropDownValue1);
        this.getDebtTypFromAutoComplete().downArrow();
        this.getDebtTypFromAutoComplete().enter();
        this.getDebtTypFromAutoComplete().tab();
        GenericMethod_cvp.implicitWait(10000);
        EnterAmountOwedinTextField(AmountOwedValue1);
        getAmountOwedTextbox().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getLiabilityutoComplete().selectFromDropdownByIndex(3);
        GenericMethod_cvp.implicitWait(10000);
        this.getArrearsOrFurtherActionYesButton().click();
        GenericMethod_cvp.implicitWait(10000);
        getArrearsOrFurtherActionYesButton().click();
        getAmountOwedTextbox().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getLiabilityutoComplete().selectFromDropdownByIndex(3);
        GenericMethod_cvp.implicitWait(10000);
        this.getArrearsOrFurtherActionYesButton().click();
        GenericMethod_cvp.implicitWait(10000);
        ClickDetailedViewLink();
        GenericMethod_cvp.implicitWait(10000);
        this.getOriginalRegularpaymentTextBox().enterTextField("65");
        this.getOriginalRegularpaymentTextBox().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getOriginalRegularpaymentTimeSelectionDropdown().selectFromDropdownByIndex(4);
        GenericMethod_cvp.implicitWait(10000);
        getDriver().findElement(By.xpath("//label[text()='Court action']")).click();
        GenericMethod_cvp.implicitWait(10000);
        getDriver().findElement(By.xpath("//label[text()='County Court Judgment (CCJ)']")).click();
        GenericMethod_cvp.implicitWait(10000);
        getBrowser().sleep(3000);
        getDriver().findElement(By.xpath("(//label[text()='Is there an arrangement in place to repay this?']//following::label[1])")).click();
        GenericMethod_cvp.implicitWait(10000);
        getDriver().findElement(By.xpath("(//div[text()='How much are they repaying towards this?']//following::input[1])")).sendKeys("5");
        GenericMethod_cvp.tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getReparingTowardsThisDropdown().selectFromDropdownByIndex(4);
        GenericMethod_cvp.implicitWait(10000);
        this.getDetailviewLink89939().click();
        //getDriver().findElement(By.xpath("(//i[@data-test-id='20171214161448093183475'])[1]")).click();
        //getBrowser().sleep(4000);

        //Crediator2
        //GenericMethod_cvp.implicitWait(3000);
        //switchToActiveFrame();
       // GenericMethod_cvp.implicitWait(3000);
        this.getAddaDebtButton().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getCreditorFromDropDown2().enterTextThenSelectFromAutoComplete(Creditor2Name);
        GenericMethod_cvp.verifyOverLayDisplayed();
        this.getCreditorFromDropDown2().downArrow();
        this.getCreditorFromDropDown2().enter();
        this.getCreditorFromDropDown2().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromDropdown2().enterTextThenSelectFromAutoComplete(DebtType2Name);
        GenericMethod_cvp.verifyOverLayDisplayed();
        this.getDebtTypFromDropdown2().downArrow();
        this.getDebtTypFromDropdown2().enter();
        this.getDebtTypFromDropdown2().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getAmountOwedTextbox2().enterText(AmountOwed2Value);
//        DebtTypeDropDownValueButton.click();
//        this.getAmountOwedTextbox2().clear();
//        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getLiabilityComplete2().getSelector()));
//        this.getAmountOwedTextbox2().enterTextField("3000");
     //**  89937 getters used above
        GenericMethod_cvp.implicitWait(5000);
        this.getLiabilityComplete2().selectFromDropdownByIndex(1);
        GenericMethod_cvp.implicitWait(5000);
        getBrowser().sleep(5000);
        getDriver().findElement(By.xpath("//input[contains(@name,'$ppxResults$l2$pBooleanVal')]/../label[.='No']")).click();
        GenericMethod_cvp.implicitWait(10000);
        //Creditor3

        GenericMethod_cvp.implicitWait(3000);
        switchToActiveFrame();
        this.getAddaDebtButton().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getCreditorType3Name().enterTextThenSelectFromAutoComplete(Creditor3Name);
        GenericMethod_cvp.verifyOverLayDisplayed();
        this.getCreditorType3Name().downArrow();
        this.getCreditorType3Name().enter();
        this.getCreditorType3Name().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromDropdown3().enterTextThenSelectFromAutoComplete(DebtType3Name);
        GenericMethod_cvp.verifyOverLayDisplayed();
        this.getDebtTypFromDropdown3().downArrow();
        this.getDebtTypFromDropdown3().enter();
        this.getDebtTypFromDropdown3().tab();
        GenericMethod_cvp.implicitWait(10000);
        getAmountOwedTextbox3().enterText(AmountOwed3Value);
        GenericMethod_cvp.implicitWait(10000);
        this.getLiabilityDropdown3().selectFromDropdownByIndex(2);
        GenericMethod_cvp.implicitWait(10000);
        getBrowser().sleep(500);
//		this.getArrearsOrFurtherActionNoButton3().click();
        GenericMethod_cvp.clickOnElementJse(By.xpath("//input[contains(@name,'$ppxResults$l3$pBooleanVal')]/../label[.='No']"));
//		getDriver().findElement(By.xpath("//input[contains(@name,'$ppxResults$l3$pBooleanVal')]/../label[.='No']")).click();
        GenericMethod_cvp.implicitWait(10000);
    }

    public void completeYourDebtPage() {
        this.getYourDebtsContinueButton().click();
    }


    public void EnterDebtsforJointCase89940() {
        switchToActiveFrame();
        GenericMethod_cvp.implicitWait(10000);
        this.getAddaDebtButton().click();
        this.getAreTheyLiableQuestionNoButtonInGlobalQuestionsAlert().click();
        this.getSubmitButtonInGlobalQuestionsAlert().click();
        getBrowser().scrollUp();
        //creditor1
//	this.getCreditorFromutoComplete().clickScreenElement(this.getCreditorFromutoComplete().getElement());
        GenericMethod_cvp.implicitWait(10000);
        this.getCreditorFromutoComplete().enterTextThenSelectFromAutoComplete("Blackhorse");
        getBrowser().sleep(getBrowser().getTimeout() / 5);
        this.getCreditorFromutoComplete().tab();
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        //GenericMethod_cvp.implicitWait(5000);
        this.getDebtTypFromAutoComplete().enterTextThenSelectFromAutoComplete("Other debt");
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        this.getDebtTypFromAutoComplete().enter();
        this.getDebtTypFromAutoComplete().tab();
        //(new WebDriverWait(getDriver(),30)).until(ExpectedConditions.elementToBeClickable(getLiabilityutoComplete().getSelector()));
//	this.getAmountOwedTextField().clickScreenElement(this.getAmountOwedTextField().getElement());
        GenericMethod_cvp.implicitWait(10000);
        this.getAmountOwedTextField().enterText("10000");
        this.getAmountOwedTextField().enter();
        this.getAmountOwedTextField().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getLiabilityutoComplete().selectFromDropdownByIndex(3);
	/*this.getLiabilityutoComplete().selectFromDropdown("OWN0001");
	this.getArrearsOrFurtherActionNoButton().click();*/
        getBrowser().sleep(100);
        this.getDetailedViewLink().click();
        this.getNoFurtherAction().click();
        GenericMethod_cvp.implicitWait(2000);

        //debt2
        this.getAddaDebtButton().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getCreditorFromDropDown2().enterTextThenSelectFromAutoComplete("HSBC");
        GenericMethod_cvp.implicitWait(5000);
        this.getCreditorFromutoComplete().tab();
        //GenericMethod_cvp.implicitWait(5000);
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getDebtTypFromAutoComplete().getSelector()));
        this.getDebtTypFromDropdown2().enterTextThenSelectFromAutoComplete("Personal loan");
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromAutoComplete().enter();
        this.getDebtTypFromAutoComplete().tab();
        //(new WebDriverWait(getDriver(),30)).until(ExpectedConditions.elementToBeClickable(getLiabilityutoComplete().getSelector()));
        GenericMethod_cvp.implicitWait(10000);
//	this.getAmountOwedTextField().clickScreenElement(this.getAmountOwedTextField().getElement());
        this.getAmountOwedTextbox2().enterText("10500");
        this.getAmountOwedTextbox2().enter();
        this.getAmountOwedTextbox2().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getLiabilityDropdown2().selectFromDropdownByIndex(1);
	/*this.getLiabilityutoComplete().selectFromDropdown("OWN0001");
	this.getArrearsOrFurtherActionNoButton().click();*/
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        this.getDetailedViewLink3_89940().click();
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getOriginalRegularpaymentTextBoxdebt2().getSelector()));
        this.getOriginalRegularpaymentTextBoxdebt2().enterTextField("200");
        this.getOriginalRegularpaymentTextBoxdebt2().enter();
        this.getOriginalRegularpaymentTextBoxdebt2().tab();
        //(new WebDriverWait(getDriver(),30)).until(ExpectedConditions.elementToBeClickable(getOriginalRegularpaymentTextBoxdebt2().getSelector()));
        GenericMethod_cvp.implicitWait(20000);
        this.getOriginalRegularpaymentTimeSelectionDropdowndebt2().selectFromDropdownByIndex(4);
        GenericMethod_cvp.implicitWait(20000);
        this.getAreYouBehindWithpayementNoButton2().click();



	/*yourDebtPageObj.ClickAddaDebtButton();
	yourDebtPageObj.EnterCreditor2NameinTextFiledfordebt2("HSBC");
	yourDebtPageObj.EnterDebtType2NameinTextFiledfordebt2("Personal loan");
	yourDebtPageObj.EnterAmountOwedDebt2inTextFieldfordebt2("10500");
	yourDebtPageObj.SelectLiability2FromDropDownfordebt2(1);
	yourDebtPageObj.ClickDetailedViewLink2fordebt2();
	yourDebtPageObj.EnterOriginalRegularPaymentInTextBoxfordebt2("200");
	yourDebtPageObj.SelectOriginalRegularpaymentTimeSelectionDropdownforDebt2("month");
	yourDebtPageObj.ClickAreYouBehindWithpayementNoButton2fordebt2();*/


        this.getAddaDebtButton().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getCreditorFromDropDown3().enterTextThenSelectFromAutoComplete("HSBC");
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromAutoComplete().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromDropdown3().enterTextThenSelectFromAutoComplete("Personal loan");
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromDropdown3().downArrow();
        this.getDebtTypFromDropdown3().enter();
        this.getDebtTypFromDropdown3().tab();
        GenericMethod_cvp.implicitWait(10000);
//	this.getAmountOwedTextbox2().clickScreenElement(this.getAmountOwedTextField().getElement());
        this.getAmountOwedTextbox3().enterText("11000");
        this.getAmountOwedTextbox3().enter();
        this.getAmountOwedTextbox3().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getLiabilityDropdown3().selectFromDropdownByIndex(1);
        //this.getLiabilityComplete2().selectFromDropdown("OWN0001");
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        //getBrowser().sleep(10000);
        this.getDetailedViewLink5_89940().click();
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        this.getOriginalRegularpaymentTextBoxfordebt3().enterTextField("200");
        this.getOriginalRegularpaymentTextBoxfordebt3().enter();
        this.getOriginalRegularpaymentTextBoxfordebt3().tab();
        getBrowser().sleep(getBrowser().getTimeout() / 10);
	/*GenericMethod_cvp.implicitWait(10000);
	try {*/
        this.getOriginalRegularpaymentTimeSelectionDropdownfordebt3().selectFromDropdownByIndex(4);
	/*}catch (Exception e)
	{
		this.getOriginalRegularpaymentTimeSelectionDropdownfordebt3().selectFromDropdownByIndex(4);
	}*/
        this.getArrearsOrFurtherActionNoButton3().click();
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getDetailedViewLink3().getSelector()));
        GenericMethod_cvp.implicitWait(6000);
        this.getAllofClientsDebtshavebeencapturedCheckBox().click();
        GenericMethod_cvp.implicitWait(10000);
        getDoTheyHaveGuarantoNoButton_89940().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getDoTheyDisputeBalanceNoButton().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getDoTheyBelieveStatueBarredorPrescribedQuestionNoButton().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getSubmitButtonInGlobalQuestionsAlert().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getYourDebtsContinueButton().click();


    }

    public void EnterdataforCoupleofDebtsAsaGuestuser() {
        switchToActiveFrame();
        this.getAddaDebtButton().click();
        //ClickAddaDebtButton();
        GenericMethod_cvp.implicitWait(2000);
        this.getAddaDebtButton().click();
        this.getAreTheyLiableQuestionNoButtonInGlobalQuestionsAlert().click();
        this.getSubmitButtonInGlobalQuestionsAlert().click();
        getBrowser().scrollUp();
        //creditor1
//		this.getCreditorFromutoComplete().clickScreenElement(this.getCreditorFromutoComplete().getElement());
        GenericMethod_cvp.implicitWait(10000);
        this.getCreditorFromutoComplete().enterTextThenSelectFromAutoComplete("HSBC");
        this.getCreditorFromutoComplete().tab();
        //GenericMethod_cvp.implicitWait(10000);
        //GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromAutoComplete().enterTextThenSelectFromAutoComplete("Personal loan");
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromAutoComplete().enter();
        this.getDebtTypFromAutoComplete().tab();
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getLiabilityutoComplete().getSelector()));
//		this.getAmountOwedTextField().clickScreenElement(this.getAmountOwedTextField().getElement());
        this.getAmountOwedTextField().enterText("777");
        this.getAmountOwedTextField().enter();
        this.getAmountOwedTextField().tab();
        GenericMethod_cvp.implicitWait(6000);
        this.getLiabilityutoComplete().selectFromDropdownByIndex(1);
        this.getLiabilityutoComplete().selectFromDropdown("OWN0001");
        this.getArrearsOrFurtherActionNoButton().click();
        getBrowser().sleep(100);
        this.getDetailedViewLink().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getOriginalRegularpaymentTextBox().enterTextField("200");
        this.getOriginalRegularpaymentTextBox().enter();
        this.getOriginalRegularpaymentTextBox().tab();
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getOriginalRegularpaymentTimeSelectionDropdown().getSelector()));
        GenericMethod_cvp.implicitWait(20000);
        this.getOriginalRegularpaymentTimeSelectionDropdown().selectFromDropdownByIndex(4);
        GenericMethod_cvp.implicitWait(20000);
        this.getAreYouBehindWithpayementNoButton().click();
        this.getIstheDebtSubjectToAGuarantorNoButton().click();
        this.getAddaDebtButton().click();
        GenericMethod_cvp.implicitWait(30000);
        this.getCreditorFromDropDown2().enterTextThenSelectFromAutoComplete("TSB Bank");
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromAutoComplete().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromDropdown2().enterTextThenSelectFromAutoComplete("Personal loan");
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromAutoComplete().downArrow();
        this.getDebtTypFromAutoComplete().enter();
        this.getDebtTypFromAutoComplete().tab();
        GenericMethod_cvp.implicitWait(10000);
//		this.getAmountOwedTextbox2().clickScreenElement(this.getAmountOwedTextField().getElement());
        this.getAmountOwedTextbox2().enterText("777");
        this.getAmountOwedTextbox2().enter();
        this.getAmountOwedTextbox2().tab();
        GenericMethod_cvp.implicitWait(6000);
        this.getLiabilityComplete2().selectFromDropdownByIndex(1);
        this.getLiabilityComplete2().selectFromDropdown("OWN0001");
        GenericMethod_cvp.implicitWait(10000);
        getBrowser().sleep(100);
        this.getDetailedViewLink3().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getOriginalRegularpaymentTextBox1().enterTextField("200");
        this.getOriginalRegularpaymentTextBox1().enter();
        this.getOriginalRegularpaymentTextBox1().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getOriginalRegularpaymentTimeSelectionDropdown1().selectFromDropdownByIndex(4);
        this.getArrearsOrFurtherActionNoButton().click();
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getDetailedViewLink2().getSelector()));
        GenericMethod_cvp.implicitWait(6000);
        this.getAllofClientsDebtshavebeencapturedCheckBox().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getDoTheyDisputeBalanceNoButton().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getDoTheyBelieveStatueBarredorPrescribedQuestionNoButton().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getSubmitButtonInGlobalQuestionsAlert().click();
        getBrowser().sleep(100);
        this.getYourDebtsContinueButton().click();
    }

    private Button tabClick;
    private Button tabdebtsPrimary;

    public Button gettabClick() {
        return tabClick;
    }

    public void debtsWithCreditorsforJointMPA() {
        System.out.println("=======Enter in to Navigate to the Debts page and enter the data as JointMPA");
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        switchToActiveFrame();
        this.getAddaDebtButton().click();
        //Creditor1
        GenericMethod_cvp.implicitWait(20000);
        this.getCreditorFromDropDown2MPA().enterCharByChar("HSBC");
        System.out.println("=======HSBC Entered");
        this.gettabClick().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromDropdown2MPA().enterCharByChar("Personal loan");
        tabdebtsPrimary.click();
        GenericMethod_cvp.implicitWait(10000);
        this.getAmountOwedTextbox2MPA().enterText("4000");
        GenericMethod_cvp.implicitWait(10000);
        this.getAmountOwedTextbox2MPA().enterTextField("4000");
        this.getAmountOwedTextbox2MPA().enter();
        this.getAmountOwedTextbox2MPA().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getLiabilityDropdown2MPA().selectFromDropdown("OWN0003");//shared
        GenericMethod_cvp.implicitWait(10000);
        this.getDetailedViewLink2().click();
        GenericMethod_cvp.implicitWait(5000);
        this.getOriginalRegularpaymentTextBox1().enterTextField("200");
        GenericMethod_cvp.implicitWait(5000);
        this.getOriginalRegularpaymentTimeSelectionDropdown1().selectFromDropdown("TPD0002");//month
        GenericMethod_cvp.implicitWait(10000);
        this.getAreYouBehindWithPaymentNoButton2JointMPA().click();
        GenericMethod_cvp.implicitWait(5000);
        this.getIstheDebtSubjectToAGuarantorNoButtonCred2MPA().click();
        GenericMethod_cvp.implicitWait(5000);
        //this.getArrearsOrFurtherActionNoButton().click();
        System.out.println("=======Creditor 1 done");
        //creditor2
        System.out.println("=======Creditor 2 Started ");
        this.getAddaDebtButton().click();
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        this.getCreditorFromDropDownfordebt3().enterCharByChar("Natwest");
        this.gettabClick().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromDropdown3().enterTextField("Credit card");
        tabdebtsPrimary.click();
        GenericMethod_cvp.implicitWait(10000);
        this.getAmountOwedTextbox3().enterTextField("2000");
        GenericMethod_cvp.implicitWait(5000);
        this.getAmountOwedTextbox3().enterTextField("2000");
        this.getAmountOwedTextbox3().enter();
        this.getAmountOwedTextbox3().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getLiabilityDropdownfordebt3().selectFromDropdown("OWN0001");
        GenericMethod_cvp.implicitWait(10000);
        //	this.getArrearsOrFurtherActionNoButton().click();
        this.getDetailedViewLinkfordebt3().click();
        GenericMethod_cvp.implicitWait(5000);
        this.getAreYouBehindWithpaymentNoButton3JointMPA().click();
        GenericMethod_cvp.implicitWait(5000);


        //creditor3
        this.getAddaDebtButton().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getCreditorType4Name().enterTextField("Natwest");
        this.gettabClick().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromDropdown4().enterTextField("Overdraft");
        tabdebtsPrimary.click();
        GenericMethod_cvp.implicitWait(10000);
        this.getAmountOwedTextbox4().enterTextField("500");
        GenericMethod_cvp.implicitWait(10000);
        this.getAmountOwedTextbox4().enterTextField("500");
        this.getAmountOwedTextbox4().enter();
        this.getAmountOwedTextbox4().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getLiabilityDropdown4().selectFromDropdown("OWN0002");
        GenericMethod_cvp.implicitWait(10000);
        this.DetailedViewLink4.click();
        GenericMethod_cvp.implicitWait(10000);
        this.getIstheDebtWiththeCollectionProcessNoButtonCred4MPA().click();
        GenericMethod_cvp.implicitWait(5000);
        getBrowser().scrollDown();
        this.getAllofClientsDebtshavebeencapturedCheckBox().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getDoTheyDisputeBalanceNoButton().click();
        GenericMethod_cvp.implicitWait(5000);
        this.getDoTheyBelieveStatueBarredorPrescribedQuestionNoButton().click();
        GenericMethod_cvp.implicitWait(5000);
        this.getSubmitButtonInGlobalQuestionsAlert().click();
        GenericMethod_cvp.implicitWait(20000);
        GenericMethod_cvp.getContinueButton().click();
        GenericMethod_cvp.implicitWait(20000);
        System.out.println("Complete Debts Details===========================");

    }

    ///Debt1

    public void EnterCreditor1NameinTextFiledfordebt1(String debt1) {
        this.getCreditorFromDropdown().enterText(debt1);  //wait(Explicit) //tab  //wait
        creaditorDropDownValueButton.click();
    }

    public void EnterDebtType1NameinTextFiledfordebt1(String debttype1) {
        this.getDebtTypFromDropdown().enterText(debttype1);
        DebtTypeDropDownValueButton.click();
    }

    public void EnterAmountOwed1inTextFieldfordebt1(String Amount1) {
        this.getAmountOwedTextbox().clear();
        GenericMethod_cvp.implicitWait(1000);
        this.getAmountOwedTextbox().enterTextField(Amount1);
        GenericMethod_cvp.implicitWait(3000);
    }

    public void SelectLiability1FromDropDownfordebt1(int number) {
        GenericMethod_cvp.selectByIndex(LiabilityDropdown, number);
    }

    public void ClickDetailedViewLinkForDebt1() {
        this.getDetailedViewLink().click();
    }

    public void ClickNoFurtherActionForDebt1() {
        this.getNoFurtherAction().click();
    }


    // Debt2

    public void EnterCreditor2NameinTextFiledfordebt2(String debt2) {
        this.getCreditorFromDropDown2().enterText(debt2);
        //getBrowser().waitForElementToBeClickable(By.xpath("(//input[@placeholder='Creditor'])[2]"));
        creaditorDropDownValueButton2.click();
    }

    public void EnterDebtType2NameinTextFiledfordebt2(String debttype2) {
        this.getDebtTypFromDropdown2().enterText(debttype2);
        DebtTypeDropDownValueButton2.click();
    }

    public void EnterCreditor2NameinTextFiledfordebt2for89949(String debt2) {
        this.getCreditorFromDropDown2().enterText(debt2);
        creaditorDropDownValueButton.click();
    }

    public void EnterDebtType2NameinTextFiledfordebt2for89949(String debttype2) {
        this.getDebtTypFromDropdown2().enterText(debttype2);
        DebtTypeDropDownValueButton.click();
    }

    public void EnterAmountOwedDebt2inTextFieldfordebt2(String amount2) {
        this.getAmountOwedTextbox2().clear();
        GenericMethod_cvp.implicitWait(3000);
        this.getAmountOwedTextbox2().enterTextField(amount2);
        GenericMethod_cvp.implicitWait(2000);
        this.getAmountOwedTextbox2().clear();
        GenericMethod_cvp.implicitWait(1000);
        this.getAmountOwedTextbox2().enterCharByChar(amount2);
        GenericMethod_cvp.implicitWait(3000);
    }


    public void SelectLiability2FromDropDownfordebt2(int number) {
        GenericMethod_cvp.implicitWait(3000);
        GenericMethod_cvp.selectByIndex(LiabilityDropdown2, 1);
        //GenericMethod_cvp.selectByIndex(LiabilityDropdown2, 1);

    }

    public void ClickDetailedViewLink2fordebt2() {
        GenericMethod_cvp.implicitWait(3000);
        //getBrowser().waitForElementToBeClickable(By.xpath("(//a[text()='Detailed view'])[3]"));
        this.getDetailedViewLink2().click();
    }

    public void ClickAreYouBehindWithpayementNoButton2fordebt2() {
        this.getAreYouBehindWithpayementNoButton2().click();
    }

    public void ClickIsSVRNoButtonfordebt2() {
        this.getIsSVRNoButton().click();
    }

    public void EnterOriginalRegularPaymentInTextBoxfordebt2(String OrgRegularPaymentfordebt2) {
        GenericMethod_cvp.implicitWait(3000);
        this.getOriginalRegularpaymentTextBoxdebt2().enterTextField(OrgRegularPaymentfordebt2);
    }

    public void SelectOriginalRegularpaymentTimeSelectionDropdownforDebt2(String debt2month) {
        GenericMethod_cvp.selectByText(OriginalRegularpaymentTimeSelectionDropdowndebt2, debt2month);
        GenericMethod_cvp.implicitWait(3000);
        GenericMethod_cvp.selectByText(OriginalRegularpaymentTimeSelectionDropdowndebt2, debt2month);
        GenericMethod_cvp.implicitWait(3000);
    }


    /// for debt3

    public void EnterCreditorNameinTextFiledfordebt3(String debt3) {
        this.getCreditorFromDropDownfordebt3().enterText(debt3);
        creaditorDropDownValueButton.click();
    }

    public void EnterDebtTypeNameinTextFieldfordebt3(String debttype3) {
        this.getDebtTypFromDropdownfordebt3().enterText(debttype3);
        DebtTypeDropDownValueButton.click();
    }

    public void EnterAmountOwedforDebtinTextFieldfordebt3(String Amount3) {
        this.getAmountOwedTextboxfordebt3().clear();
        GenericMethod_cvp.implicitWait(1000);
        this.getAmountOwedTextboxfordebt3().enterTextField(Amount3);
        GenericMethod_cvp.implicitWait(3000);
    }

    public void SelectLiabilityforDebtFromDropDownfordebt3(int number) {
        GenericMethod_cvp.selectByIndex(LiabilityDropdownfordebt3, number);
    }

    public void ClickDetailedViewLinkfordebt3() {
        this.getDetailedViewLinkfordebt3().click();
    }

    public void ClickAreYouBehindWithpayementNoButtonfordebt3() {
        this.getAreYouBehindWithpayementNoButtonfordebt3().click();
    }

    public void ClickIsSVRNoButtonfordebt3() {
        this.getIsSVRNoButtonfordebt3().click();
    }

    public void EnterOriginalRegularPaymentInTextBoxfordebt3(String OrgRegularPaymentfordebt3) {
        this.getOriginalRegularpaymentTextBoxfordebt3().enterTextField(OrgRegularPaymentfordebt3);
    }

    public void SelectOriginalRegularpaymentTimeSelectionDropdownforDebt3(String debt3month) {
        GenericMethod_cvp.selectByText(OriginalRegularpaymentTimeSelectionDropdownfordebt3, debt3month);
        GenericMethod_cvp.implicitWait(3000);
        GenericMethod_cvp.selectByText(OriginalRegularpaymentTimeSelectionDropdownfordebt3, debt3month);
        GenericMethod_cvp.implicitWait(3000);
    }


    public void SelectYesFromAretheyLiableInGlobalQuestion() {

        this.getAreTheyLiableQuestionYesButtonInGlobalQuestionsAlert().click();
    }


    public Dropdown getOriginalRegularpaymentTimeSelectionDropdown1() {
        return OriginalRegularpaymentTimeSelectionDropdown1;
    }

    public TextField getOriginalRegularpaymentTextBox1() {
        return OriginalRegularpaymentTextBox1;
    }


    public void EnterdataforCoupleofDebtsForAllFeatures(String Scenario) {
        switch (Scenario) {
            case "89936":
                switchToActiveFrame();
                GenericMethod_cvp.implicitWait(2000);
                this.getAddaDebtButton().click();
                this.getAreTheyLiableQuestionNoButtonInGlobalQuestionsAlert().click();
                this.getSubmitButtonInGlobalQuestionsAlert().click();
                getBrowser().scrollUp();
                GenericMethod_cvp.implicitWait(10000);
                this.getCreditorFromutoComplete().enterTextThenSelectFromAutoComplete("Littlewoods");
                this.getCreditorFromutoComplete().tab();
                GenericMethod_cvp.implicitWait(10000);
                GenericMethod_cvp.implicitWait(10000);
                this.getDebtTypFromAutoComplete().enterTextThenSelectFromAutoComplete("Catalogue");
                GenericMethod_cvp.implicitWait(10000);
                this.getDebtTypFromAutoComplete().enter();
                this.getDebtTypFromAutoComplete().tab();
                (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getLiabilityutoComplete().getSelector()));
                this.getAmountOwedTextField().clickScreenElement(this.getAmountOwedTextField().getElement());
                this.getAmountOwedTextField().enterText("6000");
                this.getAmountOwedTextField().enter();
                this.getAmountOwedTextField().tab();
                GenericMethod_cvp.implicitWait(6000);
                this.getLiabilityutoComplete().selectFromDropdownByText("Client 1");
                this.getArrearsOrFurtherActionNoButton().click();
                GenericMethod_cvp.implicitWait(2000);
                this.getAddaDebtButton().click();
                //	this.getLiability(2).enterTextThenSelectFromAutoComplete("Wonga");
                this.getLiability(2).tab();
                GenericMethod_cvp.implicitWait(10000);
                GenericMethod_cvp.implicitWait(10000);
                this.getDebtType(2).enterTextThenSelectFromAutoComplete("Payday loan");

//			case"89924":
//				switchToActiveFrame();
//				GenericMethod_cvp.implicitWait(2000);
//				this.getAddaDebtButton().click();
//				this.getAreTheyLiableQuestionNoButtonInGlobalQuestionsAlert().click();
//				this.getSubmitButtonInGlobalQuestionsAlert().click();
//				getBrowser().scrollUp();
//				GenericMethod_cvp.implicitWait(10000);


        }
        switchToActiveFrame();
        GenericMethod_cvp.implicitWait(2000);
        this.getAddaDebtButton().click();
        this.getAreTheyLiableQuestionNoButtonInGlobalQuestionsAlert().click();
        this.getSubmitButtonInGlobalQuestionsAlert().click();
        getBrowser().scrollUp();
        //creditor1
//		this.getCreditorFromutoComplete().clickScreenElement(this.getCreditorFromutoComplete().getElement());
        GenericMethod_cvp.implicitWait(10000);
        this.getCreditorFromutoComplete().enterTextThenSelectFromAutoComplete("HSBC");
        this.getCreditorFromutoComplete().tab();
        GenericMethod_cvp.implicitWait(10000);
//		this.getDebtTypFromAutoComplete().clickScreenElement(this.getDebtTypFromAutoComplete().getElement());
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromAutoComplete().enterTextThenSelectFromAutoComplete("Personal loan");
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromAutoComplete().enter();
        this.getDebtTypFromAutoComplete().tab();
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getLiabilityutoComplete().getSelector()));
        this.getAmountOwedTextField().clickScreenElement(this.getAmountOwedTextField().getElement());
        this.getAmountOwedTextField().enterText("777");
        this.getAmountOwedTextField().enter();
        this.getAmountOwedTextField().tab();
        GenericMethod_cvp.implicitWait(6000);
        this.getLiabilityutoComplete().selectFromDropdownByText("Client 1");
        this.getArrearsOrFurtherActionNoButton().click();
        getBrowser().sleep(100);
        this.getDetailedViewLink().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getOriginalRegularpaymentTextBox().enterTextField("200");
        this.getOriginalRegularpaymentTextBox().enter();
        this.getOriginalRegularpaymentTextBox().tab();
        GenericMethod_cvp.implicitWait(20000);
        this.getOriginalRegularpaymentTimeSelectionDropdown().selectFromDropdownByIndex(4);
        GenericMethod_cvp.implicitWait(20000);
        this.getAreYouBehindWithpayementNoButton().click();
        this.getIstheDebtSubjectToAGuarantorNoButton().click();
        this.getAddaDebtButton().click();
        GenericMethod_cvp.implicitWait(30000);
        this.getCreditorFromDropDown2().enterTextThenSelectFromAutoComplete("TSB Bank");
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromAutoComplete().enter();
        this.getDebtTypFromAutoComplete().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromDropdown2().enterTextThenSelectFromAutoComplete("Personal loan");
        GenericMethod_cvp.implicitWait(10000);
        this.getDebtTypFromAutoComplete().enter();
        this.getDebtTypFromAutoComplete().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getAmountOwedTextbox2().clickScreenElement(this.getAmountOwedTextField().getElement());
        this.getAmountOwedTextbox2().enterText("777");
        this.getAmountOwedTextbox2().enter();
        this.getAmountOwedTextbox2().tab();
        GenericMethod_cvp.implicitWait(6000);
        this.getLiabilityComplete2().selectFromDropdownByText("Client 1");
        GenericMethod_cvp.implicitWait(10000);
        getBrowser().sleep(100);
        this.getDetailedViewLink2().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getOriginalRegularpaymentTextBox1().enterTextField("200");
        this.getOriginalRegularpaymentTextBox1().enter();
        this.getOriginalRegularpaymentTextBox1().tab();
        GenericMethod_cvp.implicitWait(10000);
        this.getOriginalRegularpaymentTimeSelectionDropdown1().selectFromDropdownByIndex(4);
        this.getArrearsOrFurtherActionNoButton().click();
        (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getDetailedViewLink2().getSelector()));
        GenericMethod_cvp.implicitWait(6000);
        this.getAllofClientsDebtshavebeencapturedCheckBox().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getDoTheyDisputeBalanceNoButton().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getDoTheyBelieveStatueBarredorPrescribedQuestionNoButton().click();
        GenericMethod_cvp.implicitWait(10000);
        this.getSubmitButtonInGlobalQuestionsAlert().click();
        this.getYourDebtsContinueButton().click();
    }

    public AutoComplete getCreditor(int index) {
        return new AutoComplete(By.name("$PD_LiabilityItemList_pa5129215065851524pz$ppxResults$l" + index + "$pCreditor$pDescription"));
    }

    public AutoComplete getDebtType(int index) {
        return new AutoComplete(By.name("$PD_LiabilityItemList_pa5129215065851524pz$ppxResults$l" + index + "$pDescription"));
    }

    public TextField getAmountOwed(int index) {
        return new TextField(By.name("$PD_LiabilityItemList_pa5129215065851524pz$ppxResults$l" + index + "$pAmountOwed"));
    }

    public Dropdown getLiability(int index) {
        return new Dropdown(By.name("$PD_LiabilityItemList_pa5129215065851524pz$ppxResults$l" + index + "$pOwnership$pCode"));
    }

    public Link getDetailedViewLinkfordebt4() {
        return DetailedViewLinkfordebt4;
    }

    public Dropdown getMainHomeDropdown() {
        return MainHomeDropdown;
    }

    public TextField getMainHomeAmount() {
        return MainHomeAmount;
    }

    public Button getMainHomeSave() {
        return MainHomeSave;
    }

    public Button getArrearsOrFurtherActionNoButton3() {
        return ArrearsOrFurtherActionNoButton3;
    }

    public void fillYourDebtWithTwoCreditors() {
        //creditor1
        this.getAddaDebtButton().click();
        ClickSubmitButtonInGlobalQuestion();

        GenericMethod_cvp.implicitWait(2000);
        this.getCreditorFromutoComplete().enterTextThenSelectFromAutoComplete("Natwest");
        creaditorDropDownValueButton.click();
        this.getDebtTypFromAutoComplete().enterTextThenSelectFromAutoComplete("Credit card");
        DebtTypeDropDownValueButton.click();
        this.getAmountOwedTextField().clear();
        this.getAmountOwedTextField().enterTextField("8000");
//        EnterCreditor1NameinTextFiledfordebt1("Natwest");
//        EnterDebtType1NameinTextFiledfordebt1("Credit card");
//        GenericMethod_cvp.implicitWait(3000);
//        this.getAmountOwedTextbox89949().enterTextField("8000");
//        GenericMethod_cvp.implicitWait(3000);
        GenericMethod_cvp.selectByIndex(LiabilityutoComplete, 1);
        GenericMethod_cvp.implicitWait(3000);
        this.getDetailedViewLink().click();
        GenericMethod_cvp.implicitWait(2000);
        this.getAreYouBehindWithpayementNoButton().click();
        GenericMethod_cvp.implicitWait(2000);


//        //creditor2//LiabilityDropdown2
        this.getAddaDebtButton().click();
        GenericMethod_cvp.implicitWait(5000);
        this.getCreditorFromDropDown2().enterText("Natwest");
        creaditorDropDownValueButton.click();
        this.getDebtTypFromDropdown2().enterText("Credit card");
        DebtTypeDropDownValueButton.click();
        this.getAmountOwedTextbox2().clear();
        this.getAmountOwedTextbox2().enterTextField("5000");
//        EnterCreditor2NameinTextFiledfordebt2for89949("Natwest");
//        EnterDebtType2NameinTextFiledfordebt2for89949("Credit card");
//        GenericMethod_cvp.implicitWait(10000);
//        this.getAmountOwedTextbox2().enterTextField("5000");
////        GenericMethod_cvp.implicitWait(5000);
////        this.getAmountOwedTextbox2().enterTextField("5000");
        GenericMethod_cvp.implicitWait(5000);
        GenericMethod_cvp.selectByIndex(LiabilityDropdown2, 2);
        GenericMethod_cvp.implicitWait(3000);
        this.getDetailedViewLink3().click();
        GenericMethod_cvp.implicitWait(2000);
        this.getAreuBehindWithNoButton89949().click();
        GenericMethod_cvp.implicitWait(2000);
       // this.getAmountOwedTextbox89949().enterTextField("8000");
        GenericMethod_cvp.implicitWait(3000);

        this.getAllofClientsDebtshavebeencapturedCheckBox().click();
        this.getDoTheyGuarantorWhoWillBecomeResponsibleNoButton().click();
        this.getDoTheyDisputeBalanceNoButton().click();
        this.getDoTheyBelieveStatueBarredorPrescribedQuestionNoButton().click();
        this.getSubmitButtonInGlobalQuestionsAlert().click();
        GenericMethod_cvp.implicitWait(4000);
        this.getYourDebtsContinueButton().click();
    }


}

