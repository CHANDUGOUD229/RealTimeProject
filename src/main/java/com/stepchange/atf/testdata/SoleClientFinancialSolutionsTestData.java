package com.stepchange.atf.testdata;

import com.stepchange.atf.data.SoleClientaFinancialSol_SC89933_Obj;

public class SoleClientFinancialSolutionsTestData {

	
	public static SoleClientaFinancialSol_SC89933_Obj getTestData() {

		String EmailData = "Automatio0051";
		String EmailWithDomain = "Automatio0051@aol.com";

		return new SoleClientaFinancialSol_SC89933_Obj("kumar.amit@aaseya.com", "Nov@2020", "Barclays",
				"Unemployment or redundancy", EmailData, "DemoTestB", "60",
				"Mr", "12121950", EmailData, "aol.com", "+44 7944423456", "Mobile",
				"PO167GZ", "11, Owen Close, Fareham, Hampshire, ", EmailWithDomain,
				"Mortgaged", "Married", "Full-time employed", "HSBC", "Personal loan",
				"6000", EmailData, "300", "month", "Nationwide", "Mortgage", "20000",
				"Repayment", "466.88", "monthly", "1000", "monthly", "200", "13.2", "50",
				"50", "50", "50", "200", "1000000", "Full session");
	}

	public static SoleClientaFinancialSol_SC89933_Obj getLoginDetails() {
		return new SoleClientaFinancialSol_SC89933_Obj("sahodara.reddy@aaseya.com","Jan@2021");

	}

	public static SoleClientaFinancialSol_SC89933_Obj getClientDetails(){
		return new SoleClientaFinancialSol_SC89933_Obj("Scotland","Yes","No","36","Client1","Name");

	}

	public static SoleClientaFinancialSol_SC89933_Obj getSecondClientDetails(){
		return new SoleClientaFinancialSol_SC89933_Obj("India","Yes","No","22","Client2","Name2");

	}

	public static SoleClientaFinancialSol_SC89933_Obj getIncomeDetails() {
		return new SoleClientaFinancialSol_SC89933_Obj("798.47", "84.21", "85");
	}
}