package com.stepChangeRem.remediation.pages.helper.online;

import com.stepChangeRem.remediation.pages.YourDebtsPage;
import com.stepChangeRem.remediation.pages.helper.vo.DebtsFields;
import com.stepChangeRem.remediation.pages.helper.vo.QuestionsFields;
import com.stepchange.atf.controls.*;
import org.openqa.selenium.By;

import java.util.List;

public class OnlineDebtHelper extends Control {
    private AutoComplete debitorName;
    private Button debtType;
    private Button debtOwner;
    private TextField amountOwed;
    private Button areYouBehindWithPayments;
    private Button furtherActionType;
    private Button addDebit;
    private Button newDebit;
    private Button finishedDebts;
    private Button confirmFinishedDebts;
    private Button continueButton;
    //Questions
    private Button guarantor;
    private Button disputedDebt;
    private Button debtUnenforceable;
    private Button haveYouRepaidAnyArrearsInTheLast12Months;
    Button whatTypeOfMortgageIsIt;
    TextField mortagagePaymentAmount;
    Dropdown mortagagePaymentFrequency;
    Button isTheDebtSubjectToAGuarantor;
    Button arrangementRepayInsurance;
    Button ongoingMobileService;
    Button addAssets;
    TextField assetAmount;
    Dropdown assetOwner;
    Button saveAsset;
    Button addMortagagePayment;
    Button isItOnaStandardVariableRate;
    private Dropdown paymentOwner;
    private Button isMainHome;
    private TextField originalRegularpaymentTextBox;
    private Dropdown originalRegularpaymentForEvery;
    private Dropdown spendingItem;
    private TextField   regularpaymentTextBox;
    public Dropdown getSpendingItem() {
        return spendingItem=new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l1$pCode')]"));
    }

    public TextField getRegularpaymentTextBox() {
        return regularpaymentTextBox=new TextField(By.xpath("//input[contains(@name,'$ppxResults$l1$pAmount')]"));
    }

    public Button getIsTheDebtSubjectToAGuarantor(int index, String actionType) {
        return isTheDebtSubjectToAGuarantor = new Button(By.xpath("//input[contains(@name,'$ppxResults$l" + index + "$pIsSubjectToGuarantor')]/../label[.='" + actionType + "']"));
    }

    public Dropdown getOriginalRegularpaymentForEvery(int index) {
        return originalRegularpaymentForEvery = new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l" + index + "$pContractualPaymentFrequency')]"));
    }

    public TextField getOriginalRegularpaymentTextBox(int index) {
        return originalRegularpaymentTextBox = new TextField(By.xpath("//input[contains(@name,'$ppxResults$l" + index + "$pContractualPaymentValue')]"));
    }

    public TextField getMortagagePaymentAmount(int index) {
        return mortagagePaymentAmount = new TextField(By.xpath("(//input[contains(@name,'$ppxResults$l1$pAmount')])["+index+"]"));
    }
    public Button getAddLikedItem() {
        return addLikedItem = new Button(By.xpath("//button[text()='Add linked item']"));
    }

    private Button addLikedItem;

    public Button getOngoingMobileService(int index, String actionType) {
        return ongoingMobileService=new Button(By.xpath("//input[contains(@name,'$ppxResults$l"+index+"$pIsCurrentSupplier')]/../label[.='"+actionType+"']"));
    }

    public Button getArrangementRepayInsurance(int index, String actionType) {
        return arrangementRepayInsurance=new Button(By.xpath("//input[contains(@name,'$ppxResults$l"+index+"$pArrangementsInPlace')]/../label[.='"+actionType+"']"));
    }

    public Button getIsItOnaStandardVariableRate(int index, String actionTye) {
        return isItOnaStandardVariableRate = new Button(By.xpath("//input[contains(@name,'$ppxResults$l" + index + "$pClientOnStandardVariableRate')]/../label[.='" + actionTye + "']"));
    }

    public Button getWhatTypeOfMortgageIsIt(int index, String whatTypeOfMortgageIsIt) {
        return this.whatTypeOfMortgageIsIt = new Button(By.xpath("//input[contains(@name,'$ppxResults$l" + index + "$pMortgageType')]/../label[.='"+whatTypeOfMortgageIsIt+"']"));
    }

    public Button getHaveYouRepaidAnyArrearsInTheLast12Months(int index, String actionTye) {
        return haveYouRepaidAnyArrearsInTheLast12Months = new Button(By.xpath("//input[contains(@name,'$ppxResults$l" + index + "$pPaymentMissedInLast12Months')]/../label['" + actionTye + "']"));
    }

