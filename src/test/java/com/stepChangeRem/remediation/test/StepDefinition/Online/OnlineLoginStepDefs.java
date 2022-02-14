package com.stepChangeRem.remediation.test.StepDefinition.Online;

import com.stepChangeRem.remediation.pages.helper.online.OnlineHomePage;
import com.stepchange.atf.tests.CucumberGenericTest;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class OnlineLoginStepDefs extends CucumberGenericTest {
    OnlineHomePage onlineHomePage;
    public OnlineLoginStepDefs()
    {onlineHomePage=new OnlineHomePage();}
    @Before
    public void initializeCucumberTest(Scenario scenario) {
        initialise(scenario.getName().replace("/", "or"));
        String URL= getBrowser().getBrowserProperties().getOnlineEnvironmentUrl();
        System.out.println("URL: "+URL);
        getDriver().get(URL);
        maximiseWindow();
        getBrowser().sleep(3000);
    }

    @Given("User is in login page for Online")
    public void userIsInLoginPageForOnline() {
        onlineHomePage.clickOnClickMe();

    }
}
