package com.stepChangeRem.remediation.pages;

import com.stepchange.atf.controls.*;
import com.stepchange.atf.genericMethods.GenericMethodsRemediation;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class YourSpendingFlexibleCost extends Control {
	GenericMethodsRemediation genericMethodsCvp = new GenericMethodsRemediation();
	private Button HomePhonInternetTvPackageArrearsNoButton;
	private Button YourSpendingFlexibleCostBackToDashboardButton;
	private Checkbox ReasonAwaitingForContractToEnd;
	private Div SpendingFlexibleCostTitleDiv;
	//Food and house Keeping module
	private Div FoodAndHouseKeepingTitleDiv;
	//Groceries
	private TextField MonthlyFoodAndGroceries;
	private Dropdown FoodAndGroceriesmonthlyDropdown;
	private Dropdown FoodAndGroceriesOwnerDropdown;
	private Button FoodAndGroceriesRemoveButton;
	private Button FoodAndGroceriesAnotherButton;
	private Button FoodAndGroceriesRenameLink;
	//Reason for Spend Popup
	private Div ReasonForSpendTitleDiv;
	private Checkbox ReasonForSpendotherPeopleCotributeCheckBox;
	private Checkbox ReasonForSpendClienthasChosennottoBudget;
	private Checkbox ReasonForSpendSomeoneElsePaysForThis;
	private Checkbox ReasonForSpendThisIsntApplicableToMe;
	private Checkbox ReasonForSpendAReasonNotListed;
	private TextField ReasonForSpendOtherTextArea;
	private Button ReasonForSpendSubmitButton;
	private Button ReasonForSpendCancelButton;
	private Button selectReasonForRemoving;
	//Meals at work
	private TextField MonthlyMealsAtWork;
	private Dropdown MealsAtWorkMonthlyDropdown;
	private Dropdown MealsAtWorkOwnerDropdown;
	private Button MealsAtWorkRemoveButton;
	private Button MonthlyMealsAtWorkAnotherButton;
	//Alcohol
	private TextField AlcoholTextbox;
	private Dropdown AlcoholMonthlyDropdown;
	private Dropdown AlcoholOwnerDropdown;
	private Button AlcoholRemoveButton;
	private Button AlcoholAnotherButton;
	//Laundry and dry cleaning
	private TextField LaundryTextbox;
	private Dropdown LaundryMonthlyDropdown;
	private Dropdown LaundryOwnerDropdown;
	private Button LaundryRemoveButton;
	private Button LaundryAnotherButton;
	//Household maintenance and repairs
	private TextField HouseholdMainRepairsTextbox;
	private Dropdown HouseholdMainRepairsMonthlyDropdown;
	private Dropdown HouseholdMainRepairsOwnerDropdown;
	private Button HouseholdMainRepairsRemoveButton;
	private Button HouseholdMainRepairsAnotherButton;
	//private Button nappies and baby items
	private Button addNappiesandBabyItemsButton;
	private TextField addNappiesandBabyItemsTextbox;
	private Dropdown addNappiesandBabyItemsMonthlyDropdown;
	private Dropdown addNappiesandBabyItemsOwnerDropdown;
	private Button addNappiesandBabyItemsRemoveButton;
	private Button addNappiesandBabyItemsAnotherButton;
	//SchoolMeals
	private Button addSchoolmealsButton;
	private TextField SchoolmealsTextbox;
	private Dropdown SchoolmealsMonthlyDropdown;
	private Dropdown SchoolmealsOwnerDropdown;
	private Button SchoolmealsRemoveButton;
	private Button SchoolmealsAnotherButton;
	//Smoking products
	private Button addSmokingproductsButton;
	private TextField SmokingproductsTextbox;
	private Dropdown SmokingproductsMonthlyDropdown;
	private Dropdown SmokingproductsOwnerDropdown;
	private Button SmokingproductsRemoveButton;
	private Button SmokingproductsAnotherButton;
	//vet bills and pet insurance
	private Button addVetBillsandpetInsuranceButton;
	private TextField VetBillsandpetInsuranceTextbox;
	private Dropdown VetBillsandpetInsuranceMonthlyDropdown;
	private Dropdown VetBillsandpetInsuranceOwnerDropdown;
	private Button VetBillsandpetInsuranceRemoveButton;
	private Button VetBillsandpetInsuranceAnotherButton;
	//Other food and housekeeping
	private Button addOtherfoodandHousekeepingButton;
	private TextField OtherfoodandHousekeepingTextbox;
	private Dropdown OtherfoodandHousekeepingMonthlyDropdown;
	private Dropdown OtherfoodandHousekeepingOwnerDropdown;
	private Button OtherfoodandHousekeepingRemoveButton;
	private Button OtherfoodandHousekeepingAnotherButton;
	//Communications and leisure module
	private Div CommunicationsAndLeisureTitle;
	//Home,phone,TV,Internet
	private TextField HomePhoneInternetTvPackageTextbox;
	private Dropdown HomePhoneInternetTvPackageMonthlyDropdown;
	private Dropdown HomePhoneInternetTvPackageOwnerDropdown;
	private Button HomePhoneInternetTvPackageRemoveButton;
	private Button HomePhoneInternetTvPackageAnotherButton;
	//Mobile Phone
	private TextField MobilePhoneTextbox;
	private Dropdown MobilePhoneMonthlyDropdown;
	private Dropdown MobilePhoneOwnerDropdown;
	private Button MobilePhoneRemoveButton;
	private Button MobilePhoneAnotherButton;
	private Button MobilePhoneNoButton;
	//Hobbies,leisure or Sport
	private TextField HobbiesLeisureSportTextbox;
	private Dropdown HobbiesLeisureSportMonthlyDropdown;
	private Dropdown HobbiesLeisureSportOwnerDropdown;
	private Button HobbiesLeisureSportRemoveButton;
	private Button HobbiesLeisureSportAnotherButton;
	//Gifts
	private TextField GiftsTextbox;
	private Dropdown GiftsMonthlyDropdown;
	private Dropdown GiftsOwnerDropdown;
	private Button GiftsRemoveButton;
	private Button GiftsAnotherButton;
	//Newspapers,magazines,Stationary and postage
	private TextField NewspapersMagazinesStationeryTextbox;
	private Dropdown NewspapersMagazinesStationeryMonthlyDropdown;
	private Dropdown NewspapersMagazinesStationeryOwnerDropdown;
	private Button NewspapersMagazinesStationeryRemoveButton;
	private Button NewspapersMagazinesStationeryAnotherButton;
	//Pocket Money
	private Button PocketMoneyButton;
	private TextField PocketMoneyTextbox;
	private Dropdown PocketMoneyMonthlyDropdown;
	private Dropdown PocketMoneyOwnerDropdown;
	private Button PocketMoneyRemoveButton;
	private Button PocketMoneyAnotherButton;
	//Charitable Donation
	private Button CharitableDonationButton;
	private TextField CharitableDonationTextbox;
	private Dropdown CharitableDonationMonthlyDropdown;
	private Dropdown CharitableDonationOwnerDropdown;
	private Button CharitableDonationRemoveButton;
	private Button CharitableDonationAnotherButton;
	//Religious Contribution
	private Button ReligiousContributionButton;
	private TextField ReligiousContributionTextbox;
	private Dropdown ReligiousContributionMonthlyDropdown;
	private Dropdown ReligiousContributionOwnerDropdown;
	private Button ReligiousContributionRemoveButton;
	private Button ReligiousContributionAnotherButton;
	//Other Communicationa and Leisure Costs
	private Button OtherCommAndLeisureCostButton;
	private TextField OtherCommAndLeisureCostTextbox;
	private Dropdown OtherCommAndLeisureCostMonthlyDropdown;
	private Dropdown OtherCommAndLeisureCostOwnerDropdown;
	private Button OtherCommAndLeisureCostRemoveButton;
	private Button OtherCommAndLeisureCostAnotherButton;
	//Personal Costs Module
	private Div PersonalCostsTitle;
	//Other Personal Costs
	private Button OtherPersonalCostButton;
	private TextField OtherPersonalCostTextbox;
	private Dropdown OtherPersonalCostMonthlyDropdown;
	private Dropdown OtherPersonalCostOwnerDropdown;
	private Button OtherPersonalCostRemoveButton;
	private Button OtherPersonalCostAnotherButton;
	//Clothing and footwear
	private TextField ClothingAndFootwearTextbox;
	private Dropdown ClothingAndFootwearMonthlyDropdown;
	private Dropdown ClothingAndFootwearOwnerDropdown;
	private Button ClothingAndFootwearRemoveButton;
	private Button ClothingAndFootwearAnotherButton;
	//Toiletries
	private TextField ToiletriesTextbox;
	private Dropdown ToiletriesMonthlyDropdown;
	private Dropdown ToiletriesOwnerDropdown;
	private Button ToiletriesRemoveButton;
	private Button ToiletriesAnotherButton;
	//Hairdressing
	private TextField HairdressingTextbox;
	private Dropdown HairdressingMonthlyDropdown;
	private Dropdown HairdressingOwnerDropdown;
	private Button HairdressingRemoveButton;
	private Button HairdressingAnotherButton;
	private Checkbox allFlexibleSpendingCompleted;
	private Button continueYourFlexibleSpendingButton;
	//Show Summary
	private Div ShowSummaryAmountOwnedDiv;
	private Div ShowSummaryIncomeDiv;
	private Div ShowSummarySpendingDiv;
	private Div ShowSummaryAvailableForDebtsDiv;
	private Dropdown ShowSummaryAsDropdown;
	private Link MobilePhoneReasonLink;

	private Link YourIncomelink;

	private Dropdown GroceriesOwnerDropdown;
	//	private Dropdown MobilePhoneOwnerDropdown;
	private Link Rename;
	private TextField RenameTextBox;
	private Link Renamesavelink;
	private TextField clothingTextBox;
	private Dropdown ClothingDropdown;
	private Dropdown ClothingOwnerDropdown;

	private TextField MobilephoneTextBox;
	private Dropdown MobilephoneDropdown;
	private Button RemoveSchoolmealsButton;
	private Button RemovePocketMoneygButton;
	private Button MoiblephoneArrearsNoButton;
	private Button removePersonalCostButton;
	private Checkbox otherPeopleCotributCheckBox;
	private Button continueYourFlexibleSpendingButtonA;




	//getters



	public Button getYourSpendingFlexibleCostBackToDashboardButton() {return YourSpendingFlexibleCostBackToDashboardButton;}
	public Div getSpendingFlexibleCostTitleDiv() {return SpendingFlexibleCostTitleDiv;}
	public Div getFoodAndHouseKeepingTitleDiv() {return FoodAndHouseKeepingTitleDiv;}
	public TextField getMonthlyFoodAndGroceries() {return MonthlyFoodAndGroceries;}
	public Dropdown getFoodAndGroceriesmonthlyDropdown() {return FoodAndGroceriesmonthlyDropdown;}
	public Button getFoodAndGroceriesRemoveButton() {return FoodAndGroceriesRemoveButton;}
	public Button getFoodAndGroceriesAnotherButton() {return FoodAndGroceriesAnotherButton;}
	public Div getReasonForSpendTitleDiv() {return ReasonForSpendTitleDiv;}
	public Checkbox getReasonForSpendotherPeopleCotributeCheckBox() {return ReasonForSpendotherPeopleCotributeCheckBox;}
	public Checkbox getReasonForSpendClienthasChosennottoBudget() {return ReasonForSpendClienthasChosennottoBudget;}
	public Checkbox getReasonForSpendSomeoneElsePaysForThis() {return ReasonForSpendSomeoneElsePaysForThis;}
	public Checkbox getReasonForSpendThisIsntApplicableToMe() {return ReasonForSpendThisIsntApplicableToMe;}
	public Checkbox getReasonForSpendAReasonNotListed() {return ReasonForSpendAReasonNotListed;}
	public TextField getReasonForSpendOtherTextArea() {return ReasonForSpendOtherTextArea;}
	public Button getReasonForSpendCancelButton() {return ReasonForSpendCancelButton;}
	public TextField getMonthlyMealsAtWork() {return MonthlyMealsAtWork; }
	public Dropdown getMealsAtWorkMonthlyDropdown() {return MealsAtWorkMonthlyDropdown;}
	public Dropdown getMealsAtWorkOwnerDropdown() {return MealsAtWorkOwnerDropdown;}
	public Button getMealsAtWorkRemoveButton() {return MealsAtWorkRemoveButton;}
	public Button getMonthlyMealsAtWorkAnotherButton() {return MonthlyMealsAtWorkAnotherButton;}
	public TextField getAlcoholTextbox() {return AlcoholTextbox;}
	public Dropdown getAlcoholMonthlyDropdown() {return AlcoholMonthlyDropdown; }
	public Dropdown getAlcoholOwnerDropdown() {return AlcoholOwnerDropdown;}
	public Button getAlcoholRemoveButton() {return AlcoholRemoveButton;}
	public Button getAlcoholAnotherButton() {return AlcoholAnotherButton;}
	public TextField getLaundryTextbox() {return LaundryTextbox;}
	public Dropdown getLaundryMonthlyDropdown() {return LaundryMonthlyDropdown;}
	public Dropdown getLaundryOwnerDropdown() {return LaundryOwnerDropdown;}
	public Button getLaundryRemoveButton() {return LaundryRemoveButton;}
	public Button getLaundryAnotherButton() {return LaundryAnotherButton;}
	public TextField getHouseholdMainRepairsTextbox() {return HouseholdMainRepairsTextbox;}
	public Dropdown getHouseholdMainRepairsMonthlyDropdown() {return HouseholdMainRepairsMonthlyDropdown;}
	public Dropdown getHouseholdMainRepairsOwnerDropdown() {return HouseholdMainRepairsOwnerDropdown;}
	public Button getHouseholdMainRepairsRemoveButton() {return HouseholdMainRepairsRemoveButton;}
	public Button getHouseholdMainRepairsAnotherButton() {return HouseholdMainRepairsAnotherButton;}
	public Button getaddNappiesandBabyItemsButton() {return addNappiesandBabyItemsButton;}
	public TextField getaddNappiesandBabyItemsTextbox() {return addNappiesandBabyItemsTextbox;}
	public Dropdown getaddNappiesandBabyItemsMonthlyDropdown() {return addNappiesandBabyItemsMonthlyDropdown;}
	public Dropdown getaddNappiesandBabyItemsOwnerDropdown() {return addNappiesandBabyItemsOwnerDropdown;}
	public Button getaddNappiesandBabyItemsRemoveButton() {return addNappiesandBabyItemsRemoveButton;}
	public Button getaddNappiesandBabyItemsAnotherButton() {return addNappiesandBabyItemsAnotherButton;}
	public Button getaddSchoolmealsButton() {return addSchoolmealsButton;}
	public TextField getSchoolmealsTextbox() {return SchoolmealsTextbox;}
	public Dropdown getSchoolmealsMonthlyDropdown() {return SchoolmealsMonthlyDropdown;}
	public Dropdown getSchoolmealsOwnerDropdown() {return SchoolmealsOwnerDropdown;}
	public Button getSchoolmealsRemoveButton() {return SchoolmealsRemoveButton;}
	public Button getSchoolmealsAnotherButton() {return SchoolmealsAnotherButton;}
	public Button getaddSmokingproductsButton() {return addSmokingproductsButton;}
	public TextField getSmokingproductsTextbox() {return SmokingproductsTextbox;}
	public Dropdown getSmokingproductsMonthlyDropdown() {return SmokingproductsMonthlyDropdown;}
	public Dropdown getSmokingproductsOwnerDropdown() {return SmokingproductsOwnerDropdown;}
	public Button getSmokingproductsRemoveButton() {return SmokingproductsRemoveButton;}
	public Button getSmokingproductsAnotherButton() {return SmokingproductsAnotherButton;}
	public Button getaddVetBillsandpetInsuranceButton() {return addVetBillsandpetInsuranceButton;}
	public TextField getVetBillsandpetInsuranceTextbox() {return VetBillsandpetInsuranceTextbox;}
	public Dropdown getVetBillsandpetInsuranceMonthlyDropdown() {return VetBillsandpetInsuranceMonthlyDropdown;}
	public Dropdown getVetBillsandpetInsuranceOwnerDropdown() {return VetBillsandpetInsuranceOwnerDropdown;}
	public Button getVetBillsandpetInsuranceRemoveButton() {return VetBillsandpetInsuranceRemoveButton;}
	public Button getVetBillsandpetInsuranceAnotherButton() {return VetBillsandpetInsuranceAnotherButton;}
	public Button getaddOtherfoodandHousekeepingButton() {return addOtherfoodandHousekeepingButton;}
	public TextField getOtherfoodandHousekeepingTextbox() {return OtherfoodandHousekeepingTextbox;}
	public Dropdown getOtherfoodandHousekeepingMonthlyDropdown() {return OtherfoodandHousekeepingMonthlyDropdown;}
	public Dropdown getOtherfoodandHousekeepingOwnerDropdown() {return OtherfoodandHousekeepingOwnerDropdown;}
	public Button getOtherfoodandHousekeepingRemoveButton() {return OtherfoodandHousekeepingRemoveButton;}
	public Button getOtherfoodandHousekeepingAnotherButton() {return OtherfoodandHousekeepingAnotherButton;}
	public Div getCommunicationsAndLeisureTitle() {return CommunicationsAndLeisureTitle;}
	public TextField getHomePhoneInternetTvPackageTextbox() {return HomePhoneInternetTvPackageTextbox;}
	public Dropdown getHomePhoneInternetTvPackageMonthlyDropdown() {return HomePhoneInternetTvPackageMonthlyDropdown;}
	public Dropdown getHomePhoneInternetTvPackageOwnerDropdown() {return HomePhoneInternetTvPackageOwnerDropdown;}
	public Button getHomePhoneInternetTvPackageRemoveButton() {return HomePhoneInternetTvPackageRemoveButton;}
	public Button getHomePhoneInternetTvPackageAnotherButton() {return HomePhoneInternetTvPackageAnotherButton;}
	public TextField getMobilePhoneTextbox() {return MobilePhoneTextbox;}
	public Dropdown getMobilePhoneMonthlyDropdown() {return MobilePhoneMonthlyDropdown;}
	public Dropdown getMobilePhoneOwnerDropdown() {return MobilePhoneOwnerDropdown;}
	public Button getMobilePhoneRemoveButton() {return MobilePhoneRemoveButton;}
	public Button getMobilePhoneAnotherButton() {return MobilePhoneAnotherButton;}
	public Button getMobilePhoneNoButton() {return MobilePhoneNoButton;}
	public TextField getHobbiesLeisureSportTextbox() {return HobbiesLeisureSportTextbox;}
	public Dropdown getHobbiesLeisureSportMonthlyDropdown() {return HobbiesLeisureSportMonthlyDropdown;}
	public Dropdown getHobbiesLeisureSportOwnerDropdown() {return HobbiesLeisureSportOwnerDropdown;}
	public Button getHobbiesLeisureSportRemoveButton() {return HobbiesLeisureSportRemoveButton;}
	public Button getHobbiesLeisureSportAnotherButton() {return HobbiesLeisureSportAnotherButton;}
	public TextField getGiftsTextbox() {return GiftsTextbox;}
	public Dropdown getGiftsMonthlyDropdown() {return GiftsMonthlyDropdown;}
	public Dropdown getGiftsOwnerDropdown() {return GiftsOwnerDropdown;}
	public Button getGiftsRemoveButton() {return GiftsRemoveButton;}
	public Button getGiftsAnotherButton() {return GiftsAnotherButton;}
	public TextField getNewspapersMagazinesStationeryTextbox() {return NewspapersMagazinesStationeryTextbox;}
	public Dropdown getNewspapersMagazinesStationeryMonthlyDropdown() {return NewspapersMagazinesStationeryMonthlyDropdown;}
	public Dropdown getNewspapersMagazinesStationeryOwnerDropdown() {return NewspapersMagazinesStationeryOwnerDropdown;}
	public Button getNewspapersMagazinesStationeryRemoveButton() {return NewspapersMagazinesStationeryRemoveButton;}
	public Button getNewspapersMagazinesStationeryAnotherButton() {return NewspapersMagazinesStationeryAnotherButton;}
	public Button getPocketMoneyButton() {return PocketMoneyButton;}
	public TextField getPocketMoneyTextbox() {return PocketMoneyTextbox;}
	public Dropdown getPocketMoneyMonthlyDropdown() {return PocketMoneyMonthlyDropdown;}
	public Dropdown getPocketMoneyOwnerDropdown() {return PocketMoneyOwnerDropdown;}
	public Button getPocketMoneyRemoveButton() {return PocketMoneyRemoveButton;}
	public Button getPocketMoneyAnotherButton() {return PocketMoneyAnotherButton;}
	public Button getCharitableDonationButton() {return CharitableDonationButton;}
	public TextField getCharitableDonationTextbox() {return CharitableDonationTextbox;}
	public Dropdown getCharitableDonationMonthlyDropdown() {return CharitableDonationMonthlyDropdown;}
	public Dropdown getCharitableDonationOwnerDropdown() {return CharitableDonationOwnerDropdown;}
	public Button getCharitableDonationRemoveButton() {return CharitableDonationRemoveButton;}
	public Button getCharitableDonationAnotherButton() {return CharitableDonationAnotherButton;}
	public Button getReligiousContributionButton() {return ReligiousContributionButton;}
	public TextField getReligiousContributionTextbox() {return ReligiousContributionTextbox;}
	public Dropdown getReligiousContributionMonthlyDropdown() {return ReligiousContributionMonthlyDropdown;}
	public Dropdown getReligiousContributionOwnerDropdown() {return ReligiousContributionOwnerDropdown;}
	public Button getReligiousContributionRemoveButton() {return ReligiousContributionRemoveButton;}
	public Button getReligiousContributionAnotherButton() {return ReligiousContributionAnotherButton;}
	public Button getOtherCommAndLeisureCostButton() {return OtherCommAndLeisureCostButton;}
	public TextField getOtherCommAndLeisureCostTextbox() {return OtherCommAndLeisureCostTextbox;}
	public Dropdown getOtherCommAndLeisureCostMonthlyDropdown() {return OtherCommAndLeisureCostMonthlyDropdown;}
	public Dropdown getOtherCommAndLeisureCostOwnerDropdown() {return OtherCommAndLeisureCostOwnerDropdown;}
	public Button getOtherCommAndLeisureCostRemoveButton() {return OtherCommAndLeisureCostRemoveButton;}
	public Button getOtherCommAndLeisureCostAnotherButton() {return OtherCommAndLeisureCostAnotherButton;}
	public Div getPersonalCostsTitle() {return PersonalCostsTitle;}
	public Button getOtherPersonalCostButton() {return OtherPersonalCostButton;}
	public TextField getOtherPersonalCostTextbox() {return OtherPersonalCostTextbox;}
	public Dropdown getOtherPersonalCostMonthlyDropdown() {return OtherPersonalCostMonthlyDropdown;}
	public Dropdown getOtherPersonalCostOwnerDropdown() {return OtherPersonalCostOwnerDropdown;}
	public Button getOtherPersonalCostRemoveButton() {return OtherPersonalCostRemoveButton;}
	public Button getOtherPersonalCostAnotherButton() {return OtherPersonalCostAnotherButton;}
	public TextField getClothingAndFootwearTextbox() {return ClothingAndFootwearTextbox;}
	public Dropdown getClothingAndFootwearMonthlyDropdown() {return ClothingAndFootwearMonthlyDropdown;}
	public Dropdown getClothingAndFootwearOwnerDropdown() {return ClothingAndFootwearOwnerDropdown;}
	public Button getClothingAndFootwearRemoveButton() {return ClothingAndFootwearRemoveButton;}
	public Button getClothingAndFootwearAnotherButton() {return ClothingAndFootwearAnotherButton;}
	public TextField getToiletriesTextbox() {return ToiletriesTextbox;}
	public Dropdown getToiletriesMonthlyDropdown() {return ToiletriesMonthlyDropdown;}
	public Dropdown getToiletriesOwnerDropdown() {return ToiletriesOwnerDropdown;}
	public Button getToiletriesRemoveButton() {return ToiletriesRemoveButton;}
	public Button getToiletriesAnotherButton() {return ToiletriesAnotherButton;}
	public TextField getHairdressingTextbox() {return HairdressingTextbox;}
	public Dropdown getHairdressingMonthlyDropdown() {return HairdressingMonthlyDropdown;}
	public Dropdown getHairdressingOwnerDropdown() {return HairdressingOwnerDropdown;}
	public Button getHairdressingRemoveButton() {return HairdressingRemoveButton;}
	public Button getHairdressingAnotherButton() {return HairdressingAnotherButton;}
	public Checkbox getAllFlexibleSpendingCompleted() {return allFlexibleSpendingCompleted;}
	public Button getContinueYourFlexibleSpendingButton() {return continueYourFlexibleSpendingButton;}
	public Div getShowSummaryAmountOwnedDiv() {return ShowSummaryAmountOwnedDiv;}
	public Div getShowSummaryIncomeDiv() {return ShowSummaryIncomeDiv;}
	public Div getShowSummarySpendingDiv() {return ShowSummarySpendingDiv;}
	public Div getShowSummaryAvailableForDebtsDiv() {return ShowSummaryAvailableForDebtsDiv;}
	public Dropdown getShowSummaryAsDropdown() {return ShowSummaryAsDropdown;}

	//	public Button getHomePhonInternetTvPackageArrearsNoButton() {
//		return HomePhonInternetTvPackageArrearsNoButton;
//	}
//
//	private Button HomePhonInternetTvPackageArrearsNoButton;
//
//
	public Button getHomePhonInternetTvPackageArrearsNoButton() {return HomePhonInternetTvPackageArrearsNoButton;}
	public Link getMobilePhoneReasonLink() {return MobilePhoneReasonLink;}
	public Checkbox getReasonAwaitingForContractToEnd() {return ReasonAwaitingForContractToEnd;}

	public Link getYourIncomelink() {
		return YourIncomelink;
	}
	private TextField monthlyFoodAndGroceries;

	public Dropdown getFoodAndGroceriesmonthlyDrop() {
		return foodAndGroceriesmonthlyDrop;
	}
	public Button getRemovePersonalCostButton() {
		return removePersonalCostButton;
	}
	public Checkbox getOtherPeopleCotributCheckBox() {
		return otherPeopleCotributCheckBox;
	}
	private Button reasonForSpendSubmitButton;
	public Button getReasonForSpendSubmitButton() {
		return reasonForSpendSubmitButton;
	}

	private Button RemoveButtonMealsAtWork;
	private Button RemoveAlcoholButton;
	private Button removeLaundryAndDryCleaningButton;
	private Button RemoveHouseholdRepairsButton;
	private Button RemoveHomePhoneIntenetButton;
	private Button RemoveMobilePhoneButton;
	private Button RemoveHobbiesButton;
	private Button RemovegiftsButton;
	private Button RemoveNewsPaperButton;
	private Button RemoveToiletsButton;
	private Button RemoveHairDressingButton;
	private Button FoodAndGrocryAddAnoterButton01;
	private TextField MonthlyFoodAndGroceriesTextBox01;
	private TextField MonthlyFoodAndGroceriesTextBox02;
	private TextField MonthlyFoodAndGroceriesTextBox03;
	private TextField MonthlyFoodAndGroceriesTextBox04;
	private Dropdown FoodAndGroceriesMonthlyDrop01;
	private Dropdown FoodAndGroceriesMonthlyDrop02;
	private Dropdown FoodAndGroceriesMonthlyDrop03;
	private Dropdown FoodAndGroceriesMonthlyDrop04;

	public Button getFoodAndGrocryAddAnoterButton01(){return FoodAndGrocryAddAnoterButton01;}
	public TextField getMonthlyFoodAndGroceriesTextBox01(){return MonthlyFoodAndGroceriesTextBox01;}
	public TextField getMonthlyFoodAndGroceriesTextBox02(){return MonthlyFoodAndGroceriesTextBox02;}
	public TextField getMonthlyFoodAndGroceriesTextBox03(){return MonthlyFoodAndGroceriesTextBox03;}
	public TextField getMonthlyFoodAndGroceriesTextBox04(){return MonthlyFoodAndGroceriesTextBox04;}
	public Dropdown getFoodAndGroceriesMonthlyDrop01(){return FoodAndGroceriesMonthlyDrop01;}
	public Dropdown getFoodAndGroceriesMonthlyDrop02(){return FoodAndGroceriesMonthlyDrop02;}
	public Dropdown getFoodAndGroceriesMonthlyDrop03(){return FoodAndGroceriesMonthlyDrop03;}
	public Dropdown getFoodAndGroceriesMonthlyDrop04(){return FoodAndGroceriesMonthlyDrop04;}
	public Button getRemoveButtonMealsAtWork() {
		return RemoveButtonMealsAtWork;
	}
	public Button getRemoveAlcoholButton() {
		return RemoveAlcoholButton;
	}
	public Button getRemoveLaundryAndDryCleaningButton() {
		return removeLaundryAndDryCleaningButton;
	}
	public Button getRemoveHouseholdRepairsButton() {
		return RemoveHouseholdRepairsButton;
	}
	public Button getRemoveHomePhoneIntenetButton() {
		return RemoveHomePhoneIntenetButton;
	}
	public Button getRemoveMobilePhoneButton() {
		return RemoveMobilePhoneButton;
	}
	public Button getRemoveHobbiesButton() {
		return RemoveHobbiesButton;
	}
	public Button getRemovegiftsButton() {
		return RemovegiftsButton;
	}
	public Button getRemoveNewsPaperButton() {
		return RemoveNewsPaperButton;
	}
	public Button getRemoveToiletsButton() {
		return RemoveToiletsButton;
	}
	public Button getRemoveHairDressingButton() {
		return RemoveHairDressingButton;
	}
	public Button getcontinueYourFlexibleSpendingButtonA(){return continueYourFlexibleSpendingButtonA;}



	private Button getMobilePhoneArrears(){
		return mobilePhoneArrears;
	}
	private Dropdown foodAndGroceriesmonthlyDrop;
	private Dropdown foodAndGroceriesMonthlyDrop01;
	private Button mobilePhoneArrears;

	//Constructor
	public YourSpendingFlexibleCost() {

		RemoveButtonMealsAtWork = new Button(By.xpath("//div[text()='Meals at work']//following::button[4]"));
		RemoveAlcoholButton = new Button(By.xpath("//div[text()='Alcohol']//following::button[4]"));
		removeLaundryAndDryCleaningButton = new Button(By.xpath("//div[text()='Laundry and dry cleaning']//following::button[4]"));
		RemoveHouseholdRepairsButton = new Button(By.xpath("//div[text()='Household repairs and maintenance']//following::button[4]"));
		RemoveHomePhoneIntenetButton = new Button(By.xpath("//div[text()='Home phone, internet and TV package']//following::button[4]"));
		RemoveMobilePhoneButton = new Button(By.xpath("//div[text()='Mobile phone']//following::button[4]"));
		RemoveHobbiesButton = new Button(By.xpath("//div[text()='Hobbies, leisure or sport']//following::button[4]"));
		RemovegiftsButton = new Button(By.xpath("//div[text()='Gifts']//following::button[4]"));
		RemoveNewsPaperButton = new Button(By.xpath("//div[text()='Newspapers, magazines, stationery and postage']//following::button[4]"));
		RemoveToiletsButton = new Button(By.xpath("//div[text()='Toiletries']//following::button[4]"));
		RemoveHairDressingButton = new Button(By.xpath("//div[text()='Hairdressing']//following::button[4]"));
		reasonForSpendSubmitButton = new Button(By.xpath("//button[normalize-space()='Submit']"));

		otherPeopleCotributCheckBox = new Checkbox(By.xpath("//label[normalize-space()='Other people contribute towards cost']"));

		HomePhonInternetTvPackageArrearsNoButton=new Button(By.xpath("//div[text()='Home phone, internet and TV package']//following::label[4]"));
		YourSpendingFlexibleCostBackToDashboardButton=new Button(By.xpath("//a[contains(@name,'BackToDashboard_pyWorkPage')]"));
		SpendingFlexibleCostTitleDiv=new Div(By.xpath("//div[@data-test-id='201806131251220714327295']"));
		FoodAndHouseKeepingTitleDiv=new Div(By.xpath("(//div[@data-test-id='2018013011581209546505'])[1]"));
		MonthlyFoodAndGroceries = new TextField(By.xpath("//div[text()='Groceries']//following::input[2]"));
		FoodAndGroceriesmonthlyDropdown = new Dropdown (By.xpath("//div[text()='Groceries']//following::select[1]"));
		FoodAndGroceriesOwnerDropdown=new Dropdown(By.xpath("//div[text()='Groceries']//following::select[2]"));
		FoodAndGroceriesRemoveButton=new Button(By.xpath("//div[text()='Groceries']//following::button[4]"));
		FoodAndGroceriesAnotherButton=new Button(By.xpath("//button[@name='ExpenditureRow_D_ExpenditureCategoryList.pxResults(3).pxResults(1)_100']"));
		ReasonForSpendTitleDiv=new Div(By.xpath("//span[@id='modaldialog_hd_title']"));
		ReasonForSpendotherPeopleCotributeCheckBox=new Checkbox(By.xpath("//label[normalize-space()='Other people contribute towards cost']"));
		ReasonForSpendClienthasChosennottoBudget=new Checkbox(By.xpath("//label[normalize-space()='Client has chosen not to budget for this']"));
		ReasonForSpendSomeoneElsePaysForThis=new Checkbox(By.xpath("//label[normalize-space()='Someone else pays for this']"));
		ReasonForSpendThisIsntApplicableToMe=new Checkbox(By.xpath("(//label[@data-test-id='FDCausesCheck-Label'])[4]"));
		ReasonForSpendAReasonNotListed=new Checkbox(By.xpath("(//label[@data-test-id='FDCausesCheck-Label'])[5]"));
		ReasonForSpendOtherTextArea=new TextField(By.xpath("//textarea[@name='$PD_ExpenditureCategoryList$ppxResults$l3$ppxResults$l1$pOtherExpenditureReason']"));
		ReasonForSpendSubmitButton=new Button(By.xpath("//button[text()='Submit']"));
		ReasonForSpendCancelButton=new Button(By.xpath("//button[text()='Cancel']"));
		MonthlyMealsAtWork=new TextField(By.xpath("//div[text()='Meals at work']//following::input[2]"));
		MealsAtWorkMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Meals at work']//following::select[1]"));
		MealsAtWorkOwnerDropdown=new Dropdown(By.xpath("//div[text()='Meals at work']//following::select[2]"));
		MealsAtWorkRemoveButton=new Button(By.xpath("//div[text()='Meals at work']//following::button[4]"));
		MonthlyMealsAtWorkAnotherButton=new Button(By.xpath("//button[@name='ExpenditureRow_D_ExpenditureCategoryList.pxResults(3).pxResults(2)_100']"));
		AlcoholTextbox=new TextField(By.xpath("//div[text()='Alcohol']//following::input[2]"));
		AlcoholMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Alcohol']//following::select[1]"));
		AlcoholOwnerDropdown=new Dropdown(By.xpath("//div[text()='Alcohol']//following::select[2]"));
		ReasonAwaitingForContractToEnd=new Checkbox(By.xpath("//label[text()='Awaiting contract to end']"));
		AlcoholRemoveButton=new Button(By.xpath("//div[text()='Alcohol']//following::button[4]"));
		AlcoholAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(3).pxResults(3)_100"));
		LaundryTextbox=new TextField(By.xpath("//div[text()='Laundry and dry cleaning']//following::input[2]"));
		LaundryMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Laundry and dry cleaning']//following::select[1]"));
		LaundryOwnerDropdown=new Dropdown(By.xpath("//div[text()='Laundry and dry cleaning']//following::select[2]"));
		LaundryRemoveButton=new Button(By.xpath("//div[text()='Laundry and dry cleaning']//following::button[4]"));
		LaundryAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList"));
		HouseholdMainRepairsTextbox=new TextField(By.xpath("//div[text()='Household repairs and maintenance']//following::input[2]"));
		HouseholdMainRepairsMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Household repairs and maintenance']//following::select[1]"));
		HouseholdMainRepairsOwnerDropdown=new Dropdown(By.xpath("//div[text()='Household repairs and maintenance']//following::select[2]"));
		HouseholdMainRepairsRemoveButton=new Button(By.xpath("//div[text()='Household repairs and maintenance']//following::button[4]"));
		HouseholdMainRepairsAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(3).pxResults(5)_100"));
		addNappiesandBabyItemsButton=new Button(By.xpath("//button[text()='nappies and baby items']"));
		addNappiesandBabyItemsTextbox=new TextField(By.xpath("//div[text()='Nappies and baby items']//following::input[2]"));
		addNappiesandBabyItemsMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Nappies and baby items']//following::select[1]"));
		addNappiesandBabyItemsOwnerDropdown=new Dropdown(By.xpath("//div[text()='Nappies and baby items']//following::select[2]"));
		addNappiesandBabyItemsRemoveButton=new Button(By.xpath("//div[text()='Nappies and baby items']//following::button[4]"));
		addNappiesandBabyItemsAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(3).pxResults(6)_100"));
		addSchoolmealsButton=new Button(By.xpath("//button[text()='School meals']"));
		SchoolmealsTextbox=new TextField(By.xpath("//div[text()='School meals']//following::input[2]"));
		SchoolmealsMonthlyDropdown=new Dropdown(By.xpath("//div[text()='School meals']//following::select[1]"));
		SchoolmealsOwnerDropdown=new Dropdown(By.xpath("//div[text()='School meals']//following::select[2]"));
		SchoolmealsRemoveButton=new Button(By.xpath("//div[text()='School meals']//following::button[4]"));
		SchoolmealsAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(3).pxResults(7)_100"));
		addSmokingproductsButton=new Button(By.xpath("//button[text()='Smoking products']"));
		SmokingproductsTextbox=new TextField(By.xpath("//div[text()='Smoking products']//following::input[2]"));
		SmokingproductsMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Smoking products']//following::select[1]"));
		SmokingproductsOwnerDropdown=new Dropdown(By.xpath("//div[text()='Smoking products']//following::select[2]"));
		SmokingproductsRemoveButton=new Button(By.xpath("//div[text()='Smoking products']//following::button[4]"));
		SmokingproductsAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(3).pxResults(8)_100"));
		addVetBillsandpetInsuranceButton=new Button(By.xpath("//button[text()='Vet bills and pet insurance']"));
		VetBillsandpetInsuranceTextbox=new TextField(By.xpath("//div[text()='Vet bills and pet insurance']//following::input[2]"));
		VetBillsandpetInsuranceMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Vet bills and pet insurance']//following::select[1]"));
		VetBillsandpetInsuranceOwnerDropdown=new Dropdown(By.xpath("//div[text()='Vet bills and pet insurance']//following::select[2]"));
		VetBillsandpetInsuranceRemoveButton=new Button(By.xpath("//div[text()='Vet bills and pet insurance']//following::button[4]"));
		VetBillsandpetInsuranceAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(3).pxResults(9)_100"));
		addOtherfoodandHousekeepingButton=new Button(By.xpath("//button[text()='Other food and housekeeping']"));
		OtherfoodandHousekeepingTextbox=new TextField(By.xpath("//div[text()='Other food and housekeeping']//following::input[2]"));
		OtherfoodandHousekeepingMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Other food and housekeeping']//following::select[1]"));
		OtherfoodandHousekeepingOwnerDropdown=new Dropdown(By.xpath("//div[text()='Other food and housekeeping']//following::select[2]"));
		OtherfoodandHousekeepingRemoveButton=new Button(By.xpath("//div[text()='Other food and housekeeping']//following::button[4]"));
		OtherfoodandHousekeepingAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(3).pxResults(10)_100"));
		CommunicationsAndLeisureTitle=new Div(By.xpath("//div[@data-test-id='2018013011581209546505']"));
		HomePhoneInternetTvPackageTextbox=new TextField(By.xpath("//div[text()='Home phone, internet and TV package']//following::input[2]"));
		HomePhoneInternetTvPackageMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Home phone, internet and TV package']//following::select[1]"));
		HomePhoneInternetTvPackageOwnerDropdown=new Dropdown(By.xpath("//div[text()='Home phone, internet and TV package']//following::select[2]"));
		HomePhoneInternetTvPackageRemoveButton=new Button(By.xpath("//div[text()='Home phone, internet and TV package']//following::button[4]"));
		HomePhoneInternetTvPackageAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(4).pxResults(1)_100"));
		MobilePhoneTextbox=new TextField(By.xpath("//div[text()='Mobile phone']//following::input[2]"));
		MobilePhoneMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Mobile phone']//following::select[1]"));
		MobilePhoneOwnerDropdown=new Dropdown(By.xpath("//div[text()='Mobile phone']//following::select[2]"));
		MobilePhoneRemoveButton=new Button(By.xpath("//div[text()='Mobile phone']//following::button[4]"));
		MobilePhoneAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(4).pxResults(2)_100"));
		MobilePhoneNoButton=new Button(By.xpath("//div[text()='Mobile phone']//following::label[4]"));
		HobbiesLeisureSportTextbox=new TextField(By.xpath("//div[text()='Hobbies, leisure or sport']//following::input[2]"));
		HobbiesLeisureSportMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Hobbies, leisure or sport']//following::select[1]"));
		HobbiesLeisureSportOwnerDropdown=new Dropdown(By.xpath("//div[text()='Hobbies, leisure or sport']//following::select[2]"));
		HobbiesLeisureSportRemoveButton=new Button(By.xpath("//div[text()='Hobbies, leisure or sport']//following::button[4]"));
		HobbiesLeisureSportAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(4).pxResults(3)_100"));
		GiftsTextbox=new TextField(By.xpath("//div[text()='Gifts']//following::input[2]"));
		GiftsMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Gifts']//following::select[1]"));
		GiftsOwnerDropdown=new Dropdown(By.xpath("//div[text()='Gifts']//following::select[2]"));
		GiftsRemoveButton=new Button(By.xpath("//div[text()='Gifts']//following::button[4]"));
		GiftsAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(4).pxResults(4)_100"));
		NewspapersMagazinesStationeryTextbox=new TextField(By.xpath("//div[text()='Newspapers, magazines, stationery and postage']//following::input[2]"));
		NewspapersMagazinesStationeryMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Newspapers, magazines, stationery and postage']//following::select[1]"));
		NewspapersMagazinesStationeryOwnerDropdown=new Dropdown(By.xpath("//div[text()='Newspapers, magazines, stationery and postage']//following::select[2]"));
		NewspapersMagazinesStationeryRemoveButton=new Button(By.xpath("//div[text()='Newspapers, magazines, stationery and postage']//following::button[4]"));
		NewspapersMagazinesStationeryAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(4).pxResults(5)_100"));
		PocketMoneyButton=new Button(By.xpath("//button[text()='Pocket money']"));
		PocketMoneyTextbox=new TextField(By.xpath("//div[text()='Pocket money']//following::input[2]"));
		PocketMoneyMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Pocket money']//following::select[1]"));
		PocketMoneyOwnerDropdown=new Dropdown(By.xpath("//div[text()='Pocket money']//following::select[2]"));
		PocketMoneyRemoveButton=new Button(By.xpath("//div[text()='Pocket money']//following::button[4]"));
		PocketMoneyAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(4).pxResults(6)_100"));
		CharitableDonationButton=new Button(By.xpath("//button[text()='Charitable Donation']"));
		CharitableDonationTextbox=new TextField(By.xpath("//div[text()='Charitable Donation']//following::input[2]"));
		CharitableDonationMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Charitable Donation']//following::select[1]"));
		CharitableDonationOwnerDropdown=new Dropdown(By.xpath("//div[text()='Charitable Donation']//following::select[2]"));
		CharitableDonationRemoveButton=new Button(By.xpath("//div[text()='Charitable Donation']//following::button[4]"));
		CharitableDonationAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(4).pxResults(7)_100"));
		ReligiousContributionButton=new Button(By.xpath("//button[text()='Religious contribution']"));
		ReligiousContributionTextbox=new TextField(By.xpath("//div[text()='Religious contribution']//following::input[2]"));
		ReligiousContributionMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Religious contribution']//following::select[1]"));
		ReligiousContributionOwnerDropdown=new Dropdown(By.xpath("//div[text()='Religious contribution']//following::select[2]"));
		ReligiousContributionRemoveButton=new Button(By.xpath("//div[text()='Religious contribution']//following::button[4]"));
		ReligiousContributionAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(4).pxResults(8)_100"));
		OtherCommAndLeisureCostButton=new Button(By.xpath("//button[text()='Other communications and leisure costs']"));
		OtherCommAndLeisureCostTextbox=new TextField(By.xpath("//div[text()='Other communications and leisure costs']//following::input[2]"));
		OtherCommAndLeisureCostMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Other communications and leisure costs']//following::select[1]"));
		OtherCommAndLeisureCostOwnerDropdown=new Dropdown(By.xpath("//div[text()='Other communications and leisure costs']//following::select[2]"));
		OtherCommAndLeisureCostRemoveButton=new Button(By.xpath("//div[text()='Other communications and leisure costs']//following::button[4]"));
		OtherCommAndLeisureCostAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(4).pxResults(9)_100"));
		PersonalCostsTitle=new Div(By.xpath("//div[@data-test-id='2018013011581209546505']"));
		OtherPersonalCostButton=new Button(By.xpath("//button[text()='Other personal costs']"));
		MobilePhoneReasonLink=new Link(By.xpath("//div[text()='Mobile phone']//following::a[3]"));
		OtherPersonalCostTextbox=new TextField(By.xpath("//div[text()='Other personal costs']//following::input[2]"));
		OtherPersonalCostMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Other personal costs']//following::select[1]"));
		OtherPersonalCostOwnerDropdown=new Dropdown(By.xpath("//div[text()='Other personal costs']//following::select[2]"));
		OtherPersonalCostRemoveButton=new Button(By.xpath("//div[text()='Other personal costs']//following::button[4]"));
		OtherPersonalCostAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(6).pxResults(4)_100"));
		ClothingAndFootwearTextbox=new TextField(By.xpath("//div[text()='Clothing and footwear']//following::input[2]"));
		ClothingAndFootwearMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Clothing and footwear']//following::select[1]"));
		ClothingAndFootwearOwnerDropdown=new Dropdown(By.xpath("//div[text()='Clothing and footwear']//following::select[2]"));
		ClothingAndFootwearRemoveButton=new Button(By.xpath("//div[text()='Clothing and footwear']//following::button[4]"));
		ClothingAndFootwearAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(6).pxResults(1)_100"));
		ToiletriesTextbox=new TextField(By.xpath("//div[text()='Toiletries']//following::input[2]"));
		ToiletriesMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Toiletries']//following::select[1]"));
		ToiletriesOwnerDropdown=new Dropdown(By.xpath("//div[text()='Toiletries']//following::select[2]"));
		ToiletriesRemoveButton=new Button(By.xpath("//div[text()='Toiletries']//following::button[4]"));
		ToiletriesAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(6).pxResults(2)_100"));
		HairdressingTextbox=new TextField(By.xpath("//div[text()='Hairdressing']//following::input[2]"));
		HairdressingMonthlyDropdown=new Dropdown(By.xpath("//div[text()='Hairdressing']//following::select[1]"));
		HairdressingOwnerDropdown=new Dropdown(By.xpath("//div[text()='Hairdressing']//following::select[2]"));
		HairdressingRemoveButton=new Button(By.xpath("//div[text()='Hairdressing']//following::button[4]"));
		HairdressingAnotherButton=new Button(By.name("ExpenditureRow_D_ExpenditureCategoryList.pxResults(6).pxResults(3)_100"));
		allFlexibleSpendingCompleted = new Checkbox(By.xpath("//label[normalize-space()='All flexible spending items are complete']"));
		continueYourFlexibleSpendingButton = new Button(By.xpath("//button[normalize-space()='Continue']"));
		continueYourFlexibleSpendingButtonA = new Button(By.xpath("//button[normalize-space()='Continue']"));
		ShowSummaryAmountOwnedDiv=new Div(By.xpath("(//span[@data-test-id='20171109145857045611457'])[1]"));
		ShowSummaryIncomeDiv=new Div(By.xpath("(//span[@data-test-id='20171109145857045611457'])[2]"));
		ShowSummarySpendingDiv=new Div(By.xpath("//p[@name='$PpyWorkPage$pNewAgreedTotalMonthlyExpWithAIP']"));
		ShowSummaryAvailableForDebtsDiv=new Div(By.xpath("//p[@name='$PpyWorkPage$pNewAgreedTotalMonthlyDifference']"));
		ShowSummaryAsDropdown=new Dropdown(By.xpath("//select[@name='$PpyWorkPage$pBudgetSummaryFrequency']"));
		selectReasonForRemoving=new Button(By.xpath("//label[@data-test-id='FDCausesCheck-Label']"));
		YourIncomelink = new Link(By.xpath("(//a[text()='Your income'])[1]"));
		GroceriesOwnerDropdown = new Dropdown(By.xpath("//div[text()='Groceries']//following::select[2]"));
		MobilePhoneOwnerDropdown = new Dropdown(By.xpath("//div[text()='Mobile phone']//following::select[2]"));
		Rename = new Link(By.xpath("(//a[text()='rename'])[13]"));
		RenameTextBox = new TextField(By.xpath("(//input[@validationtype='minchars'])[13]"));
		Renamesavelink = new Link(By.xpath("(//input[@validationtype='minchars'])[13]"));
		clothingTextBox =  new TextField(By.xpath("//div[text()='Clothing']//following::input[2]"));
		ClothingDropdown = new Dropdown(By.xpath("//div[text()='Clothing']//following::select[1]"));
		ClothingOwnerDropdown = new Dropdown(By.xpath("//div[text()='Clothing']//following::select[2]"));
		MobilephoneTextBox = new TextField(By.xpath("//div[text()='Mobile phone']//following::input[2]"));
		MobilephoneDropdown = new Dropdown(By.xpath("//div[text()='Mobile phone']//following::select[1]"));
		RemoveSchoolmealsButton = new Button(By.xpath("//div[text()='School meals']//following::button[4]"));
		RemovePocketMoneygButton = new Button(By.xpath("//div[text()='Pocket money']//following::button[4]"));
		MoiblephoneArrearsNoButton = new Button(By.xpath("//div[text()='Mobile phone']//following::label[4]"));
		foodAndGroceriesmonthlyDrop = new Dropdown (By.xpath("//div[text()='Groceries']//following::select[1]"));
		removePersonalCostButton = new Button(By.xpath("//div[text()='Clothing and footwear']//following::button[4]"));
		MonthlyFoodAndGroceriesTextBox01= new TextField(By.xpath("(//div[text()='Groceries']//following::input[2])[1]"));
		FoodAndGroceriesMonthlyDrop01 = new Dropdown (By.xpath("(//div[text()='Groceries']//following::select[1])[1]"));
		FoodAndGrocryAddAnoterButton01 = new Button(By.xpath("//button[@data-test-id='2015071603054009744126']"));
		MonthlyFoodAndGroceriesTextBox02= new TextField(By.xpath("(//div[text()='Groceries']//following::input[2])[2]"));
		MonthlyFoodAndGroceriesTextBox03= new TextField(By.xpath("(//div[text()='Groceries']//following::input[2])[3]"));
		MonthlyFoodAndGroceriesTextBox04= new TextField(By.xpath("(//div[text()='Groceries']//following::input[2])[4]"));
		FoodAndGroceriesMonthlyDrop01 = new Dropdown (By.xpath("(//div[text()='Groceries']//following::select[1])[1]"));
		FoodAndGroceriesMonthlyDrop02 = new Dropdown (By.xpath("(//div[text()='Groceries']//following::select[1])[2]"));
		FoodAndGroceriesMonthlyDrop03 =	new Dropdown (By.xpath("(//div[text()='Groceries']//following::select[1])[3]"));
		FoodAndGroceriesMonthlyDrop04 = new Dropdown (By.xpath("(//div[text()='Groceries']//following::select[1])[4]"));


		GroceriesAnother=new Button(By.xpath("//div[text()='Groceries']//following::button[text()='Another'][1]"));

		Groceries5=new TextField(By.xpath("(//div[text()='Groceries']//following::input[2])[5]"));
		Groceries5Frequency=new Dropdown(By.xpath("(//div[text()='Groceries']//following::select[1])[5]"));

		GroceriesAnother2=new Button(By.xpath("(//div[text()='Groceries'])[2]//following::button[text()='Another'][2]"));
		GroceriesAnother3=new Button(By.xpath("(//div[text()='Groceries'])[3]//following::button[text()='Another'][2]"));
		GroceriesAnother4=new Button(By.xpath("(//div[text()='Groceries'])[4]//following::button[text()='Another'][2]"));


	}
	public void SelectReasoneForSpendSubmitButton() {
		this.getReasonForSpendSubmitButton().click();
		genericMethodsCvp.implicitWait(3000);
	}
	public void SelectOtherPeopleContributionCheckbox() {
		this.getOtherPeopleCotributCheckBox().click();
		genericMethodsCvp.implicitWait(3000);
	}
	public void filltherequireddetails89929()
	{
		getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		switchToActiveFrame();
		// Remove
		this.getMealsAtWorkRemoveButton().click();
		this.getMealsAtWorkRemoveButton().verifyInvisiblityIslocated();
		this.getAlcoholRemoveButton().click();
		this.getAlcoholRemoveButton().verifyInvisiblityIslocated();
		this.getLaundryRemoveButton().click();
		this.getLaundryRemoveButton().verifyInvisiblityIslocated();
//		this.getHouseholdMainRepairsRemoveButton().click();
		this.getMobilePhoneRemoveButton().click();
		this.getMobilePhoneRemoveButton().verifyInvisiblityIslocated();
		this.getHobbiesLeisureSportRemoveButton().click();
		this.getHobbiesLeisureSportRemoveButton().verifyInvisiblityIslocated();
		this.getGiftsRemoveButton().click();
		this.getGiftsRemoveButton().verifyInvisiblityIslocated();
		this.getNewspapersMagazinesStationeryRemoveButton().click();
		this.getNewspapersMagazinesStationeryRemoveButton().verifyInvisiblityIslocated();
		this.getToiletriesRemoveButton().click();
		this.getToiletriesRemoveButton().verifyInvisiblityIslocated();
		this.getHairdressingRemoveButton().click();
		this.getHairdressingRemoveButton().verifyInvisiblityIslocated();
		//Fill the details for Food and Grocery
		getBrowser().sleep(200);
		this.getMonthlyFoodAndGroceries().enterTextField("217");
		this.getMonthlyFoodAndGroceries().tab();
		this.getFoodAndGroceriesmonthlyDropdown().selectFromDropdownByIndex(4);
//		this.getOtherfoodandHousekeepingAnotherButton().click();
//		this.getOtherfoodandHousekeepingTextbox().enterTextField("54");
//		this.getOtherfoodandHousekeepingTextbox().tab();
//		this.getOtherfoodandHousekeepingMonthlyDropdown().selectFromDropdownByIndex(4);
		// Home phone And InterNet
		this.getHomePhoneInternetTvPackageTextbox().enterTextField("35");
		this.getHomePhoneInternetTvPackageTextbox().tab();
		this.getHomePhoneInternetTvPackageMonthlyDropdown().selectFromDropdownByIndex(4);
		this.getHomePhonInternetTvPackageArrearsNoButton().click();
		// CLothing and Footwear
		this.getClothingAndFootwearTextbox().enterTextField("20");
		this.getClothingAndFootwearTextbox().tab();
		this.getClothingAndFootwearMonthlyDropdown().selectFromDropdownByIndex(4);
		this.getAllFlexibleSpendingCompleted().click();
		this.getContinueYourFlexibleSpendingButton().click();
	}

     public void EnterdetailsJointMPA()
	 {
		 switchToActiveFrame();
		 this.getRemoveAlcoholButton().click();
		 getBrowser().sleep(getBrowser().getTimeout()/10);
		 this.getRemoveLaundryAndDryCleaningButton().click();
		 getBrowser().sleep(getBrowser().getTimeout()/10);
		 this.getHouseholdMainRepairsRemoveButton().click();
		 getBrowser().sleep(getBrowser().getTimeout()/10);
		 this.getHomePhoneInternetTvPackageRemoveButton().click();
		 getBrowser().sleep(getBrowser().getTimeout()/10);
		 this.getMobilePhoneRemoveButton().click();
		 getBrowser().sleep(getBrowser().getTimeout()/10);
		 this.getHobbiesLeisureSportRemoveButton().click();
		 getBrowser().sleep(getBrowser().getTimeout()/10);
		 this.getGiftsRemoveButton().click();
		 getBrowser().sleep(getBrowser().getTimeout()/10);
		 this.getNewspapersMagazinesStationeryRemoveButton().click();
		 getBrowser().sleep(getBrowser().getTimeout()/10);
		 this.getToiletriesRemoveButton().click();
		 getBrowser().sleep(getBrowser().getTimeout()/10);
		 this.getHairdressingRemoveButton().click();
		 genericMethodsCvp.implicitWait(5000);
		 this.getMonthlyFoodAndGroceries().enterTextField("290");
		 genericMethodsCvp.implicitWait(5000);
		 this.getFoodAndGroceriesmonthlyDrop().selectFromDropdown("TPD0002");
		 genericMethodsCvp.implicitWait(1000);
		 this.getFoodAndGroceriesmonthlyDrop().tab();
		 genericMethodsCvp.implicitWait(5000);
		 this.getClothingAndFootwearTextbox().enterTextField("10");
		 genericMethodsCvp.implicitWait(10000);
		 this.getClothingAndFootwearMonthlyDropdown().selectFromDropdown("TPD0002");
		 genericMethodsCvp.implicitWait(3000);
		 this.getClothingAndFootwearMonthlyDropdown().tab();
		 genericMethodsCvp.implicitWait(5000);
		 this.getAllFlexibleSpendingCompleted().click();
		 genericMethodsCvp.implicitWait(5000);
		 this.getContinueYourFlexibleSpendingButton().click();
		 genericMethodsCvp.implicitWait(5000);
         System.out.println("EnterdetailsJointMPA=====================");

	 }

	public void EnterdetailsGuestUser()
	{
		switchToActiveFrame();
		this.getMealsAtWorkRemoveButton().click();
		this.getAlcoholRemoveButton().click();
		this.getLaundryRemoveButton().click();
		this.getHobbiesLeisureSportRemoveButton().click();
		this.getGiftsRemoveButton().click();
		this.getNewspapersMagazinesStationeryRemoveButton().click();
		this.getClothingAndFootwearRemoveButton().click();
		this.getReasonForSpendThisIsntApplicableToMe().click();
		this.getReasonForSpendSubmitButton().click();
		this.getToiletriesRemoveButton().click();
		this.getHairdressingRemoveButton().click();
		this.getMonthlyFoodAndGroceries().enterTextField("200");
		this.getFoodAndGroceriesmonthlyDropdown().selectFromDropdownByIndex(5);
		this.getHomePhoneInternetTvPackageTextbox().enterTextField("50");
		this.getHomePhoneInternetTvPackageMonthlyDropdown().selectFromDropdownByIndex(5);
		this.getHomePhonInternetTvPackageArrearsNoButton().click();
		this.getMobilePhoneTextbox().enterTextField("33");
		this.getMobilePhoneMonthlyDropdown().selectFromDropdownByIndex(4);
		this.getMobilePhoneNoButton().click();
		this.getMobilePhoneReasonLink().click();
		this.getReasonAwaitingForContractToEnd().click();
		this.getReasonForSpendSubmitButton().click();
		this.getAllFlexibleSpendingCompleted().click();
		this.getContinueYourFlexibleSpendingButton().click();


	}

	public void RemovePersonalCostButton() {
		this.getRemovePersonalCostButton().click();
		genericMethodsCvp.implicitWait(3000);
	}

	public void clickYourIncomelink() {
		this.getYourIncomelink().click();
		genericMethodsCvp.implicitWait(2000);

	}
	public void EnterGroceries(String data)	{
		this.getMonthlyFoodAndGroceries().enterText(data);
		genericMethodsCvp.implicitWait(3000);

	}

	public void SelectSharedfromFoodAndGroceriesOwnerDropdown () {
		genericMethodsCvp.selectByText(GroceriesOwnerDropdown, "Shared");
	}


	public void EnterAmountinMobilephoneTextBox(String data)	{
		this.getMobilePhoneTextbox().enterText(data);
		genericMethodsCvp.implicitWait(3000);

	}
	public void SelectMonthfromMobilephoneDropdown () {
		genericMethodsCvp.selectByText(MobilephoneDropdown, "monthly");
	}
	public void SelectClient2fromMobilePhoneOwnerDropdown () {
		genericMethodsCvp.selectByText(MobilePhoneOwnerDropdown, "Client2");
	}

	public Button getMoiblephoneArrearsNoButton() {
		return MoiblephoneArrearsNoButton;
	}
	public void clickMobilePhoneArrearsNoButton() {
		this.getMoiblephoneArrearsNoButton().click();
	}

	public Link getRename() {
		return Rename;
	}
	public void clickRenamelink() {
		this.getRename().click();
	}

	public TextField getRenameTextBox() {
		return RenameTextBox;
	}
	public void EnterClothingNameinRenameTextBox()	{
		this.getRenameTextBox().enterText("Clothing");
		genericMethodsCvp.implicitWait(3000);

	}
	public Link getRenamesavelink() {
		return Renamesavelink;
	}
	public void clickRenamesavelink() {
		this.getRenamesavelink().click();
	}

	public TextField getClothingTextBox() {
		return clothingTextBox;
	}
	public void EnterClothinngAmountinTextBox(String data)	{
		clickRenamelink();
		EnterClothingNameinRenameTextBox();
		clickRenamesavelink();
		this.getClothingTextBox().enterText(data);
		genericMethodsCvp.implicitWait(3000);

	}

	public void SelectSharedfromClothingOwnerDropdown () {
		genericMethodsCvp.selectByText(ClothingOwnerDropdown, "Shared");
	}
	public void SelectMonthfromClothingDropdown () {
		genericMethodsCvp.selectByText(ClothingDropdown, "monthly");
	}
	public Button getRemoveSchoolmealsButton() {
		return RemoveSchoolmealsButton;
	}
	public Button getRemovePocketMoneygButton() {
		return RemovePocketMoneygButton;
	}

	public void ClickRemoveSchoolmealsOptionutton() {
		this.getRemoveSchoolmealsButton().click();
	}
	public void clickRemovePocketmoneyOptionbutton() {
		this.getRemovePocketMoneygButton().click();
	}
	public void SelectfoodAndGroceriesDropdown () {
		genericMethodsCvp.selectByText(foodAndGroceriesmonthlyDrop, "monthly");
		genericMethodsCvp.selectByText(foodAndGroceriesmonthlyDrop, "monthly");
	}



	public void clickRemoveMealsAtWorkButton() {
		this.getRemoveButtonMealsAtWork().click();
		genericMethodsCvp.implicitWait(3000);

	}

	public void clickRemoveAlcoholButton() {
		this.getRemoveAlcoholButton().click();
		genericMethodsCvp.implicitWait(3000);

	}

	public void clickRemoveLaundryAndDryCleaningButton() {
		getBrowser().waitForElementToBeClickable(By.xpath("//div[text()='Laundry and dry cleaning']//following::button[4]"));
		this.getRemoveLaundryAndDryCleaningButton().click();
		genericMethodsCvp.implicitWait(3000);

	}

	public void clickRemoveHouseholdRepairsButton() {
		this.getRemoveHouseholdRepairsButton().click();
		genericMethodsCvp.implicitWait(3000);

	}

	public void clickRemoveHomePhoneIntenetButton() {
		this.getRemoveHomePhoneIntenetButton().click();
		genericMethodsCvp.implicitWait(3000);

	}


	public void clickRemoveMobilePhoneButton() {
		this.getRemoveMobilePhoneButton().click();
		genericMethodsCvp.implicitWait(3000);

	}

	public void clickRemoveHobbiesButton() {
		this.getRemoveHobbiesButton().click();
		genericMethodsCvp.implicitWait(3000);

	}

	public void clickRemovegiftsButton() {
		this.getRemovegiftsButton().click();
		genericMethodsCvp.implicitWait(3000);

	}


	public void clickRemoveNewsPaperButton() {
		this.getRemoveNewsPaperButton().click();
		genericMethodsCvp.implicitWait(3000);

	}

	public void clickRemoveToiletsButton() {
		this.getRemoveToiletsButton().click();
		genericMethodsCvp.implicitWait(2000);

	}

	public void clickRemoveHairDressingButton() {
		this.getRemoveHairDressingButton().click();
		genericMethodsCvp.implicitWait(2000);

	}

	public void RemoveUnwantedOptionsFromFlexibleCostPage() {
		ClickRemoveSchoolmealsOptionutton();
		clickRemoveMealsAtWorkButton();
		clickRemoveAlcoholButton();
		clickRemoveLaundryAndDryCleaningButton();
		clickRemoveHouseholdRepairsButton();
		clickRemoveHomePhoneIntenetButton();
		clickRemovegiftsButton();
		clickRemoveNewsPaperButton();
		clickRemovePocketmoneyOptionbutton();
		clickRemoveToiletsButton();
		clickRemoveHairDressingButton();

	}

	public void SelectcontinueYourFlexibleSpendingButton() {
		this.getContinueYourFlexibleSpendingButton().click();
		genericMethodsCvp.implicitWait(3000);

	}
	public void SelectAllFlexibleSpendingCompletedCheckbox() {
		this.getAllFlexibleSpendingCompleted().click();
		genericMethodsCvp.implicitWait(2000);
	}
	public void YourSpendingFlexibleCostActionSet_SC89934() {
		getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		switchToActiveFrame();
		this.getMonthlyFoodAndGroceriesTextBox01().verifyInvisiblityIslocated();
		this.getMonthlyFoodAndGroceriesTextBox01().enterTextField("20");
		genericMethodsCvp.implicitWait(3000);
		this.getFoodAndGroceriesMonthlyDrop01().selectFromDropdownByIndex(2);
//		this.getMonthlyFoodAndGroceriesTextBox01().enterCharByChar("20");
//		genericMethodsCvp.implicitWait(2000);
		//this.getMonthlyFoodAndGroceriesTextBox01().tab();
		genericMethodsCvp.implicitWait(4000);
		this.getFoodAndGroceriesAnotherButton().click();
		genericMethodsCvp.implicitWait(4000);
		this.getFoodAndGrocryAddAnoterButton01().click();
		genericMethodsCvp.implicitWait(4000);
		this.getFoodAndGrocryAddAnoterButton01().click();
		genericMethodsCvp.implicitWait(5000);
//		this.getMonthlyFoodAndGroceriesTextBox01().verifyInvisiblityIslocated();
//		this.getMonthlyFoodAndGroceriesTextBox01().enterTextField("20");
		//genericMethodsCvp.implicitWait(2000);
		//this.getMonthlyFoodAndGroceriesTextBox01().tab();
//		genericMethodsCvp.implicitWait(4000);
//		this.getFoodAndGroceriesMonthlyDrop01().selectFromDropdownByIndex(2);
		//genericMethodsCvp.implicitWait(4000);
		//genericMethodsCvp.selectByText(FoodAndGroceriesMonthlyDrop01, "weekly");
		//this.getMonthlyFoodAndGroceriesTextBox02().verifyInvisiblityIslocated();
		this.getMonthlyFoodAndGroceriesTextBox02().enterTextField("20");
		//genericMethodsCvp.implicitWait(2000);
		//this.getMonthlyFoodAndGroceriesTextBox02().tab();
		genericMethodsCvp.implicitWait(4000);
		this.getFoodAndGroceriesMonthlyDrop02().selectFromDropdownByIndex(3);
		genericMethodsCvp.implicitWait(4000);
		//genericMethodsCvp.selectByText(FoodAndGroceriesMonthlyDrop02, "fortnightly");
		//this.getMonthlyFoodAndGroceriesTextBox03().verifyInvisiblityIslocated();
		this.getMonthlyFoodAndGroceriesTextBox03().enterTextField("20");
//		genericMethodsCvp.implicitWait(2000);
//		this.getMonthlyFoodAndGroceriesTextBox03().tab();
		genericMethodsCvp.implicitWait(4000);
		this.getFoodAndGroceriesMonthlyDrop03().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(4000);
		//genericMethodsCvp.selectByText(FoodAndGroceriesMonthlyDrop03, "4 weekly");
		//this.getMonthlyFoodAndGroceriesTextBox04().verifyInvisiblityIslocated();
		this.getMonthlyFoodAndGroceriesTextBox04().enterTextField("148.33");
//		genericMethodsCvp.implicitWait(2000);
//		this.getMonthlyFoodAndGroceriesTextBox04().tab();
		genericMethodsCvp.implicitWait(4000);
		this.getFoodAndGroceriesMonthlyDrop04().selectFromDropdownByIndex(5);
		genericMethodsCvp.implicitWait(4000);
		//genericMethodsCvp.selectByText(FoodAndGroceriesMonthlyDrop04, "monthly");
		//this.getClothingAndFootwearTextbox().verifyInvisiblityIslocated();
		this.getClothingAndFootwearTextbox().enterTextField("60");
//		this.getClothingAndFootwearTextbox().tab();
		genericMethodsCvp.implicitWait(4000);
		this.getClothingAndFootwearMonthlyDropdown().selectFromDropdownByIndex(4);
		//genericMethodsCvp.selectByIndex(ClothingAndFootwearMonthlyDropdown, 4);
		genericMethodsCvp.implicitWait(5000);
		this.getSchoolmealsRemoveButton().click();
		this.getSchoolmealsRemoveButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getAlcoholRemoveButton().click();
		this.getAlcoholRemoveButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getLaundryRemoveButton().click();
		this.getLaundryRemoveButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getHouseholdMainRepairsRemoveButton().click();
		this.getHouseholdMainRepairsRemoveButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getHomePhoneInternetTvPackageRemoveButton().click();
		this.getHomePhoneInternetTvPackageRemoveButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getMobilePhoneRemoveButton().click();
		this.getMobilePhoneRemoveButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getHobbiesLeisureSportRemoveButton().click();
		this.getHobbiesLeisureSportRemoveButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getGiftsRemoveButton().click();
		this.getGiftsRemoveButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getNewspapersMagazinesStationeryRemoveButton().click();
		this.getNewspapersMagazinesStationeryRemoveButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getPocketMoneyRemoveButton().click();
		this.getPocketMoneyRemoveButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getToiletriesRemoveButton().click();
		this.getToiletriesRemoveButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getHairdressingRemoveButton().click();
		this.getHairdressingRemoveButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(3000);
		this.getAllFlexibleSpendingCompleted().click();
		genericMethodsCvp.implicitWait(4000);
		this.getContinueYourFlexibleSpendingButton().click();
		getBrowser().sleep(5000);
	}
	public void SetOfActionSpendingFlexibleCostSC89937() {
		this.getMonthlyFoodAndGroceries().enterText("105");
		genericMethodsCvp.implicitWait(3000);
		this.getFoodAndGroceriesmonthlyDrop().selectFromDropdownByIndex(5);
		genericMethodsCvp.implicitWait(3000);
//		genericMethodsCvp.selectByText(foodAndGroceriesmonthlyDrop, "monthly");
//		genericMethodsCvp.selectByText(foodAndGroceriesmonthlyDrop, "monthly");
		this.getRemovePersonalCostButton().click();
		genericMethodsCvp.implicitWait(3000);
		this.getOtherPeopleCotributCheckBox().click();
		genericMethodsCvp.implicitWait(3000);
		this.getReasonForSpendSubmitButton().click();
		genericMethodsCvp.implicitWait(3000);
		//clickRemoveMealsAtWorkButton();
		clickRemoveAlcoholButton();
		this.getRemoveAlcoholButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(2000);
		clickRemoveLaundryAndDryCleaningButton();
		this.getRemoveLaundryAndDryCleaningButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(2000);
		clickRemoveHouseholdRepairsButton();
		this.getRemoveHouseholdRepairsButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(2000);
		clickRemoveHomePhoneIntenetButton();
		this.getRemoveHomePhoneIntenetButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(2000);
		clickRemoveMobilePhoneButton();
		this.getRemoveMobilePhoneButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(2000);
		clickRemoveHobbiesButton();
		this.getRemoveHobbiesButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(2000);
		clickRemovegiftsButton();
		this.getRemovegiftsButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(2000);
		clickRemoveNewsPaperButton();
		this.getRemoveNewsPaperButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(2000);
		clickRemoveToiletsButton();
		this.getRemoveToiletsButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(2000);
		clickRemoveHairDressingButton();
		this.getRemoveHairDressingButton().verifyInvisiblityIslocated();
		genericMethodsCvp.implicitWait(4000);
		this.getAllFlexibleSpendingCompleted().click();
		genericMethodsCvp.implicitWait(5000);
		this.getcontinueYourFlexibleSpendingButtonA().click();
		this.getContinueYourFlexibleSpendingButton().click();
//		genericMethodsCvp.implicitWait(2000);
//		this.getContinueYourFlexibleSpendingButton().click();

	}
	public void ContinueOnSpending(){
		this.getContinueYourFlexibleSpendingButton().click();
	}

	public void removeOptionsAsPer89939() {
		clickRemoveMealsAtWorkButton();
		genericMethodsCvp.implicitWait(5000);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		clickRemoveAlcoholButton();
		genericMethodsCvp.implicitWait(5000);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		clickRemoveLaundryAndDryCleaningButton();
		genericMethodsCvp.implicitWait(5000);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		clickRemoveHouseholdRepairsButton();
		genericMethodsCvp.implicitWait(5000);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		clickRemoveHomePhoneIntenetButton();
		genericMethodsCvp.implicitWait(5000);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		clickRemoveMobilePhoneButton();
		genericMethodsCvp.implicitWait(5000);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		clickRemoveHobbiesButton();
		genericMethodsCvp.implicitWait(5000);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		clickRemovegiftsButton();
		genericMethodsCvp.implicitWait(5000);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		clickRemoveNewsPaperButton();
		genericMethodsCvp.implicitWait(5000);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		clickRemoveToiletsButton();
		genericMethodsCvp.implicitWait(5000);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		clickRemoveHairDressingButton();
		genericMethodsCvp.implicitWait(5000);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
	}
	public void YourSpendingFlexibleCostActionSet_SC89940() {
		getDriver().manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		switchToActiveFrame();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		this.getMonthlyFoodAndGroceries().enterText("350");
		this.getMonthlyFoodAndGroceries().tab();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		this.getFoodAndGroceriesMonthlyDrop01().selectFromDropdownByIndex(3);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		//genericMethodsCvp.selectByText(FoodAndGroceriesMonthlyDrop04, "monthly");
		this.getClothingAndFootwearTextbox().enterText("60");   // testdata incorrect in test case sheet(expected is 60 as per test case sheet)
		this.getClothingAndFootwearTextbox().tab();
		genericMethodsCvp.implicitWait(2000);
		this.getClothingAndFootwearMonthlyDropdown().selectFromDropdownByIndex(2);
		//genericMethodsCvp.selectByIndex(ClothingAndFootwearMonthlyDropdown, 4);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		this.getMobilePhoneTextbox().enterTextField("45");
		this.getMobilePhoneTextbox().tab();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		getMobilePhoneArrears().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		this.getMobilePhoneMonthlyDropdown().selectFromDropdownByIndex(2);
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		getRemoveButtonMealsAtWork().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		getSchoolmealsRemoveButton().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		   /*this.getSchoolmealsRemoveButton().click();
		   genericMethodsCvp.implicitWait(4000);*/
		this.getAlcoholRemoveButton().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		this.getLaundryRemoveButton().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		this.getHouseholdMainRepairsRemoveButton().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		this.getHomePhoneInternetTvPackageRemoveButton().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		this.getHobbiesLeisureSportRemoveButton().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		this.getGiftsRemoveButton().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		this.getNewspapersMagazinesStationeryRemoveButton().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		this.getPocketMoneyRemoveButton().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		this.getToiletriesRemoveButton().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		this.getHairdressingRemoveButton().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		this.getAllFlexibleSpendingCompleted().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);
		this.getContinueYourFlexibleSpendingButton().click();
		getBrowser().sleep(getBrowser().getTimeout() / 10);

	}

	public void FillSpendigFlexibleCostPageDetailsfor89949(){

		RemoveUnwantedOptionsFromFlexibleCostPagefor89949();
		//EnterGroceries("200");
		this.getMonthlyFoodAndGroceries().enterTextField("200");
		genericMethodsCvp.implicitWait(5000);
		this.getFoodAndGroceriesmonthlyDrop().selectFromDropdownByIndex(5);

//		genericMethodsCvp.implicitWait(5000);
//		genericMethodsCvp.selectByIndex(FoodAndGroceriesmonthlyDropdown,2);
//		//this.getFoodAndGroceriesmonthlyDropdown().selectFromDropdownByIndex(4);
//		genericMethodsCvp.implicitWait(5000);
//		genericMethodsCvp.selectByIndex(FoodAndGroceriesmonthlyDropdown,5);
		genericMethodsCvp.implicitWait(5000);
		this.getAllFlexibleSpendingCompleted().click();
		genericMethodsCvp.implicitWait(3000);
		this.getContinueYourFlexibleSpendingButton().click();
		genericMethodsCvp.implicitWait(5000);

	}


	public void RemoveUnwantedOptionsFromFlexibleCostPagefor89949() {
		clickRemoveAlcoholButton();
		genericMethodsCvp.implicitWait(5000);
		clickRemoveLaundryAndDryCleaningButton();
		genericMethodsCvp.implicitWait(5000);
		clickRemoveHomePhoneIntenetButton();
		genericMethodsCvp.implicitWait(5000);
		this.getRemoveMobilePhoneButton().click();
		genericMethodsCvp.implicitWait(5000);
		this.getRemoveHobbiesButton().click();
		genericMethodsCvp.implicitWait(5000);
		clickRemovegiftsButton();
		genericMethodsCvp.implicitWait(5000);
		clickRemoveNewsPaperButton();
		genericMethodsCvp.implicitWait(5000);
		//clickRemovePocketmoneyOptionbutton();
		clickRemoveToiletsButton();
		genericMethodsCvp.implicitWait(5000);
		clickRemoveHairDressingButton();
		genericMethodsCvp.implicitWait(5000);
		this.getRemovePersonalCostButton().click();
		genericMethodsCvp.implicitWait(5000);
		SelectOtherPeopleContributionCheckbox();
		genericMethodsCvp.implicitWait(5000);
		SelectReasoneForSpendSubmitButton();
		genericMethodsCvp.implicitWait(5000);

	}


	 private Button GroceriesAnother;
	 private Button GroceriesAnother2;
	 private Button GroceriesAnother3;
	 private Button GroceriesAnother4;

	 private TextField Groceries5;
	 private Dropdown Groceries5Frequency;


	public Button getGroceriesAnother(){return GroceriesAnother;}
	public Button getGroceriesAnother2(){return GroceriesAnother2;}
	public Button getGroceriesAnother3(){return GroceriesAnother3;}
	public Button getGroceriesAnother4(){return GroceriesAnother4;}

	public TextField getGroceries5(){return Groceries5;}
	public Dropdown getGroceries5Frequency(){return Groceries5Frequency;}




	public void fillSpendingsFlexibleCost89924()
	{
		switchToActiveFrame();
		genericMethodsCvp.implicitWait(2000);
        this.getMealsAtWorkRemoveButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getAlcoholRemoveButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getRemoveLaundryAndDryCleaningButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getHouseholdMainRepairsRemoveButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getMobilePhoneRemoveButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getHobbiesLeisureSportRemoveButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getGiftsRemoveButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getNewspapersMagazinesStationeryRemoveButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getClothingAndFootwearRemoveButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getReasonForSpendThisIsntApplicableToMe().click();
		this.getReasonForSpendSubmitButton().click();
		this.getToiletriesRemoveButton().click();
		genericMethodsCvp.implicitWait(2000);
		this.getHairdressingRemoveButton().click();
		genericMethodsCvp.implicitWait(2000);
        this.getMonthlyFoodAndGroceries().enterTextField("10");
		genericMethodsCvp.implicitWait(2000);
		this.getFoodAndGroceriesmonthlyDrop().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(2000);
		this.getGroceriesAnother().click();
		genericMethodsCvp.implicitWait(2000);
		this.getMonthlyFoodAndGroceriesTextBox02().enterTextField("10");
		genericMethodsCvp.implicitWait(2000);
		this.getFoodAndGroceriesMonthlyDrop02().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(2000);
		this.getGroceriesAnother2().click();
		genericMethodsCvp.implicitWait(2000);
		this.getMonthlyFoodAndGroceriesTextBox03().enterTextField("10");
		genericMethodsCvp.implicitWait(2000);
		this.getFoodAndGroceriesMonthlyDrop03().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(2000);
		this.getGroceriesAnother3().click();
		genericMethodsCvp.implicitWait(2000);
		this.getMonthlyFoodAndGroceriesTextBox04().enterTextField("10");
		genericMethodsCvp.implicitWait(2000);
		this.getFoodAndGroceriesMonthlyDrop04().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(2000);
		this.getGroceriesAnother4().click();
		this.getGroceries5().enterTextField("98.46");
		genericMethodsCvp.implicitWait(2000);
		this.getGroceries5Frequency().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(2000);
        this.getHomePhoneInternetTvPackageTextbox().enterTextField("52");
		genericMethodsCvp.implicitWait(2000);
		this.getHomePhoneInternetTvPackageMonthlyDropdown().selectFromDropdownByIndex(4);
		genericMethodsCvp.implicitWait(2000);
		this.getHomePhonInternetTvPackageArrearsNoButton().click();
		genericMethodsCvp.implicitWait(2000);
		SelectAllFlexibleSpendingCompletedCheckbox();

	}
}

