package com.stepchange.atf.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.stepchange.atf.drivers.SupportedDriver;
import com.vimalselvam.cucumber.listener.Reporter;

public class LogWriter {
	
	private  Logger logger;
	private  String logDirectory;
	private  String logDirectoryExtent;
	private  FileHandler logFile = null;
	
	public  void log(String message) {
		
		getLogger().log(Level.INFO, message);
	}
	public  void log(String message, Level level) {
		getLogger().log(level, message);
	}
	
	public  void instantiateLogger(String testNameParam) {
		
		if(logger == null) {
			logger = Logger.getLogger(Thread.currentThread().getName());
			
			SimpleDateFormat format = new SimpleDateFormat("YYYY-M-d-HHmmss");
			logDirectory = "target/cucumber-reports/CucumberhmtlReport/logs/" + testNameParam.replaceAll(" " , " ") + "_" + format.format(Calendar.getInstance().getTime());
			logDirectoryExtent= "CucumberhmtlReport/logs/" + testNameParam.replaceAll(" " , " ") + "_" + format.format(Calendar.getInstance().getTime());
			new File(logDirectory).mkdirs();
			
			try {
				logFile = new FileHandler(logDirectory + "/" + testNameParam + "_Log_" + format.format(Calendar.getInstance().getTime()) + ".html");
				}catch (Exception e) {
					e.printStackTrace();
				}
			logFile.setFormatter(new HTMLLogFormatter());
			logger.addHandler(logFile);
			}
		}
		
		public  Logger getLogger() {
			return logger;
		}
		
		public  void logScreenshot() {
			
			Level level = Level.INFO;
			logScreenshot(level);
		}
		
		
		public  void logScreenshot(Level level) {
			
			try {
				
				String screenshotFloder = logDirectory + "/screenshots/";
				String screenShotFolderForExtent=logDirectoryExtent+ "/screenshots/";
				new File(screenshotFloder).mkdirs();
				SimpleDateFormat format = new SimpleDateFormat("YYYYMDHHmmssS");
				Date date = new Date();
				String fileName = "screenshot" + format.format(date)+".png";
				String screenshotPath = screenshotFloder + fileName;
				String linkPath = "screenshots/" + fileName;
				File scrFile = ((TakesScreenshot) SupportedDriver.getBrowsers().get(Thread.currentThread().getId()).getDriver()).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(scrFile, new File(screenshotPath));
				getLogger().log(level, "<a href=\"" +  linkPath + "\"><img width=200 src=\"" + linkPath + "\" alt=\"Screenshot\"></a>"  );
				Reporter.addScreenCaptureFromPath(screenShotFolderForExtent+fileName);
				FileUtils.deleteQuietly(scrFile);
			} catch(Exception e) {
				getLogger().log(Level.SEVERE, "Failed to take screenshot:" + e.getMessage());
			}
		}
		

		public  void closeLogger() {
			logger.removeHandler(logFile);
			logFile.close();
			logger = null;
		}
		
		
		public  String getLogDirectory() {
			return logDirectory;
		}
	
	
	
}
