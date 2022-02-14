package com.stepChangeRem.remediation.pages.onlinePages;

import com.stepchange.atf.controls.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class YourDebtPage extends Control {
    GenericMethodsRemediation GenericMethods_cvp = new GenericMethodsRemediation();
    //debt1
    private Button AddDebtButton;
    private AutoComplete Creditor1;
    private Button DebtType1Rb;
    private Button WhoOwedThisDebtRb;
    private TextField HowMuchDoyouOweTextBox;
    private Button AreYouBehidWithPaymentYesRb;
    private Button FurtherActionDefaultnoticeRb;
    private Button AddButton;
    private Button ContinueButton;
    private Button addedEverythingOption;
    private Button PopUpConfirmButton;
    private Button AddDebt;
    private AutoComplete WhoOweMonyCreditor1;
    private Button WhatTypeofDebt;
    private Button DebtOwner;
    private TextField OutStandingBalance;
    private Button WhyAskingMe;
    private Button OtherDebtPopUpOk;
    private Button NoActionTaken;
    //debt2
    private Button DebtType2Rb;
    private Button WhoOwedThisDebtRb2;
    private TextField HowMuchDoyouOweTextBox2;
    private Button CreditorOngoingSupplyNoRb;
    private Button FurtherActionNoActionTakenRb;
    private Button DebtsPageContinueButton;
    private Button IhaveAddedEverythingYesRbinDebtPopUp;
    private Button ConfirmButtoninDebtPopUp;
    private Button SelectFirstOptionforCreditor;

    //getters

    public Button getAddDebt() {return AddDebt;}
    public AutoComplete getWhoOweMonyCreditor1() {return WhoOweMonyCreditor1;}
    public Button getWhatTypeofDebt() {return WhatTypeofDebt;}
    public Button getDebtOwner() {return DebtOwner;}
    public TextField getOutStandingBalance() {return OutStandingBalance;}
    public Button getWhyAskingMe() {return WhyAskingMe;}
    public Button getOtherDebtPopUpOk() {return OtherDebtPopUpOk;}
    public Button getNoActionTaken() {return NoActionTaken;}
    public Button getContinueButton() { return ContinueButton; }
    public Button getAddedEverythingOption() {return addedEverythingOption;}
    public Button getPopUpConfirmButton() {return PopUpConfirmButton; }

    public Button getAddDebtButton() {
        return AddDebtButton;
    }
    public AutoComplete getCreditor1() {
        return Creditor1;
    }
    public Button getDebtType1Rb() {
        return DebtType1Rb;
    }
    public Button getWhoOwedThisDebtRb() {
        return WhoOwedThisDebtRb;
    }
    public TextField getHowMuchDoyouOweTextBox() {
        return HowMuchDoyouOweTextBox;
    }
    public Button getAreYouBehidWithPaymentYesRb() {
        return AreYouBehidWithPaymentYesRb;
    }
    public Button getFurtherActionDefaultnoticeRb() {
        return FurtherActionDefaultnoticeRb;
    }

    public Button getDebtType2Rb() {
        return DebtType2Rb;
    }
    public Button getWhoOwedThisDebtRb2() {
        return WhoOwedThisDebtRb2;
    }
    public TextField getHowMuchDoyouOweTextBox2() {
        return HowMuchDoyouOweTextBox2;
    }
    public Button getCreditorOngoingSupplyNoRb() {
        return CreditorOngoingSupplyNoRb;
    }
    public Button getFurtherActionNoActionTakenRb() {
        return FurtherActionNoActionTakenRb;
    }
    public Button getAddButton() {
        return AddButton;
    }
    public Button getDebtsPageContinueButton() {
        return DebtsPageContinueButton;
    }
    public Button getIhaveAddedEverythingYesRbinDebtPopUp() {
        return IhaveAddedEverythingYesRbinDebtPopUp;
    }
    public Button getConfirmButtoninDebtPopUp() {
        return ConfirmButtoninDebtPopUp;
    }
    public Button getSelectFirstOptionforCreditor() {
        return SelectFirstOptionforCreditor;
    }


    public YourDebtPage(){

        AddDebt = new Button(By.xpath("//button[text()='Add a debt']"));
        WhoOweMonyCreditor1 = new AutoComplete(By.xpath("//input[@class='autocomplete_input ac_']"));
        WhatTypeofDebt = new Button(By.xpath("//div[text()='What type of debt is it?']//following::label[1]"));
        DebtOwner= new Button(By.xpath("//label[text()='Who owes this debt?']//following::label[1]"));
        OutStandingBalance= new TextField(By.xpath("//div[text()='How much do you owe?']//following::input[1]"));
        WhyAskingMe = new Button(By.xpath("(//label[text()='No' and @class='rb_standard rb_standard radioLabel'])[1]"));
        OtherDebtPopUpOk= new Button(By.xpath("//button[text()='OK']"));
        NoActionTaken= new Button(By.xpath("//label[text()='No action taken (arrears only)']"));
        ContinueButton = new Button(By.xpath("//button[text()='Continue']"));
        addedEverythingOption = new Button(By.xpath("//label[text()='Yes, I have added everything']"));
        PopUpConfirmButton = new Button(By.xpath("//button[text()='Confirm']"));
        SelectFirstOptionforCreditor = new Button(By.xpath("//span[@class='ac-primary-option']"));

        //debt1
        AddDebtButton = new Button(By.xpath("//button[text()='Add a debt']"));
        Creditor1 = new AutoComplete(By.xpath("//input[@class='autocomplete_input ac_']"));
        DebtType1Rb = new Button(By.xpath("//div[text()='What type of debt is it?']//following::label[1]"));
        WhoOwedThisDebtRb= new Button(By.xpath("//label[text()='Who owes this debt?']//following::label[1]"));
        HowMuchDoyouOweTextBox= new TextField(By.xpath("//div[text()='How much do you owe?']//following::input[1]"));
        AreYouBehidWithPaymentYesRb= new Button(By.xpath("//h6[text()='How would I know about court action?']//following::label[1]"));
        FurtherActionDefaultnoticeRb= new Button(By.xpath("//div[text()='What action has been taken by the creditor?']//following::label[3]"));
        AddButton = new Button(By.xpath("//button[text()='Add']"));
        //debt2
        //Creditor2 Xpath is same As Creditor1 Xpath we can reuse
        DebtType2Rb = new Button(By.xpath("//div[text()='What type of debt is it?']//following::label[3]"));
        WhoOwedThisDebtRb2= new Button(By.xpath("//label[text()='Who owes this debt?']//following::label[2]"));
        HowMuchDoyouOweTextBox2= new TextField(By.xpath("//div[text()='How much do you owe?']//following::input[1]"));
        CreditorOngoingSupplyNoRb = new Button(By.xpath("//div[text()='Does the creditor provide an ongoing supply?']//following::label[2]"));
        FurtherActionNoActionTakenRb= new Button(By.xpath("//div[text()='What action has been taken by the creditor?']//following::label[2]"));
        DebtsPageContinueButton = new Button(By.xpath("//button[text()='Continue']"));
        IhaveAddedEverythingYesRbinDebtPopUp = new Button(By.xpath("(//label[@class='rb_standard rb_standard radioLabel'])[2]"));
        ConfirmButtoninDebtPopUp = new Button(By.xpath("//button[text()='Confirm']"));
        SelectFirstOptionforCreditor = new Button(By.xpath("//span[@class='ac-primary-option']"));


    }


    public void EntertwoDebtDetailsfor89963(String creitor1,String data1,String Creditor2,String data2){
    	GenericMethods_cvp.implicitWait(10000);
    	this.getAddDebtButton().click();
        GenericMethods_cvp.implicitWait(5000);
        this.getCreditor1().enterText(creitor1);
        GenericMethods_cvp.implicitWait(5000);
        this.getSelectFirstOptionforCreditor().click();
        GenericMethods_cvp.implicitWait(5000);
        this.getDebtType1Rb().click();
        GenericMethods_cvp.implicitWait(5000);
        this.getWhoOwedThisDebtRb().click();
        GenericMethods_cvp.implicitWait(5000);
        this.getHowMuchDoyouOweTextBox().enterText(data1);
        GenericMethods_cvp.implicitWait(5000);
        this.getAreYouBehidWithPaymentYesRb().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getFurtherActionDefaultnoticeRb().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getAddButton().click();
        GenericMethods_cvp.implicitWait(4000);

        this.getAddDebtButton().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getCreditor1().enterText(Creditor2);
        GenericMethods_cvp.implicitWait(5000);
        this.getSelectFirstOptionforCreditor().click();
        GenericMethods_cvp.implicitWait(5000);
        this.getDebtType2Rb().click();
        GenericMethods_cvp.implicitWait(5000);
        this.getWhoOwedThisDebtRb2().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getHowMuchDoyouOweTextBox2().enterText(data2);
        GenericMethods_cvp.implicitWait(2000);
        this.getHowMuchDoyouOweTextBox2().enterText(data2);
        GenericMethods_cvp.implicitWait(2000);
        this.getCreditorOngoingSupplyNoRb().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getFurtherActionNoActionTakenRb().click();
        GenericMethods_cvp.implicitWait(2000);
        this.getAddButton().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getDebtsPageContinueButton().click();
        //this.getAddButton().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getIhaveAddedEverythingYesRbinDebtPopUp().click();
        GenericMethods_cvp.implicitWait(4000);
        this.getConfirmButtoninDebtPopUp().click();
        GenericMethods_cvp.implicitWait(5000);

    }
    public void ActionSetOnDebt89955(){

        this.getAddDebt().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getWhoOweMonyCreditor1().enterText("Blackhorse Collections");
        this.getSelectFirstOptionforCreditor().click();
        //  this.getWhoOweMonyCreditor1().selectFromDropdown("Blackhorse Collections");
        GenericMethods_cvp.implicitWait(10000);
        this.getWhatTypeofDebt().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getDebtOwner().click();
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        this.getOutStandingBalance().enterText("15000");
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        this.getWhyAskingMe().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getOtherDebtPopUpOk().click();
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        this.getOutStandingBalance().enterText("15000");
        getBrowser().sleep(getBrowser().getTimeout() / 10);
        GenericMethods_cvp.implicitWait(10000);
        this.getNoActionTaken().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getAddButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getContinueButton().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getAddedEverythingOption().click();
        GenericMethods_cvp.implicitWait(10000);
        this.getPopUpConfirmButton().click();
    }

}
