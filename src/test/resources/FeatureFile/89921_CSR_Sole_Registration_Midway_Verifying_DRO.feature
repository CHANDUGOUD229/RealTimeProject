Feature: Validation of E2E scenario 89921
  @SoleClientDRORegistrationMidwayNorthernIreland_SC89921
  @CSR_BatchE2E_All_Scenario
  @CSR_BatchE2E_SET_01
  Scenario: Validation of E2E scenario 89921
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
      | Client1 | Client1   |Client1LastName |Northern Ireland|Yes   |No                 |53 |No                 |No             |false                       |false                      |false                              |false                               |
#      | Client2 | Client2   |Client2LastName |Northern Ireland|Yes   |No                 |53 |No                 |No             |false                       |false                      |false                                |false                               |
    And click on continue guests
    And User Navigates to Your Household Page And Fill The below Data and Continues to Debts Page
      |housingStatus              |maritalStatus|ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment        |partnerEmployment|noOfVehicles|
      |Renting - private landlord |Separated    |0                |0                     |0                |false                    |Part-time employed|false            |0           |
    Then User fills the Debt Details for Client and assert Total Amount "7200"
      | creditor            | debttype    |      amountOwed  | liability |  areYouBehindWithPayments |furtherAction |furtherActionType |isClientLiableForAllPayments|
      | HSBC                | Credit card |      3600        | 1         |  No                       |      No      |   false          |No                          |
      | Littlewoods         | Catalogue   |      3600        | 1         |  Yes                      |      Yes     |Default notice    |No                          |
    And user selects options from Global Questions as "No"
    And User clicks on continue The screen
    Then user clicks on create budget and submits screen
    And Navigate to the Income page and enter the data as DataTable and Assert Total Income as "1500.00"
      | field            | amount    |      index  |
      | Wage             | 1500      |        4    |
    And Navigate to the Your Spendings Fixed page and enter the data as DataTable and Assert Total Fixed Spendings as "1278.00"
      | field                           | amount    |      index  |   arrears   |
      | Rent                            | 1000      |        4    |     No      |
      | Rates                           | 150       |        4    |     No      |
      | TV licence                      | 13        |        3    |     No      |
      | Electricity                     | 30        |        4    |     No      |
      | Gas                             | 30        |        4    |     No      |
      | Water supply                    | 30        |        4    |     No      |
      | Buildings and contents insurance| 25        |        4    |     No      |
    And User clicks on continue The screen
    And User Navigates Back
    And User Navigates Back
    And User Navigates Back
    And User Navigates Back
    Then User Clicks On Understand your situation link in Dash Borad and Nvigates to Debts Page
    Then User fills the Debt Details for Client and assert Total Amount "18000" after Navigating Back After completing 2
      | creditor            | debttype             |      amountOwed  | liability |  areYouBehindWithPayments |furtherAction |furtherActionType                 |ongoingMobileService          |arrangementRepayInsurance|
      | Lowell              | Mobile phone arrears |      7200        | 1         |  No                       |      false   |No action taken (arrears only)    |No                            |No                       |
      | Lowell              | Insurance arrears    |      1800        | 1         |  false                    |      false   |No action taken (arrears only)    |false                         |No                       |
      | Barclaycard         | Credit card          |      1800        | 1         |  No                       |      No      |false                             |false                         |false                    |
    And user selects options from Global Questions as "No"
    And User clicks on continue The screen
    And User Clicks On Your Spendings in DashBoard
    And User clicks on continue The screen
    And Navigate to the Your Spendings Flexible page and enter the data as DataTable and Assert The totatl Spedings As "1500.00"
      | field                           | amount    |      index  |   arrears      |
      | Groceries                       | 222       |        5    |     false      |
#     | Clothing and footwear           | 60        |        4    |     false      |
    And User clicks on continue The screen
    Then User is navigated to Advice your budget to review budget
    And User navigates to Assets page in debt advice of final questions
    #And User navigates to Assets page in debt advice of final questions
    And User Perform Action on Final Question pages
    And Navigate to the Priority Arrears page and select Calculate
    Then Navigate to the solutions page and verify DRO is one of the recommended solutions
    |title|firstName|surname        |dateOfBirth|domain      |phoneNumber   |phoneType|postCode|preferredContactMethod|address|captureAddressManually|
    |Mr   |Client1  |Client1LastName|10101978   |gmail.com   |+44 7944423456|Mobile   |PO167GZ |Email                 |1      |true                  |
    And User Navigates to Review Your Options Page
    And User Ends the session and Logout from the Application
    And Perform Logout And Close Browser


