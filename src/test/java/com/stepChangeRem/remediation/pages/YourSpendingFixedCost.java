package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.*;
import com.stepchange.atf.data.SpendingFixedCostData;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import com.stepchange.atf.testdata.SpendingFixedCostTestData;
import org.openqa.selenium.By;

public class YourSpendingFixedCost extends Control {
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
	private Button removeDuelFuelButton;
	private Button removeLifeInsuranceButton;
	private Button removePublictransportButton;
	private Button removeMedicineButton;
	private Button removeDentistryButton;
	private Button removeOpticiansButton;
	private Button electricityArrearYesButton;
	private Button electricityLinkedItem;
	private TextField councileTax;
	private Dropdown  councileMonthlyDrop;
	private Button councileArrearButton;

	private TextField tvLicence;
	private Dropdown  tvMonthlyDrop;
	private Button tvArrearButton;

	private TextField electricityUtility;
	private Dropdown  electricityMonthlyDrop;
	private Button electricityArrearButton;
	private TextField electricitySupplier;

	private TextField gasUtility;
	private Dropdown  gasMonthlyDrop;
	private Button gasArrearButton;
	private TextField gasSupplier;

	private TextField waterSupplyUtility;
	private Dropdown  waterSupplyMonthlyDrop;
	private Button waterSupplyArrearButton;
	private TextField waterSupplySupplier;



	private TextField billingAndInsurance;
	private Dropdown  billingAndInsuranceMonthlyDrop;
	private Button billingAndInsuranceArrearButton;
	private Button yourIncomeButtonButton;

	private Checkbox allFixedSpendingCompleted;
	private Button continueYourFixedSpendingButton;

	private Button ChildcareButton;
	private Button ChildcareButton_89940;
	private Button AfterSchoolClubsandSchoolTrips;

	private TextField Rent;
	private Dropdown RentMonthly;
	private Button RentArrearsNoButton;

	private TextField SchoolUniform;
	private Dropdown SchoolUniformMonthly;
	private Button SchoolUniformArrearsNoButton;

	private TextField ChildcareTectBox;
	private Dropdown ChildcareDropdownMonthly;
	private Button ChildcareArrearsNoButton;

	private Button Flexiblecostlink;

	private TextField RoadTax2;
	private Dropdown  RoadTaxMonthlyDrop2;

	private TextField Fuel1;
	private Dropdown  FuelMonthlyDrop1;

	private TextField Fuel2;
	private Dropdown  FuelMonthlyDrop2;

	private TextField BreakDown1;
	private Dropdown  BreakDownMonthlyDrop1;

	private TextField BreakDown2;
	private Dropdown  BreakDownMonthlyDrop2;

	private TextField MOTAndOngoing1;
	private Dropdown  MOTAndOngoingMonthlyDrop1;
	private TextField Board;
	private Dropdown BoardDrop;
	private Button BoardArrearNoButton;
	private TextField RoadTax1;
	private Dropdown RoadTaxMonthlyDrop1;

	private TextField MOTAndOngoing2;
	private Dropdown  MOTAndOngoingMonthlyDrop2;

	private TextField Prescriptions;
	private Dropdown  PrescriptionsMonthlyDrop;

	private TextField Dentistry;
	private Dropdown  DentistryMonthlyDrop;


	private TextField Opticians;
	private Dropdown  OpticiansMonthlyDrop;



	private TextField publicTransport;
	private Dropdown  publicTransportMonthlyDrop;
	private Button publicTransportArrearButton;

	private TextField Rates;
	private Dropdown  RatesMonthlyDrop;
	private Button RatesArrearNoButton;





	private Button LinkspopupAddDebt;
	private AutoComplete LinkspopupWhoisTheCreditor;
	private Dropdown LinkspopupWhoisLiablefortheDebt;
	private TextField LinkspopupWhoisTheCreditorMPA;
	private TextField LinkspopupWhoisLiablefortheDebtMPA;
	private TextField LinkspopupHowmuchisOwned;
	private Button LinkspopupActionTakenByCreditorNoAction;
	private Button linksPopUpActionTakenByCreditorCourtAction;
	private Button linksPopUpActionTakenByCreditorCourtActionEnforcement;
	private Button linksPopUpActionTakenByCreditorCourtActionEnforcementAttachmentOfEarnings;
	private TextField linksPopUpHowMuchRepaying;
	private Dropdown linksPopUpHowMuchRepayingDropDown;
	private Button LinkspopupArrangementInplaceToRepayNoButton;
	private Button LinkspopupSubmitButton;
    private Button BritishGasFirstOptionClick;

	public Button getFlexiblecostlink() {
		return Flexiblecostlink;
	}
	public TextField getChildcareTectBox() {
		return ChildcareTectBox;
	}
	public Dropdown getChildcareDropdownMonthly() {
		return ChildcareDropdownMonthly;
	}
	private Button getChildcareArrearsNoButton() {
		return ChildcareArrearsNoButton;
	}

	public TextField getSchoolUniform() {
		return SchoolUniform;
	}
	public Dropdown getSchoolUniformMonthly() {
		return SchoolUniformMonthly;
	}
	private Button getSchoolUniformArrearsNoButton() {
		return SchoolUniformArrearsNoButton;
	}

	public TextField getRent() {
		return Rent;
	}
	public Dropdown getRentMonthly() {
		return RentMonthly;
	}
	private Button getRentArrearsNoButton() {
		return RentArrearsNoButton;
	}

	public Button getAfterSchoolClubsandSchoolTrips() {
		return AfterSchoolClubsandSchoolTrips;
	}
	public Button getChildcareButton() {
		return ChildcareButton;
	}

	public Button getChildcareButton_89940(){
		return ChildcareButton_89940;
	}
	public Button getRemoveDuelFuelButton() {
		return removeDuelFuelButton;
	}

	public Button getRemoveLifeInsuranceButton() {
		return removeLifeInsuranceButton;
	}

	public Button getRemovePublictransportButton() {
		return removePublictransportButton;
	}

	public Button getRemoveMedicineButton() {
		return removeMedicineButton;
	}

	public Button getRemoveDentistryButton() {
		return removeDentistryButton;
	}

	public Button getRemoveOpticiansButton() {
		return removeOpticiansButton;
	}


	public TextField getCouncileTax() {
		return councileTax;
	}
	public Dropdown getCouncileMonthlyDrop() {
		return councileMonthlyDrop;
	}
	public Button getCouncileArrearButton() {
		return councileArrearButton;
	}

	public TextField getTvLicence() {
		return tvLicence;
	}
	public Dropdown getTvMonthlyDrop() {
		return tvMonthlyDrop;
	}
	public Button getTvArrearButton() {
		return tvArrearButton;
	}

	public TextField getElectricityUtility() {
		return electricityUtility;
	}
	public Dropdown getElectricityMonthlyDrop() {
		return electricityMonthlyDrop;
	}
	public Button getElectricityArrearButton() {
		return electricityArrearButton;
	}
	public TextField getElectricitySupplier() {
		return electricitySupplier;
	}
	public Button getelectricityArrearYesButton() {
		return electricityArrearYesButton;
	}
	public Button getelectricityLinkedItem() {
		return electricityLinkedItem;
	}

	public TextField getGasUtility() {
		return gasUtility;
	}
	public Dropdown getGasMonthlyDrop() {
		return gasMonthlyDrop;
	}
	public Button getGasArrearButton() {
		return gasArrearButton;
	}
	public TextField getGasSupplier() {
		return gasSupplier;
	}

	public TextField getWaterSupplyUtility() {
		return waterSupplyUtility;
	}
	public Dropdown getWaterSupplyMonthlyDrop() {
		return waterSupplyMonthlyDrop;
	}
	public Button getWaterSupplyArrearButton() {
		return waterSupplyArrearButton;
	}
	public TextField getWaterSupplySupplier() {
		return waterSupplySupplier;
	}

	public TextField getBillingAndInsurance() {
		return billingAndInsurance;
	}
	public Dropdown getBillingAndInsuranceMonthlyDrop() {
		return billingAndInsuranceMonthlyDrop;
	}
	public Button getBillingAndInsuranceArrearButton() {
		return billingAndInsuranceArrearButton;
	}


