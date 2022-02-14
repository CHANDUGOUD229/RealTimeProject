Feature: Validation of E2E scenario 89924
  @SoleClientGroceriesSameFrequenciesDPPScotland_SC89924
  @CSR_BatchE2E_All_Scenario
  @CSR_BatchE2E_SET_01
  Scenario: Validate HomePage Functionality
    Given User is in login page
    When User enters the credentials and click on login Button
    And Click On New Button
    And Select PhoneCall Option
    And Create new debt Advice case
    And Select Referral Route as "Direct"
    And Select who Referred Them as "Other"
    And Select cause Of Financial difficulty
    And In the Establish Client Needs page capture the details from datatable for Financial Difficulety "Unemployment or redundancy"
      |         | firstname |   lastname     | whereDoTheyLive|ukDebt|insolvencySolutions|age|areTheySelfEmployed|healthCondition|consentForStepChangeToRecord|consentForStepChangeToShare|isYourPartnerAvailableToSpeakWithUs|doYouHavePermissionTOShareTheDetails|
      | Client1 | Client1   |Client1LastName |Scotland        |Yes   |No                 |53 |No                 |No             |false                       |false                      |false                              |false                               |
    And click on continue guests
    And User Navigates to Your Household Page And Fill The below Data and Continues to Debts Page
      |housingStatus              |maritalStatus|ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment        |partnerEmployment|noOfVehicles|
      |Renting - Council          |Single       |0                |0                     |0                |false                    |Full-time employed|false            |0           |
    Then User fills the Debt Details for Client and assert Total Amount "3957"
      | creditor            | debttype        |      amountOwed  | liability |  areYouBehindWithPayments |furtherAction |furtherActionType |originalReGularPayment|originalReGularPaymentForEvery|isthedebtsubjecttoaguarantor|isDebtTypeMortagage|whatTypeOfMortgageIsIt|isItOnaStandardVariableRate|mortagagePaymentAmount|mortagagePaymentFrequency|isClientLiableForAllPayments|
      | Capital One         | Credit Card     |      2457        | 1         |  Yes                      |      Yes     |   Default notice | false                |          false               | false                      | false             |        0             |      false                |       0              |        0                |   false                    |
      | Barclaycard         | Credit Card     |      1500        | 1         |  Yes                      |      Yes     |   Default notice | false                |          false               | false                      | false             |        0             |      false                |       0              |        0                |   false                    |
    And user selects options from Global Questions as "No"
    And User clicks on continue The screen
    Then user clicks on create budget and submits screen
    And Navigate to the Income page and enter the data as DataTable and Assert Total Income as "550"
      | field            | amount    |      index  |
      | Wage             | 550       |        4    |
    And Navigate to the Your Spendings Fixed page and enter the data as DataTable and Assert Total Fixed Spendings as "295.00"
      | field                            | amount    |      index  |   arrears   |
      | Rent                             | 196.88    |        4    |     No      |
      | Council tax                      | 30        |        4    |     No      |
      | TV licence                       | 13.12     |        3    |     No      |
      | Electricity                      | 10        |        4    |     No      |
      | Gas                              | 10        |        4    |     No      |
      | Water supply                     | 20        |        4    |     No      |
      | Buildings and contents insurance | 15        |        4    |     No      |
    And User clicks on continue The screen
    And Navigate to the spendings flexible page as SoleClientDPP
    And User clicks on continue The screen
    Then User is navigated to Advice your budget to review budget
    And ensure Groceries has retained the same frequencies and amounts
    And Navigate to the Final Questions page as SoleGuestDPP
    And Navigate to the Priority Arrears as SoleGuestDPP
    And select Calculate the value as SoleGuestDPP
    Then Navigate to the solutions page  and verify DPP recommended solutions
    And User Ends the session and Logout from the Application
    And Perform Logout And Close Browser







  