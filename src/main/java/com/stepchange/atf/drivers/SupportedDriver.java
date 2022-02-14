package com.stepchange.atf.drivers;

import java.util.HashMap;

import com.stepchange.atf.core.Browser;

public class SupportedDriver {
	
	private static HashMap<Long, Browser> browsers;
	
	public static HashMap<Long, Browser> getBrowsers() {
		if(browsers == null) {
			browsers = new HashMap<Long, Browser>();
		}
		
		return browsers;
	}

}