	public TextField getpublicTransport() {
		return publicTransport;
	}
	public Dropdown  getpublicTransportMonthlyDrop() {
		return publicTransportMonthlyDrop;
	}
	public Button getpublicTransportArrearButton() {
		return publicTransportArrearButton;
	}
	private TextField BuildingsAndcontentInsurance;
	private Dropdown  BuildingsAndContentInsuranceMonthlyDrop;
	private Button BuildingsAndContentInsuranceNoArrearButton;

	private TextField LifeInsurance;
	private Dropdown  LifeInsuranceMonthlyDrop;
	private Button LifeInsuranceNoArrearButton;

	private TextField CarInsurance1;
	private Dropdown  CarInsuranceMonthlyDrop1;
	private Button CarInsuranceNoArrearButton1;

	private TextField CarInsurance2;
	private Dropdown  CarInsuranceMonthlyDrop2;
	private Button CarInsuranceNoArrearButton2;


	public Checkbox getAllFixedSpendingCompleted() {
		return allFixedSpendingCompleted;
	}
	public Button getContinueYourFixedSpendingButton() {
		return continueYourFixedSpendingButton;
	}
	public Button getYourIncomeButtonButton() {
		return yourIncomeButtonButton;
	}

	public TextField getBoard() {return Board;}
	public Dropdown  getBoardDrop() {return BoardDrop;}
	public Button getBoardArrearNoButton() {return BoardArrearNoButton;}

	public TextField getBuildingsAndcontentInsurance() {return BuildingsAndcontentInsurance;}
	public Dropdown  getBuildingsAndContentInsuranceMonthlyDrop() {return BuildingsAndContentInsuranceMonthlyDrop;}
	public Button getBuildingsAndContentInsuranceNoArrearButton() {return BuildingsAndContentInsuranceNoArrearButton;}

	public TextField getLifeInsurance() {return LifeInsurance;}
	public Dropdown  getLifeInsuranceMonthlyDrop() {return LifeInsuranceMonthlyDrop;}
	public Button getLifeInsuranceNoArrearButton() {return LifeInsuranceNoArrearButton;}

	public TextField getCarInsurance1() {return CarInsurance1;}
	public Dropdown  getCarInsuranceMonthlyDrop1() {return CarInsuranceMonthlyDrop1;}
	public Button getCarInsuranceNoArrearButton1() {return CarInsuranceNoArrearButton1;}

	public TextField getCarInsurance2() {return CarInsurance2;}
	public Dropdown  getCarInsuranceMonthlyDrop2() {return CarInsuranceMonthlyDrop2;}
	public Button getCarInsuranceNoArrearButton2() {return CarInsuranceNoArrearButton2;}

	public TextField getRoadTax1() {return RoadTax1;}
	public Dropdown  getRoadTaxMonthlyDrop1() {return RoadTaxMonthlyDrop1;}

	public TextField getRoadTax2() {return RoadTax2;}
	public Dropdown  getRoadTaxMonthlyDrop2() {return RoadTaxMonthlyDrop2;}

	public TextField getFuel1() {return Fuel1;}
	public Dropdown  getFuelMonthlyDrop1() {return FuelMonthlyDrop1;}

	public TextField getFuel2() {return Fuel2;}
	public Dropdown  getFuelMonthlyDrop2() {return FuelMonthlyDrop2;}

	public TextField getBreakDown1() {return BreakDown1;}
	public Dropdown  getBreakDownMonthlyDrop1() {return BreakDownMonthlyDrop1;}

	public TextField getBreakDown2() {return BreakDown2;}
	public Dropdown  getBreakDownMonthlyDrop2() {return BreakDownMonthlyDrop2;}

	public TextField getMOTAndOngoing1() {return MOTAndOngoing1;}
	public Dropdown  getMOTAndOngoingMonthlyDrop1() {return MOTAndOngoingMonthlyDrop1;}

	public TextField getMOTAndOngoing2() {return MOTAndOngoing2;}
	public Dropdown  getMOTAndOngoingMonthlyDrop2() {return MOTAndOngoingMonthlyDrop2;}

	public TextField getPrescriptions() {return Prescriptions;}
	public Dropdown getPrescriptionsMonthlyDrop() {return PrescriptionsMonthlyDrop;}

	public TextField getDentistry() {return Dentistry;}
	public Dropdown  getDentistryMonthlyDrop() {return DentistryMonthlyDrop;}

	public TextField getOpticians() {return Opticians;}
	public Dropdown  getOpticiansMonthlyDrop() {return OpticiansMonthlyDrop;}

	public TextField getRates() {return Rates;}
	public Dropdown getRatesMonthlyDrop() {return RatesMonthlyDrop;}
	public Button getRatesArrearButton() {return RatesArrearNoButton;}

	public Button getLinkspopupAddDebt() {return LinkspopupAddDebt;}
	public AutoComplete getLinkspopupWhoisTheCreditor() {return LinkspopupWhoisTheCreditor;}
	public Dropdown getLinkspopupWhoisLiablefortheDebt() {return LinkspopupWhoisLiablefortheDebt;}
	public TextField getLinkspopupWhoisTheCreditorMPA(){return LinkspopupWhoisTheCreditorMPA;}
	public TextField getLinkspopupWhoisLiablefortheDebtMPA(){return LinkspopupWhoisTheCreditorMPA;}
	public TextField getLinkspopupHowmuchisOwned() {return LinkspopupHowmuchisOwned;}
	public Button getLinkspopupActionTakenByCreditorNoAction() {return LinkspopupActionTakenByCreditorNoAction;}
	public Button getlinksPopUpActionTakenByCreditorCourtAction() {return linksPopUpActionTakenByCreditorCourtAction;}
	public Button getlinksPopUpActionTakenByCreditorCourtActionEnforcement() {return linksPopUpActionTakenByCreditorCourtActionEnforcement;}
	public Button getLinksPopUpActionTakenByCreditorCourtActionEnforcementAttachDmentOfEarnings() {return linksPopUpActionTakenByCreditorCourtActionEnforcementAttachmentOfEarnings;}
	public TextField getlinksPopUpHowMuchRepaying() {return linksPopUpHowMuchRepaying;}
	public Dropdown getlinksPopUpHowMuchRepayingDropdown() {return linksPopUpHowMuchRepayingDropDown;}
	public Button getLinkspopupArrangementInplaceToRepayNoButton() {return LinkspopupArrangementInplaceToRepayNoButton;}
	public Button getLinkspopupSubmitButton() {return LinkspopupSubmitButton;}
	public Button getBritishGasFirstOptionClick(){return BritishGasFirstOptionClick;}

	private TextField BoardTextBox;
	private Dropdown BoardMonthly;
	private Dropdown BoardOwnerDropdown;
	private Button BoardArrearsNoButton;
	private Button removeBuildingsAndContentinsuranceButton;


	public TextField getBoardTextBox() {return BoardTextBox;}
	public Dropdown getBoardMonthly() {return BoardMonthly;}
	public Dropdown getBoardOwnerDropdown() {	return BoardOwnerDropdown;}
	public Button getBoardArrearsNoButton() {return BoardArrearsNoButton;}
	public Button getRemoveBuildingsAndContentinsuranceButton() {return removeBuildingsAndContentinsuranceButton;}



