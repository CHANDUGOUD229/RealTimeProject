package com.stepChangeRem.remediation.test.StepDefinition.Online;

import com.stepChangeRem.remediation.pages.helper.YourSpendingHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDashBoardHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineDebtHelper;
import com.stepChangeRem.remediation.pages.helper.online.OnlineIncomeHelper;
import com.stepChangeRem.remediation.pages.helper.vo.SpendingsFields;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

import java.util.List;

public class OnineFixedSpedingStepdefs {
    OnlineIncomeHelper helper=new OnlineIncomeHelper();
    OnlineDashBoardHelper houseHolds=new OnlineDashBoardHelper();
    YourSpendingHelper spendingHelper=new YourSpendingHelper();
    OnlineDebtHelper debtHelper=new OnlineDebtHelper();
    @And("Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as \"([^\"]*)\"$")
    public void navigateToTheOnlineSpendingsFixedPageAndEnterTheDataAsBelowAssertTotalIncomeAs(String spendings, DataTable spendingsDetails) {
        houseHolds.getCreateYourSpending().click();
        List<SpendingsFields> spendingsFields = spendingsDetails.asList(SpendingsFields.class);
        helper.fillTheSpendingDetails(spendingsFields);
    }

    @And("User Continues After Checks Item Type Not Applicable \"([^\"]*)\"$")
    public void userChecksItemTypeNotApplicable(String itemType) {
        spendingHelper.checkItemsNotApplicable(itemType);
        debtHelper.getContinueButton().click();
    }
}
