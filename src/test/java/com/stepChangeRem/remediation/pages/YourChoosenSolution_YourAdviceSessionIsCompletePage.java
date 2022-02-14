package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.RadioButton;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class YourChoosenSolution_YourAdviceSessionIsCompletePage extends Control {
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
	private Button DownloadPersonalActionPlanButton;
	private RadioButton DoestheClientwantToWarmTransferifpossibleYesRadioButton;
	private RadioButton DoestheClientwantToWarmTransferifpossibleNoRadioButton;
	private Button YourAdviceSessionIsCompletePageSaveAndExitButton;
	private Button LogoutButton;
	private Button UserIconForLogout;
	private Button CheckBoxForAll;

	//getters
	public Button getLogoutButton(){return LogoutButton;}
	public Button getUserIconForLogout(){return UserIconForLogout;}
	public Button getCheckBoxForAll(){return CheckBoxForAll;}
	
	
	public Button getDownloadPersonalActionPlanButton() {
		return DownloadPersonalActionPlanButton;
	}
	public RadioButton getDoestheClientwantToWarmTransferifpossibleYesRadioButton() {
		return DoestheClientwantToWarmTransferifpossibleYesRadioButton;
	}
	public RadioButton getDoestheClientwantToWarmTransferifpossibleNoRadioButton() {
		return DoestheClientwantToWarmTransferifpossibleNoRadioButton;
	}
	public Button getYourAdviceSessionIsCompletePageSaveAndExitButton() {
		return YourAdviceSessionIsCompletePageSaveAndExitButton;
	}
	
	
	
	
	public YourChoosenSolution_YourAdviceSessionIsCompletePage() {
		
		DownloadPersonalActionPlanButton = new Button(By.xpath("//button[contains(@name,'DownloadAttachment_D')]"));
		DoestheClientwantToWarmTransferifpossibleYesRadioButton = new RadioButton(By.xpath("(//label[@class='rb_ rb_standard radioLabel'])[1]"));
		DoestheClientwantToWarmTransferifpossibleNoRadioButton = new RadioButton(By.xpath("(//label[@class='rb_ rb_standard radioLabel'])[2]"));
		YourAdviceSessionIsCompletePageSaveAndExitButton = new Button(By.xpath("//button[@name='NextSteps_pyWorkPage_46']"));
		LogoutButton = new Button(By.xpath("//span[text()='Logout']"));
		//UserIconForLogout= new Button(By.xpath("//i[contains(@class,'icons avatar name')]"));
		CheckBoxForAll=new Button(By.xpath("//body[@class='screen-layout-body with-fixed-header']"));
	}// another x pathe for logout (//a[contains(@class,'menu-item-anchor ') and @tabindex='-1' ])[9]


	public void LogOutAndCloseBrowser(){
		genericMethodsCvp.implicitWait(5000);
		this.getUserIconForLogout().click();
		genericMethodsCvp.implicitWait(4000);
		this.getLogoutButton().click();
		genericMethodsCvp.implicitWait(5000);
		getDriver().quit();
	}
	
	
	public void ClickOnDownloadPersonalActionPlanButton() {
		genericMethodsCvp.implicitWait(2000);
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(10000);
		this.getDownloadPersonalActionPlanButton().click();
//		genericMethodsCvp.implicitWait(5000);
		this.getYourAdviceSessionIsCompletePageSaveAndExitButton().click();
//		genericMethodsCvp.implicitWait(5000);
//		switchToActiveFrame();
//		this.getCheckBoxForAll().click();
//		genericMethodsCvp.implicitWait(4000);
//		UserIconForLogout.click();
//		genericMethodsCvp.implicitWait(4000);
//		this.getLogoutButton().click();
//		genericMethodsCvp.implicitWait(5000);
//		getDriver().quit();
	}
	
	public void ClickOnDoestheClientwantToWarmTransferifpossibleNoRadioButton() {
		this.getDoestheClientwantToWarmTransferifpossibleNoRadioButton().click();
		
	}
	
	public void ClickOnYourAdviceSessionIsCompletePageSaveAndExitButton() {
		
		genericMethodsCvp.implicitWait(4000);
		this.getYourAdviceSessionIsCompletePageSaveAndExitButton().click();
		genericMethodsCvp.implicitWait(4000);
	}
	
	
	
	
	
	
	
	
}