	public YourSpendingFixedCost() {
		removeDuelFuelButton = new Button(By.xpath("//div[text()='Dual fuel']//following::button[3]"));
		removeLifeInsuranceButton = new Button(By.xpath("//div[text()='Life insurance']//following::button[4]"));
		removePublictransportButton = new Button(By.xpath("//div[text()='Public transport']//following::button[4]"));
		removeMedicineButton = new Button(By.xpath("//div[text()='Prescriptions and medicine']//following::button[4]"));
		removeDentistryButton = new Button(By.xpath("//div[text()='Dentistry']//following::button[4]"));
		removeOpticiansButton = new Button(By.xpath("//div[text()='Opticians']//following::button[4]"));
		publicTransport = new TextField(By.xpath("//div[text()='Public transport']//following::input[2]"));
		publicTransportArrearButton = new Button(By.xpath("//div[text()='Public transport']//following::label[4]"));
		publicTransportMonthlyDrop = new Dropdown (By.xpath("//div[text()='Public transport']//following::select[1]"));



		LinkspopupAddDebt=new Button(By.xpath("//button[text()='Debt']"));
		LinkspopupWhoisTheCreditor=new AutoComplete(By.xpath("//label[text()='Who is the creditor?']//following::input[1]"));
		LinkspopupWhoisLiablefortheDebt=new Dropdown(By.xpath("//label[text()='Who is liable for the debt?']//following::select[1]"));
		LinkspopupWhoisTheCreditorMPA=new TextField(By.xpath("//label[text()='Who is the creditor?']//following::input[1]"));
		LinkspopupWhoisLiablefortheDebtMPA=new TextField(By.xpath("//label[text()='Who is liable for the debt?']//following::select[1]"));
		LinkspopupHowmuchisOwned=new TextField(By.xpath("//div[text()='How much is owed?']//following::input[1]"));
		LinkspopupActionTakenByCreditorNoAction=new Button(By.xpath("//label[text()='What action has been taken by the creditor?']//following::label[text()='No action taken (arrears only)']"));
		linksPopUpActionTakenByCreditorCourtAction=new Button(By.xpath("//label[text()='What action has been taken by the creditor?']//following::label[text()='Court action']"));
		linksPopUpActionTakenByCreditorCourtActionEnforcement=new Button(By.xpath("//label[text()='Which type of court action?']//following::label[text()='Enforcement']"));
		linksPopUpActionTakenByCreditorCourtActionEnforcementAttachmentOfEarnings=new Button(By.xpath("//label[text()='What type of enforcement?']//following::label[text()='Attachment of earnings']"));
		linksPopUpHowMuchRepaying=new TextField(By.xpath("(//div[text()='How much are they repaying towards this?'])//following::input[1]"));
		linksPopUpHowMuchRepayingDropDown=new Dropdown(By.xpath("(//div[text()='How much are they repaying towards this?'])//following::select[1]"));
		LinkspopupArrangementInplaceToRepayNoButton=new Button(By.xpath("(//label[text()='Is there an arrangement in place to repay this?']//following::label[text()='No'])[1]"));
		LinkspopupSubmitButton=new Button(By.xpath("//button[text()='Submit']"));
		BritishGasFirstOptionClick=new Button(By.xpath("(//div[@class='cellIn'])[1]"));

		councileTax = new TextField(By.xpath("//div[text()='Council tax']//following::input[2]"));
		councileMonthlyDrop = new Dropdown (By.xpath("//div[text()='Council tax']//following::select[1]"));
		councileArrearButton = new Button(By.xpath("//div[text()='Council tax']//following::label[4]"));

		BuildingsAndcontentInsurance = new TextField(By.xpath("//div[text()='Buildings and contents insurance']//following::input[2]"));
		BuildingsAndContentInsuranceMonthlyDrop = new Dropdown (By.xpath("//div[text()='Buildings and contents insurance']//following::select[1]"));
		BuildingsAndContentInsuranceNoArrearButton = new Button(By.xpath("//div[text()='Buildings and contents insurance']//following::label[4]"));

		LifeInsurance = new TextField(By.xpath("//div[text()='Life insurance']//following::input[2]"));
		LifeInsuranceMonthlyDrop = new Dropdown (By.xpath("//div[text()='Life insurance']//following::select[1]"));
		LifeInsuranceNoArrearButton = new Button(By.xpath("//div[text()='Life insurance']//following::label[4]"));

		Rates = new TextField(By.xpath("//div[text()='Rates']//following::input[2]"));
		RatesMonthlyDrop = new Dropdown (By.xpath("//div[text()='Rates']//following::select[1]"));
		RatesArrearNoButton = new Button(By.xpath("//div[text()='Rates']//following::label[4]"));

		Board=new TextField(By.xpath("//div[text()='Board']//following::input[2]"));
		BoardDrop = new Dropdown (By.xpath("//div[text()='Board']//following::select[1]"));
		BoardArrearNoButton= new Button(By.xpath("//div[text()='Board']//following::label[4]"));

		CarInsurance1=new TextField(By.xpath("//div[text()='Car insurance 1']//following::input[2]"));
		CarInsuranceMonthlyDrop1= new Dropdown (By.xpath("//div[text()='Car insurance 1']//following::select[1]"));
		CarInsuranceNoArrearButton1= new Button(By.xpath("//div[text()='Car insurance 1']//following::label[4]"));

		CarInsurance2=new TextField(By.xpath("//div[text()='Car insurance 2']//following::input[2]"));
		CarInsuranceMonthlyDrop2= new Dropdown (By.xpath("//div[text()='Car insurance 2']//following::select[1]"));
		CarInsuranceNoArrearButton2= new Button(By.xpath("//div[text()='Car insurance 2']//following::label[4]"));

		RoadTax1=new TextField(By.xpath("//div[text()='Road tax 1']//following::input[2]"));
		RoadTaxMonthlyDrop1= new Dropdown (By.xpath("//div[text()='Road tax 1']//following::select[1]"));

		RoadTax2=new TextField(By.xpath("//div[text()='Road tax 2']//following::input[2]"));
		RoadTaxMonthlyDrop2= new Dropdown (By.xpath("//div[text()='Road tax 2']//following::select[1]"));

		Fuel1=new TextField(By.xpath("//div[text()='Fuel, parking and toll road charges 1']//following::input[2]"));
		FuelMonthlyDrop1= new Dropdown (By.xpath("//div[text()='Fuel, parking and toll road charges 1']//following::select[1]"));

		Fuel2=new TextField(By.xpath("//div[text()='Fuel, parking and toll road charges 2']//following::input[2]"));
		FuelMonthlyDrop2= new Dropdown (By.xpath("//div[text()='Fuel, parking and toll road charges 2']//following::select[1]"));

		BreakDown1=new TextField(By.xpath("//div[text()='Breakdown cover 1']//following::input[2]"));
		BreakDownMonthlyDrop1= new Dropdown (By.xpath("//div[text()='Breakdown cover 1']//following::select[1]"));

		BreakDown2=new TextField(By.xpath("//div[text()='Breakdown cover 2']//following::input[2]"));
		BreakDownMonthlyDrop2= new Dropdown (By.xpath("//div[text()='Breakdown cover 2']//following::select[1]"));

		MOTAndOngoing1=new TextField(By.xpath("//div[text()='MOT and ongoing vehicle maintenance 1']//following::input[2]"));
		MOTAndOngoingMonthlyDrop1= new Dropdown (By.xpath("//div[text()='MOT and ongoing vehicle maintenance 1']//following::select[1]"));

		MOTAndOngoing2=new TextField(By.xpath("//div[text()='MOT and ongoing vehicle maintenance 2']//following::input[2]"));
		MOTAndOngoingMonthlyDrop2= new Dropdown (By.xpath("//div[text()='MOT and ongoing vehicle maintenance 2']//following::select[1]"));

		Prescriptions=new TextField(By.xpath("//div[text()='Prescriptions and medicine']//following::input[2]"));
		PrescriptionsMonthlyDrop= new Dropdown (By.xpath("//div[text()='Prescriptions and medicine']//following::select[1]"));

		Dentistry=new TextField(By.xpath("//div[text()='Dentistry']//following::input[2]"));
		DentistryMonthlyDrop= new Dropdown (By.xpath("//div[text()='Dentistry']//following::select[1]"));

		Opticians=new TextField(By.xpath("//div[text()='Opticians']//following::input[2]"));
		OpticiansMonthlyDrop= new Dropdown (By.xpath("//div[text()='Opticians']//following::select[1]"));

		tvLicence = new TextField(By.xpath("//div[text()='TV licence']//following::input[2]"));
		tvMonthlyDrop = new Dropdown (By.xpath("//div[text()='TV licence']//following::select[1]"));
		tvArrearButton = new Button(By.xpath("//div[text()='TV licence']//following::label[4]"));

		electricityUtility = new TextField(By.xpath("//div[text()='Electricity']//following::input[2]"));
		electricityMonthlyDrop = new Dropdown (By.xpath("//div[text()='Electricity']//following::select[1]"));
		electricityArrearButton = new Button(By.xpath("//div[text()='Electricity']//following::label[4]"));
		electricityArrearYesButton = new Button(By.xpath("//div[text()='Electricity']//following::label[3]"));
		electricityLinkedItem=new Button(By.xpath("//div[text()='Electricity']//following::button[text()='Add linked item']"));
		electricitySupplier  = new TextField(By.xpath(""));

		gasUtility = new TextField(By.xpath("//div[text()='Gas']//following::input[2]"));
		gasMonthlyDrop = new Dropdown (By.xpath("//div[text()='Gas']//following::select[1]"));
		gasArrearButton = new Button(By.xpath("//div[text()='Gas']//following::label[4]"));
		gasSupplier  = new TextField(By.xpath(""));

		waterSupplyUtility = new TextField(By.xpath("//div[text()='Water supply']//following::input[2]"));
		waterSupplyMonthlyDrop = new Dropdown (By.xpath("//div[text()='Water supply']//following::select[1]"));
		waterSupplyArrearButton = new Button(By.xpath("//div[text()='Water supply']//following::label[4]"));
		waterSupplySupplier  = new TextField(By.xpath(""));

		billingAndInsurance = new TextField(By.xpath("//div[text()='Buildings and contents insurance']//following::input[2]"));
		billingAndInsuranceMonthlyDrop = new Dropdown (By.xpath("//div[text()='Buildings and contents insurance']//following::select[1]"));
		billingAndInsuranceArrearButton= new Button(By.xpath("//div[text()='Buildings and contents insurance']//following::label[4]"));

		publicTransport = new TextField(By.xpath("//div[text()='Public transport']//following::input[2]"));
		publicTransportMonthlyDrop = new Dropdown (By.xpath("//div[text()='Public transport']//following::select[1]"));
		publicTransportArrearButton = new Button(By.xpath("//div[text()='Public transport']//following::label[4]"));

		allFixedSpendingCompleted = new Checkbox(By.xpath("//*[@name='$PpyWorkPage$pGenericFlag$gFixedExpenditureComplete']/../label"));
		continueYourFixedSpendingButton= new Button(By.xpath("(//button[@class='SC_Button_Primary pzhc pzbutton'])[1]"));
		yourIncomeButtonButton = new Button(By.xpath("(//a[text()='Your income']//parent::span)[1]"));

		ChildcareButton = new Button(By.xpath("(//button[@class='SC_Tag_Small pzhc pzbutton'])[26]"));
		ChildcareButton_89940 = new Button(By.xpath("(//button[@class='SC_Tag_Small pzhc pzbutton'])[28]"));
		AfterSchoolClubsandSchoolTrips = new Button(By.xpath("//div[text()='After school clubs and school trips']//following::button[4]"));

		Rent = new TextField(By.xpath("//div[text()='Rent']//following::input[2]"));
		RentMonthly = new Dropdown (By.xpath("//div[text()='Rent']//following::select[1]"));
		RentArrearsNoButton = new Button(By.xpath("//div[text()='Rent']//following::label[4]"));

		SchoolUniform = new TextField(By.xpath("//div[text()='School uniform']//following::input[2]"));
		SchoolUniformMonthly = new Dropdown (By.xpath("//div[text()='School uniform']//following::select[1]"));

		ChildcareTectBox= new TextField(By.xpath("//div[text()='Childcare']//following::input[2]"));
		ChildcareDropdownMonthly = new Dropdown (By.xpath("//div[text()='Childcare']//following::select[1]"));
		ChildcareArrearsNoButton = new Button(By.xpath("//div[text()='Childcare']//following::label[4]"));
		Flexiblecostlink = new Button(By.xpath("//a[text()='Flexible Costs']"));

		BoardTextBox = new TextField(By.xpath("//div[text()='Board']//following::input[2]"));
		BoardMonthly = new Dropdown (By.xpath("//div[text()='Board']//following::select[1]"));
		BoardOwnerDropdown = new Dropdown (By.xpath("//div[text()='Board']//following::select[2]"));
		BoardArrearsNoButton= new Button(By.xpath("//div[text()='Board']//following::label[4]"));
		removeBuildingsAndContentinsuranceButton = new Button(By.xpath("//div[text()='Buildings and contents insurance']//following::button[4]"));

	}

