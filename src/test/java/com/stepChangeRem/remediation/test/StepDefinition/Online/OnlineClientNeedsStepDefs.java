package com.stepChangeRem.remediation.test.StepDefinition.Online;

import com.stepChangeRem.remediation.pages.helper.online.OnlineClientDetailsHelper;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;

import java.util.List;
import java.util.Map;

public class OnlineClientNeedsStepDefs {
    OnlineClientDetailsHelper clientDetailsHelper=new OnlineClientDetailsHelper();
    public void OnlineClientNeedsStepDefs()
    {

    }
    @And("In the Establish Client Needs page capture the details for Online")
    public void inTheEstablishClientNeedsPageCaptureTheDetailsForOnline(DataTable clientNeeds) {
        List<Map<String, String>> clientNeedsList = clientNeeds.asMaps(String.class, String.class);
        clientDetailsHelper.filleClientDetails(clientNeedsList);
    }
}
