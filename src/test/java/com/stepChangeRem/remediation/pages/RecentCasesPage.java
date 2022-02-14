package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import org.openqa.selenium.By;

public class RecentCasesPage extends Control{
private Button StatusButton;

public Button getStatusButton() {
	return StatusButton;
}

public RecentCasesPage() {
	StatusButton = new Button(By.xpath("//div[text()='Status:']//following::span[1]"));
}


public void ClickOnStatusButton() {
	this.getStatusButton().click();
}
}