	public void SelectIncomeButtonButton() {
		this.getYourIncomeButtonButton().click();
	}
	public void removeDuelFuleBtn() {
		this.getRemoveDuelFuelButton().click();
	}
	public void removeLifeInsuranceBtn() {
		this.getRemoveLifeInsuranceButton().click();
	}
	public void removePublictransportBtn() {
		this.getRemovePublictransportButton().click();
	}
	public void removeMedicineBtn() {
		this.getRemoveMedicineButton().click();
	}
	public void removeDentistryBtn() {		this.getRemoveDentistryButton().click();
	}
	public void removeOpticians() {		this.getRemoveOpticiansButton().click();
	}
	public void RemovePublictransportButton(){this.getRemovePublictransportButton().click();}

	public void clickContinueYourFixedSpendingButton(){
		getBrowser().sleep(2000);
		this.getContinueYourFixedSpendingButton().click();
		System.out.println("=================Clicked on clickContinueYourFixedSpendingButton");
	}

	public void FillRequiredDetailsOf89929() {
		switchToActiveFrame();
//		removeDuelFuleBtn();
		getBrowser().sleep(200);
		removeLifeInsuranceBtn();
		getBrowser().sleep(200);
		removeMedicineBtn();
		getBrowser().sleep(200);
		removeDentistryBtn();
		getBrowser().sleep(200);
		removeOpticians();
		getBrowser().sleep(200);
		//   Board Spending
		this.getBoard().enterTextField("300");
		this.getBoard().tab();
		this.getBoardArrearNoButton().click();
		this.getBoardDrop().selectFromDropdownByIndex(4);
		//  Buildings and contents insurance
		this.getBuildingsAndcontentInsurance().enterTextField("55");
		this.getBuildingsAndcontentInsurance().tab();
		this.getBuildingsAndContentInsuranceNoArrearButton().click();
		this.getBuildingsAndContentInsuranceMonthlyDrop().selectFromDropdownByIndex(4);
		//Public transport
		this.getpublicTransport().enterText("200");
		this.getpublicTransport().tab();
		this.getpublicTransportMonthlyDrop().selectFromDropdownByIndex(4);
		//
//		genericMethodsCvp.selectByIndex(councileMonthlyDrop, 4);
//		this.getCouncileArrearButton().click();
//		this.getTvLicence().enterText("13.12");
//		this.getTvLicence().tab();
//		genericMethodsCvp.selectByIndex(this.getTvMonthlyDrop(), 4);
//		this.getTvArrearButton().click();
//		this.getElectricityUtility().enterText("71");
//		this.getCouncileTax().tab();
//		genericMethodsCvp.selectByIndex(electricityMonthlyDrop, 4);
//		this.getElectricityArrearButton().click();
//		getBrowser().waitForElementToBeClickable(By.xpath("//div[text()='Electricity']//following::select[1]"));
//		genericMethodsCvp.selectByIndex(electricityMonthlyDrop, 4);
//		this.getGasUtility().enterText("50");
//		this.getGasUtility().tab();
//		genericMethodsCvp.selectByIndex(gasMonthlyDrop, 4);
//		this.getGasArrearButton().click();
//		genericMethodsCvp.implicitWait(3000);
//		genericMethodsCvp.selectByIndex(gasMonthlyDrop, 4);
//		this.getWaterSupplyUtility().enterText("46");
//		this.getWaterSupplyUtility().tab();
//		genericMethodsCvp.selectByIndex(waterSupplyMonthlyDrop, 4);
//		this.getWaterSupplyArrearButton().click();
//		genericMethodsCvp.implicitWait(3000);
//		genericMethodsCvp.selectByIndex(waterSupplyMonthlyDrop, 4);
//		this.getBillingAndInsurance().enterText("25");
//		this.getBillingAndInsurance().tab();
//		genericMethodsCvp.selectByIndex(billingAndInsuranceMonthlyDrop, 4);
//		getBrowser().waitForElementToBeClickable(By.xpath("//div[text()='Buildings and contents insurance']//following::label[4]"));
//		this.getBillingAndInsuranceArrearButton().click();
//		genericMethodsCvp.implicitWait(3000);
//		genericMethodsCvp.selectByIndex(billingAndInsuranceMonthlyDrop, 4);
//		this.getpublicTransport().enterText("200");
//		this.getpublicTransport().tab();
//		genericMethodsCvp.selectByIndex(publicTransportMonthlyDrop, 4);
//		this.getpublicTransportArrearButton().click();
//		genericMethodsCvp.implicitWait(3000);
//		genericMethodsCvp.selectByIndex(publicTransportMonthlyDrop, 4);
		this.getAllFixedSpendingCompleted().click();
//		genericMethodsCvp.implicitWait(3000);
		this.getContinueYourFixedSpendingButton().click();


	}

