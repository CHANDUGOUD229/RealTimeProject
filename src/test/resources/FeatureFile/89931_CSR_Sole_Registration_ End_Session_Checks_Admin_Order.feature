Feature: Validation of E2E scenario 89931
  @BasicSoleClientAdminOrderRegistration_SC89931
  @CSR_BatchE2E_All_Scenario
  @CSR_BatchE2E_SET_03
  Scenario: Validate HomePage Functionality
    Given User is in login page
    When User enters the credentials and click on login Button
#    And User Clicks On A Case And Navigates to Flexible Spendings
    And Click On New Button
    And Select PhoneCall Option
    And Create new debt Advice case
    And Select Referral Route as "Direct"
    And Select who Referred Them as "Other"
    And Select cause Of Financial difficulty
    And In the Establish Client Needs page capture the details from datatable for Financial Difficulety "Unemployment or redundancy"
      |         | firstname |   lastname     | whereDoTheyLive|ukDebt|insolvencySolutions|age|areTheySelfEmployed|healthCondition|consentForStepChangeToRecord|consentForStepChangeToShare|isYourPartnerAvailableToSpeakWithUs|doYouHavePermissionTOShareTheDetails|
      | Client1 | Client1   |Client1LastName |England         |Yes   |No                 |35 |No                 |No             |false                       |false                      |false                              |false                               |
#      | Client2 | Client2   |Client2LastName |Northern Ireland|Yes   |No                 |53 |No                 |No             |false                       |false                      |false                                |false                               |
    And click on continue guests
    And User Navigates to Your Household Page And Fill The below Data and Continues to Debts Page
      |housingStatus           |maritalStatus|ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment         |partnerEmployment|noOfVehicles|
      |Living with family      |Single       |0                |0                     |0                |false                    |Part-time employed |false            |2           |
    Then User fills the Debt Details for Client and assert Total Amount "4500"
      | creditor   | debttype      |liability|amountOwed  | areYouBehindWithPayments |furtherAction |furtherActionType |typeOfAction                |isthedebtsubjecttoaguarantor|isDebtTypeMortagage|originalReGularPayment|originalReGularPaymentForEvery|arrangementRepayInsurance|
      | NatWest    | Credit card   |1        |3700        | Yes                      |Yes           |   Default notice |false                       | false                      |false              |false                 |false                         |false                    |
      | NatWest    | Credit card   |1        |800         | Yes                      |Yes           |   Court action   |County Court Judgment (CCJ) | false                      |false              |5                     |4                             |Yes                      |
    And user selects options from Global Questions as "No"
    And User clicks on continue The screen
    Then user clicks on create budget and submits screen
    And Navigate to the Income page and enter the data as DataTable and Assert Total Income as "630"
      | field            | amount    |      index  |
      | Wage             | 500       |        4    |
      |Carer's Allowance | 30        |        1    |
    And Navigate to the Your Spendings Fixed page and enter the data as DataTable and Assert Total Fixed Spendings as "5"
      | field                           | amount    |      index  |   arrears   |
      | Board                           | 255       |        4    |     No      |
      | Buildings and contents insurance| 50        |        4    |     No      |
    And User clicks on continue The screen
    And Navigate to the Your Spendings Flexible page and enter the data as DataTable and Assert The totatl Spedings As "527.23  "
      | field                           | amount    |      index  |   arrears      |
      | Groceries                       | 200       |        5    |     false      |
    And User clicks on continue The screen
    Then User is navigated to Advice your budget to review budget89931
    And User navigates to Assets page in debt advice of final questions89931
   # And User navigates to Assets page in debt advice of final questions
    #Then User Naigates to Final Questions Page
    And User Perform Action on Final Question page89931
    And Navigate to the Priority Arrears page and Continues
    And User Navigates to Review Your Options Page DMP as recommended Solution
    And User Ends the session and Logout from the Application
    And Perform Logout And Close Browser
