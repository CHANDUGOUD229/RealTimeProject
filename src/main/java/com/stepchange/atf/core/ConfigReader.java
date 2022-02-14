package com.stepchange.atf.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	Properties prop = new Properties();
	public String getReportConfigPath() throws FileNotFoundException{
		FileInputStream properties = new FileInputStream("src/main/resources/config.properties");
		
		try {
			prop.load(properties);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String reportConfigPath = prop.getProperty("ReportConfigPath");
		 if(reportConfigPath!= null) return reportConfigPath;
		 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
		}
}
