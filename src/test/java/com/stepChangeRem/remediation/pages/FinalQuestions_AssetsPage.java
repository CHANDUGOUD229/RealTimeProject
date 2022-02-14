package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FinalQuestions_AssetsPage  extends Control{
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
	
	//main home
	private TextField MainHomeTextBox;
	private Dropdown MainhomeOwnerDropdown;
	private TextField MainhomeClient01ShareValueTextbox;
	private TextField MainhomeClient01SharePercentageTextbox;
	private TextField MainhomeClient02ShareValueTextbox;
	private TextField MainhomeClient02SharePercentageTextbox;
	private Checkbox MainhomeNonstandardChb;
	private Button MainhomeRemoveButton;
	private Button MainhomeLinksEditButton;
	//Other properties available on the assests page can be added
	//additional property,vehicle,savings,investment/shares,antique,artwork,musical instrument,luxury item, other item
	private Button addOtherPropertyNameButton;
	private TextField OtherPropertyValuetextField;
	private Dropdown OtherPropertyOwnerDropdown;
	private Button OtherPropertyRemoveButton;
	private Button OtherPropertyAddLinkedItemButton;

	//Saving
	private Button SavingButton;
	private TextField SavingtextField;
	private Dropdown SavingOwnerDropdown;
	private TextField SavingClient01SharePercentageTextbox;
	private TextField SavingClient02SharePercentageTextbox;

	//Antique
	private Button AntiqueButton;
	private TextField AntiquetextField;
	private Dropdown AntiqueOwnerDropdown;


	//Add Links Popup
	private Button AddDebtButton;
	private Dropdown LinksPopupWhatTypeOfDebtDropdown;
	private Dropdown LinksPopupWhoistheCreditorDropdown;
	private Button AddAfterFillingdetailsButton;
	private Button RemoveAfterFillingButton;
	private Checkbox LinksPopupDebtsListChb;
	private Button LinksPopupCancelButton;
	private Button LinksPopupSubmitButton;
	private Checkbox AllofClientsAssetshavebeenCapturedCheckBox;
	private Checkbox AllofClientsAssetshavebeenCapturedCheckBox_89940;
	private Button AssetsPageContinueButton;
	private Checkbox AllofClientsAssetshavebeenCapturedCheckBox89934;
	private Checkbox AllofClientsAssetshavebeenCapturedCheckBox89949;


	//Getter Methods
	public TextField getMainHomeTextBox() {	return MainHomeTextBox;	}
	public Dropdown getMainhomeOwnerDropdown() {return MainhomeOwnerDropdown;}
	public TextField getMainhomeClient01ShareValueTextbox() {return MainhomeClient01ShareValueTextbox ;}
	public TextField getMainhomeClient01SharePercentageTextbox() {return MainhomeClient01SharePercentageTextbox;}
	public TextField getMainhomeClient02ShareValueTextbox() {return MainhomeClient02ShareValueTextbox ;}
	public TextField getMainhomeClient02SharePercentageTextbox() {return MainhomeClient02SharePercentageTextbox;}
	public Checkbox getMainhomeNonstandardChb() {return MainhomeNonstandardChb;}
	public Button getMainhomeRemoveButton() {return MainhomeRemoveButton;}
	public Button getMainhomeLinksEditButton() {return MainhomeLinksEditButton;}
	public Checkbox getAllofClientsAssetshavebeenCapturedCheckBox() {return AllofClientsAssetshavebeenCapturedCheckBox;}
	public Checkbox getAllofClientsAssetshavebeenCapturedCheckBox_89940(){ return AllofClientsAssetshavebeenCapturedCheckBox_89940;}
	public Button getAssetsPageContinueButton() {return AssetsPageContinueButton;}
	
	public Button getaddOtherPropertyNameButton() {return addOtherPropertyNameButton;}
	public TextField getOtherPropertyValuetextField() {return OtherPropertyValuetextField;}
	public Dropdown getOtherPropertyOwnerDropdown() {return OtherPropertyOwnerDropdown;}
	public Button getOtherPropertyRemoveButton() {return OtherPropertyRemoveButton;}
	public Button getOtherPropertyAddLinkedItemButton() {return OtherPropertyAddLinkedItemButton;}
	
	public Button getAddDebtButton() {return AddDebtButton;}
	public Dropdown getLinksPopupWhatTypeOfDebtDropdown() {return LinksPopupWhatTypeOfDebtDropdown;}
	public Dropdown getLinksPopupWhoistheCreditorDropdown() {return LinksPopupWhoistheCreditorDropdown;}
	public Button getAddAfterFillingdetailsButton() {return AddAfterFillingdetailsButton;}
	public Button getRemoveAfterFillingButton() {return RemoveAfterFillingButton;}
	public Checkbox getLinksPopupDebtsListChb() {return LinksPopupDebtsListChb;}
	public Button getLinksPopupCancelButton() {return LinksPopupCancelButton;}
	public Button getLinksPopupSubmitButton() {return LinksPopupSubmitButton;}
	public Checkbox getAllofClientsAssetshavebeenCapturedCheckBox89934(){return AllofClientsAssetshavebeenCapturedCheckBox89934;}

	public Button getSavingButton(){return SavingButton;}
	public TextField getSavingtextField(){return SavingtextField;}
	public Dropdown getSavingOwnerDropdown(){return SavingOwnerDropdown;}
	public TextField getSavingClient01SharePercentageTextbox(){return SavingClient01SharePercentageTextbox;}
	public TextField getSavingClient02SharePercentageTextbox(){return SavingClient02SharePercentageTextbox;}

	//Antique
	public Button getAntiqueButton(){return AntiqueButton;}
	public TextField getAntiquetextField(){return AntiquetextField;}
	public Dropdown getAntiqueOwnerDropdown(){return AntiqueOwnerDropdown;}

	public Checkbox getAllofClientsAssetshavebeenCapturedCheckBox89949() { return AllofClientsAssetshavebeenCapturedCheckBox89949; }



	//Constructor
	public FinalQuestions_AssetsPage(String otherPropertyName,Integer LinksPopupCheckboxList) {
		MainHomeTextBox = new TextField(By.xpath("//div[text()='Main home']//following::input[2]"));
		MainhomeOwnerDropdown=new Dropdown(By.xpath("//div[text()='Main home']//following::select[1]"));
		MainhomeClient01ShareValueTextbox=new TextField(By.xpath("//div[text()='Main home']//following::input[3]"));
		MainhomeClient01SharePercentageTextbox=new TextField(By.xpath("//div[text()='Main home']//following::input[4]"));
	    MainhomeClient02ShareValueTextbox=new TextField(By.xpath("//div[text()='Main home']//following::input[5]"));
		MainhomeClient02SharePercentageTextbox=new TextField(By.xpath("//div[text()='Main home']//following::input[6]"));
		MainhomeNonstandardChb=new Checkbox(By.xpath("//label[text()='Lives in non-standard house']"));
		MainhomeRemoveButton=new Button(By.xpath("//div[text()='Main home']//following::button[1]"));
		MainhomeLinksEditButton=new Button(By.xpath("//div[text()='Main home']//following::a[3]"));
		//AllofClientsAssetshavebeenCapturedCheckBox89934 = new Checkbox(By.xpath("//label[@class=' cb_standard' and @data-test-id='2017111121112905678655-Label']"));
		AllofClientsAssetshavebeenCapturedCheckBox89934 = new Checkbox(By.xpath("//label[@class=' cb_standard' and @data-test-id='2017111121112905678655-Label']"));
		AllofClientsAssetshavebeenCapturedCheckBox= new Checkbox(By.xpath("(//label[@class=' cb_standard'])[2]"));
		AllofClientsAssetshavebeenCapturedCheckBox_89940= new Checkbox(By.xpath("(//label[@class=' cb_standard'])[1]"));
		AssetsPageContinueButton = new Button(By.xpath("//button[text()='Continue']"));
		addOtherPropertyNameButton=new Button(By.xpath("//button[text()='"+otherPropertyName+"']"));
		OtherPropertyValuetextField=new TextField(By.xpath("(//div[text()='"+otherPropertyName+"']//following::input[2])[1]"));
        OtherPropertyOwnerDropdown=new Dropdown(By.xpath("(//div[text()='"+otherPropertyName+"']//following::select[1])[1]"));
        OtherPropertyRemoveButton=new Button(By.xpath("(//div[text()='"+otherPropertyName+"']//following::button[2])[1]"));
        OtherPropertyAddLinkedItemButton=new Button(By.xpath("(//div[text()='"+otherPropertyName+"']//following::button[1])[1]"));
		
        AddDebtButton=new Button(By.xpath("//button[text()='Debt']"));
    	LinksPopupWhatTypeOfDebtDropdown=new Dropdown(By.xpath("//label[text()='What type of debt is it?']//following::select[1]"));
    	LinksPopupWhoistheCreditorDropdown=new Dropdown(By.xpath("//label[text()='Who is the creditor?']//following::input[1]"));
    	AddAfterFillingdetailsButton=new Button(By.xpath("//button[text()='Add']"));
    	RemoveAfterFillingButton=new Button(By.xpath("(//button[text()='Remove'])[1]"));
    	LinksPopupDebtsListChb=new Checkbox(By.xpath("(//div[@section_index='1']//following::input[@type='checkbox'])[LinksPopupCheckboxList]"));
    	LinksPopupCancelButton=new Button(By.name("Modal_Buttons_D_AssetItemList_pa4516495740754815pz.pxResults(2)_8"));
    	LinksPopupSubmitButton=new Button(By.xpath("//span/button[text()='Submit']"));

		SavingButton=new Button(By.xpath("//button[text()='savings']"));
		SavingtextField=new TextField(By.xpath("(//div[text()='Savings']//following::input[2])[1]"));
		SavingOwnerDropdown=new Dropdown(By.xpath("(//div[text()='Savings']//following::select[1])[1]"));
		SavingClient01SharePercentageTextbox=new TextField(By.xpath("//div[text()='Savings']//following::input[4]"));
		SavingClient02SharePercentageTextbox=new TextField(By.xpath("//div[text()='Savings']//following::input[6]"));

		//Antique
		AntiqueButton=new Button(By.xpath("//button[text()='antique']"));
		AntiquetextField=new TextField(By.xpath("(//div[text()='Antique']//following::input[2])[1]"));
		AntiqueOwnerDropdown=new Dropdown(By.xpath("(//div[text()='Antique']//following::select[1])[1]"));
		AllofClientsAssetshavebeenCapturedCheckBox89949= new Checkbox(By.xpath("//label[@class=' cb_standard']"));
		AllofClientsAssetshavebeenCapturedCheckBox= new Checkbox(By.xpath("(//label[@class=' cb_standard'])"));
	}
	public FinalQuestions_AssetsPage() {
		// TODO Auto-generated constructor stub
		this("",2);
	}

	public void FinalQuestionsFill89929()
	{
		switchToActiveFrame();
		(new WebDriverWait(getDriver(),30)).until(ExpectedConditions.elementToBeClickable(getMainHomeTextBox().getSelector()));
		this.getMainHomeTextBox().enterTextField("170000");
		this.getMainHomeTextBox().tab();
		this.getMainhomeClient01ShareValueTextbox().enterTextField("50");
		this.getMainhomeClient01ShareValueTextbox().tab();
		this.getMainhomeClient02SharePercentageTextbox().enterTextField("50");
		this.getMainhomeClient02SharePercentageTextbox().tab();
		this.getAllofClientsAssetshavebeenCapturedCheckBox().click();
		this.getAssetsPageContinueButton().click();
	}


public void ContinueasGuestUser()
	{
		switchToActiveFrame();
		this.getAllofClientsAssetshavebeenCapturedCheckBox().click();
		this.getAssetsPageContinueButton().click();
	}

	public void ClickAssetsPageContinewButton() {
		this.getAssetsPageContinueButton().click();
		genericMethodsCvp.implicitWait(3000);

	}
	public void ClickAllofClientsAssetshavebeenCapturedCheckBox() {
		this.getAllofClientsAssetshavebeenCapturedCheckBox().click();
		genericMethodsCvp.implicitWait(3000);
	}
	public void FinalQuestionsFillAsset89934()
	{
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(10000);
		this.getAllofClientsAssetshavebeenCapturedCheckBox89934().click();
		this.getAssetsPageContinueButton().click();
		genericMethodsCvp.implicitWait(10000);
	}

	public void FillAssestsJointMPA()
	{
		genericMethodsCvp.implicitWait(7000);
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(10000);
		this.getMainHomeTextBox().enterTextField("120000");
		genericMethodsCvp.implicitWait(4000);
		this.getMainhomeOwnerDropdown().selectFromDropdown("OWN0003");
		genericMethodsCvp.implicitWait(10000);
		this.getMainhomeClient01SharePercentageTextbox().enterTextField("50");
		genericMethodsCvp.implicitWait(4000);
		this.getMainhomeClient02SharePercentageTextbox().enterTextField("50");
		genericMethodsCvp.implicitWait(4000);
		this.getSavingButton().click();
		genericMethodsCvp.implicitWait(4000);
		this.getSavingtextField().enterTextField("1000");
		this.getSavingOwnerDropdown().selectFromDropdown("OWN0003");
		genericMethodsCvp.implicitWait(4000);
		this.getSavingClient01SharePercentageTextbox().enterTextField("35");
		genericMethodsCvp.implicitWait(6000);
		this.getSavingClient02SharePercentageTextbox().enterTextField("65");
		genericMethodsCvp.implicitWait(6000);
        this.getAntiqueButton().click();
		genericMethodsCvp.implicitWait(4000);
        this.getAntiquetextField().enterTextField("500");
		genericMethodsCvp.implicitWait(4000);
        this.getAntiqueOwnerDropdown().selectFromDropdown("OWN0001");
        scrollDown();
		getBrowser().sleep(2000);
		//ClickAllofClientsAssetshavebeenCapturedCheckBox();
		this.getAllofClientsAssetshavebeenCapturedCheckBox().click();
		genericMethodsCvp.implicitWait(5000);
		this.getAssetsPageContinueButton().click();
		genericMethodsCvp.implicitWait(5000);


	}
	public void ContinueasGuestUser89949()
	{
		switchToActiveFrame();
		this.getAllofClientsAssetshavebeenCapturedCheckBox89949().click();
		genericMethodsCvp.implicitWait(3000);
		this.getAssetsPageContinueButton().click();
		genericMethodsCvp.implicitWait(3000);
	}

}
