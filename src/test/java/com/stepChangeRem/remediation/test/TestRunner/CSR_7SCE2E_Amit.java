//public class CSR_7SCE2E_Amit
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
        features = "src/test/resources/FeatureFile",
        glue = {"com.stepChangeRem.remediation.test.StepDefinition.CSR"},


        tags= "@CSR_Batch40/41"
)
public class CSR_7SCE2E_Amit{
    @AfterClass
    public static void setup()
    {
//        LogWriter writer = new LogWriter();
//        Reporter.loadXMLConfig(new File("src/main/resources/extent-config.xml"));
//        //Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
//        Reporter.setSystemInfo("Application Name", "Test App ");
//        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
//        Reporter.setSystemInfo("Environment", "Production");
          Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
    }

}