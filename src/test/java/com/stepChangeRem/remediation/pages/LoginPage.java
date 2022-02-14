package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.TextField;
import com.stepchange.atf.data.SoleClientaFinancialSol_SC89933_Obj;
import com.stepchange.atf.testdata.SoleClientFinancialSolutionsTestData;
import com.stepchange.atf.utilities.AAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class LoginPage extends Control{
	private TextField Username;
	private TextField password;
	private TextField Uname;
	private TextField Pswd;
	private Button LoginBtn;
	private Button TroubleLoggingIn;
	private String TroubleLoggingInText ="Trouble logging in?";

	private SoleClientaFinancialSol_SC89933_Obj personalDetailsData;


	 public String UName ="vinod.bekinal@aaseya.com"; public String PWD="Jan@2021";

	
	public TextField getUsername() {
		return Username;
	}

	public TextField getPassword() {
		return password;
	}

	public Button getLoginBtn() {
		return LoginBtn;
	}
	public Button getTroubleLoggingIn() {
		return TroubleLoggingIn;
	}


	public LoginPage() {

		Username = new TextField(By.xpath("//input[@id ='txtUserID']"));
		password = new TextField(By.xpath("//input[@id ='txtPassword']"));
		Uname = new TextField(By.xpath("//input[@id ='txtUserID']"));
		Pswd= new TextField(By.xpath("//input[@id ='txtPassword']"));
		LoginBtn = new Button(By.xpath("(//span[@class='loginButtonText'])[1]"));
		TroubleLoggingIn = new Button(By.xpath("//a[text()='Trouble logging in?']"));
	}

	public void EnterUsername(String UserName) {
		this.getUsername().enterText(UserName);
	}

	public void EnterPassword(String Password) {
		this.getPassword().enterText(Password);
	}

	public TextField getUname() {return Uname; }
	public TextField getPswd() {return Pswd; }



	public void clickLoginButton() {
		this.getLoginBtn().click();

	}
	
	public void VerifyingTroubleloggingInText() {
	
		WebElement element = getDriver().findElement(By.xpath("//a[text()='Trouble logging in?']"));
		String data = element.getText();
		System.out.println(data);
		AAssert.assertEquals("Trouble logging in?", data);
	}
	public void LoginintoApplication(){
//		personalDetailsData = SoleClientFinancialSolutionsTestData.getLoginDetails();
		personalDetailsData = SoleClientFinancialSolutionsTestData.getTestData();
		this.getUsername().enterText(personalDetailsData.getUserName());
		this.getPassword().enterText(personalDetailsData.getPassword());
		this.getLoginBtn().click();
		getBrowser().sleep(3000);
	}

	public void UserEntersLoginCredentials()
	{
		WebElement element = getDriver().findElement(By.xpath("//a[text()='Trouble logging in?']"));
		String data = element.getText();
		System.out.println(data);
		AAssert.assertEquals("Trouble logging in?", data);
		/*this.getUsername().enterText(Usname);
		this.getPassword().enterText(Psswd);*/
		this.getLoginBtn().click();

	}

}
