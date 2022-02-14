package com.stepchange.atf.core;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;

import com.stepchange.atf.drivers.DriverType;
import com.stepchange.atf.drivers.SupportedDriver;
import com.stepchange.atf.utilities.GeneralConstants;
import com.stepchange.atf.utilities.PropertyManager;


public class BaseTest {

	private String envURL;
	protected double startTime;
	private String testName;
	private String originalWindow;
	private boolean happyPath;
	private DriverType originalBrowser;
	protected String environment;
	protected String environmentOnline;
	protected String propertiesFile = null;
	protected String userPID;
	protected String userPassword;
	protected String driverType;
	protected String driverQuit;
	protected String application;
	protected int timeout;
	protected int maxAttempts;
	protected String logLevel;

	private Environment environmentObj;
	
	public static final String PROPERTIES_FILENAME_KEY = "propertiesfile";
	public static final String PROPERTIES_FILE_PATH = "./src/main/resources/properties/";
	public static final String PROPERTIES_FILE_EXTENSION = ".properties";
	public static final String MISSING_PROPERTIES_FILE_ARGUMENT_MESSAGE = "Required 'propertiesfile' environment variable not set." + 
			"Please set an environment variable with the name of 'properties' " +
			"and the value of a properties file when running this test. " + 
			"This can be done within the IDE . " +
			"e.g. propertiesfile= ./src/main/resources/xxxx.properties";
	
	public static final String MISSING_PROPERTY_MESSAGE = "Required property missing from the properties file. Please add this property to the file and re-run the test.";

	
	
	//Getters
	public String getEnvironment() { return environment; }
	
	public static String getTimestamp() {
		SimpleDateFormat format = new SimpleDateFormat ("YYYYMMddHHmmss");
		Date date = new Date();
		return format.format(date);
	}
	
	public void setEnvironment (String environment) { this.environment = environment ; }
	
	protected static void setDriverType(DriverType driverType) {
		SupportedDriver.getBrowsers().get(Thread.currentThread().getId()).getBrowserProperties().setDriverType(driverType);
	}
	/**
	 * This method is to get EvnURL
	 * @return envURL
	 */
	
	public String getEnvURL() {
		return envURL;
	}
	
	/**
	 * This method is to get start time
	 * @return startTime
	 */
	public double getStartTime() {
		return startTime;
	}
	
	/**
	 * This method is to get Test Name
	 * @return testName
	 */
	public String getTestName() {
		return testName;
	}
	
	/**
	 * This method is to get Original Window
	 * @return originalWindow
	 */
	public String getOriginalWindow() {
		return originalWindow;
	}
	
	/**
	 * This method is to get the is Happypath
	 * @return happyPath
	 */
	public boolean isHappyPath() {
		return happyPath;
	}
	
	/**
	 * provide a reference to the driver objects
	 * 
	 * @return A reference to the driver object
	 */
	public WebDriver getDriver() { return getBrowser().getDriver(); }
	
	/**
	 *  This method gets the start Time
	 *  @return start time
	 */
	
	public DriverType getDriverType() { return getBrowser().getDriverType(); }
	
	/**
	 * This method is to get  original Browser
	 * @return originalBrowser
	 */
	public DriverType getOriginalBrowser() {
		return originalBrowser;
	}
	

	
	//Setters

	/**
	 * This method is to set the Env URL
	 * @param envURL
	 */
	public void setEnvURL(String envURL) {
		this.envURL = envURL;
	}

	/**
	 * This method is to set the Start Time
	 * @param startTime
	 */
	public void setStartTime(double startTime) {
		this.startTime = startTime;
	}

	/**
	 * This method is to set the test name
	 * @param testName
	 */
	public void setTestName(String testName) {
		this.testName = testName;
		}
	/**
	 * This method is to set the original Window
	 * @param originalWindow
	 */
	public void setOriginalWindow(String originalWindow) {
		this.originalWindow = originalWindow;
	}
	/**
	 *This method is to set the happy path 
	 * @param happyPath
	 */
	public void setHappyPath(boolean happyPath) {
		this.happyPath = happyPath;
	}
	/**
	 * This method is to set the original Browser
	 * @param originalBrowser
	 */
	public void setOriginalBrowser(DriverType originalBrowser) {
		this.originalBrowser = originalBrowser;
	}
	
	
	public void setTimeout(int timeout) {
		SupportedDriver.getBrowsers().get(Thread.currentThread().getId()).getBrowserProperties().setTimeout(timeout);
	}
	
	public static void setMaxAttempts(int maxAttempts) {
		SupportedDriver.getBrowsers().get(Thread.currentThread().getId()).getBrowserProperties().setMaxAttempts(maxAttempts);
	}

