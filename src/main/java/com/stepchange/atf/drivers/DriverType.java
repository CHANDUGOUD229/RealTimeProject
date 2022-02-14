package com.stepchange.atf.drivers;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.logging.Level;

import com.stepchange.atf.core.BrowserProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.stepchange.atf.core.Browser;
import com.stepchange.atf.core.WebDriverException;

public enum DriverType {
	CHROME {
		public void instantiateDriver(BrowserProperties browserProperties) {
			ChromeOptions options = new ChromeOptions() ;
			options.setBinary("C:/Program Files/Google/Chrome/Application/chrome_google.exe");
			options.addArguments("--lang=en-GB");
					
					Browser browser = null;
					ChromeDriver chromeDriver = null;
					boolean driverStarted = false;
					
					try {
						System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
						chromeDriver = new ChromeDriver(options);
						driverStarted = true;
					} catch (WebDriverException e) {
						// Do nothing - This is not the right version of the webDriver
					}
					
					if(!driverStarted) {
						try {
							System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver.exe" );
							chromeDriver = new ChromeDriver(options);
							driverStarted = true;
						} catch (WebDriverException e) {
							// Do nothing - This is not the right version of the webD
							
							
						}
					}
						
						if (!driverStarted) {
							throw new  WebDriverException ("Could not load correct chromedriver");
						}
						SupportedDriver.getBrowsers().put(Thread.currentThread().getId(), new Browser (chromeDriver , browserProperties));
					
		}
	},
		
		WINIE {
			public void instantiateDriver(BrowserProperties browserProperties) {
				DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			System.setProperty("webdriver.ie.driver", "src/main/resources/IEDriverServer.exe");
			capabilities.setCapability("requireWindowFocus", true);
			capabilities.setCapability(InternetExplorerDriver.IE_SWITCHES, "-private");
			InternetExplorerDriver tempDriver = new InternetExplorerDriver(capabilities);
			tempDriver.setLogLevel(Level.FINEST);
			SupportedDriver.getBrowsers().put(Thread.currentThread().getId(), new Browser (tempDriver , browserProperties));
			}
		},
		
		FIREFOX {
			public void instantiateDriver(BrowserProperties browserProperties) {
				SupportedDriver.getBrowsers().put(Thread.currentThread().getId(), new Browser (new FirefoxDriver(), browserProperties));
			}
		},
		PHANTOMJS {
			public void instantiateDriver(BrowserProperties browserProperties) {
				DesiredCapabilities caps = new DesiredCapabilities();
				caps.setJavascriptEnabled(true);
				caps.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "src/main/resources/phantomjs.exe");
				PhantomJSDriver driver = new PhantomJSDriver (caps);
				driver.setLogLevel(Level.FINEST);
				driver.manage().window().maximize();
				SupportedDriver.getBrowsers().put(Thread.currentThread().getId(), new Browser(driver, browserProperties));
			}
		},
			
		
		
		
		CHROMEGRID {
			public void instantiateDriver(BrowserProperties browserProperties) {
				
				WebDriver webDriver = null ;
				DesiredCapabilities capabilities = DesiredCapabilities.chrome();
				ChromeOptions options = new ChromeOptions();
				HashMap<String,String > prefs = new HashMap<String,String > ();
				prefs.put("intl.accept_languages" , "en-gb");
				options.setExperimentalOption("prefs", prefs);
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				
				try {
					
					webDriver = new RemoteWebDriver (new URL(""), capabilities);
					SupportedDriver.getBrowsers().put(Thread.currentThread().getId(), new Browser(webDriver , browserProperties));
				} catch (MalformedURLException e){
						System.out.println("Malformed URL Exception thrown!");
						
					}
						
					}
		};
				
				DriverType() {
	
				
							
						}
				
				
				public void instantiateDriver(BrowserProperties browserProperties) {
					
				}
}

      