	public void EnterdetailsofJointMPA()
	{
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(5000);
		this.getRemoveDuelFuelButton().click();
		genericMethodsCvp.implicitWait(5000);
		this.getRemoveLifeInsuranceButton().click();
		genericMethodsCvp.implicitWait(5000);
		this.getRemovePublictransportButton().click();
		genericMethodsCvp.implicitWait(5000);
		this.getRemoveMedicineButton().click();
		genericMethodsCvp.implicitWait(5000);
		this.getRemoveDentistryButton().click();
		genericMethodsCvp.implicitWait(5000);
		this.getRemoveOpticiansButton().click();
		genericMethodsCvp.implicitWait(5000);
		this.getRates().enterTextField("200");
		genericMethodsCvp.implicitWait(5000);
		this.getRatesMonthlyDrop().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(5000);
		this.getRatesArrearButton().click();
		genericMethodsCvp.implicitWait(5000);
		this.getTvLicence().enterTextField("13.12");
		genericMethodsCvp.implicitWait(6000);
		genericMethodsCvp.selectByIndex(this.getTvMonthlyDrop(),3);
		genericMethodsCvp.implicitWait(5000);
		genericMethodsCvp.selectByIndex(this.getTvMonthlyDrop(),3);
		genericMethodsCvp.implicitWait(5000);
		this.getTvArrearButton().click();
		genericMethodsCvp.implicitWait(3000);
		this.getElectricityUtility().enterTextField("100");
		genericMethodsCvp.implicitWait(5000);
		this.getElectricityMonthlyDrop().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(5000);
		this.getelectricityArrearYesButton().click();
		genericMethodsCvp.implicitWait(3000);
		this.getGasUtility().enterTextField("100");
		genericMethodsCvp.implicitWait(3000);
		this.getGasMonthlyDrop().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(3000);
		this.getGasArrearButton().click();
		genericMethodsCvp.implicitWait(3000);
		this.getWaterSupplyUtility().enterTextField("100");
		genericMethodsCvp.implicitWait(3000);
		this.getWaterSupplyMonthlyDrop().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(3000);
		this.getWaterSupplyArrearButton().click();
		genericMethodsCvp.implicitWait(3000);
		this.getBuildingsAndcontentInsurance().enterTextField("171.06");
		genericMethodsCvp.implicitWait(3000);
		this.getBuildingsAndContentInsuranceMonthlyDrop().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(3000);
		this.getBuildingsAndContentInsuranceNoArrearButton().click();
		genericMethodsCvp.implicitWait(3000);
		this.getAllFixedSpendingCompleted().click();
		genericMethodsCvp.implicitWait(3000);
		this.getelectricityLinkedItem().click();
		genericMethodsCvp.implicitWait(3000);
		this.getLinkspopupAddDebt().click();
		genericMethodsCvp.implicitWait(3000);
		this.getLinkspopupWhoisTheCreditorMPA().enterTextField("British Gas");
		genericMethodsCvp.implicitWait(3000);
		this.getBritishGasFirstOptionClick().click();
		genericMethodsCvp.implicitWait(5000);
		this.getLinkspopupWhoisLiablefortheDebt().selectFromDropdown("OWN0003");
		genericMethodsCvp.implicitWait(6000);
	//	this.getLinkspopupWhoisLiablefortheDebt().tab();
		genericMethodsCvp.implicitWait(3000);
		this.getLinkspopupHowmuchisOwned().enterTextField("150");
		genericMethodsCvp.implicitWait(3000);
		this.getLinkspopupActionTakenByCreditorNoAction().click();
		genericMethodsCvp.implicitWait(3000);
		this.getLinkspopupArrangementInplaceToRepayNoButton().click();
		genericMethodsCvp.implicitWait(3000);
		this.getLinkspopupSubmitButton().click();
		genericMethodsCvp.implicitWait(4000);
		this.getContinueYourFixedSpendingButton().click();
		genericMethodsCvp.implicitWait(4000);

	}

	public void RemoveUnwantedOptionsInSpendingFixedCostPage() {
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(1000);
		removeDuelFuleBtn();
		removeLifeInsuranceBtn();
		removePublictransportBtn();
		removeMedicineBtn();
		removeDentistryBtn();
		removeOpticians();
	}


	public void EnterCouncilTax(String CouncilTax)	{
		this.getCouncileTax().enterText(CouncilTax);
	}
	public void SelectCouncileMonthlyDropdown () {
		genericMethodsCvp.selectByText(councileMonthlyDrop, "monthly");

	}
	public void ClickOnNoButtonForCouncileArrear() {
		this.getCouncileArrearButton().click();
		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(councileMonthlyDrop, "monthly");
	}

	public void EnterTvLicence(String TvLicenceValue)	{
		this.getTvLicence().enterText(TvLicenceValue);
	}
	public void SelectTvLicenceMonthlyDropdown () {
		genericMethodsCvp.selectByText(tvMonthlyDrop, "monthly");
	}
	public void ClickOnNoButtonForTvLicenceArrear() {
		this.getTvArrearButton().click();
		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(tvMonthlyDrop, "monthly");
	}

	public void EnterElectricityBil(String ElectricityBilValue)	{
		this.getElectricityUtility().enterText(ElectricityBilValue);
	}
	public void SelectElectricityMonthlyDropdown () {
		genericMethodsCvp.selectByText(electricityMonthlyDrop, "monthly");
	}
	public void SelectNoButtonForElectricityArrear() {
		this.getElectricityArrearButton().click();
		getBrowser().waitForElementToBeClickable(By.xpath("//div[text()='Electricity']//following::select[1]"));
		genericMethodsCvp.selectByText(electricityMonthlyDrop, "monthly");
	}


	public void EnterGasBil(String data)	{
		this.getGasUtility().enterText(data);
	}
	public void SelectGasMonthlyDropdown () {
		genericMethodsCvp.selectByText(gasMonthlyDrop, "monthly");
	}
	public void SelectNoButtonForGasArrear() {
		this.getGasArrearButton().click();
		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(gasMonthlyDrop, "monthly");
	}
	public void EnterGasSuplyer()	{
		this.getGasSupplier().enterText("British Gas");
	}

	public void EnterWaterBil(String data)	{
		this.getWaterSupplyUtility().enterText(data);
	}
	public void SelectWaterMonthlyDropdown () {
		genericMethodsCvp.selectByText(waterSupplyMonthlyDrop, "monthly");
	}
	public void SelectNoButtonForWaterArrear() {
		this.getWaterSupplyArrearButton().click();
		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(waterSupplyMonthlyDrop, "monthly");
	}
	public void EnterWaterSuplyer()	{
		this.getWaterSupplySupplier().enterText("Welsh Water");
	}

	public void EnterBillingAndInsurance(String data)	{
		this.getBillingAndInsurance().enterText(data);
	}
	public void SelectInsuranceMonthlyDropdown () {
		genericMethodsCvp.selectByText(billingAndInsuranceMonthlyDrop, "monthly");
	}
	public void SelectNoButtonForInsuranceArrear() {
		getBrowser().waitForElementToBeClickable(By.xpath("//div[text()='Buildings and contents insurance']//following::label[4]"));
		this.getBillingAndInsuranceArrearButton().click();
		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(billingAndInsuranceMonthlyDrop, "monthly");
	}

