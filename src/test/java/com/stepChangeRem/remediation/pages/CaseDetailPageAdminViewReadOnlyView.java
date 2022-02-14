package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Link;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

public class CaseDetailPageAdminViewReadOnlyView  extends Control{
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();

	private Button DebtsTabBreadcrumbs;
	private Button IncomeTabBreadcrumbs;
	private Button SpendingTabBreadcrumbs;
	private Button AssetsTabBreadcrumbs;
	private Button FutureChangesTabBreadcrumbs;
	private Button SummaryTabBreadcrumbs;
	private Button MakeChangesButton1;
	private Button AreYouSurePopUpConfirmButton;
	private Button TopRightToolIconButton;
	private Button DetailViewDropValueFromToolIcon;
	private Link pendingverificationLink;

	public Button getDebtsTabBreadcrumbs() { return DebtsTabBreadcrumbs;}
	public Button getIncomeTabBreadcrumbs() { return IncomeTabBreadcrumbs;}
	public Button getSpendingTabBreadcrumbs() { return SpendingTabBreadcrumbs;}
	public Button getAssetsTabBreadcrumbs() { return AssetsTabBreadcrumbs;}
	public Button getFutureChangesTabBreadcrumbs() { return FutureChangesTabBreadcrumbs;}
	public Button getSummaryTabBreadcrumbs() { return SummaryTabBreadcrumbs;}
	public Button getMakeChangesButton1() { return MakeChangesButton1;}
	public Button getAreYouSurePopUpConfirmButton() { return AreYouSurePopUpConfirmButton;}
	public Button getTopRightToolIconButton() { return TopRightToolIconButton;}
	public Button getDetailViewDropValueFromToolIcon() { return DetailViewDropValueFromToolIcon;}
	public Link getpendingverificationLink() {return pendingverificationLink;}
	public CaseDetailPageAdminViewReadOnlyView()
	{
		DebtsTabBreadcrumbs=new Button(By.xpath("//h3[normalize-space()='Debts']"));
		IncomeTabBreadcrumbs = new Button(By.xpath("//h3[normalize-space()='Income']"));
		SpendingTabBreadcrumbs = new Button(By.xpath("//h3[normalize-space()='Spending']"));
		AssetsTabBreadcrumbs = new Button(By.xpath("//h3[normalize-space()='Assets']"));
		FutureChangesTabBreadcrumbs = new Button(By.xpath("///h3[normalize-space()='Future changes']"));
	    SummaryTabBreadcrumbs = new Button(By.xpath("//h3[normalize-space()='Summary']"));
	    MakeChangesButton1 = new Button(By.xpath("//button[normalize-space()='Make changes']"));
	    AreYouSurePopUpConfirmButton =new Button(By.xpath("//button[normalize-space()='Confirm']"));
	    TopRightToolIconButton = new Button(By.xpath("//i[contains(@class,'pi pi-wrench pi-medium pi-blue')]"));
	    DetailViewDropValueFromToolIcon = new Button(By.xpath("//span[contains(text(),'Detailed View')]"));
		pendingverificationLink=new Link(By.xpath("//a[@title='Open this assignment']"));

	}
	
	public void SetOfActionCaseDetailPageAdminViewSC89937()
	{

		switchToActiveFrame();
		genericMethodsCvp.implicitWait(2000);
		this.getDebtsTabBreadcrumbs().click();
		genericMethodsCvp.implicitWait(2000);
		this.getIncomeTabBreadcrumbs().click();
		genericMethodsCvp.implicitWait(2000);
		this.getSpendingTabBreadcrumbs().click();
		genericMethodsCvp.implicitWait(2000);
		this.getAssetsTabBreadcrumbs().click();
		genericMethodsCvp.implicitWait(2000);
		this.getFutureChangesTabBreadcrumbs().click();
		genericMethodsCvp.implicitWait(2000);
		this.getSummaryTabBreadcrumbs().click();
		genericMethodsCvp.implicitWait(2000);
		this.getMakeChangesButton1().click();
		
	}
	public void SetOfActionCaseDetailPageViewOnlySC89937()
	{

		switchToActiveFrame();
		this.getDebtsTabBreadcrumbs().click();
		genericMethodsCvp.implicitWait(1000);
		this.getIncomeTabBreadcrumbs().click();
		genericMethodsCvp.implicitWait(1000);
		this.getSpendingTabBreadcrumbs().click();
		genericMethodsCvp.implicitWait(1000);
		this.getAssetsTabBreadcrumbs().click();
		genericMethodsCvp.implicitWait(1000);
		this.getFutureChangesTabBreadcrumbs().click();
		genericMethodsCvp.implicitWait(2000);
		this.getTopRightToolIconButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getDetailViewDropValueFromToolIcon().click();
		
		//Driver.switchWindow.window1.drive.quit.-------this mehted need to use for 
		}

	public void soleClientverifydata()
	{
		switchToActiveFrame();
		this.getDebtsTabBreadcrumbs().click();
		genericMethodsCvp.implicitWait(1000);
		this.getpendingverificationLink().click();


	}
   }
