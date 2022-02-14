package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import com.stepChangeRem.remediation.pages.YourDashBoardPage;
import com.stepChangeRem.remediation.pages.helper.YourIncomePageHelper;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class DashBoradStepDef {
    YourDashBoardPage dashBoardPage;
    YourIncomePageHelper helper;
    public DashBoradStepDef()
    {
        helper=new YourIncomePageHelper();
        dashBoardPage=new YourDashBoardPage();
    }
    @And("User Navigates Back")
    public void userNavigatesBack() {
        helper.getBackButton().click();
    }
//
//    @Then("User Clicks On link in Dash Borad and Nvigates to Debts Page")
//    public void userClicksOnLinkInDashBoradAndNvigatesToDebtsPage(String arg0) {
//
//    }

    @Then("User Clicks On Understand your situation link in Dash Borad and Nvigates to Debts Page")
    public void userClicksOnUnderstandYourSituationLinkInDashBoradAndNvigatesToDebtsPage() {

        dashBoardPage.getUndesrStandYourSituation().click();
        dashBoardPage.getYourDebtsLink().click();
    }


    @And("User Clicks On Your Spendings in DashBoard")
    public void userClicksOnYourSpendingsInDashBoard() {
        dashBoardPage.getYourSpendigsLink().click();
    }
}
