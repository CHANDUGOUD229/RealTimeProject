package com.stepchange.atf.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyManager {
	
	public static String BROWSER_TEST_FLAG_KEY = "browserTestFlag";
	public static String BROWSER = "browser";
	public static String IS_TESTNG = "isTestNG";
	public static String DRIVER_TYPE = "driver_type";
	public static String ENVIRONMENT = "environment";
	public static String ENVIRONMENT_ONLINE = "onlineEnvironment";
	public static String TIMEOUT = "timeout";
	public static String MAX_ATTEMPTS = "maxAttempts";
	public static String LOG_LEVEL = "logLevel";
	public static String DRIVER_QUIT_KEY = "driver_quit";
	
	
	
	
	public static Properties properties = new Properties();
	
	static {
		
		   InputStream inputStream = null;
		   try {
			   inputStream = new FileInputStream(".\\src\\main\\resources\\config.properties");
			   properties.load(inputStream);
		   }catch (FileNotFoundException e) {
			   e.printStackTrace();
		   }catch (IOException io) {
			   io.printStackTrace();
		   }
	}
	
	public Properties getPropertyValues(String propertiesFileName) {
		if(propertiesFileName!=null) {
		InputStream inputStream = null;
		try {
			try {
				inputStream = new FileInputStream(propertiesFileName);
				}catch(FileNotFoundException e) {
					e.printStackTrace();
				}
			
			if(inputStream != null) {
				properties.load(inputStream);
			}else {
				throw new FileNotFoundException("property file ' " + propertiesFileName + "' not found in the classpath");
			}
		}catch(Exception e) {
			System.out.println("Exception:" + e);
		}finally {
			try {
				inputStream.close();
			}catch(Exception e){
				System.out.println("Exception:" + e);
			}
		}}
		return properties;
	}
	
	
	public static String getProperty(String propertyKey) {
		
		return properties.getProperty(propertyKey);
	}
	
}
