package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import org.openqa.selenium.By;

public class DPACheckPage extends Control {

	private Button PassedDPAButton;

	public Button getPassedDPAButton() {
		return PassedDPAButton;
	}

	public DPACheckPage() {
		PassedDPAButton = new Button(By.xpath("//button[text()='Passed DPA']"));

	}

	public void ClickOnPassedDPAButton() {
		this.getPassedDPAButton().click();
	}



}
