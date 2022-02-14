Feature: Validation of E2E scenario 89936
  @SoleSoleTPPwriteOffEnglandTerminalIllness_SC89936
  @CSR_BatchE2E_All_Scenario
  @CSR_BatchE2E_SET_03
  Scenario: Validation of E2E scenario 89936
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
      | Client1 | Client1   |Client1LastName |England         |Yes   |No                 |29 |No                 |Yes             |Yes                         |Yes                        |false                              |false                               |
    And click on continue guests
    And User Navigates to Your Household Page And Fill The below Data and Continues to Debts Page
      |housingStatus              |maritalStatus|ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment        |partnerEmployment |noOfVehicles|
      |Other                      |Single       |0                |1                     |0                |false                    |Part-time employed|false             |0           |
    Then User fills the Debt Details for Client and assert Total Amount "18000"
      | creditor            | debttype    |      amountOwed  | liability |  areYouBehindWithPayments |furtherAction |furtherActionType |isClientLiableForAllPayments|
      | Littlewoods         | Catalogue   |      6000        | 1         |  No                       |      No      |   false          |true                        |
      | Wonga               | Payday loan |      2800        | 1         |  Yes                      |      Yes     |Default notice    |false                       |
      | Aqua                | Credit card |      8000        | 1         |  No                       |      No      |   false          |false                       |
      | Sunny               | Payday loan |      1200        | 1         |  Yes                      |      Yes     |Default notice    |false                       |
    And user selects options from Global Questions as "No"
    And User clicks on continue The screen
    Then user clicks on create budget and submits screen
    And Navigate to the Income page and enter the data as DataTable and Assert Total Income as "1258.03"
      | field            | amount    |      index  |
      | Wage             | 798.47    |        4    |
      |Child Benefit     | 84.21     |        2    |
      |Child Tax Credit  | 85        |        1    |
    And Navigate to the Your Spendings Fixed page and enter the data as DataTable and Assert Total Fixed Spendings as "886.03"
      | field                           | amount    |      index  |   arrears   |
      | Council tax                     | 200       |        4    |     No      |
      | TV licence                      | 13.12     |        3    |     No      |
      | Electricity                     | 100       |        4    |     No      |
      | Gas                             | 100       |        4    |     No      |
      | Water supply                    | 100       |        4    |     No      |
      | Buildings and contents insurance| 80        |        4    |     No      |
      | Childcare                       | 272.91    |        4    |     No      |
      | School uniform                  | 20        |        4    |     false   |
    And User clicks on continue The screen
    And Navigate to the Your Spendings Flexible page and enter the data as DataTable and Assert The totatl Spedings As "1246.03"
      | field                           | amount    |      index  |   arrears       |
      | Groceries                       | 300       |        5    |     false      |
      | Clothing and footwear           | 60        |        4    |     false      |
    And User clicks on continue The screen
    Then User is navigated to Advice your budget to review budget
    And User navigates to Assets page in debt advice of final questions
    #And User navigates to Assets page in debt advice of final questions
    And User Clicked on final Question Button
    And Navigate to the Final Questions pages
    And Navigate to the Priority Arrears page and select Calculate as a guest user
    Then User reviews the available options and selects TPP as the Solution
    And User Ends the session and Logout from the Application
    And Perform Logout And Close Browser




