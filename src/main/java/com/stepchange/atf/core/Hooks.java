package com.stepchange.atf.core;

import org.openqa.selenium.lift.TestContext;

import com.stepchange.atf.controls.Control;
import com.stepchange.atf.utilities.LogWriter;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.AfterStep;

public class Hooks extends Control {
	/*
	 * TestContext testContext; public Hooks(TestContext context) { testContext
	 * = context; }
	 * 
	 * Reporter.assignAuthor("ToolsQA - Lakshay Sharma"); }
	 */

	/*
	 * @AfterStep public void AfterSteps() {
	 * 
	 * 
	 * 
	 * // }
	 */
	@After
	public void afterScenario(Scenario scenario) {
		if(scenario.isFailed()){
			try{
				LogWriter writer = new LogWriter();
				writer.logScreenshot();
				Reporter.addScenarioLog("failed due to error message");
				
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
			
		}
		

	}
}