	protected void readProperties() {
		PropertyManager propertyManager = new PropertyManager();
		Properties properties = propertyManager.getPropertyValues(propertiesFile);
			driverType = properties.getProperty(PropertyManager.DRIVER_TYPE);
		
		if((driverType == null) || (driverType.trim().equals(""))){
			String message = MISSING_PROPERTY_MESSAGE + "Property: driver_type";
			throw new RuntimeException(message);
		}
		driverQuit = properties.getProperty(PropertyManager.DRIVER_QUIT_KEY);
		environment =  properties.getProperty(PropertyManager.ENVIRONMENT);
		environmentOnline =  properties.getProperty(PropertyManager.ENVIRONMENT_ONLINE);
		if ((environment == null) || (environment.trim().equals(""))) {
			String message = MISSING_PROPERTY_MESSAGE + "Property: environment";
			throw new RuntimeException(message);
		}
		
		if((properties.getProperty(PropertyManager.TIMEOUT) == null) || (properties.getProperty(PropertyManager.TIMEOUT).trim().equals(GeneralConstants.EMPTY_STRING))) {
			
			timeout = GeneralConstants.DEFAULT_TIMEOUT_VALUE;
		}else {
			timeout = Integer.parseInt(properties.getProperty(PropertyManager.TIMEOUT));
		}
		
		if((properties.getProperty(PropertyManager.MAX_ATTEMPTS) == null) || (properties.getProperty(PropertyManager.MAX_ATTEMPTS).trim().equals(GeneralConstants.EMPTY_STRING))) {
			
			maxAttempts = GeneralConstants.DEFAULT_MAX_ATTEMPTS_VALUE;
		}else {
			maxAttempts = Integer.parseInt(properties.getProperty(PropertyManager.MAX_ATTEMPTS));
		}
		
		if((properties.getProperty(PropertyManager.LOG_LEVEL) == null) || (properties.getProperty(PropertyManager.LOG_LEVEL).trim().equals(GeneralConstants.EMPTY_STRING))) {
			
			logLevel = GeneralConstants.DEFAULT_LOGING_LEVEL_VALUE;
		}else {
			logLevel = properties.getProperty(PropertyManager.LOG_LEVEL);
		}
		
		
	
	}
	
	
	protected void initialise(String testName) {
		this.testName = testName;
		Date date = new Date();
		System.out.println("Start Time:" + date.toString());
		readProperties();
		environmentObj = new Environment(getEnvironment());
		setStartTime(System.currentTimeMillis());
		
		DriverType tempDriverType = DriverType.valueOf(driverType);
		
		BrowserProperties browserProperties = new BrowserProperties(maxAttempts, timeout, tempDriverType,environmentObj.getEnvironment(),environmentObj.getEnvURL(),environmentObj.getOnlineEnvironmentUrl());
		setHappyPath(false);
		tempDriverType.instantiateDriver(browserProperties);
		getBrowser().getLogWriter().instantiateLogger(getTestName());
		log("Start Time:" + date.toString(), Level.INFO);
		log("Environment: " + environmentObj.getEnvironment());
		log("Environment URL: " + environmentObj.getEnvURL());
		setDriverType(tempDriverType);
		log("Browser Type: " + getBrowser().getDriverType().toString());
		setOriginalBrowser(getBrowser().getDriverType());
		setTestName(testName);
	}
	

	public void loadEnvironment() {
		getBrowser().getDriver().get(getBrowser().getBrowserProperties().getEnvironmentURL());
	}
	
	
	
	@AfterSuite
	
	public void afterSuite(ITestContext context) {
		getBrowser().getLogWriter().logScreenshot();
		if(Boolean.parseBoolean(driverQuit)) { getBrowser().getDriver().quit(); }
		Date date = new Date();
		getBrowser().getLogWriter().log("End Time: " + date.toString(),Level.INFO);
		double endTime = System.currentTimeMillis();
		double runTime = ((endTime-startTime)/1000);
		getBrowser().getLogWriter().log("Run Time: " + runTime + " seconds ", Level.INFO);
		getBrowser().getLogWriter().closeLogger();
	}
	
	
	
	
	/**
	 * This method is to get the Browser
	 * @return BrowserID
	 */
	public Browser getBrowser() {
		
		return SupportedDriver.getBrowsers().get(Thread.currentThread().getId());
	}

	public void tab() {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);
		}
		catch(AWTException e) {
			e.printStackTrace();
		}
	}
	public void downArrow() {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_DOWN);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		catch(AWTException e) {
			e.printStackTrace();
		}
	}

	public void upArrow() {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_UP);
			robot.keyRelease(KeyEvent.VK_UP);
		}
		catch(AWTException e) {
			e.printStackTrace();
		}
	}
	
	public void enter() {
		try {
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		}
		catch(AWTException e) {
			e.printStackTrace();
		}
	}
	public void checkNotClickable(Exception e) {
		if(!e.getMessage().contains("Element is not clickable at this point") && !e.getMessage().contains("element not visible")) {
			throw new RuntimeException(e);
		}
		else {
			JavascriptExecutor jse = (JavascriptExecutor)this.getBrowser().getDriver();
			jse.executeScript("window.scrollBy(0,500)", new Object[] {""});
		}
	}
	
	public void log(String message) {
		getBrowser().getLogWriter().log(message);
		
	}
	public void log(String message, Level level) {
		getBrowser().getLogWriter().log(message,level);
		
	}
	/**
	 * Puts a screenshot of the current browser window into the logs
	 */
	
	public void  logScreenshot() { getBrowser().getLogWriter().logScreenshot(); }
	/**
	 * This method returns the browser time out value
	 * @return browser time out
	 */
	
	public int getTimeout() { return getBrowser().getTimeout();}
	/**
	 * This method returns the max attempts
	 * @return max attempts
	 */
	
	public int getMaxAttempts() { return getBrowser().getMaxAttempts(); }
	/**
	 * Maximises the current driver WINDOW
	 */
	
	public void maximiseWindow() { getDriver().manage().window().maximize();
		//getDriver().manage().window().setSize(new Dimension(1920,1080));
		getDriver().manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
//		getDriver().manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
//		getDriver().manage().timeouts().setScriptTimeout(2000, TimeUnit.MILLISECONDS);
	}
	/**
	 * This method sets the environment
	 * @param environment environment
	 */
	
	public void setEnvironmnet (String environment) { this.environment = environment ; }
	
}
