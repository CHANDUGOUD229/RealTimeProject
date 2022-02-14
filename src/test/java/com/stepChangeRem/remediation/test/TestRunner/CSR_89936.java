package com.stepChangeRem.remediation.test.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
			plugin = {  "pretty", "html:target/cucumber-reports/CucumberhmtlReport",
					"junit:target/cucumber-reports/Cucumber.xml",
					"json:target/cucumber-reports/Cucumber.json",
					"com.vimalselvam.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"
					},
			monochrome = true,
			features = "src/test/resources/FeatureFile/89936_CSR_Sole_Write_Off_Terminal_Illness_TPP.feature",
			glue = {"com.stepChangeRem.remediation.test.StepDefinition.CSR"},

			tags="@SoleSoleTPPwriteOffEnglandTerminalIllness_SC89936"

			)
	public class CSR_89936 {
		@AfterClass
		public static void setup()
		{
	/*		LogWriter writer = new LogWriter();
		Reporter.loadXMLConfig(new File("src/main/resources/extent-config.xml"));
		Reporter.setSystemInfo("Application Name", "Test App ");
		Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
		Reporter.setSystemInfo("Environment", "Production");
		Reporter.setTestRunnerOutput("Test Execution Cucumber Report");*/
		}
		
		
		
		
	}