	public void ClickAllFixedSpendingChekcbox() {
		this.getAllFixedSpendingCompleted().click();
	}
	public void ClickContinueButtonYourSpendingFixedCast() {
		genericMethodsCvp.implicitWait(3000);
		this.getContinueYourFixedSpendingButton().click();
	}

	public void SelectChildcareOptionFromSpendingFixedcostpage() {
		this.getChildcareButton().click();
	}


	public void EnterChildcarevalue(String Childcarevalue)	{
		this.getChildcareTectBox().enterText(Childcarevalue);
	}
	public void SelectChildcareMonthlyDropdown() {
		genericMethodsCvp.selectByText(ChildcareDropdownMonthly, "monthly");

	}
	public void ClickOnNoButtonForChildcareArrear() {
		this.getChildcareArrearsNoButton().click();
		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(ChildcareDropdownMonthly, "monthly");
	}

	public void EnterRent(String rent)	{
		this.getRent().enterText(rent);
	}
	public void SelectRentMonthlyDropdown () {
		genericMethodsCvp.selectByText(RentMonthly, "monthly");

	}
	public void ClickOnNoButtonForRentArrear() {
		this.getRentArrearsNoButton().click();
		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.selectByText(RentMonthly, "monthly");
	}


	public void EnterSchoolUniform(String data)	{
		this.getSchoolUniform().enterText(data);
	}
	public void SelectSchoolUniformMonthlyDropdown () {
		genericMethodsCvp.selectByText(SchoolUniformMonthly, "monthly");

	}


	public void removeAfterSchoolClubsandSchoolTrips() {
		this.getAfterSchoolClubsandSchoolTrips().click();
	}

	public void RemoveUnwantedOptionFropSpendingFixedPage() {
		switchToActiveFrame();
		removeDuelFuleBtn();
		removeLifeInsuranceBtn();
		removePublictransportBtn();
		removeMedicineBtn();
		removeDentistryBtn();
		removeOpticians();
		removeAfterSchoolClubsandSchoolTrips();



	}


	public void enterSpendingDetailsFor89940(){
		  // switchToActiveFrame();
		   getBrowser().sleep(getBrowser().getTimeout()/10);
		   this.getRemoveDuelFuelButton().click();
		   getBrowser().sleep(getBrowser().getTimeout()/10);
		   this.getRemoveLifeInsuranceButton().click();
		   getBrowser().sleep(getBrowser().getTimeout()/10);
		   this.getRemovePublictransportButton().click();
		   getBrowser().sleep(getBrowser().getTimeout()/10);
		   this.getRemoveMedicineButton().click();
		   getBrowser().sleep(getBrowser().getTimeout()/10);
		   this.getRemoveDentistryButton().click();
		   getBrowser().sleep(getBrowser().getTimeout()/10);
		   this.getRemoveOpticiansButton().click();
//		   getBrowser().sleep(getBrowser().getTimeout()/10);
//		   this.getAfterSchoolClubsandSchoolTrips().click();
		   //getBrowser().sleep(getBrowser().getTimeout()/10);
		  // (new WebDriverWait(getDriver(),30)).until(ExpectedConditions.elementToBeClickable(getChildcareButton_89940().getSelector()));
		   //this.getChildcareButton_89940().click();
		//**********************Comment by Priya**************************
		    /*getBrowser().sleep(getBrowser().getTimeout()/10);
		    this.getCouncileTax().enterTextField("100");
		    getBrowser().sleep(getBrowser().getTimeout()/10);
		    this.getRent().enterTextField("251.96");
		    getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getRentMonthly().selectFromDropdownByIndex(4);
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getRentArrearsNoButton().click();
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getCouncileTax().enterTextField("100");
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getCouncileMonthlyDrop().selectFromDropdownByIndex(4);
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getCouncileArrearButton().click();
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getTvLicence().enterTextField("13.12");
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getTvMonthlyDrop().selectFromDropdownByIndex(4);
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getTvArrearButton().click();
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getElectricityUtility().enterTextField("50");
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getElectricityMonthlyDrop().selectFromDropdownByIndex(4);
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getElectricityArrearButton().click();
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getGasUtility().enterTextField("50");
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getGasMonthlyDrop().selectFromDropdownByIndex(4);
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getGasArrearButton().click();
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getWaterSupplyUtility().enterTextField("50");
			getBrowser().sleep(getBrowser().getTimeout()/20);
			this.getWaterSupplyMonthlyDrop().selectFromDropdownByIndex(4);
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getWaterSupplyArrearButton().click();
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getBillingAndInsurance().enterTextField("20");
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getBillingAndInsuranceMonthlyDrop().selectFromDropdownByIndex(4);
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getBillingAndInsuranceArrearButton().click();
			//getBrowser().sleep(getBrowser().getTimeout()/10);
			//this.getChildcareTectBox().enterTextField("100");
			//getBrowser().sleep(getBrowser().getTimeout()/10);
			//this.getChildcareDropdownMonthly().selectFromDropdownByIndex(4);
			//getBrowser().sleep(getBrowser().getTimeout()/10);
			//this.getChildcareArrearsNoButton().click();
		//clicking on school uniform is not here
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getSchoolUniform().enterTextField("20");
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getSchoolUniformMonthly().selectFromDropdownByIndex(4);
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getAllFixedSpendingCompleted().click();
			getBrowser().sleep(getBrowser().getTimeout()/10);
			this.getContinueYourFixedSpendingButton().click();
		    System.out.println("=== Exist user Navigated to Spending-Fixed cost page and fill the data");*/

	}
	public void EnterSpendingdetailsofguestUser() {
		switchToActiveFrame();
		this.getBoard().enterTextField("300");
		this.getBoardArrearNoButton().click();
		this.getBoardDrop().selectFromDropdownByIndex(4);
		this.getBuildingsAndcontentInsurance().enterTextField("55");
		this.getBuildingsAndcontentInsurance().tab();
		this.getBuildingsAndContentInsuranceNoArrearButton().click();
		this.getBuildingsAndContentInsuranceMonthlyDrop().selectFromDropdownByIndex(4);
		this.getLifeInsurance().enterTextField("20");
		this.getLifeInsurance().tab();
		this.getLifeInsuranceNoArrearButton().click();
		this.getLifeInsuranceMonthlyDrop().selectFromDropdownByIndex(4);
		this.getCarInsurance1().enterTextField("20");
		this.getCarInsurance1().tab();
		this.getCarInsuranceNoArrearButton1().click();
		this.getCarInsuranceMonthlyDrop1().selectFromDropdownByIndex(4);
		this.getCarInsurance2().enterTextField("20");
		this.getCarInsurance2().tab();
		this.getCarInsuranceNoArrearButton2().click();
		this.getCarInsuranceMonthlyDrop2().selectFromDropdownByIndex(4);
		this.getRoadTax1().enterTextField("5");
		this.getRoadTax1().tab();
		this.getRoadTaxMonthlyDrop1().selectFromDropdownByIndex(4);
		this.getRoadTax2().enterTextField("5");
		this.getRoadTax2().tab();
		genericMethodsCvp.implicitWait(3000);
		this.getRoadTaxMonthlyDrop2().selectFromDropdownByIndex(4);
		this.getFuel1().enterTextField("60");
		this.getFuel1().tab();
		genericMethodsCvp.implicitWait(3000);
		this.getFuelMonthlyDrop1().selectFromDropdownByIndex(4);
		this.getFuel2().enterTextField("60");
		this.getFuel2().tab();
		genericMethodsCvp.implicitWait(3000);
		this.getFuelMonthlyDrop2().selectFromDropdownByIndex(4);
		this.getBreakDown1().enterTextField("10");
		this.getBreakDown1().tab();
		genericMethodsCvp.implicitWait(3000);
		this.getBreakDownMonthlyDrop1().selectFromDropdownByIndex(4);
		this.getBreakDown2().enterTextField("10");
		this.getBreakDown2().tab();
		genericMethodsCvp.implicitWait(3000);
		this.getBreakDownMonthlyDrop2().selectFromDropdownByIndex(4);
		this.getMOTAndOngoing1().enterTextField("5");
		this.getMOTAndOngoing1().tab();
		genericMethodsCvp.implicitWait(3000);
		this.getMOTAndOngoingMonthlyDrop1().selectFromDropdownByIndex(4);
		this.getMOTAndOngoing2().enterTextField("5");
		this.getMOTAndOngoing2().tab();
		genericMethodsCvp.implicitWait(3000);
		this.getMOTAndOngoingMonthlyDrop2().selectFromDropdownByIndex(4);
		this.getPrescriptions().enterTextField("10");
		this.getPrescriptions().tab();
		genericMethodsCvp.implicitWait(3000);
		this.getPrescriptionsMonthlyDrop().selectFromDropdownByIndex(4);
		this.getDentistry().enterTextField("10");
		this.getDentistry().tab();
		genericMethodsCvp.implicitWait(3000);
		this.getDentistryMonthlyDrop().selectFromDropdownByIndex(4);
		this.getOpticians().enterTextField("10");
		this.getOpticians().tab();
		genericMethodsCvp.implicitWait(3000);
		this.getOpticiansMonthlyDrop().selectFromDropdownByIndex(4);
		this.getAllFixedSpendingCompleted().click();
		this.getContinueYourFixedSpendingButton().click();
	}


