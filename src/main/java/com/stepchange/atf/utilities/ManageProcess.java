package com.stepchange.atf.utilities;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class ManageProcess {
	

/**
 * Method to kill the chrome driver.exe
 */

	public void stopChromeDriver() {
		boolean chromeDriver = true;
		while(chromeDriver) {
			try {
				if(isProcessRunning("chromedriver.exe")) {
					
					killProcess("chromedriver.exe");
				}else {
					chromeDriver = false;
				}
			}catch(Exception e) {
				chromeDriver = false;
			}
		}
		
		chromeDriver = true;
		while(chromeDriver) {
			try {
				if(isProcessRunning("chromedriver-2.21.exe")) {
					
					killProcess("chromedriver-2.21.exe");
				}else {
					chromeDriver = false;
				}
			}catch(Exception e) {
				chromeDriver = false;
			}
		}
		
		
		
		while(chromeDriver) {
			try {
				if(isProcessRunning("chromedriver-2.25.exe")) {
					
					killProcess("chromedriver-2.25.exe");
				}else {
					chromeDriver = false;
				}
			}catch(Exception e) {
				chromeDriver = false;
			}
		}
		
	}
	
	public void stopIEDriver() {
		
		boolean IEDriver = true;
		while(IEDriver) {
			try {
				if(isProcessRunning("IEDriverServer.exe")) {
					
					killProcess("IEDriverServer.exe");
				}else {
					IEDriver = false;
				}
			}catch(Exception e) {
				IEDriver = false;
			}
		}
		
	}
	
	public void stopIEDriver47() {
		boolean IEDriver = true;
		while(IEDriver) {
			try {
				if(isProcessRunning("IEDriverServer_2_47_32bit.exe")) {
					
					killProcess("IEDriverServer_2_47_32bit.exe");
				}else {
					IEDriver = false;
				}
			}catch(Exception e) {
				IEDriver = false;
			}
		}
		
	 }
	
	
	public boolean isProcessRunning(String serviceName) throws Exception{
		Process p = Runtime.getRuntime().exec("tasklist");
		BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line;
		while((line = reader.readLine()) !=null ) {
			if(line.contains(serviceName)) {
				return true;
			}
		}
				
		
		return false;
	}
	
	
	
	public void killProcess(String serviceName) {
		try {
			Runtime.getRuntime().exec("tasklist/f/IM" + serviceName);
		}catch(Exception e) {
			
		}
	}
	
	
	public String getComputerName() {
		
		try {
			String computerName = InetAddress.getLocalHost().getHostAddress();
			return computerName;
		}catch (Exception e) {
			System.out.println("Exception caught =  " + e.getMessage() );
		}
		
		return null;
	}
	
	

}
