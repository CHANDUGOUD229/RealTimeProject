package com.stepChangeRem.remediation.test.TestRunner;

        import com.stepchange.atf.utilities.LogWriter;
        import com.vimalselvam.cucumber.listener.Reporter;
        import cucumber.api.CucumberOptions;
        import cucumber.api.junit.Cucumber;
        import org.junit.AfterClass;
        import org.junit.runner.RunWith;

        import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", "html:target/cucumber-reports/CucumberhmtlReport",
					"junit:target/cucumber-reports/Cucumber.xml",
					"json:target/cucumber-reports/Cucumber.json",
					"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
        },
        monochrome = true,
        features = "src/test/resources/FeatureFile/89937_CSR_Sole_Registration_Payment_Suspension.feature",
        glue = {"com.stepChangeRem.remediation.test.StepDefinition.CSR"},

        tags= "@SC89937"
        //tags="@SoleClientfinancialSolution_89933,@BasicSoleClientAdminOrderRegistration_SC89931,@JointClientReferral_ERR_TPP_Vehicle_SC89939,@JointMPA_NI_LinkingAIP_CalcSavings_SC89941,@JointSeparateSolutionsDRONorthernIreland_SC89949,@SoleClientDRORegistrationMidwayNorthernIreland_SC89921,@SoleClientGroceriesSameFrequenciesDPPScotland_SC89924,@SoleClientMAPVehicles2likelyItems_SC89925,@SoleGroceriesMultipleFrequienciesVisionBulue_SC89934,@SoleClientPaymentSuspension_SC89937,@SoleSoleTPPwriteOffEnglandTerminalIllness_SC89936,@SoleSoleTPPwriteOffEnglandTerminalIllness_SC89936,@JointClient_NonLinearDataCapture_89929,@LinkingDebtsToSpending_SC89930"

        //tags="@Create_Your_Debt_Budget_And_SetUp_Your_Plan,@Create_Your_Debt_Budget_And_SetUp_Your_Plan,@Capture_Your_Debt_Create_Your_Budget_Ineligible,@Capture_Your_Debt_Create_Your_Budget_Ineligible_your_partner,@Capture_Your_Debt_Create_Your_Budget_Ineligible,@Capture_Your_Debt_Create_Your_Budget_Ineligible_your_partner"

)
public class CSR_89937 {
    @AfterClass
    public static void setup()
    {
        LogWriter writer = new LogWriter();
        Reporter.loadXMLConfig(new File("src/main/resources/extent-config.xml"));
        //Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
        Reporter.setSystemInfo("Application Name", "Test App ");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Environment", "Production");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }

}

