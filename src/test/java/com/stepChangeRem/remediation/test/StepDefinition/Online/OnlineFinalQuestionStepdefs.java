package com.stepChangeRem.remediation.test.StepDefinition.Online;

import com.stepChangeRem.remediation.pages.helper.online.OnlineAdviceOnYourBudgetPage;
import com.stepChangeRem.remediation.pages.helper.online.OnlineAssetsPage;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDashBoardHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDebtHelper;
import com.stepChangeRem.remediation.pages.helper.vo.OnlineFinalQuestionsFields;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class OnlineFinalQuestionStepdefs {
    OnlineDashBoardHelper houseHolds=new OnlineDashBoardHelper();
    OnlineDebtHelper helper=new OnlineDebtHelper();
    OnlineAssetsPage assets=new OnlineAssetsPage();
    OnlineAdviceOnYourBudgetPage adviceOnYourBudgetPage=new OnlineAdviceOnYourBudgetPage();

    @Then("^User Navigates to Advice on Your Budget and Complete Cutbacks$")
    public void userNavigatesToAdviceOnYourBudgetAndCompleteCutbacks(DataTable values) {
        houseHolds.getAdviceOnBudget().click();
        adviceOnYourBudgetPage.getRuSatisified().click();
        helper.getContinueButton().click();
        assets.fillCutBackAmount(values.asList(OnlineFinalQuestionsFields.class));
        helper.getContinueButton().click();
        helper.getContinueButton().click();
    }
    @Then("^User Navigates to Advice on Your Budget and Complete Cutbacks and provide reason as below$")
    public void userNavigatesToAdviceOnYourBudgetAndCompleteCutbacksAndProvideReasonAsBelow(DataTable values) {
        houseHolds.getAdviceOnBudget().click();
        adviceOnYourBudgetPage.getRuSatisified().click();
        helper.getContinueButton().click();
        assets.fillCutBackAmount(values.asList(OnlineFinalQuestionsFields.class));
        helper.getContinueButton().click();
        helper.getContinueButton().click();
        helper.getContinueButton().click();
    }

    @And("User Navigated to Final Questions and Continues and Fill Mortgage Details")
    public void userNavigatedToFinalQuestionsAndContinuesAndFillMortgageDetails(DataTable values) {
        houseHolds.getFinalQuestion().click();
        assets.fillAssetsFormFinalQuestionsPage(values.asList(OnlineFinalQuestionsFields.class));
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
    }

    @And("User Navigated to Final Questions and Continues and Fill Assets")
    public void userNavigatedToFinalQuestionsAndContinuesAndFillAssets(DataTable values) {
        houseHolds.getFinalQuestion().click();
        assets.addAssetsToAssetPage(values.asList(OnlineFinalQuestionsFields.class));
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
        houseHolds.clickOnNoButtons();
        helper.getContinueButton().click();
    }
}
