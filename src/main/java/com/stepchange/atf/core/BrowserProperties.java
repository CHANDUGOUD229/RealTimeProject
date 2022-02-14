package com.stepchange.atf.core;

import com.stepchange.atf.drivers.DriverType;

public class BrowserProperties {
	
	private  int maxAttempts;
	private int timeout;
	private DriverType driverType;
	private String environmentName;
	private String environmentURL;
	private String onlineEnvironment;
	private String onlineEnvironmentUrl;

	
	public BrowserProperties (int maxAttempts, int timeout, DriverType driverType, String environmentName , String environmentURL,String onlineEnvironment) {
		this.maxAttempts = maxAttempts;
		this.timeout = timeout;
		this.driverType = driverType;
		this.environmentName = environmentName;
		this.environmentURL = environmentURL;
		this.onlineEnvironmentUrl=onlineEnvironment;
		
	}
	
	public int getMaxAttempts() { return maxAttempts; }
	public void setMaxAttempts (int maxAttempts) { this.maxAttempts = maxAttempts; }
	public int getTimeout() { return timeout;}
	public void setTimeout (int timeout) { this.timeout = timeout; }
	public DriverType getDriverType() { return driverType ; }
	public void setDriverType (DriverType driverType) { this.driverType = driverType; }
	public String getEnvironmentName() { return environmentName; }
	public void setEnvironmentName(String environmentName) { this.environmentName = environmentName ; }
	public String getEnvironmentURL() {return environmentURL; }
	public void setEnvironmnetURL(String  environmentURL) { this.environmentURL = environmentURL; }

	public String getOnlineEnvironment() {
		return onlineEnvironment;
	}

	public void setOnlineEnvironment(String onlineEnvironment) {
		this.onlineEnvironment = onlineEnvironment;
	}

	public String getOnlineEnvironmentUrl() {
		return onlineEnvironmentUrl;
	}

	public void setOnlineEnvironmentUrl(String onlineEnvironmentUrl) {
		this.onlineEnvironmentUrl = onlineEnvironmentUrl;
	}
}


