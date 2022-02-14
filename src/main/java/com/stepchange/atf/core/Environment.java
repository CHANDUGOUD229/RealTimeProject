package com.stepchange.atf.core;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Scanner;

import com.stepchange.atf.utilities.PropertyManager;



public class Environment {
		
		//Attributes 
	
	private String environmentName;
	private String onlineEnvironmentUrl;
	private String onlineEnvironmentName;

	public String getOnlineEnvironmentName() {
		return onlineEnvironmentName;
	}

	public void setOnlineEnvironmentName(String onlineEnvironmentName) {
		this.onlineEnvironmentName = onlineEnvironmentName;
	}

	public Environment(String environmentName) {
		this.environmentName = environmentName;
	}
	
	public String getEnvironment() {
		return environmentName;
	}

	public String getEnvironmentName() {
		return environmentName;
	}
	public String getEnvURL() {
		return getEnvURL(getEnvironmentName());
	}

	public String getOnlineEnvironmentUrl() {
		return getOnlineEnvironmentUrl(getOnlineEnvironment(PropertyManager.ENVIRONMENT_ONLINE));
	}
	public String getOnlineEnvironment(String onlineEnvironment) {
		PropertyManager propertyManager = new PropertyManager();
		propertyManager.getPropertyValues("./src/main/resources/config.properties");
		return propertyManager.getProperty(onlineEnvironment);
	}

	public String getOnlineEnvironmentUrl(String onlineEnvironment) {

		PropertyManager propertyManager = new PropertyManager();
		propertyManager.getPropertyValues("./src/main/resources/config.properties");
		return propertyManager.getProperty(onlineEnvironment);
	}

	public HashMap<String, String> getEnvJDBCDetails(){
		return getEnvJDBCDetails(getEnvironmentName());
	}
	
	
	
	public String getEnvURL(String environment) {
		/*Path path = Paths.get("src/main/resources/Environments.ini");
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(path);
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			assert scanner!=null;
			scanner.useDelimiter(System.lineSeparator());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		while (scanner.hasNext()){
			String line = scanner.next();
			String[] elements = line.split(",");
			if(elements[0].equals(environment)) {
				scanner.close();
				return elements[1];
			}
		}
		return null;*/
		PropertyManager propertyManager = new PropertyManager();
		propertyManager.getPropertyValues("./src/main/resources/config.properties");
		return propertyManager.getProperty(environment);
	}
	
	
	
	public HashMap<String, String> getEnvJDBCDetails(String environment){
		HashMap<String, String> jdbcDetails = new HashMap<>();
		Path path = Paths.get("src/main/resources/Environments.ini");
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (scanner != null) {
			
			try {
				scanner.useDelimiter(System.getProperty("line.separator"));
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			
		while (scanner.hasNext()){
			String line = scanner.next();
			String [] elements = line.split(",");
			if(elements[0].equals(environment)) {
				scanner.close();
				if(elements[4].contains("7.")||(elements[4].contains("6."))) {
					throw new RuntimeException("Cannot connect - Environment information is malformed, password contains Pega Version");
				}
				
				jdbcDetails.put("URL", elements[2]);
				jdbcDetails.put("SCHEMA", elements[3]);
				jdbcDetails.put("PASSWORD", elements[4]);
				return jdbcDetails;
			}
		}
		
		
		}else {
			throw new RuntimeException("Creation of scanner failed getting DB details");
			
		}
		return null;
	}
	
	
	
	public String getEnvVersion(String environment) {
		Path path = Paths.get("src/main/resources/Environments.ini");
		Scanner scanner = null;
		
		try {
			scanner = new Scanner(path);
		}catch (IOException e) {
			
			e.printStackTrace();
		}
		
		try {
			assert scanner!=null;
			scanner.useDelimiter(System.lineSeparator());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		
		while (scanner.hasNext()){
			String line = scanner.next();
			String[] elements = line.split(",");
			if(elements[0].equals(environment)) {
				
				scanner.close();
				try {
				return elements[5];
			}catch (ArrayIndexOutOfBoundsException ae) {
				System.out.println(ae.getMessage());
				System.out.println("Returning null for the Environment Version.");
				break;
			}
				
			}
		}
		return null;
		
	}
	
	
}

		
				
					
				
			
		