    public Button getGuarantor(String answer) {

        return guarantor=new Button(By.xpath("//input[@name='$PpyWorkPage$pIsSubjectToGuarantor']/../label[.='"+answer+"']"));
    }

    public Button getDisputedDebt(String answer) {
        return disputedDebt=new Button(By.xpath("//input[@name='$PpyWorkPage$pIsItemInDispute']/../label[.='"+answer+"']"));
    }

    public Button getDebtUnenforceable(String answer) {
        return debtUnenforceable=new Button(By.xpath("//input[@name='$PpyWorkPage$pIsNotEnforceable']/../label[.='"+answer+"']"));
    }

    public Button getContinueButton() {
        return continueButton=new Button(By.xpath("//button[.='Continue']"));
    }

    public Button getConfirmFinishedDebts() {
        return confirmFinishedDebts=new Button(By.xpath("//button[.='Confirm']"));
    }

    public Button getFinishedDebts(String actionType) {
        return finishedDebts=new Button(By.xpath("//input[@name='$PpyWorkPage$pActionTaken']/../label[.='"+actionType+"']"));
    }

    public Button getNewDebit() {
        return newDebit=new Button(By.xpath("//button[.='Add a debt']"));
    }

    public Button getAddDebit() {
        return addDebit=new Button(By.xpath("//button[.='Add']"));
    }

    public Button getFurtherActionType(int index, String action) {
        return furtherActionType=new Button(By.xpath("//input[contains(@name,'$ppxResults$l"+index+"$pCollectionStage')]/../label[.='"+action+"']"));
    }

    public Button getAreYouBehindWithPayments(int index, String action) {
        return areYouBehindWithPayments=new Button(By.xpath("//input[contains(@name,'$ppxResults$l"+index+"$pPaymentMissed')]/../label[.='"+action+"']"));
    }

    public TextField getAmountOwed(int index) {
        return amountOwed=new TextField(By.xpath("//input[contains(@name,'$ppxResults$l"+index+"$pAmountOwed') or contains(@name,'$ppxResults$l"+index+"$pArrearsBalance')]"));
    }

    public Button getDebtType(int index, String type) {
        return debtType=new Button(By.xpath("//input[contains(@name,'$ppxResults$l"+index+"$pCommonLiabilityCode')]/../label[.='"+type+"']"));
    }

    public AutoComplete getDebitorName(int index) {
        return debitorName=new AutoComplete(By.xpath("//input[contains(@name,'$ppxResults$l"+index+"$pCreditor$pDescription')]"));
    }

    public Button getDebtOwner(int index,String owner) {
        return debtOwner=new Button(By.xpath("//input[contains(@name,'$ppxResults$l"+index+"$pOwnership$pCode')]/../label[.='"+owner+"']"));
    }

    public Dropdown getMortagagePaymentFrequency(int index) {
        return mortagagePaymentFrequency = new Dropdown(By.xpath("(//select[contains(@name,'$ppxResults$l"+index+"$pFrequency')])"));
    }
    public Dropdown getPaymentOwner() {
        return paymentOwner=new Dropdown(By.xpath("//select[contains(@name,'$l1$pOwnership$pCode')]"));
    }
    public Button getIsMainHome(String action) {
        return isMainHome=new Button(By.xpath("//input[contains(@name,'$ppxResults$l1$pIsDebtRelatedToMainHome')]/../label[.='"+action+"']"));
    }

    public TextField getAssetAmount() {
        return assetAmount=new TextField(By.xpath("//input[contains(@name,'$ppxResults$l2$pAmount')]"));
    }

    public Dropdown getAssetOwner() {
        return assetOwner=new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l1$pOwnership$pCode')]"));
    }

