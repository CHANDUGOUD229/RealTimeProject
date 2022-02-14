package com.stepChangeRem.remediation.test.StepDefinition.CSR;

import com.stepChangeRem.remediation.pages.helper.EstablishClientNeedsHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

import java.util.List;
import java.util.Map;

public class ClientNeedsStepDef {
    EstablishClientNeedsHelper establishClientNeedsHelper;
    public ClientNeedsStepDef()
    {
        establishClientNeedsHelper=new EstablishClientNeedsHelper();
    }
    @And("In the Establish Client Needs page capture the details from datatable for Financial Difficulety \"([^\"]*)\"$")
    public void inTheEstablishClientNeedsPageCaptureTheDetailsFromDatatableForFinancialDifficulety(String financialDifficulty, DataTable clientNeeds)
    {
        List<Map<String, String>> clientNeedsList = clientNeeds.asMaps(String.class, String.class);
        establishClientNeedsHelper.filleClientDetails(clientNeedsList);
    }

}
