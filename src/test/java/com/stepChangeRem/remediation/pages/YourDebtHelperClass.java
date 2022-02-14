package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.*;
import com.stepchange.atf.data.DebtDataObjects;
import com.stepchange.atf.testdata.DebtTestData;
import cucumber.api.java.en.But;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class YourDebtHelperClass extends YourDebtsPage {
    DebtDataObjects firstDebtTestData;
    DebtDataObjects secondDebtTestData;
    DebtDataObjects thirdDebtTestData;
    DebtDataObjects fourthDebtTestData;

    private Div totalDebts;
    private Button debtGlobalQuestionsSubmitButton;
    public Button globleQuestionTitle;
    private Button continueButton;

    public Div getTotalDebts() {
        return totalDebts;
    }

    public Button getDebtGlobalQuestionsSubmitButton() {
        return debtGlobalQuestionsSubmitButton;
    }
    public Button getGlobleQuestionTitle(){return globleQuestionTitle;}

    public YourDebtHelperClass() {
        totalDebts = new Div(By.xpath("//*[contains(text(),'Total amount owed')]/following::div[1]"));
        debtGlobalQuestionsSubmitButton = new Button(By.xpath("//*[@name='Modal_Buttons_pyWorkPage_13']"));
        globleQuestionTitle= new Button(By.xpath("//span[text()='        Global questions about their debts       ']"));


    }



    public void EnterDataForCoupleOfDebtsForAllFeatures(String Scenario) {

        switch (Scenario) {
            case "89936":
                firstDebtTestData = DebtTestData.getFirstDebtTestData89936();
                 secondDebtTestData = DebtTestData.getSecondDebtTestData89936();
                break;
            case "89933":
                firstDebtTestData = DebtTestData.getFirstDebtTestData89933();
                secondDebtTestData = DebtTestData.getSecondDebtTestData89933();
                break;
        }
        switch (Scenario) {
            case "89936":
             case "89933":
            switchToActiveFrame();
            GenericMethod_cvp.implicitWait(2000);
            this.getAddaDebtButton().click();
            this.getAreTheyLiableQuestionNoButtonInGlobalQuestionsAlert().click();
            this.getSubmitButtonInGlobalQuestionsAlert().click();
            getBrowser().scrollUp();
            GenericMethod_cvp.implicitWait(10000);
            this.getCreditorFromutoComplete().enterTextThenSelectFromAutoComplete(firstDebtTestData.getCreditor());
            getBrowser().sleep(getBrowser().getTimeout()/5);
            this.getCreditorFromutoComplete().downArrow();
            this.getCreditorFromutoComplete().enter();

            this.getCreditorFromutoComplete().tab();
            this.getCreditorFromutoComplete().tab();
            this.getCreditorFromutoComplete().tab();
            GenericMethod_cvp.implicitWait(10000);
            GenericMethod_cvp.implicitWait(10000);
            this.getDebtTypFromAutoComplete().clickScreenElement(this.getDebtTypFromAutoComplete().getElement());
            this.getDebtTypFromAutoComplete().enterTextThenSelectFromAutoComplete(firstDebtTestData.getDebtType());
            GenericMethod_cvp.implicitWait(10000);


            this.getDebtTypFromAutoComplete().enter();
            this.getDebtTypFromAutoComplete().tab();
            (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getLiabilityutoComplete().getSelector()));
            this.getAmountOwedTextField().clickScreenElement(this.getAmountOwedTextField().getElement());
            this.getAmountOwedTextField().enterText(firstDebtTestData.getAmountOwed());
            this.getAmountOwedTextField().enter();
            this.getAmountOwedTextField().tab();
            GenericMethod_cvp.implicitWait(6000);
            this.getLiabilityutoComplete().selectFromDropdown(firstDebtTestData.getLiability());
            this.getArrearsOrFurtherActionNoButton().click();
            if(Scenario.equals("89933")){
                this.getDetailedViewLink().click();
                getBrowser().sleep(getBrowser().getTimeout()/10);
                this.getOriginalRegularpaymentTextBox().enterTextField("200");
                this.getOriginalRegularpaymentTextBox().enter();
                this.getOriginalRegularpaymentTextBox().tab();
                (new WebDriverWait(getDriver(),30)).until(ExpectedConditions.elementToBeClickable(getOriginalRegularpaymentTimeSelectionDropdown().getSelector()));
                GenericMethod_cvp.implicitWait(20000);
                this.getOriginalRegularpaymentTimeSelectionDropdown().selectFromDropdownByIndex(4);
                GenericMethod_cvp.implicitWait(6000);
                this.getIstheDebtSubjectToAGuarantorNoButton().click();
                this.getDetailedViewLink().click();
             }
            GenericMethod_cvp.implicitWait(2000);
            this.getAddaDebtButton().click();
            this.getCreditor(2).enterTextThenSelectFromAutoComplete(secondDebtTestData.getCreditor());
            GenericMethod_cvp.implicitWait(10000);
            this.getCreditor(2).enter();
            this.getCreditor(2).tab();
            GenericMethod_cvp.implicitWait(10000);
            GenericMethod_cvp.implicitWait(10000);
            this.getDebtType(2).enterTextThenSelectFromAutoComplete(secondDebtTestData.getDebtType());
            GenericMethod_cvp.implicitWait(10000);
            this.getDebtType(2).enter();
            this.getDebtType(2).tab();
            (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getAmountOwed(2).getSelector()));
            //this.getAmountOwed(2).clickScreenElement(this.getAmountOwed(2).getElement());
            this.getAmountOwed(2).clickScreenElement(getAmountOwed(2));
            getBrowser().sleep(2000);
            this.getAmountOwed(2).enterCharByChar(secondDebtTestData.getAmountOwed());
            this.getAmountOwed(2).downArrow();
            this.getAmountOwed(2).enter();
            this.getAmountOwed(2).tab();
            GenericMethod_cvp.implicitWait(6000);
            //this.getLiability(2).clickScreenElement(this.getLiability(2).getElement());
            this.getLiability(2).selectFromDropdownByIndex(1);
            GenericMethod_cvp.implicitWait(6000);
            if(Scenario.equals("899333")){
                getBrowser().sleep(getBrowser().getTimeout()/10);
                this.getDetailedViewLink().click();
                this.getRepaidArrearsNoButton().click();
                getBrowser().sleep(getBrowser().getTimeout()/10);
                this.SelectMortgageTypeFromDropDown("Repayment");
                this.ClickIsSVRNoButton();
                this.getAddLinkedItem().click();
                (new WebDriverWait(getDriver(),30)).until(ExpectedConditions.elementToBeClickable(getFrequencyDropDown().getSelector()));
                this.getMortgagePaymentAmountTextBox().enterTextField("466.88");
                this.getFrequencyDropDown().selectFromDropdownByIndex(4);
                this.getOwnerDropdown().selectFromDropdownByIndex(3);
                this.getMainHomeCheckbox().click();
                this.getLinkedPopupAddButton().click();
                this.getDetailedViewLink(2).click();
                getBrowser().sleep(getBrowser().getTimeout()/10);

            }else {
                this.getArrearsOrFurtherActionAsYes(2).waitForElementToBeClickable();
                this.getArrearsOrFurtherActionAsYes(2).click();
                GenericMethod_cvp.implicitWait(6000);
                (new WebDriverWait(getDriver(), 30)).until(ExpectedConditions.elementToBeClickable(getDetailedViewLink(2).getSelector()));
                this.getDetailedViewLink(2).click();
                GenericMethod_cvp.implicitWait(6000);
                this.getFurtherAction1().click();
                GenericMethod_cvp.implicitWait(6000);
                this.getDetailedViewLink(2).click();


            }
        }
        this.getAllofClientsDebtshavebeencapturedCheckBox().click();
    }




        public void addThirdAndFourthDebt(String Scenario) {
            switch (Scenario) {
                case "89936":
                    thirdDebtTestData = DebtTestData.getThirdDebtTestData89936();
                    fourthDebtTestData = DebtTestData.getFourthDebtTestData89936();
                    break;
            }
            switch (Scenario) {
                case "89936":
                    GenericMethod_cvp.implicitWait(6000);
                    this.getAddaDebtButton().click();
                    GenericMethod_cvp.implicitWait(6000);
                    this.getCreditor(3).enterTextThenSelectFromAutoComplete(thirdDebtTestData.getCreditor());
                    GenericMethod_cvp.implicitWait(10000);
                    this.getCreditor(3).enter();
                    this.getCreditor(3).tab();
                    this.getCreditor(3).tab();
                    GenericMethod_cvp.implicitWait(10000);
                    GenericMethod_cvp.implicitWait(10000);
                    this.getDebtType(3).enterTextThenSelectFromAutoComplete(thirdDebtTestData.getDebtType());
                    this.getDebtType(3).downArrow();
                    this.getDebtType(3).enter();
                    this.getDebtType(3).tab();
                    this.getDebtType(3).tab();
                    this.getDebtType(3).tab();
                   GenericMethod_cvp.implicitWait(10000);
                    getBrowser().sleep(1000);
                    this.getDebtType(3).enterTextThenSelectFromAutoComplete(thirdDebtTestData.getDebtType());
                    getDriver().findElement(By.xpath("//*[@id='acresults_list']/ul/li/span/span")).click();
                    this.getDebtType(3).enter();
                    this.getDebtType(3).tab();
                    this.getDebtType(3).tab();
                    this.getDebtType(3).tab();
                    this.getDebtType(3).tab();
                    GenericMethod_cvp.implicitWait(6000);
                    GenericMethod_cvp.implicitWait(6000);
                    (new WebDriverWait(getDriver(),30)).until(ExpectedConditions.elementToBeClickable(getLiability(3).getSelector()));
                    this.getLiability(3).clickScreenElement(this.getLiability(3).getElement());
                    this.getLiability(3).selectFromDropdownByIndex(1);
                    GenericMethod_cvp.implicitWait(6000);
                    GenericMethod_cvp.implicitWait(6000);
                    this.getArrearsOrFurtherActionAsNo(3).waitForElementToBeClickable();
                    this.getArrearsOrFurtherActionAsNo(3).click();
                    (new WebDriverWait(getDriver(),30)).until(ExpectedConditions.elementToBeClickable(getAmountOwed(3).getSelector()));
                    this.getAmountOwed(3).clickScreenElement(this.getAmountOwed(3).getElement());
                    this.getAmountOwed(3).enterCharByChar(thirdDebtTestData.getAmountOwed());
                    this.getAmountOwed(3).enter();
                    this.getAmountOwed(3).tab();
                    GenericMethod_cvp.implicitWait(6000);

                    GenericMethod_cvp.implicitWait(6000);
                    this.getAddaDebtButton().click();

                    //fourth Debt
                    this.getCreditor(4).enterTextThenSelectFromAutoComplete(fourthDebtTestData.getCreditor());
                    GenericMethod_cvp.implicitWait(10000);
                    this.getCreditor(4).enter();
                    this.getCreditor(4).tab();
                    GenericMethod_cvp.implicitWait(10000);
                    GenericMethod_cvp.implicitWait(10000);
                    this.getDebtType(4).enterTextThenSelectFromAutoComplete(fourthDebtTestData.getDebtType());
                    this.getDebtType(4).downArrow();
                    GenericMethod_cvp.implicitWait(10000);
                    this.getDebtType(4).enter();
                    this.getDebtType(4).tab();

                    GenericMethod_cvp.implicitWait(6000);
                    GenericMethod_cvp.implicitWait(6000);
                    (new WebDriverWait(getDriver(),30)).until(ExpectedConditions.elementToBeClickable(getAmountOwed(4).getSelector()));
                    this.getAmountOwed(4).clickScreenElement(this.getAmountOwed(4).getElement());
                    this.getAmountOwed(4).enterCharByChar(fourthDebtTestData.getAmountOwed());
                    this.getAmountOwed(4).enter();
                    this.getAmountOwed(4).tab();
                    GenericMethod_cvp.implicitWait(6000);
                    this.getLiability(4).clickScreenElement(this.getLiability(4).getElement());
                    this.getLiability(4).selectFromDropdownByIndex(1);
                    this.getArrearsOrFurtherActionAsYes(4).waitForElementToBeClickable();
                    this.getArrearsOrFurtherActionAsYes(4).click();
                    GenericMethod_cvp.implicitWait(6000);
                    this.getDetailedViewLink(4).click();
                    this.getFurtherAction1().click();
                    GenericMethod_cvp.implicitWait(6000);
                    this.getDetailedViewLink(4).click();
                    this.getAllofClientsDebtshavebeencapturedCheckBox().click();
                    break;
            }
        }


    public AutoComplete getCreditor(int index) { return new AutoComplete(By.xpath("//input[contains(@name,'pz$ppxResults$l" + index + "$pCreditor$pDescription')]")); }
    public AutoComplete getDebtType(int index) { return new AutoComplete(By.xpath("//input[contains(@name,'pz$ppxResults$l" + index + "$pDescription')]")); }
    public TextField getAmountOwed(int index) { return new TextField(By.xpath("(//input[@placeholder='£'])["+index+"]")); }
    public Dropdown getLiability(int index) { return new Dropdown(By.xpath("(//option[@value='OWN0001']//parent::select)["+index+"]")); }
    public Button getArrearsOrFurtherActionAsYes(int index) { return new Button(By.xpath("(//*[text()='Yes'])["+index+"]")); }
    public Button getArrearsOrFurtherActionAsNo(int index) { return new Button(By.xpath("(//*[text()='No'])["+index+"]")); }
    public Link getDetailedViewLink(int index) { return new Link(By.xpath("(//a[text()='Detailed view'])["+index+"]")); }

    public void verifyTotalDebts(){
        this.getTotalDebts().getDivText().contains("£18,000.00");


    }

    public void clickYesOrNoForGlobalQuestions(String YesOrNo) {
    getBrowser().sleep(getBrowser().getTimeout());
        switchToActiveFrame();
        if (YesOrNo.equals("No")) {

            List<WebElement> webelement= getDriver().findElements(By.xpath("(//div[contains(text(),'?')]/following::span[2])"));
            for (int i = 1; i <= webelement.size(); i++) {
                try {
                   new Button(By.xpath("(//div[contains(text(),'?')]/following::span[2])[" + i + "]")).click();
                }catch (Exception e){}
            }
        } else {

            for (int i = 0; i <= 4; i++) {
                WebElement element = getDriver().findElement(By.xpath("(//*[text()='Yes'])["+i+"]"));
                ((JavascriptExecutor) this.getDriver()).executeScript("element.focus();", new Object[]{element});
                ((JavascriptExecutor) this.getDriver()).executeScript("arguments[0].scrollIntoView(true);", new Object[]{element});
                element.click();
            }
            getBrowser().sleep(getBrowser().getTimeout());
                this.getSubmitButton().click();
        }

    }

        public void clickGlobalQuestionSubmitButton(){
        getBrowser().sleep(getBrowser().getTimeout()/10);
        this.getGlobleQuestionTitle().click();
        getBrowser().sleep(getBrowser().getTimeout()/10);
        this.getDebtGlobalQuestionsSubmitButton().verifyElementEnabled(true);
        this.getDebtGlobalQuestionsSubmitButton().click();

        }

		public Button ClickDebtButton() {
			 GenericMethod_cvp.implicitWait(6000);
			 return continueButton =new Button(By.xpath("//button[contains(text(),'Continue with debt advice') or @name='BreathingSpaceSignPosting_pyWorkPage_30']"));
		}


}
