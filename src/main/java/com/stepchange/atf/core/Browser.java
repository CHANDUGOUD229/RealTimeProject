package com.stepchange.atf.core;

import java.util.logging.Level;

import com.stepchange.atf.drivers.DriverType;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.stepchange.atf.utilities.LogWriter;

// The Browser objects compries a driver plus a few extra things which are tied to the browser , such as maximum number of attempts number of attempts and wait details

public class Browser {

	private WebDriver driver;
	private BrowserProperties browserProperties;
	private LogWriter logWriter;
	private String originalWindow;
	public Browser (WebDriver driver , BrowserProperties browserProperties) {
		this.driver = driver;
		this.setBrowserProperties(browserProperties);
			this.logWriter = new LogWriter(); 
		}
	
	
		public WebDriver getDriver() {
			return driver; 
			}
	
		public int getMaxAttempts() { 
			return getBrowserProperties().getMaxAttempts(); 
			}
		
		public int getTimeout() { 
			return getBrowserProperties().getTimeout(); 
			}
		
		public DriverType getDriverType() {
			return getBrowserProperties().getDriverType(); 
			}
		

		public String getEnvironment() { 
			return getBrowserProperties().getEnvironmentName();
			}
		
		public BrowserProperties getBrowserProperties() { 
			return browserProperties; 
			}
		
	
		public void setBrowserProperties(BrowserProperties browserProperties) {
				this.browserProperties = browserProperties;
				}
		


		public void setLogWriter(LogWriter logWriter) {
			this.logWriter = logWriter;
		}
		

			/**
			 * Pauses execution for a specified time. Generally you should use getTimeout() as the parameter, as this is specified in  the XML file
			 * @param ms The time (in milliseconds) to sleep for
			 */
			
			
			public void sleep(int ms) {
				try {
					Thread.currentThread().sleep(ms);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			


			public void  scrollDown() {
				// Scroll down persistently because IE is a load of crap
				JavascriptExecutor jse = (JavascriptExecutor) getDriver();
				jse.executeScript("window.scrollTo(0,document.body.scrollHeight)","");


			}
			
			public void  scrollUp() {
				// Scroll up persistently because IE is a load of crap
				JavascriptExecutor jse = (JavascriptExecutor) getDriver();
				jse.executeScript("window.scrollBy(0, -500)","");
			}

			public void waitForElementToBeClickable(By elementSelector) {
				try {
//					((JavascriptExecutor) this.getDriver()).executeScript("element.focus();", new Object[]{getDriver().findElement(elementSelector)});
//					(new WebDriverWait(getDriver(),0,500)).until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(getDriver().findElement(elementSelector))));
					(new WebDriverWait(getDriver(),20)).until(ExpectedConditions.elementToBeClickable(elementSelector));
					(new WebDriverWait(getDriver(),20)).until(ExpectedConditions.visibilityOfElementLocated(elementSelector));
					int itCount;
					itCount = getMaxAttempts();
					while(itCount>0) {
						try {
							if(getElementWhenReady(elementSelector).isDisplayed()) {
								break;
							}
						}
						catch(StaleElementReferenceException e) {
							this.logWriter.log("Caught timeout exception in wait for element to be clickable");
						}
					itCount--;
					sleep(getTimeout()/10);
					}
				}
				catch(TimeoutException e) {
					this.logWriter.log("Caught timeout exception in wait for element to be clickable");
				}  
			}
			
			public void waitForElementToBeClickable(By elementSelector, int seconds) {(new WebDriverWait(getDriver(),seconds)).until(ExpectedConditions.elementToBeClickable(elementSelector));}

			public WebElement getElementWhenReady(By by) throws NoSuchElementException{
				int i=0;
				while (!isElementPresent(by)) {
					sleep(100);
					if(++i >= getMaxAttempts()) {
						this.logWriter.log("Could not find element "+ by, Level.SEVERE);
						throw new NoSuchElementException("Could not find element " + by + " after " + i + " attempts");
					}
				}
				i=0;
				while(i<getMaxAttempts()) {
					try {
						this.logWriter.log(getDetailWebElement(getDriver().findElement(by)), Level.FINEST);
						break;
					}
					catch(StaleElementReferenceException e) {
						this.logWriter.log("Caught StaleElementReferenceException");
						sleep(getTimeout()/100);
						i++;
					}
				}
				return getDriver().findElement(by);
			}
			public boolean isElementPresent(By by) {
				try {
					getDriver().findElement(by);
					return true;
				}
				catch(NoSuchElementException e) {
					return false;
				}
				catch(StaleElementReferenceException e) {
					this.logWriter.log("StaleElementReferenceException for element " + by + ". Message:"+e.getLocalizedMessage(), Level.INFO);
					return false;
				}
			}
			public String getDetailWebElement(WebElement it) {
				return "id='"+it.getAttribute("id")+"' name='"+ it.getAttribute("name")+ "' tag='"+ it.getTagName()+ "' text='"+it.getText()
				+ "' class='"+it.getAttribute("class")+ "' onclick='"+ it.getAttribute("onclick")+"'"+"' data-click='"+ it.getAttribute("data-click")+"'";
				
			}
			public LogWriter getLogWriter() {
				return this.logWriter;
			}
			public void switchToActiveIFrame() {
				sleep(getTimeout()/5); // Do NOT charge this line . short sleep to make sure the tab's loaded... There's no way  to do this ither than just waiting 
                   leaveIFrame();
                   int iterationCounter = 0;
                   while (iterationCounter < 3) {
                	   try {
                		   WebElement webGadget = getElementWhenReady(By.cssSelector("div[id*='PegaWebGadget'] [aria-hidden ='false'][tabindex='0']"));
                		   String iFrameID = webGadget.getAttribute("pegagadget") + "Ifr";
                		   (new WebDriverWait(getDriver(), 3)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iFrameID));
                		   this.logWriter.log(iFrameID , Level.FINE);
					return;
					} catch (NoSuchElementException e) {
						sleep (getTimeout() / 10);
						this.logWriter.log("Switch to active iFrame" + e.getMessage());
						
					}
                	   iterationCounter++;
                   }
                   throw new RuntimeException("Failed to switch to active iFrame");
			}
			public void leaveIFrame() {
				this.logWriter.log("Moving to default content" , Level.FINEST);
				int iterationCounter = 0;
				while (iterationCounter < getMaxAttempts() ) {
					try { 
						getDriver().switchTo().defaultContent();
						break;
					} catch (Exception e) {
						this.logWriter.log(e.getMessage(), Level.FINEST);
						iterationCounter++;
						sleep(30);
					}
				}
			}
			
}
			
					
					
					
	

