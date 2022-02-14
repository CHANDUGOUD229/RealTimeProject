package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Checkbox;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.TextField;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.utilities.RandomGenerators;
import org.openqa.selenium.By;

public class ConfirmEmailAddressPage extends Control {
	final String email = RandomGenerators.getRandomString();
	final String finalValue = "test"+ email;
	GenericMethodsRemediation GenericMethods_cvp=new GenericMethodsRemediation();
	private TextField emailAddressClient01 ;
	private TextField emailAddressClient02;
	private Checkbox emailAddressChangeConfirmChbClient01;
	private Checkbox emailAddressChangeConfirmChbClient02;
	private Checkbox emailAddressChangeConfirmAndFormatInvalidChbClient01;
	private Checkbox emailAddressChangeConfirmAndFormatInvalidChbClient02;
	private Button confirmBtn  ;
	private Button confirmEmailTitle ;
	private Button cancelButtonConfirmEmailPopup;
	
   //getters
	public TextField getEmailAddressClient01() {return emailAddressClient01;}
	public TextField getemailAddressClient02() {return emailAddressClient02;}
	public Checkbox getemailAddressChangeConfirmChbClient01() {return emailAddressChangeConfirmChbClient01;}
	public Checkbox getemailAddressChangeConfirmChbClient02() {return emailAddressChangeConfirmChbClient02;}
	public Checkbox getemailAddressChangeConfirmAndFormatInvalidChbClient01() {return emailAddressChangeConfirmAndFormatInvalidChbClient01;}
	public Checkbox getemailAddressChangeConfirmAndFormatInvalidChbClient02() {return emailAddressChangeConfirmAndFormatInvalidChbClient02;}
	public Button getConfirmBtn() {return confirmBtn;}
	public Button getConfirmEmailTitle() {return confirmEmailTitle;}
	public Button getcancelButtonConfirmEmailPopup() {return cancelButtonConfirmEmailPopup;}

	//Constructor
	public ConfirmEmailAddressPage()
	{
		emailAddressClient01=new TextField(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$ppyEmail']"));
		emailAddressClient02=new TextField(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l2$ppyEmail']"));
		emailAddressChangeConfirmChbClient01=new Checkbox(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pConfirmEmailAddressIsCorrect'][2]"));
		emailAddressChangeConfirmChbClient02=new Checkbox(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l2$pConfirmEmailAddressIsCorrect'][2]"));
		emailAddressChangeConfirmAndFormatInvalidChbClient01=new Checkbox(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pConfirmEmailAddressIsCorrect'][1]"));
		emailAddressChangeConfirmAndFormatInvalidChbClient02=new Checkbox(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l2$pConfirmEmailAddressIsCorrect'][1]"));
		confirmBtn=new Button(By.xpath("//button[@name='VerifyEmailAddress_pyWorkPage_11']"));
		confirmEmailTitle = new Button(By.xpath("//span[@id='modaldialog_hd_title']"));
		cancelButtonConfirmEmailPopup=new Button(By.xpath("//button[@name='VerifyEmailAddress_pyWorkPage_8']"));
	}
	
	

	public void fillConfirmEmailAddressDetails(String fullEmailAddress)
	{
		this.getEmailAddressClient01().enterText(fullEmailAddress);
		this.getConfirmEmailTitle().click();
		GenericMethods_cvp.implicitWait(2000);
		this.getConfirmBtn().click();
		GenericMethods_cvp.implicitWait(2000);

	}
	public void fillconfirmEmailTwoClients()
	{
		GenericMethods_cvp.implicitWait(3000);
		this.getEmailAddressClient01().enterText(finalValue+"@gmail.com");
		this.getEmailAddressClient01().tab();
		GenericMethods_cvp.implicitWait(3000);
		getBrowser().sleep(2000);
		this.getEmailAddressClient01().enterText(finalValue+"@gmail.com");
		getBrowser().sleep(4000);
		this.getemailAddressClient02().clear();
		GenericMethods_cvp.implicitWait(3000);
		this.getemailAddressClient02().enterText(finalValue+"1"+"@gmail.com");
		this.getemailAddressClient02().tab();
		GenericMethods_cvp.implicitWait(3000);
		this.getConfirmBtn().click();
		GenericMethods_cvp.implicitWait(3000);
	}

	/*//Lavanya-89929

	/*public void fillconfirmEmailTwoClients()
//	{
//		this.getEmailAddressClient01().enterText(finalValue+"@gmail.com");
//		getBrowser().sleep(2000);
//		this.getemailAddressClient02().clear();
//		this.getemailAddressClient02().enterTextField(finalValue+"1"+"@gmail.com");
//		this.getConfirmBtn().click();
//		GenericMethods_cvp.implicitWait(2000);
//	}*/
//
//	//Lavanya-89929
//
//	public void fillconfirmEmailTwoClients(String fullEmailAddress,String fullEmailAddressClientTwo)
//	{
//		this.getEmailAddress().enterText(fullEmailAddress);
//		this.getemailAddressClientTwo().enterTextField(fullEmailAddressClientTwo);
//		this.getConfirmEmail().click();
//		this.getConfirmBtn().click();
//		GenericMethods_cvp.implicitWait(2000);
//	}
//
//

	public void fillConfirmEmailAddressDetailsguestuser()
	{
		this.getEmailAddressClient01().enterText("remo12@aol.com");
//		this.getConfirmEmail().click();
		this.getConfirmBtn().click();
		GenericMethods_cvp.implicitWait(2000);

	}
	public void fillconfirmEmailTwoClientsfor89949()
	{
		this.getEmailAddressClient01().enterText("Sele@aol.com");
		GenericMethods_cvp.implicitWait(3000);
		this.getemailAddressClient02().enterText("Jain@aol.com");
		this.getConfirmBtn().click();
		GenericMethods_cvp.implicitWait(2000);
	}

}

