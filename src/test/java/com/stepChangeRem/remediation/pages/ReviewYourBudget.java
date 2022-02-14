package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Control;
import com.stepchange.atf.controls.Div;
import com.stepchange.atf.controls.Dropdown;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.utilities.AAssert;
import org.openqa.selenium.By;

public class ReviewYourBudget extends Control{
		GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
		
		private Dropdown ShowSummaryDrop;
		private Button ShowSummaryContinueButton;

		private Button FoodAndHousekeepingTabClick89924;
    	private Div GroceriesTotalAmount;
	    private Div GroceriesTotalFrequency;
		private Div Groceries1Amount;
		private Div Groceries1Frequency;
	    private Div Groceries2Amount;
	    private Div Groceries2Frequency;
	    private Div Groceries3Amount;
	    private Div Groceries3Frequency;
	    private Div Groceries4Amount;
	    private Div Groceries4Frequency;
	    private Div Groceries5Amount;
	    private Div Groceries5Frequency;


		
		public Dropdown getShowSummaryDrop() {
			return ShowSummaryDrop;
		}
		public Button getShowSummaryContinueButton() {
			return ShowSummaryContinueButton;
		}

	    public Button getFoodAndHousekeepingTabClick89924(){return FoodAndHousekeepingTabClick89924;}
	    public Div getGroceriesTotalAmount(){return GroceriesTotalAmount;}
	    public Div getGroceriesTotalFrequency(){return GroceriesTotalFrequency;}
	    public Div getGroceries1Amount(){return Groceries1Amount;}
	    public Div getGroceries1Frequency(){return Groceries1Frequency;}
	    public Div getGroceries2Amount(){return Groceries2Amount;}
	    public Div getGroceries2Frequency(){return Groceries2Frequency;}
	    public Div getGroceries3Amount(){return Groceries3Amount;}
	    public Div getGroceries3Frequency(){return Groceries3Frequency;}
	    public Div getGroceries4Amount(){return Groceries4Amount;}
	    public Div getGroceries4Frequency(){return Groceries4Frequency;}
	    public Div getGroceries5Amount(){return Groceries5Amount;}
	    public Div getGroceries5Frequency(){return Groceries5Frequency;}

	public ReviewYourBudget() {
			
		    ShowSummaryContinueButton = new Button(By.xpath("//button[normalize-space()='Continue']"));

			FoodAndHousekeepingTabClick89924=new Button(By.xpath("//div[text()='Food and housekeeping']"));

		    GroceriesTotalAmount=new Div(By.xpath("(//div[text()='138.46'])"));
		    GroceriesTotalFrequency=new Div(By.xpath("(//span[text()='4 weekly'])[1]"));
			Groceries1Amount=new Div(By.xpath("(//div[text()='10.00'])[1]"));
		    Groceries1Frequency=new Div(By.xpath("(//span[text()='4 weekly'])[2]"));
		    Groceries2Amount=new Div(By.xpath("(//div[text()='10.00'])[2]"));
		    Groceries2Frequency=new Div(By.xpath("(//span[text()='4 weekly'])[3]"));
		    Groceries3Amount=new Div(By.xpath("(//div[text()='10.00'])[3]"));
		    Groceries3Frequency=new Div(By.xpath("(//span[text()='4 weekly'])[4]"));
		    Groceries4Amount=new Div(By.xpath("(//div[text()='10.00'])[4]"));
		    Groceries4Frequency=new Div(By.xpath("(//span[text()='4 weekly'])[5]"));
		    Groceries5Amount=new Div(By.xpath("//div[text()='98.46']"));
		    Groceries5Frequency=new Div(By.xpath("(//span[text()='4 weekly'])[6]"));
		}
		        public void SelectShowSummaryDropdown () {
				genericMethodsCvp.selectByText(ShowSummaryDrop, "monthly");
			}
			    public void ActionOnShowSummaryContinueButton() {
					genericMethodsCvp.implicitWait(5000);
			    	getBrowser().waitForElementToBeClickable(By.xpath("//button[normalize-space()='Continue']"));
			    	this.getShowSummaryContinueButton().click();

            }
            public void ClickonContinueButtonReviewBudget()
			{
				genericMethodsCvp.implicitWait(1000);
				switchToActiveFrame();
				genericMethodsCvp.implicitWait(1000);
				this.getShowSummaryContinueButton().click();

			}

			public void GroceriesVerifyValuesFor89924()
			{
				switchToActiveFrame();
				this.getFoodAndHousekeepingTabClick89924().click();
				//genericMethodsCvp.implicitWait(3000);
				getBrowser().sleep(3000);
                String GroceriesTotalSum=this.getGroceriesTotalAmount().getDivText();
                String GroceriesTotalFrequency=this.getGroceriesTotalFrequency().getDivText();
                String Groceries1Amt=this.getGroceries1Amount().getDivText();
                String Groceries1Freq=this.getGroceries1Frequency().getDivText();
                String Groceries2Amt=this.getGroceries2Amount().getDivText();
                String Groceries2Freq=this.getGroceries2Frequency().getDivText();
				String Groceries3Amt=this.getGroceries3Amount().getDivText();
				String Groceries3Freq=this.getGroceries3Frequency().getDivText();
				String Groceries4Amt=this.getGroceries4Amount().getDivText();
				String Groceries4Freq=this.getGroceries4Frequency().getDivText();
				String Groceries5Amt=this.getGroceries5Amount().getDivText();
				String Groceries5Freq=this.getGroceries5Frequency().getDivText();
				AAssert.assertContains("138.46",GroceriesTotalSum,"138.46");
				AAssert.assertContains("4 weekly",GroceriesTotalFrequency,"4 weekly");
				AAssert.assertContains("10.00",Groceries1Amt,"verified");
				AAssert.assertContains("4 weekly",Groceries1Freq,"verified");
				AAssert.assertContains("10.00",Groceries2Amt,"verified");
				AAssert.assertContains("4 weekly",Groceries2Freq,"verified");
				AAssert.assertContains("10.00",Groceries3Amt,"verified");
				AAssert.assertContains("4 weekly",Groceries3Freq,"verified");
				AAssert.assertContains("10.00",Groceries4Amt,"verified");
				AAssert.assertContains("4 weekly",Groceries4Freq,"verified");
				AAssert.assertContains("98.46",Groceries5Amt,"verified");
				AAssert.assertContains("4 weekly",Groceries5Freq,"verified");

			}
}