	public void EnterSpendingdetailsForAllScenarios(String Scenarios) {
		switch (Scenarios){
		case "89936":
			SpendingFixedCostData data = SpendingFixedCostTestData.get89936TestData();
		switchToActiveFrame();
		this.getCouncileTax().enterTextField(data.getCouncilTax());
		this.getBoardArrearNoButton().click();
		this.getBoardDrop().selectFromDropdownByIndex(4);
		this.getBuildingsAndcontentInsurance().enterTextField("55");
		this.getBuildingsAndContentInsuranceNoArrearButton().click();
		this.getBuildingsAndContentInsuranceMonthlyDrop().selectFromDropdownByIndex(4);
		this.getLifeInsurance().enterTextField("20");
		this.getLifeInsuranceNoArrearButton().click();
		this.getLifeInsuranceMonthlyDrop().selectFromDropdownByIndex(4);
		this.getCarInsurance1().enterTextField("20");
		this.getCarInsuranceNoArrearButton1().click();
		this.getCarInsuranceMonthlyDrop1().selectFromDropdownByIndex(4);
		this.getCarInsurance2().enterTextField("20");
		this.getCarInsuranceNoArrearButton2().click();
		this.getCarInsuranceMonthlyDrop2().selectFromDropdownByIndex(4);
		this.getRoadTax1().enterTextField("5");
		this.getRoadTaxMonthlyDrop1().selectFromDropdownByIndex(4);
		this.getRoadTax2().enterTextField("5");
		genericMethodsCvp.implicitWait(3000);
		this.getRoadTaxMonthlyDrop2().selectFromDropdownByIndex(4);
		this.getFuel1().enterTextField("60");
		genericMethodsCvp.implicitWait(3000);
		this.getFuelMonthlyDrop1().selectFromDropdownByIndex(4);
		this.getFuel2().enterTextField("60");
		genericMethodsCvp.implicitWait(3000);
		this.getFuelMonthlyDrop2().selectFromDropdownByIndex(4);
		this.getBreakDown1().enterTextField("10");
		genericMethodsCvp.implicitWait(3000);
		this.getBreakDownMonthlyDrop1().selectFromDropdownByIndex(4);
		this.getBreakDown2().enterTextField("10");
		genericMethodsCvp.implicitWait(3000);
		this.getBreakDownMonthlyDrop2().selectFromDropdownByIndex(4);
		this.getMOTAndOngoing1().enterTextField("5");
		genericMethodsCvp.implicitWait(3000);
		this.getMOTAndOngoingMonthlyDrop1().selectFromDropdownByIndex(4);
		this.getMOTAndOngoing2().enterTextField("5");
		genericMethodsCvp.implicitWait(3000);
		this.getMOTAndOngoingMonthlyDrop2().selectFromDropdownByIndex(4);
		this.getPrescriptions().enterTextField("10");
		genericMethodsCvp.implicitWait(3000);
		this.getPrescriptionsMonthlyDrop().selectFromDropdownByIndex(4);
		this.getDentistry().enterTextField("10");
		genericMethodsCvp.implicitWait(3000);
		this.getDentistryMonthlyDrop().selectFromDropdownByIndex(4);
		this.getOpticians().enterTextField("10");
		genericMethodsCvp.implicitWait(3000);
		this.getOpticiansMonthlyDrop().selectFromDropdownByIndex(4);
		this.getAllFixedSpendingCompleted().click();
		this.getContinueYourFixedSpendingButton().click();
		break;
	}
	}
////	public void ClickFlexibleCostHyperlink() {
//		this.getFlexiblecostlink().click();
//	}

	public void YourSpendingFixdCostActionSet_SC89934() {
		//Rent
		genericMethodsCvp.implicitWait(4000);
		this.getRent().enterText("526.95");
		this.getRent().tab();
		this.getRentArrearsNoButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getRentMonthly().selectFromDropdownByIndex(4);
		//genericMethodsCvp.selectByIndex(RentMonthly, 4);
		genericMethodsCvp.implicitWait(2000);
		//Rates
		this.getRates().enterText("100");
		this.getRates().tab();
		this.getRatesArrearButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getRatesMonthlyDrop().selectFromDropdownByIndex(4);
		//genericMethodsCvp.selectByIndex(RatesMonthlyDrop, 4);
		genericMethodsCvp.implicitWait(2000);
		//TV License
		this.getTvLicence().enterText("13.12");
		this.getTvLicence().tab();
		this.getTvArrearButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getTvMonthlyDrop().selectFromDropdownByIndex(3);
		//genericMethodsCvp.selectByIndex(tvMonthlyDrop, 3);
		genericMethodsCvp.implicitWait(2000);
		//Electricity
		this.getElectricityUtility().enterText("50");
		this.getElectricityUtility().tab();
		this.getElectricityArrearButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getElectricityMonthlyDrop().selectFromDropdownByIndex(4);
		//genericMethodsCvp.selectByIndex(electricityMonthlyDrop, 4);
		genericMethodsCvp.implicitWait(1000);
		//Gas
		this.getGasUtility().enterText("50");
		this.getGasUtility().tab();
		this.getGasArrearButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getGasMonthlyDrop().selectFromDropdownByIndex(4);
		//genericMethodsCvp.selectByIndex(gasMonthlyDrop, 4);
		genericMethodsCvp.implicitWait(1000);
		//Water Supply
		this.getWaterSupplyUtility().enterText("50");
		this.getWaterSupplyUtility().tab();
		this.getWaterSupplyArrearButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.waterSupplyMonthlyDrop.selectFromDropdownByIndex(4);
		//genericMethodsCvp.selectByIndex(waterSupplyMonthlyDrop, 4);
		genericMethodsCvp.implicitWait(1000);
		//Building and..
		this.getBillingAndInsurance().enterText("20");
		this.getBillingAndInsurance().tab();
		this.getBillingAndInsuranceArrearButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getBillingAndInsuranceMonthlyDrop().selectFromDropdownByIndex(4);
		//genericMethodsCvp.selectByText(billingAndInsuranceMonthlyDrop, "monthly");
		genericMethodsCvp.implicitWait(1000);
		//Child Care
		this.getChildcareButton().click();
		genericMethodsCvp.implicitWait(3000);
		this.getChildcareTectBox().enterText("50");
		this.getChildcareTectBox().tab();
		this.getChildcareArrearsNoButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getChildcareDropdownMonthly().selectFromDropdownByIndex(4);
		//genericMethodsCvp.selectByIndex(ChildcareDropdownMonthly, 4);
		genericMethodsCvp.implicitWait(4000);
		//School Uniform
		this.getSchoolUniform().enterText("20");
		this.getSchoolUniform().tab();
		this.getChildcareArrearsNoButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getSchoolUniformMonthly().selectFromDropdownByIndex(4);
		//genericMethodsCvp.selectByIndex(SchoolUniformMonthly, 4);
		genericMethodsCvp.implicitWait(4000);
		//Removing all unwanted element for this scenario
		        removeDuelFuleBtn();
				getBrowser().sleep(4000);
				removeLifeInsuranceBtn();
				getBrowser().sleep(4000);
				removeMedicineBtn();
				getBrowser().sleep(4000);
				removeDentistryBtn();
				getBrowser().sleep(4000);
				removeOpticians();
		        getBrowser().sleep(4000);
		        RemovePublictransportButton();
				getBrowser().sleep(4000);
				removeAfterSchoolClubsandSchoolTrips();
				getBrowser().sleep(4000);
		this.getAllFixedSpendingCompleted().click();
        genericMethodsCvp.implicitWait(3000);
		this.getContinueYourFixedSpendingButton().click();
		getBrowser().sleep(5000);
	}
	public void SetOfActionYourSpendingFixedSC89937() {
		genericMethodsCvp.implicitWait(5000);
		this.getBoard().enterText("210");
		genericMethodsCvp.implicitWait(4000);
		this.getBoardDrop().selectFromDropdownByIndex(4);
		genericMethodsCvp.selectByText(BoardDrop, "monthly");
		genericMethodsCvp.implicitWait(4000);
//		genericMethodsCvp.selectByText(HomeAndContentsMonthlyDropdown, "monthly");
//		genericMethodsCvp.implicitWait(2000);
		this.getBoardArrearsNoButton().click();
		genericMethodsCvp.implicitWait(3000);
		this.getRemoveBuildingsAndContentinsuranceButton().click();
		this.getRemoveBuildingsAndContentinsuranceButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getRemoveLifeInsuranceButton().click();
		this.getRemoveLifeInsuranceButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getRemovePublictransportButton().click();
		this.getRemovePublictransportButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getRemoveMedicineButton().click();
		this.getRemoveMedicineButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getRemoveDentistryButton().click();
		this.getRemoveDentistryButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getRemoveOpticiansButton().click();
		this.getRemoveOpticiansButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(4000);
		this.getAllFixedSpendingCompleted().click();
		genericMethodsCvp.implicitWait(2000);
		this.getContinueYourFixedSpendingButton().click();
		genericMethodsCvp.implicitWait(4000);

	}



