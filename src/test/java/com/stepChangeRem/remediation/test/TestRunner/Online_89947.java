package com.stepChangeRem.remediation.test.TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
			plugin = { "pretty", "html:target/cucumber-reports/CucumberhmtlReport",
					},
			monochrome = true,
			features = "src/test/resources/FeatureFile/89947_Online_Joint_Registration_via_advisor_DPP.feature",
			glue = {"com.stepChangeRem.remediation.test.StepDefinition.Online"},

			tags="@89947"

			)

	public class Online_89947{
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

