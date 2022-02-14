package com.stepChangeRem.remediation.pages.helper;

import com.stepChangeRem.remediation.pages.YourDebtsPage;
import com.stepChangeRem.remediation.pages.helper.vo.DebtsFields;
import com.stepchange.atf.controls.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class YourDebtsHelper extends YourDebtsPage {
    AutoComplete creditor;
    AutoComplete debttype;
    TextField amountOwed;
    Dropdown liability;
    Checkbox allOfClientsDFebtsHaveBeenCaptured;
    Button areYouBeHindWithPayments;
    Button arrearsFurtherActions;
    ;
    Button furtherActionType;
    Dropdown whatTypeOfMortgageIsIt;
    TextField mortagagePaymentAmount;
    Button haveYouRepaidAnyArrearsInTheLast12Months;
    Dropdown mortagagePaymentFrequency;
    Button continueButton;
    Button isTheDebtSubjectToAGuarantor;
    Button arrangementRepayInsurance;
    Button ongoingMobileService;
    Button addAssets;
    TextField assetAmount;
    Dropdown assetOwner;
    Button saveAsset;
    Button addMortagagePayment;
    Button courtActionType;
    TextField courtActionPayment;
    Dropdown courtActionPaymentForEvery;

    public TextField getCourtActionPayment(int index) {
        return courtActionPayment=new TextField(By.xpath("//input[contains(@aria-describedby,'$l"+index+"$pArrangementError')]"));
    }

    public Dropdown getCourtActionPaymentForEvery(int index) {
        return courtActionPaymentForEvery=new Dropdown(By.xpath("//select[contains(@name,'$l"+index+"$pArrangementPaymentFrequency')]"));
    }

    public Button getCourtActionType(int index,String courtActionType) {
        return new Button(By.xpath("//input[contains(@name,'$l"+index+"$pCourtActionStage')]/../label[.='"+courtActionType+"']"));
    }

    public Button getAddMortagagePayment() {
        return addMortagagePayment=new Button(By.xpath("//button[.='Add']"));
    }

    public Button getAddAssets() {
        return addAssets=new Button(By.xpath("//button[.='Asset']"));
    }

    public TextField getAssetAmount() {
        return assetAmount=new TextField(By.xpath("//input[contains(@name,'$ppxResults$l2$pAmount')]"));
    }

    public Dropdown getAssetOwner() {
        return assetOwner=new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l2$pOwnership$pCode')]"));
    }

    public Button getSaveAsset() {
        return saveAsset=new Button(By.xpath("//button[.='Save']"));
    }

    public Div getDebtsPageHeader() {
        return  new Div(By.xpath("//div[@class='content-item content-label item-1 remove-left-spacing remove-right-spacing flex flex-row dataLabelWrite heading_1_dataLabelWrite']"));
    }

    public Button getIsTheDebtSubjectToAGuarantor(int index, String actionType) {
        return isTheDebtSubjectToAGuarantor = new Button(By.xpath("//input[contains(@name,'$ppxResults$l" + index + "$pIsSubjectToGuarantor')]/../label[.='" + actionType + "']"));
    }

    private Div totalDebts;
    private Button debtGlobalQuestionsSubmitButton;
    private TextField originalRegularpaymentTextBox;
    private Button isItOnaStandardVariableRate;
    private Checkbox isMainHome;
    private Dropdown paymentOwner;

    public Dropdown getPaymentOwner() {
        return paymentOwner=new Dropdown(By.xpath("//select[contains(@name,'$l1$pOwnership$pCode')]"));
    }

    public Checkbox getIsMainHome() {
        return isMainHome=new Checkbox(By.xpath("//span[.='Main home']//preceding::input[1]"));
    }

    public Button getAssetsRemoveButton() {
        return assetsRemoveButton = new Button(By.xpath("//a[.='Remove' and contains(@name,'LinkAssetRow')]"));
    }

    private Button assetsRemoveButton;

    public Button getAddMortagageButton() {
        return addMortagageButton = new Button(By.xpath("//button[.='Add']"));
    }

    private Button addMortagageButton;

    public Button getSaveMortagageButton() {
        return saveMortagageButton = new Button(By.xpath("//button[.='Submit']"));
    }

    private Button saveMortagageButton;

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

    public Button getHaveYouRepaidAnyArrearsInTheLast12Months(int index, String actionTye) {
        return haveYouRepaidAnyArrearsInTheLast12Months = new Button(By.xpath("//input[contains(@name,'$ppxResults$l" + index + "$pPaymentMissedInLast12Months')]/../label['" + actionTye + "']"));
    }

    public Dropdown getWhatTypeOfMortgageIsIt(int index) {
        return whatTypeOfMortgageIsIt = new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l" + index + "$pMortgageType')]"));
    }

    public TextField getMortagagePaymentAmount(int index) {
        return mortagagePaymentAmount = new TextField(By.xpath("//input[contains(@name,'$ppxResults$l" + index + "$pAmount')]"));
    }

    public Dropdown getMortagagePaymentFrequency(int index) {
        return mortagagePaymentFrequency = new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l" + index + "$pFrequency')]"));
    }

    public Button getContinueButton() {
        switchToActiveFrame();
        return continueButton = new Button(By.xpath("//button[.='Continue']"));
    }

    public TextField getOriginalRegularpaymentTextBox(int index) {
        return originalRegularpaymentTextBox = new TextField(By.xpath("//input[contains(@name,'$ppxResults$l" + index + "$pContractualPaymentValue')]"));
    }

    private Dropdown originalRegularpaymentForEvery;

    public Dropdown getOriginalRegularpaymentForEvery(int index) {
        return originalRegularpaymentForEvery = new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l" + index + "$pContractualPaymentFrequency')]"));
    }

    public Div getTotalDebts() {
        return totalDebts = new Div(By.xpath("//*[contains(text(),'Total amount owed')]/following::div[1]"));
    }

    public Button getSubmit() {
        return submit = new Button(By.xpath("//button[.='Submit']"));
    }

    Button submit;

    public Button getClientLiableForAllDebts() {
        return clientLiableForAllDebts = new Button(By.xpath("//input[@name='$PpyWorkPage$pClientLiableForAllDebts']/../label[.='No']"));
    }

    Button clientLiableForAllDebts;


    public Button getFurtherActionType(int index, String actionType) {
        return furtherActionType = new Button(By.xpath("//input[contains(@name,'$ppxResults$l" + index + "$pCollectionStage')]/../label[.='" + actionType + "']"));
    }


    public Link getDetailedView(int index) {
        return detailedView = new Link(By.xpath("(//a[.='Detailed view'])[" + index + "]"));
    }

    Link detailedView;

    public Button getAreYouBeHindWithPayments(int index, String label) {
        return areYouBeHindWithPayments = new Button(By.xpath("//input[contains(@name,'$l" + index + "$pPaymentMissed')]/../label[.='" + label + "']"));
    }

    public Checkbox getAllOfClientsDFebtsHaveBeenCaptured() {
        return allOfClientsDFebtsHaveBeenCaptured = new Checkbox(By.xpath("//input[@name='$PpyWorkPage$pGenericFlag$gDebtInputComplete']/../label"));
    }

    public Button getArrearsFurtherActions(int index, String text) {
        return arrearsFurtherActions = new Button(By.xpath("//input[contains(@name,'$ppxResults$l" + index + "$pBooleanVal')]/../label[.='" + text + "']"));
    }

    public Button getAddDebt() {
        return addDebt = new Button(By.xpath("//button[.='Add a debt']"));
    }

    Button addDebt;

    public AutoComplete getCreditor(int index) {
        return creditor = new AutoComplete(By.xpath("//input[contains(@name,'$ppxResults$l" + index + "$pCreditor$pDescription')]"));
    }

    public AutoComplete getDebttype(int index) {
        return debttype = new AutoComplete(By.xpath("//input[contains(@name,'$ppxResults$l" + index + "$pDescription')]"));
    }

    public TextField getAmountOwed(int index) {
        return amountOwed = new TextField(By.xpath("//input[contains(@name,'$ppxResults$l" + index + "$pAmountOwed')] | //input[contains(@name,'$ppxResults$l"+index+"$pArrearsBalance')] "));
    }

    public Dropdown getLiability(int index) {
        return liability = new Dropdown(By.xpath("//select[contains(@name,'$ppxResults$l" + index + "$pOwnership$pCode')]"));
    }

    public void completeTheDebtDetails(List<DebtsFields> debitDetails, String totalAmount) {
        this.getDebtsPageHeader().waitForElementIdDisplayed();
        for (int i = 0; i < debitDetails.size(); i++) {
            this.getAddDebt().click();
            if (i == 0) {
                if(debitDetails.get(i).getIsClientLiableForAllPayments()!=null &&
                            !debitDetails.get(i).getIsClientLiableForAllPayments().equalsIgnoreCase("false")) {
                    waitForElementVisibility(getClientLiableForAllDebts().getElement());
                    getClientLiableForAllDebts().click();
                }
                getSubmit().click();
            }
            int actualPostition = i + 1;
            verifyOverLayDisplayed();
            fillCreditorsDetails(debitDetails, i, actualPostition);
            fillDebtTypeDetails(debitDetails, i, actualPostition);
            verifyOverLayDisplayed();
            this.getAmountOwed(actualPostition).enterText(debitDetails.get(i).getAmountOwed());
            verifyOverLayDisplayed();
            this.getLiability(actualPostition).selectFromDropdownByIndex(Integer.parseInt(debitDetails.get(i).getLiability()));
            verifyOverLayDisplayed();
            if (debitDetails.get(i).getFurtherAction()!=null && !debitDetails.get(i).getFurtherAction().isEmpty()&& (debitDetails.get(i).getFurtherAction().equalsIgnoreCase("Yes")||debitDetails.get(i).getFurtherAction().equalsIgnoreCase("No")))
                getArrearsFurtherActions(actualPostition, debitDetails.get(i).getFurtherAction()).click();
            verifyOverLayDisplayed();
            getDetailedView(actualPostition).click();
            verifyOverLayDisplayed();
            if (debitDetails.get(i).getAreYouBehindWithPayments()!=null && !debitDetails.get(i).getAreYouBehindWithPayments().isEmpty()&&!(debitDetails.get(i).getAreYouBehindWithPayments().equalsIgnoreCase("false")))
            getAreYouBeHindWithPayments(actualPostition, debitDetails.get(i).getAreYouBehindWithPayments()).click();
            verifyOverLayDisplayed();
            if (debitDetails.get(i).getFurtherAction()!=null && !debitDetails.get(i).getFurtherAction().isEmpty()&&!(debitDetails.get(i).getFurtherActionType().equalsIgnoreCase("false")))
                getFurtherActionType(actualPostition, debitDetails.get(i).getFurtherActionType()).click();
            verifyOverLayDisplayed();
            debtDetails(debitDetails, i, actualPostition);
            verifyOverLayDisplayed();
            getDetailedView(actualPostition).click();
        }
        String result = getTotalDebts().getDivText().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result);
        assert result.contains(totalAmount);
        getAllOfClientsDFebtsHaveBeenCaptured().click();

    }

    public void navigatedBackAndCompleteTheDebtDetails(List<DebtsFields> debitDetails, String totalAmount, int recurrence) {
        switchToActiveFrame();
        this.getDebtsPageHeader().waitForElementIdDisplayed();
        for (int i = 0; i < debitDetails.size() ; i++) {

            this.getAddDebt().click();
            int actualPostition = i + recurrence+1;
            verifyOverLayDisplayed();
            fillCreditorsDetails(debitDetails, i, actualPostition);
            fillDebtTypeDetails(debitDetails, i, actualPostition);
            verifyOverLayDisplayed();
            this.getAmountOwed(actualPostition).enterText(debitDetails.get(i).getAmountOwed());
            verifyOverLayDisplayed();
            this.getLiability(actualPostition).selectFromDropdownByIndex(Integer.parseInt(debitDetails.get(i).getLiability()));
            verifyOverLayDisplayed();
            getDetailedView(actualPostition).click();
            verifyOverLayDisplayed();
            if (debitDetails.get(i).getFurtherAction()!=null && !debitDetails.get(i).getFurtherAction().isEmpty()&&(debitDetails.get(i).getFurtherAction().equalsIgnoreCase("Yes")||debitDetails.get(i).getFurtherAction().equalsIgnoreCase("No"))) {
                getArrearsFurtherActions(actualPostition, debitDetails.get(i).getFurtherAction()).click();
                verifyOverLayDisplayed();
                getAreYouBeHindWithPayments(actualPostition, debitDetails.get(i).getAreYouBehindWithPayments()).click();
            }
            verifyOverLayDisplayed();
            debtDetails(debitDetails, i, actualPostition);
            verifyOverLayDisplayed();
            if (debitDetails.get(i).getFurtherActionType()!=null && !debitDetails.get(i).getFurtherActionType().isEmpty()&&(!(debitDetails.get(i).getFurtherActionType().equalsIgnoreCase("false"))))
                getFurtherActionType(actualPostition, debitDetails.get(i).getFurtherActionType()).click();
            verifyOverLayDisplayed();
            getDetailedView(actualPostition).click();
        }
        String result = getTotalDebts().getDivText().replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(result);
        assert result.contains(totalAmount);
        getAllOfClientsDFebtsHaveBeenCaptured().click();

    }

    protected synchronized void waitForElementVisibility(WebElement element){
        Wait<WebDriver> wait = null;
        try {
            System.out.println("Waiting started :: "+System.currentTimeMillis());
            wait = new FluentWait<WebDriver>((WebDriver) getDriver()).withTimeout(0, TimeUnit.MILLISECONDS).pollingEvery(1,
                    TimeUnit.SECONDS);
            wait.until(ExpectedConditions.visibilityOf(element));
            System.out.println("Waiting Ended :: "+System.currentTimeMillis());
        }catch(Exception e) {
        }

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
            if(debitDetails.get(i).getIsthedebtsubjecttoaguarantor()!=null && !debitDetails.get(i).getIsthedebtsubjecttoaguarantor().equalsIgnoreCase("false"))
            this.getIsTheDebtSubjectToAGuarantor(actualPostition, debitDetails.get(i).getIsthedebtsubjecttoaguarantor()).click();

        }
    }
    private void fillMobilePayment(List<DebtsFields> debitDetails, int i, int actualPostition) {
        this.getOngoingMobileService(actualPostition,debitDetails.get(i).getOngoingMobileService()).click();
    }


    private void fillElectricityArrears(List<DebtsFields> debitDetails, int i, int actualPostition) {
        this.getOngoingMobileService(actualPostition,debitDetails.get(i).getOngoingMobileService()).click();
    }

    private void fillCounsilTaxArrears(List<DebtsFields> debitDetails, int i, int actualPostition) {
        this.getIsRelateToCurrentYear(actualPostition,debitDetails.get(i).getIsCurrentYearArrear()).click();
        this.getArrangementRepayInsurance(actualPostition,debitDetails.get(i).getArrangementRepayInsurance()).click();
    }

    private void fillCourtActionDetails(List<DebtsFields> debitDetails, int i, int actualPostition) {
        if(debitDetails.get(i).getFurtherActionType().equalsIgnoreCase("Court action")) {
            this.getCourtActionType(actualPostition,debitDetails.get(i).getTypeOfAction()).click();
            this.getArrangementRepayInsurance(actualPostition, debitDetails.get(i).getArrangementRepayInsurance()).click();
            if (debitDetails.get(i).getArrangementRepayInsurance().equalsIgnoreCase("yes")) {
                this.getCourtActionPayment(actualPostition).enterText(debitDetails.get(i).getOriginalReGularPayment());
                this.getCourtActionPaymentForEvery(actualPostition).selectFromDropdownByIndex(Integer.valueOf(debitDetails.get(i).getOriginalReGularPaymentForEvery()));
            }
        }
    }
    private void fillInsurancePayment(List<DebtsFields> debitDetails, int i, int actualPostition) {
        this.getArrangementRepayInsurance(actualPostition,debitDetails.get(i).getArrangementRepayInsurance()).click();
        verifyOverLayDisplayed();
        this.getAddLikedItem().click();
        verifyOverLayDisplayed();
       // (new WebDriverWait(getDriver(), 60)).until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@class='chkbxCaptionRight']")));
        new Checkbox(By.xpath("//input[contains(@name,'$ppxResults$l1$ppySelected')][2]")).click();
        getSubmit().click();

    }
    private void fillTheMortagageDetails(List<DebtsFields> debitDetails, int i, int actualPostition) {
        if (debitDetails.get(i).getIsDebtTypeMortagage()!=null && !debitDetails.get(i).getIsDebtTypeMortagage().isEmpty()&&debitDetails.get(i).getIsDebtTypeMortagage().equalsIgnoreCase("true")) {
            verifyOverLayDisplayed();
            this.getHaveYouRepaidAnyArrearsInTheLast12Months(actualPostition, debitDetails.get(i).getHaveYouRepaidAnyArrearsInTheLast12Months()).click();
            verifyOverLayDisplayed();
            this.getWhatTypeOfMortgageIsIt(actualPostition).selectFromDropdownByIndex(Integer.parseInt(debitDetails.get(i).getWhatTypeOfMortgageIsIt()));
            verifyOverLayDisplayed();
            this.getIsItOnaStandardVariableRate(actualPostition, debitDetails.get(i).getIsItOnaStandardVariableRate()).click();
            verifyOverLayDisplayed();
            this.getAddLikedItem().click();
            verifyOverLayDisplayed();
            try {
                (new WebDriverWait(getDriver(), 10)).until(ExpectedConditions.elementToBeClickable(this.getMortagagePaymentFrequency(actualPostition).getSelector()));
            }catch (Exception e){}
            this.getMortagagePaymentAmount(1).enterText(debitDetails.get(i).getMortagagePaymentAmount());
            verifyOverLayDisplayed();
            this.getMortagagePaymentFrequency(1).selectFromDropdownByIndex(Integer.parseInt(debitDetails.get(i).getMortagagePaymentFrequency()));
            verifyOverLayDisplayed();
            if(debitDetails.get(i).getOwnerOfPayment()!=null && Integer.valueOf(debitDetails.get(i).getOwnerOfPayment()).intValue()>0) {
                this.getPaymentOwner().scrollElementIntoView();
                this.getPaymentOwner().selectFromDropdownByIndex(Integer.valueOf(debitDetails.get(i).getOwnerOfPayment()).intValue());
            }
            this.getAddMortagagePayment().click();
            verifyOverLayDisplayed();
            // Remove Assets Button
            if(debitDetails.get(i).isLinkMainHome()!=null && !debitDetails.get(i).getLinkAssets().isEmpty()&&debitDetails.get(i).isLinkMainHome().equalsIgnoreCase("true"))
            {
                this.getIsMainHome().click();
            }
            if(debitDetails.get(i).getLinkAssets()!=null && !debitDetails.get(i).getLinkAssets().isEmpty()&&debitDetails.get(i).getLinkAssets().equalsIgnoreCase("true"))
            {
                this.getAddAssets().click();
                this.getAssetAmount().enterText(debitDetails.get(i).getAssetWorth());
                this.getAssetOwner().selectFromDropdownByIndex(Integer.parseInt(debitDetails.get(i).getOwnerOfTheAsset()));
                this.getSaveAsset().click();
            }
            else if(debitDetails.get(i).getLinkAssets()!=null && !debitDetails.get(i).getLinkAssets().isEmpty()&& debitDetails.get(i).getLinkAssets().equalsIgnoreCase("false") && debitDetails.get(i).getOwnerOfPayment()!=null && Integer.valueOf(debitDetails.get(i).getOwnerOfPayment()).intValue()==0){
                this.getAssetsRemoveButton().click();
            }
            verifyOverLayDisplayed();
            getSaveMortagageButton().click();
        }
    }

    private void fillDebtTypeDetails(List<DebtsFields> debitDetails, int i, int actualPostition) {
        this.getDebttype(actualPostition).enterTextThenSelectFromAutoComplete(debitDetails.get(i).getDebttype());
        verifyOverLayDisplayed();
//        this.getDebttype(actualPostition).downArrow();
        this.getDebttype(actualPostition).enter();
        this.getDebttype(actualPostition).tab();
        this.getAmountOwed(actualPostition).clear();
        (new WebDriverWait(this.getDriver(), 60)).until(ExpectedConditions.elementToBeClickable(this.getCreditor(actualPostition).getSelector()));
    }

    private void fillCreditorsDetails(List<DebtsFields> debitDetails, int i, int actualPostition) {
        this.getCreditor(actualPostition).enterTextThenSelectFromAutoComplete(debitDetails.get(i).getCreditor());
        verifyOverLayDisplayed();
        this.getCreditor(actualPostition).downArrow();
        this.getCreditor(actualPostition).enter();
        this.getCreditor(actualPostition).tab();
    }


    public void debtDetails(List<DebtsFields> debitDetails, int i, int actualPostition) {

        switch (debitDetails.get(i).getDebttype()) {
            case "Mortgage":
                fillTheMortagageDetails(debitDetails, i, actualPostition);
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
            case "Credit card":
                fillCourtActionDetails(debitDetails, i, actualPostition);
                break;
            case "Electricity arrears":
                fillElectricityArrears(debitDetails, i, actualPostition);
                break;
            case "Council tax arrears":
                fillCounsilTaxArrears(debitDetails, i, actualPostition);
                break;
        }
    }


    public Checkbox getSelectMotagagedAsset() {
        return new Checkbox(By.xpath("//input[@class='checkbox chkBxCtl ']"));
    }
}