	public void FillSpendingFixedCostRequiredDetailsOf89949() {
		genericMethodsCvp.implicitWait(5000);
		this.getRemoveBuildingsAndContentinsuranceButton().click();
		genericMethodsCvp.implicitWait(5000);
		removeLifeInsuranceBtn();
		genericMethodsCvp.implicitWait(5000);
		removePublictransportBtn();
		genericMethodsCvp.implicitWait(5000);
		removeMedicineBtn();
		genericMethodsCvp.implicitWait(5000);
		removeDentistryBtn();
		genericMethodsCvp.implicitWait(5000);
		removeOpticians();
		genericMethodsCvp.implicitWait(5000);

		getBrowser().sleep(getBrowser().getTimeout());
		this.getBoard().enterText("930");
		genericMethodsCvp.implicitWait(5000);
		this.getBoardDrop().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(5000);
		//genericMethodsCvp.selectByIndex(BoardMonthly, 4);
		genericMethodsCvp.implicitWait(3000);
		this.getBoardArrearNoButton().click();
		genericMethodsCvp.implicitWait(3000);
		this.getAllFixedSpendingCompleted().click();
		this.getContinueYourFixedSpendingButton().click();
	}



    public void enterDataAsPer89939() {
		genericMethodsCvp.implicitWait(5000);
		EnterRent("736.88");
		getRent().tab();
		genericMethodsCvp.implicitWait(3000);
		this.getRentMonthly().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(3000);
		ClickOnNoButtonForRentArrear();
		genericMethodsCvp.implicitWait(3000);
		EnterCouncilTax("95");
		getCouncileTax().tab();
		genericMethodsCvp.implicitWait(3000);
		this.getCouncileMonthlyDrop().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(3000);
		ClickOnNoButtonForCouncileArrear();
		genericMethodsCvp.implicitWait(3000);
		EnterTvLicence("13.12");
		getTvLicence().tab();
		genericMethodsCvp.implicitWait(3000);
//		SelectTvLicenceMonthlyDropdown();
		this.getTvMonthlyDrop().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(3000);
		ClickOnNoButtonForTvLicenceArrear();
		genericMethodsCvp.implicitWait(3000);
		EnterElectricityBil("50");
		getElectricityUtility().tab();
		genericMethodsCvp.implicitWait(3000);
		getElectricityMonthlyDrop().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(3000);
		getelectricityArrearYesButton().click();
		genericMethodsCvp.implicitWait(3000);
		getelectricityLinkedItem().click();
		genericMethodsCvp.implicitWait(3000);
		getLinkspopupAddDebt().click();
		genericMethodsCvp.implicitWait(8000);
		genericMethodsCvp.scrollIntoViewElement(By.xpath("//label[text()='Who is the creditor?']//following::input[1]"));
		genericMethodsCvp.implicitWait(3000);
		getLinkspopupWhoisTheCreditor().enterTextThenSelectFromAutoComplete("British Gas");
		genericMethodsCvp.verifyOverLayDisplayed();
		getLinkspopupWhoisTheCreditor().downArrow();
		getLinkspopupWhoisTheCreditor().enter();
		genericMethodsCvp.implicitWait(3000);
		getLinkspopupWhoisLiablefortheDebt().selectFromDropdownByIndex(1);
		genericMethodsCvp.implicitWait(3000);
		getLinkspopupHowmuchisOwned().enterText("100");
		genericMethodsCvp.implicitWait(3000);
		getlinksPopUpActionTakenByCreditorCourtAction().click();
		genericMethodsCvp.implicitWait(3000);
		getlinksPopUpActionTakenByCreditorCourtActionEnforcement().click();
		genericMethodsCvp.implicitWait(3000);
		getLinksPopUpActionTakenByCreditorCourtActionEnforcementAttachDmentOfEarnings().click();
		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.scrollIntoViewElement(By.xpath("(//div[text()='How much are they repaying towards this?'])//following::input[1]"));
		getlinksPopUpHowMuchRepaying().enterText("10");
		genericMethodsCvp.implicitWait(3000);
		getlinksPopUpHowMuchRepayingDropdown().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(3000);
		getLinkspopupSubmitButton().click();
		genericMethodsCvp.implicitWait(3000);
		EnterGasBil("50");
		getGasUtility().tab();
		genericMethodsCvp.implicitWait(3000);
		getGasMonthlyDrop().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(3000);
		SelectNoButtonForGasArrear();
		genericMethodsCvp.implicitWait(3000);
		EnterWaterBil("50");
		getWaterSupplyUtility().tab();
		genericMethodsCvp.implicitWait(3000);
		getWaterSupplyMonthlyDrop().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(3000);
		getWaterSupplyArrearButton().click();
		genericMethodsCvp.implicitWait(3000);
		getBuildingsAndcontentInsurance().enterText("20");
		getBuildingsAndcontentInsurance().tab();
		genericMethodsCvp.implicitWait(3000);
		getBuildingsAndContentInsuranceMonthlyDrop().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(3000);
		getBuildingsAndContentInsuranceNoArrearButton().click();
		genericMethodsCvp.implicitWait(3000);
		removeDuelFuleBtn();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		genericMethodsCvp.implicitWait(3000);
		removeLifeInsuranceBtn();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		genericMethodsCvp.implicitWait(3000);
		removePublictransportBtn();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		genericMethodsCvp.implicitWait(3000);
		removeMedicineBtn();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		genericMethodsCvp.implicitWait(3000);
		removeDentistryBtn();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		genericMethodsCvp.implicitWait(3000);
		removeOpticians();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		genericMethodsCvp.implicitWait(3000);
		genericMethodsCvp.scrollIntoViewElement(By.xpath("//label[normalize-space()='All fixed spending items are complete']"));
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		getAllFixedSpendingCompleted().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		genericMethodsCvp.implicitWait(3000);
		getContinueYourFixedSpendingButton().click();
		genericMethodsCvp.implicitWait(3000);
		getBrowser().sleep(5000);
	}
}