    public void completeOnlinedebtDetails(List<DebtsFields> debitDetails, String totalAmount)
    {
        for (int i = 0; i < debitDetails.size(); i++) {
            this.getNewDebit().click();
            int actualPostition = i + 1;
            verifyOverLayDisplayed();
            getDebitorName(actualPostition).enterTextThenSelectFromAutoComplete(debitDetails.get(i).getCreditor());
            getBrowser().sleep(2000);
//            getDebitorName(actualPostition).downArrow();
            getDebitorName(actualPostition).enter();
            getDebitorName(actualPostition).tab();
            getDebtType(actualPostition,debitDetails.get(i).getDebttype()).click();
            verifyOverLayDisplayed();
            this.getDebtOwner(actualPostition,debitDetails.get(i).getLiability()).click();
            verifyOverLayDisplayed();
            getBrowser().sleep(5000);
            this.getAmountOwed(actualPostition).enterText(debitDetails.get(i).getAmountOwed());
            verifyOverLayDisplayed();
            if(!debitDetails.get(i).getAreYouBehindWithPayments().equalsIgnoreCase("false"))
            getAreYouBehindWithPayments(actualPostition, debitDetails.get(i).getAreYouBehindWithPayments()).click();
            verifyOverLayDisplayed();
            debtDetails(debitDetails, i, actualPostition);
            verifyOverLayDisplayed();
            if (debitDetails.get(i).getFurtherAction()!=null && !debitDetails.get(i).getFurtherAction().isEmpty()&&!(debitDetails.get(i).getFurtherActionType().equalsIgnoreCase("false")))
                getFurtherActionType(actualPostition, debitDetails.get(i).getFurtherActionType()).click();
            verifyOverLayDisplayed();
            this.getAddDebit().click();
        }
//        this.getContinueButton().click();
    }


    private void fillMortgageDetails(List<DebtsFields> debitDetails, int i, int actualPostition) {
        if(debitDetails.get(i).getIsDebtTypeMortagage()!=null && !debitDetails.get(i).getIsDebtTypeMortagage().isEmpty()&&debitDetails.get(i).getIsDebtTypeMortagage().equalsIgnoreCase("true")) {
            this.getHaveYouRepaidAnyArrearsInTheLast12Months(actualPostition, debitDetails.get(i).getHaveYouRepaidAnyArrearsInTheLast12Months());
            verifyOverLayDisplayed();
            this.getHaveYouRepaidAnyArrearsInTheLast12Months(actualPostition, debitDetails.get(i).getHaveYouRepaidAnyArrearsInTheLast12Months()).click();
            verifyOverLayDisplayed();
            this.getWhatTypeOfMortgageIsIt(actualPostition,debitDetails.get(i).getWhatTypeOfMortgageIsIt()).click();
            verifyOverLayDisplayed();
            this.getIsItOnaStandardVariableRate(actualPostition, debitDetails.get(i).getIsItOnaStandardVariableRate()).click();
            getBrowser().sleep(200);
            verifyOverLayDisplayed();
            this.getMortagagePaymentAmount(2).enterText(debitDetails.get(i).getMortagagePaymentAmount());
            verifyOverLayDisplayed();
            this.getMortagagePaymentFrequency(1).selectFromDropdownByIndex(Integer.parseInt(debitDetails.get(i).getMortagagePaymentFrequency()));
            verifyOverLayDisplayed();
            if(debitDetails.get(i).getOwnerOfPayment()!=null && Integer.valueOf(debitDetails.get(i).getOwnerOfPayment()).intValue()>0) {
                this.getPaymentOwner().scrollElementIntoView();
                this.getPaymentOwner().selectFromDropdownByIndex(Integer.valueOf(debitDetails.get(i).getOwnerOfPayment()).intValue());
            }
            // Remove Assets Button
            if(debitDetails.get(i).isLinkMainHome()!=null)
            {
                this.getIsMainHome(debitDetails.get(i).isLinkMainHome()).click();
            }
            if(debitDetails.get(i).getLinkAssets()!=null && !debitDetails.get(i).getLinkAssets().isEmpty()&&debitDetails.get(i).getLinkAssets().equalsIgnoreCase("true"))
            {

                this.getAssetAmount().enterText(debitDetails.get(i).getAssetWorth());
                this.getAssetOwner().selectFromDropdownByIndex(Integer.parseInt(debitDetails.get(i).getOwnerOfTheAsset()));

            }
            verifyOverLayDisplayed();

        }
    }


