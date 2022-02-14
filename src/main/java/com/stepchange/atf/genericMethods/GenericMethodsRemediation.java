package com.stepchange.atf.genericMethods;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Div;
import com.stepchange.atf.controls.RadioButton;
import com.stepchange.atf.core.BaseTest;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

public class GenericMethodsRemediation extends BaseTest {

	private RadioButton yes;
	private RadioButton No;
	private Button ContinueButton;
	private Button SecondContinueButton;
	private RadioButton IAmNotSelfEmployed;
	private RadioButton NotSure;

	public RadioButton getYes() {
		return yes;
	}

	public RadioButton getNo() {
		return No;
	}

	public Button getContinueButton() {
		return ContinueButton;
	}

	public Button getSecondContinueButton() {
		return SecondContinueButton;
	}

	public RadioButton getIAmNotSelfEmployed() {
		return IAmNotSelfEmployed;
	}

	public RadioButton getNotSure() {
		return NotSure;
	}

	public GenericMethodsRemediation() {

		yes = new RadioButton(By.xpath("//*[.='Yes']"));
		No = new RadioButton(By.xpath("//*[.='No']"));
		ContinueButton = new Button(By.xpath("//button[text()='Continue']"));
		SecondContinueButton = new Button(By.xpath("//*[@data-test-id='202005171035390500660']"));
		IAmNotSelfEmployed = new RadioButton(By.cssSelector("div:nth-child(3) > span > label"));
		NotSure = new RadioButton(By.xpath("//*[.='Not sure']"));
	}

	public void clickOnNoAndYesAndContinue() {
		getBrowser().sleep(2000);
		this.getNo().click(false);
		this.getContinueButton().checkButtonEnabled();
		this.getYes().click(false);
		getBrowser().sleep(3000);
		this.getSecondContinueButton().click();

	}

	public void clickOnNoAndContinue() {
		getBrowser().sleep(2000);
		this.getNo().click(false);
		getBrowser().sleep(2000);
		if (this.getSecondContinueButton().isElementDisplayed() ) {
			this.getSecondContinueButton().click();
			
		}else
		{
			this.getContinueButton().click();
		}

	}

	public void clickOnNoAndYesAndSelfEmployedEmployedContinue() {
		getBrowser().sleep(3000);
		this.getIAmNotSelfEmployed().click(false);
		getBrowser().sleep(2000);
		this.getNo().click(false);
		this.getContinueButton().checkButtonEnabled();
		this.getYes().click(false);
		getBrowser().sleep(3000);
		this.getSecondContinueButton().click();

	}

	public void clickOnNoAndYesAndNotSureContinue() {
		getBrowser().sleep(3000);
		this.getNotSure().click(false);
		getBrowser().sleep(2000);
		this.getNo().click(false);
		this.getContinueButton().checkButtonEnabled();
		this.getYes().click(false);
		getBrowser().sleep(3000);
		this.getContinueButton().click();
		getBrowser().sleep(3000);

	}

	public Button getBasedContinueButton() {
		return new Button(By.xpath("//*[@data-test-id='2020051713570501589']"));
	}

	public void ElementFromIframe(By by) {

		List<WebElement> ele = getDriver().findElements(By.tagName("frame"));
		System.out.println("Number of frames in a page :" + ele.size());
		for (WebElement el : ele) {
			getDriver().switchTo().frame(el);
			if (getDriver().findElement(by).isDisplayed()) {
				getDriver().findElement(by).click();
				break;
			}

		}

	}

