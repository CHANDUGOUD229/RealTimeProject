package com.stepChangeRem.remediation.pages;
import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Link;
import org.openqa.selenium.By;
import org.testng.Assert;

public class Homepage extends Control {
	
	private Button newButton;
	private Button phoneCallButton;
	private Button OutboundPhoneCallButton;
	private Button EmailButton;
	private Button PostButton;
	private Button AdminOnlyButton;
	private Button ReadOnlyButton;
	private Button logOutButton;
	private Button PhoneNotConnectButton;
	private Button HomeButton;
	private Button MyWorkButton;
	private Button dashBoardButton;
	private Button reportButton;
	private Button ManagerToolButton;
	private Button endSession;
	private Button endSessionConfirm;
	private Button clickOnAvatar;
	private Button logout;
	private Button LogoutButton;
	private Button UserIconForLogout;
	public Button getLogoutButton(){return LogoutButton;}
	public Button getUserIconForLogout(){return UserIconForLogout;}

	public Button getLogout() {
		return logout=new Button(By.xpath("//span[.='Logout' and @class='menu-item-title']"));
	}

	public Button getClickOnAvatar() {
		getDriver().switchTo().parentFrame();
		getDriver().switchTo().defaultContent();
		getBrowser().sleep(5000);
		return clickOnAvatar=new Button(By.xpath("//i[contains(@class,'icons avatar name')]"));
	}

	public Button getEndSessionConfirm() {
		return endSessionConfirm=new Button(By.xpath("//button[.='Yes']"));
	}

	public Button getEndSession() {
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().parentFrame();
		getDriver().switchTo().defaultContent();
		getDriver().switchTo().frame(getDriver().findElement(By.id("PegaGadget1Ifr")));
		return endSession=new Button(By.xpath("(//i[@class='pcs-wrap-up pi-regular ico-white margin-r-1x']/..)[1]"));
	}

	public Button getNewButton() {return newButton;}
	public Button getPhoneCallButton() {return phoneCallButton;}
	public Button getOutboundPhoneCallButton() {return OutboundPhoneCallButton;}
	public Button getEmailButton() {return EmailButton;}
	public Button getPostButton() {return PostButton;}
	public Button getAdminOnlyButton() {return AdminOnlyButton;}
	public Button getReadOnlyButton() {return ReadOnlyButton;}
	public Button getLogOutButton() {return logOutButton;}
	public Button getPhoneNotConnectButton() {return PhoneNotConnectButton;}
	public Button getHomeButton() {return HomeButton;}
	public Button getMyWorkButton() {return MyWorkButton;}
	public Button getDashBoardButton() {return dashBoardButton;}
	public Button getReportButton() {return reportButton;}
	public Button getManagerToolButton() {return ManagerToolButton;}
	

	
	public Homepage()
	{
		newButton=new Button(By.xpath("//a[@name ='CPMInteractionPortalHeaderTop_pyDisplayHarness_4' and @class='Header_nav']"));
		phoneCallButton=new Button(By.xpath("//span[text()='Phone Call']"));
		OutboundPhoneCallButton=new Button(By.xpath("//span[text()='Outbound Phone Call']"));
		EmailButton=new Button(By.xpath("//span[text()='Email']"));
		PostButton=new Button(By.xpath("//span[text()='Post']"));
		AdminOnlyButton=new Button(By.xpath("//span[text()='Admin Only']"));
		ReadOnlyButton=new Button(By.xpath("//span[text()='Read Only']"));
		logOutButton=new Button(By.xpath("//div[text()='Logged out']"));
		PhoneNotConnectButton=new Button(By.xpath("//i[@alt='Phone not connected']"));
		HomeButton=new Button(By.xpath("//span[text()='Home']"));
		MyWorkButton=new Button(By.xpath("(//span[@class='menu-item-image-wrapper'])[1]"));
		dashBoardButton=new Button(By.xpath("(//span[@class='menu-item-image-wrapper'])[3]"));
		reportButton=new Button(By.xpath("(//span[@class='menu-item-image-wrapper'])[5]"));
		ManagerToolButton=new Button(By.xpath("(//span[@class='menu-item-image-wrapper'])[7]"));
		LogoutButton = new Button(By.xpath("//span[text()='Logout']"));
		UserIconForLogout= new Button(By.xpath("//i[contains(@class,'icons avatar name')]"));
	}
	
	
	public void  isNavigateToHomepage() 
	{ 	 
		String title = getDriver().getTitle();
		Assert.assertTrue(title.contains("Interaction Portal"), "User is Not able to Navigate to Home Page ");
	}
	
	public void clickNewButton()
	{
		getBrowser().sleep(2000);
		newButton.click();
	}
	public void clickUserIconButton()
	{
		getBrowser().sleep(10000);
		//UserIconForLogout.verifyElementEnabled(true);
		getDriver().switchTo().parentFrame();
		getDriver().switchTo().defaultContent();
		getBrowser().sleep(5000);
		UserIconForLogout.click();
		getBrowser().sleep(4000);
		this.getLogoutButton().click();
		getBrowser().sleep(4000);
		getDriver().quit();
	}
	
	public void selectphoneCall()
	{
		getBrowser().sleep(2000);
		phoneCallButton.click();
	
	}
	public void clickPhoneCallOptionFromhomePage()
	{
		switchToActiveFrame();
		this.getNewButton().click();
		this.getPhoneCallButton().click();
	}
	public void clickonCase()
	{
		switchToActiveFrame();
		new Link("DAV-1128031").click();
	}
	
}
