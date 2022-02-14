package com.stepChangeRem.remediation.test.StepDefinition.Online;

import com.stepChangeRem.remediation.pages.helper.HouseHoldsFileds;
import com.stepChangeRem.remediation.pages.helper.YourHouseHoldHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDashBoardHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

import java.util.List;

public class OnlineHouseHoldsStepdefs {
    OnlineDashBoardHelper houseHolds=new OnlineDashBoardHelper();
    YourHouseHoldHelper yourHouseHoldHelper=new YourHouseHoldHelper();
    @And("User Clicks On HouseHolds And Fills the Details as below")
    public void userClicksOnHouseHoldsAndFillsTheDetailsAsBelow(DataTable houseHoldDetails) {
        houseHolds.getHouseHold().click();
        List<HouseHoldsFileds> houseHoldsFileds = houseHoldDetails.asList(HouseHoldsFileds.class);
        yourHouseHoldHelper.fillHouseHoldDetails(houseHoldsFileds);
    }
}