    public void completeOnlinedebtDetailsAfterNavigatingBack(List<DebtsFields> debitDetails, String totalAmount,int previous)
    {
        for (int i = 0; i < (debitDetails.size()); i++) {
            this.getNewDebit().click();
            int actualPostition = i + previous+1;
            verifyOverLayDisplayed();
            getDebitorName(actualPostition).enterTextThenSelectFromAutoComplete(debitDetails.get(i).getCreditor());
            getBrowser().sleep(2000);
            getDebitorName(actualPostition).downArrow();
            getDebitorName(actualPostition).enter();
            getDebitorName(actualPostition).tab();
            getDebtType(actualPostition,debitDetails.get(i).getDebttype()).click();
            verifyOverLayDisplayed();
            this.getDebtOwner(actualPostition,debitDetails.get(i).getLiability()).click();
            verifyOverLayDisplayed();
            getBrowser().sleep(5000);
            this.getAmountOwed(actualPostition).enterText(debitDetails.get(i).getAmountOwed());
            verifyOverLayDisplayed();
            verifyOverLayDisplayed();
            if(!debitDetails.get(i).getAreYouBehindWithPayments().equalsIgnoreCase("false"))
            getAreYouBehindWithPayments(actualPostition, debitDetails.get(i).getAreYouBehindWithPayments()).click();
            verifyOverLayDisplayed();
            verifyOverLayDisplayed();
            debtDetails(debitDetails, i, actualPostition);
            if (debitDetails.get(i).getFurtherActionType()!=null && !debitDetails.get(i).getFurtherActionType().isEmpty()&&!(debitDetails.get(i).getFurtherActionType().equalsIgnoreCase("false")))
                getFurtherActionType(actualPostition, debitDetails.get(i).getFurtherActionType()).click();
            verifyOverLayDisplayed();
            verifyOverLayDisplayed();
            this.getAddDebit().click();
        }
    }
    private void fillMobilePayment(List<DebtsFields> debitDetails, int i, int actualPostition) {
        if(debitDetails.get(i).getOngoingMobileService()!=null && !debitDetails.get(i).getOngoingMobileService().equalsIgnoreCase("false"))
        this.getOngoingMobileService(actualPostition,debitDetails.get(i).getOngoingMobileService()).click();
    }
    private void fillInsurancePayment(List<DebtsFields> debitDetails, int i, int actualPostition) {
        this.getArrangementRepayInsurance(actualPostition,debitDetails.get(i).getArrangementRepayInsurance()).click();
        this.getSpendingItem().selectFromDropdownByText(debitDetails.get(i).getReasonForSpending());

        for (int l = 0; l < getBrowser().getMaxAttempts(); l++) {
            try {
                this.getRegularpaymentTextBox().enterText(debitDetails.get(i).getSpentAmount());
            } catch (Exception e) {
            }
        }

        new YourDebtsPage().getFrequencyDropDown().selectFromDropdownByIndex(4);
    }
    private void fillOriginalRegularPayment(List<DebtsFields> debitDetails, int i, int actualPostition) {
        if (debitDetails.get(i).getOriginalReGularPayment()!=null && !debitDetails.get(i).getOriginalReGularPayment().isEmpty()&&!debitDetails.get(i).getOriginalReGularPayment().equalsIgnoreCase("false")) {
            verifyOverLayDisplayed();
            getBrowser().sleep(200);
            this.getOriginalRegularpaymentTextBox(actualPostition).enterText(debitDetails.get(i).getOriginalReGularPayment());
            verifyOverLayDisplayed();
            this.getOriginalRegularpaymentTextBox(actualPostition).tab();
            this.getOriginalRegularpaymentTextBox(actualPostition).tab();
            verifyOverLayDisplayed();
            this.getOriginalRegularpaymentForEvery(actualPostition).selectFromDropdownByIndex(Integer.parseInt(debitDetails.get(i).getOriginalReGularPaymentForEvery()));
        }
    }
    public void fillTheGlobalQuestions(List<QuestionsFields> questionsFields) {

        for (QuestionsFields fields:questionsFields) {
                this.getGuarantor(fields.getGuarantor()).click();
                this.getDisputedDebt(fields.getDisputeddebt()).click();
                this.getDebtUnenforceable(fields.getDebtUnenforceable()).click();
                this.getContinueButton().click();
        }
    }
    public void debtDetails(List<DebtsFields> debitDetails, int i, int actualPostition) {

        switch (debitDetails.get(i).getDebttype()) {
            case "Mortgage":
                fillMortgageDetails(debitDetails, i, actualPostition);
                break;
            case "Personal loan":
                fillOriginalRegularPayment(debitDetails, i, actualPostition);
                break;
            case "Insurance arrears":
                fillInsurancePayment(debitDetails, i, actualPostition);
                break;
            case "Mobile phone arrears":
                fillMobilePayment(debitDetails, i, actualPostition);
                break;
            case "Electricity arrears":
                fillMobilePayment(debitDetails, i, actualPostition);
                break;
        }
    }
}