	public void clickOnElementJse(By Ele)
	{
		getBrowser().waitForElementToBeClickable(Ele);
		getDriver().manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)getDriver();
		WebElement element = getDriver().findElement(Ele);
		executor.executeScript("arguments[0].click();", element);
		
	}	
	
	public void EnterOnElementJse(By Ele, String enterthevalue )
	{
		getBrowser().waitForElementToBeClickable(Ele);
	//	getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor executor = (JavascriptExecutor)getDriver();
		WebElement element = getDriver().findElement(Ele);
		executor.executeScript("arguments[0].value='enterthevalue';", element);
		implicitWait(2000);
		
	}
	
	public void implicitWait(int mseconds) {
		getDriver().manage().timeouts().implicitlyWait(mseconds, TimeUnit.MILLISECONDS);
	}

	public void verifyOverLayDisplayed() {
		try {
			(new WebDriverWait(getDriver(),2)).until(ExpectedConditions.visibilityOfElementLocated(By.id("modalOverlay")));
			(new WebDriverWait(getDriver(),20)).until(ExpectedConditions.invisibilityOfElementLocated(By.id("modalOverlay")));
		} catch (Exception e)
		{

		}
	}

	//Added by Fayaz on 26th Jan to wait for an object until it's visible
	public boolean waitForAnObjectToBeVisible(By element, Integer time) throws InterruptedException {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), time);
			wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(element)));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

