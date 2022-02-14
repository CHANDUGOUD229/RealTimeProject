package com.stepChangeRem.remediation.test.StepDefinition.Online;

import com.stepChangeRem.remediation.pages.helper.online.OnlineAdviceOnYourBudgetPage;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDashBoardHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDebtHelper;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class OnlineDahsBoardStepdefs {
    OnlineDashBoardHelper houseHolds=new OnlineDashBoardHelper();
    OnlineDebtHelper helper=new OnlineDebtHelper();
    OnlineAdviceOnYourBudgetPage adviceOnYourBudgetPage=new OnlineAdviceOnYourBudgetPage();
    @Then("^User Navigates to Advice on Your Budget$")
    public void userNavigatesToAdviceOnYourBudget() {
        houseHolds.getAdviceOnBudget().click();
        adviceOnYourBudgetPage.getRuSatisified().click();
        helper.getContinueButton().click();
        helper.getContinueButton().click();
        helper.getContinueButton().click();

    }

    @And("^User Navigated to Final Questions$")
    public void userNavigatedToFinalQuestions() {
        houseHolds.getFinalQuestion().click();
    }

    @And("^User Navigated to Final Questions and Continues$")
    public void userNavigatedToFinalQuestionsAndContinues() {
        houseHolds.getFinalQuestion().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
    }

    @Then("^User Navigates to Priority Payments and Continues$")
    public void userNavigatesToPriorityPaymentsAndContinues() {
        houseHolds.getPriorutyPayments().click();
        helper.getContinueButton().click();
    }

    @Then("^User Navigates to Review Your Options and Continues$")
    public void userNavigatesToReviewYourOptionsAndContinues() {
        houseHolds.getReviewOptions().click();
        helper.getContinueButton().click();
        houseHolds.getFinOutMore().click();
        houseHolds.getReturnToSolution().click();
        houseHolds.getSolution().click();
        helper.getContinueButton().click();
    }

    @And("^User Navigated to Final Questions and Continues and Answer No For all Question$")
    public void userNavigatedToFinalQuestionsAndContinuesAndAnswerNoForAllQuestion() {
        houseHolds.getFinalQuestion().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
    }

    @Then("^User Navigates to Priority Payments and Continues and Select No Savings$")
    public void userNavigatesToPriorityPaymentsAndContinuesAndSelectNoSavings() {
        houseHolds.getPriorutyPayments().click();
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
    }

    @And("Close the Session")
    public void closeTheSession() {
        houseHolds.getCloseTheSession().click();
    }

    @And("^User Navigated to Final Questions and Continues Without changing the assets$")
    public void userNavigatedToFinalQuestionsAndContinuesWithoutChangingTheAssets() {
        houseHolds.getFinalQuestion().click();
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
    }

    @Then("User Agrees to repay arrears on Priority Payments and Continues")
    public void userAgreesToRepayArrearsOnPriorityPaymentsAndContinues() {
        houseHolds.getRepayArrears().click();
        helper.getContinueButton().click();
    }
    @And("User Answers Final Questions and Continues")
    public void userAnswersFinalQuestionsAndContinues() {
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
    }
    @And("^User Navigated to Registration from Final Questions$")
    public void userNavigatedToRegistrationFromFinalQuestions() {
        houseHolds.getRegisterToSaveProgress().click();
    }
}
