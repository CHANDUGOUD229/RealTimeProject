package com.stepChangeRem.remediation.test.StepDefinition.Online;

import com.stepChangeRem.remediation.pages.helper.online.OnlineDashBoardHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDebtHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineIncomeHelper;
import com.stepChangeRem.remediation.pages.helper.vo.DebtsFields;
import com.stepChangeRem.remediation.pages.helper.vo.QuestionsFields;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

import java.util.List;

public class OnlineDebtsStepdefs {
    OnlineDebtHelper helper=new OnlineDebtHelper();
    OnlineIncomeHelper onlineIncomeHelper=new OnlineIncomeHelper();
    OnlineDashBoardHelper houseHolds=new OnlineDashBoardHelper();
    @Then("User fills the Debt Details Online for Client and assert Total Amount \"([^\"]*)\"$")
    public void userFillsTheDebtDetailsOnlineForClientAndAssertTotalAmount(String total, DataTable values) {
        houseHolds.getYourDebts().click();
        List<DebtsFields> debtsFields = values.asList(DebtsFields.class);
        helper.completeOnlinedebtDetails(debtsFields,total);

    }

    @And("User Clicks On Continue Button and Marks the Debt completion as \"([^\"]*)\"$")
    public void userClicksOnContinueButtonAndMarksTheDebtCompletionAs(String debtsReason) {
        onlineIncomeHelper.getPageHeader().waitForElementIdDisplayed();
        helper.getContinueButton().click();
        helper.getFinishedDebts(debtsReason).click();
        helper.getConfirmFinishedDebts().click();

    }

    @And("User Navigates Create Your Budget and clicks on Continue button")
    public void userNavigatesCreateYourBudgetAndClicksOnContinueButton() {
        houseHolds.getCreateYourBudget().click();
        helper.getContinueButton().click();
    }

    @Then("User fills the Debt Details Online for Client and assert Total Amount \"([^\"]*)\" After Navigating back completing (\\d+)$")
    public void userFillsTheDebtDetailsOnlineForClientAndAssertTotalAmountAfterNavigatingBackCompleting(String totalAmount, int previousExecutions,DataTable values) {
        houseHolds.getYourDebts().click();
        List<DebtsFields> debtsFields = values.asList(DebtsFields.class);
        helper.completeOnlinedebtDetailsAfterNavigatingBack(debtsFields,totalAmount,previousExecutions);
    }

    @Then("User Will be Navigated to Questions and Answer the questions as below")
    public void userWillBeNavigatedToQuestionsAndAnswerTheQuestionsAsBelow(DataTable questions) {
        List<QuestionsFields> questionsFields = questions.asList(QuestionsFields.class);
        helper.fillTheGlobalQuestions(questionsFields);
    }
}