//	//Added by Fayaz on 25th to generate unique names for clients
	private static final String STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

	public static String getRandomAlphanumericText(int count) {
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) {
			int character = (int) (Math.random() * STRING.length());
			builder.append(STRING.charAt(character));
		}
		return builder.toString();
	}

	//Added by Fayaz on 25th to scroll into element
	public boolean scrollIntoViewElement(By ScrollToElement) {
		try {
			JavascriptExecutor executor = (JavascriptExecutor) this.getDriver();
			executor.executeScript("arguments[0].scrollIntoView(true);", this.getDriver().findElement(ScrollToElement));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	//Added by Fayaz on 30th to wait for an oject to be clickable
	public boolean waitForAnObjectToBeClickable(By by, Integer time) {
		try {
			WebDriverWait wait = new WebDriverWait(getDriver(), time);
			wait.until(ExpectedConditions.elementToBeClickable(by));
			return true;
		} catch (Exception e) {
			try {
				WebDriverWait wait = new WebDriverWait(getDriver(), time);
				wait.until(ExpectedConditions.elementToBeClickable(by));
				return true;
			} catch (Exception e1) {
				return false;
			}
		}
	}

	public void scrollElementIntoView(WebElement element) {
		try {
			((JavascriptExecutor) this.getDriver()).executeScript("arguments[0].scrollIntoView(true);", new Object[]{element});
			((JavascriptExecutor) this.getDriver()).executeScript("element.focus();", new Object[]{element});
		} catch (Exception var2) {
			this.log(var2.getLocalizedMessage() + " Exception thrown inside scrollElementIntoView() method ");
			try {
				Actions actions = new Actions(getDriver());
				actions.moveToElement(element);
				actions.perform();
				this.log(  " Retried to Scroll and Passed  ");
			}catch (Exception var3)
			{
				this.log(var3.getLocalizedMessage() + " Retried to Scroll and Failed ");
			}
		}
	}

	/*public void ElementFromIframe(Control element)
	{
		List<WebElement> ele1;
		Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver())							
					.withTimeout(30, TimeUnit.SECONDS) 			
					.pollingEvery(5, TimeUnit.SECONDS) 			
					.ignoring(NoSuchFrameException.class);
		List<WebElement> ele = getDriver().findElements(By.tagName("iframe"));//number of iframes
		System.out.println("Number of frames in a page :" + ele.size());//printing the size of the frames
		//WebElement elem1 = ;
		if (ele.size() == 0)
		{
			try {
			
			 ele1 = getDriver().findElements(By.tagName("iframe"));
			System.out.println(ele1.size());
			if(ele1.size() > 0){
				getBrowser().sleep(2000);
				getDriver().findElement(element.getSelector()).click();
				
			}
				for (int i = 0; i < ele1.size(); i++) 
				{
				getBrowser().sleep(3000);
				System.out.println(getDriver().switchTo().frame(i));
				try 
				{
					getBrowser().sleep(2000);
					if (getDriver().findElement(element.getSelector()).isDisplayed())
					{
						System.out.println("Multiple Iframes are Available ");
						getDriver().findElement(element.getSelector()).click();
						System.out.println("hello");
						break;
					}

				}
				catch (Exception e)
				{

				}
				
				}
			
		
		}
			catch (Exception e)
			{

			}
			finally 
			{
				getDriver().switchTo().defaultContent();
			}
		}
		
		
	
	else
	{

	for(int i = 0;i<ele.size();i++)
	{
		getBrowser().sleep(3000);
		System.out.println(getDriver().switchTo().frame(i));
		
			getBrowser().sleep(2000);
			
			if (getDriver().findElement(element.getSelector()).isDisplayed()) {
				if (getDriver().findElement(element.getSelector()).isEnabled()) {
				System.out.println("Multiple Iframes are Available ");
				WebDriverWait wait = new WebDriverWait(getDriver(),120); 
				wait.until(ExpectedConditions.elementToBeClickable(element.getSelector()));
				getDriver().findElement(element.getSelector()).click();
				System.out.println("hello123");
				break;
				}
				}

		

		} 
			getDriver().switchTo().defaultContent();
		

	}
	}*/

	
	
	public void ElementFromIframe(Control element) {
		List<WebElement> ele = getDriver().findElements(By.tagName("iframe"));
		log("Number of frames in a page33 :" + ele.size());
		//WebElement elem1 = ;
		if (ele.size() == 0) {
			getBrowser().sleep(2000);
			getDriver().findElement(element.getSelector()).click();

		} else {
			for (int i = 0; i < ele.size(); i++) {
				getDriver().switchTo().frame(i);
				try {
					getBrowser().sleep(2000);
					if (getDriver().findElement(element.getSelector()).isDisplayed()) {
						log("Multiple Iframes are Available ");
						getDriver().findElement(element.getSelector()).click();
						break;
					}

				} catch (Exception e) {

				} finally {
					getDriver().switchTo().defaultContent();
				}

			}
		}
	}

	

	public void switchtowindow(String expectedNewWindowTitle, Button button) {
		String parentWindow = getDriver().getWindowHandle();
		String newWindow = "";
		getBrowser().sleep(2000);
		button.click();
		getBrowser().sleep(2000);
		Set<String> allWindowHandles = getDriver().getWindowHandles();
		try {
			if (allWindowHandles.size() > 1) {
				for (String allWindow : allWindowHandles) {

					if (!allWindowHandles.equals(parentWindow)) {
						newWindow = allWindow;

					}
				}
			}

			getDriver().switchTo().window(newWindow);
			getBrowser().sleep(2000);
			logScreenshot();
			Assert.assertEquals(expectedNewWindowTitle, getDriver().getTitle());

		} catch (Exception e) {

		} finally {
			getBrowser().sleep(2000);
			getDriver().switchTo().window(parentWindow);

		}

	}

	public void switchtowindow() {
		String parentWindow = getDriver().getWindowHandle();
		String newWindow = "";
		getBrowser().sleep(2000);
		Set<String> allWindowHandles = getDriver().getWindowHandles();
		try {
			if (allWindowHandles.size() > 1) {
				for (String allWindow : allWindowHandles) {

					if (!allWindowHandles.equals(parentWindow)) {
						newWindow = allWindow;

					}
				}
			}

			getDriver().switchTo().window(newWindow);
			getBrowser().sleep(2000);
			logScreenshot();
			// Assert.assertEquals(expectedNewWindowTitle,
			// getDriver().getTitle());

		} catch (Exception e) {

		}
	}

	public void ElementFromIframeText(Control element, String text) {
		List<WebElement> ele = getDriver().findElements(By.tagName("iframe"));
		System.out.println("Number of frames in a page :" + ele.size());

		if (ele.size() == 0) {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(getDriver()).withTimeout(30, TimeUnit.SECONDS)
					.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchFrameException.class);
			List<WebElement> ele1 = getDriver().findElements(By.tagName("iframe"));
			System.out.println(ele1.size());

			// System.out.println("********Size 0");
			getBrowser().sleep(2000);
			// this.getWhenYouCanApplyDiv().getDivText().equals(this.getWhenYouCanApply());
			element.getText().equals(text);

		} else {
			for (int i = 0; i < ele.size(); i++) {
				System.out.println(getDriver().switchTo().frame(i));

				try {
					getBrowser().sleep(2000);
					getDriver().switchTo().frame(i);
					if (getDriver().findElement(element.getSelector()).isDisplayed()) {

						System.out.println("Multiple Iframes are Available ");
						element.getText().equals(text);
						break;
					}

				} catch (Exception e) {

				} finally {
					getDriver().switchTo().defaultContent();
				}

			}
		}
	}

	public void selectByValue(Control element, String value) {
		Select selectByValue = new Select(getDriver().findElement(element.getSelector()));
		selectByValue.selectByValue("value");
		getBrowser().sleep(2000);

	}

	public void selectByIndex(Control element, int value) {
		Select selectByIndex = new Select(getDriver().findElement(element.getSelector()));
		selectByIndex.selectByIndex(value);
		getBrowser().sleep(2000);

	}

	public void selectByText(Control element, String value) {
		Select selectByVisibleText = new Select(getDriver().findElement(element.getSelector()));
		selectByVisibleText.selectByVisibleText(value);
		getBrowser().sleep(2000);
	}

	public void acceptAlert() {
		try {
			new WebDriverWait(getDriver(), 100).until(ExpectedConditions.alertIsPresent());
			getDriver().switchTo().alert().accept();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public double stringToDouble(Div element){
		String totalspendingstr=element.getText().replaceAll(",", "");
		double expectedTotal;
		if(totalspendingstr.contains("£")){
		
		String totalspending = totalspendingstr.substring(1, totalspendingstr.length() - 1);
		 expectedTotal=Double.parseDouble(totalspending);
		
		}
		else{
		 expectedTotal=Double.parseDouble(totalspendingstr);
		
		}
		return expectedTotal;
		
	}


	public void clickConfirmButton() {
		try {
			WebElement button =getDriver().findElement(By.name("AreYouSureYouWantToAddClientTwo_pyWorkPage_99"));
			button.click();
			getBrowser().getTimeout();
		} catch (Exception e) {
			log("Tab Failed", Level.SEVERE);
			e.printStackTrace();
		}
	}

	public void clickRemoveButtonFromScreen(int numberOfRemoveIcon){

		ArrayList <String> attributes = new ArrayList();

		for (int i=1;i<=numberOfRemoveIcon;i++) {
			try {
			//WebElement removeButton = getDriver().findElement(By.cssSelector("[data-click*='$PD_IncomeItemList_pa']"));
			WebElement removeButton = getDriver().findElement(By.xpath("//*[text()='Remove']"));
			getBrowser().sleep(getBrowser().getTimeout());
			scrollElementIntoView(removeButton);
			getBrowser().sleep(getBrowser().getTimeout()/10);
			attributes.add(removeButton.getAttribute("name"));
			scrollElementIntoView(removeButton);


		}catch (Exception e){

			try{
				WebElement removeButton = getDriver().findElement(By.cssSelector("[data-click*='$PD_IncomeItemList_pa']"));
				WebDriverWait wait = new WebDriverWait(getDriver(), 10);
				wait.until(ExpectedConditions.stalenessOf(removeButton));
				getBrowser().scrollDown();
			}catch (Exception e1){
				System.out.println("Second Catch");
			}
		}

		}

		for (int i=0;i<=attributes.size();i++){
			try {
				WebElement removeButton = getDriver().findElement(By.name(attributes.get(i)));
				getBrowser().sleep(getBrowser().getTimeout());
				scrollElementIntoView(removeButton);
				getBrowser().sleep(getBrowser().getTimeout()/10);
				removeButton.click();
			}catch (Exception e){


			}


		}
	}
	}

