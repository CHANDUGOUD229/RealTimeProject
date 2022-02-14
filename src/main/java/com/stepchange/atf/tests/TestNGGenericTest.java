package com.stepchange.atf.tests;

import com.stepchange.atf.core.BaseTest;
import org.testng.ITestContext;
import org.testng.annotations.BeforeClass;

public abstract  class TestNGGenericTest extends BaseTest{

	


	/**
	 * Initial setup of the tests. Logs start times, sets up environment variables, makes a call to set up the driver and loads the  environment . This should nto be touched without good reason
	 * @param  context ALlows pulling of parameters from TestNG XML file
	 */
	@BeforeClass
	public void beforeSuite(ITestContext context) {
		initialise(context.getCurrentXmlTest().getName());
	}
	


	


	
	

	
	
}


	
