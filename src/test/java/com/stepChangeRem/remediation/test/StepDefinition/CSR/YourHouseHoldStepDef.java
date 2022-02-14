package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import com.stepChangeRem.remediation.pages.YourDashBoardPage;
import com.stepChangeRem.remediation.pages.helper.HouseHoldsFileds;
import com.stepChangeRem.remediation.pages.helper.YourHouseHoldHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

import java.util.List;

public class YourHouseHoldStepDef {
    YourDashBoardPage yourDashBordPageObj;
    YourHouseHoldHelper yourHouseHoldHelper;
    public YourHouseHoldStepDef()
    {
        yourHouseHoldHelper=new YourHouseHoldHelper();
        yourDashBordPageObj=new YourDashBoardPage();
    }

    @And("User Navigates to Your Household Page And Fill The below Data and Continues to Debts Page")
    public void userNavigatesToYourHouseholdPageAndFillTheBelowDataAndContinuesToDebtsPage(DataTable houseHoldDetails) {
        yourDashBordPageObj.ClickOnYourHouseHoldButton();
        List<HouseHoldsFileds> houseHoldsFileds = houseHoldDetails.asList(HouseHoldsFileds.class);
        yourHouseHoldHelper.fillHouseHoldDetails(houseHoldsFileds);
    }
}
