Feature: Validation of E2E scenario 89930
@LinkingDebtsToSpending_SC89930
@CSR_BatchE2E_All_Scenario
@CSR_BatchE2E_SET_03
Scenario: Validate Linking Debts to Spending
  Given User is in login page
  When User enters the credentials and click on login Button
#   And User Clicks On A Case And Navigates to Flexible Spendings
  And Click On New Button
  And Select PhoneCall Option
  And Create new debt Advice case
  And Select Referral Route as "ERR"
  And Select who Referred Them as "Other"
  And Select cause Of Financial difficulty
  And In the Establish Client Needs page capture the details from datatable for Financial Difficulety "Unemployment or redundancy"
    |         | firstname | lastname        | whereDoTheyLive | ukDebt | insolvencySolutions | age | areTheySelfEmployed | healthCondition | consentForStepChangeToRecord | consentForStepChangeToShare | isYourPartnerAvailableToSpeakWithUs | doYouHavePermissionTOShareTheDetails |
    | Client1 | Client1   | Client1LastName | England         | Yes    | No                  | 28  | No                  | No              | false                        | false                       | false                               | false                                |
    | Client2 | Client2   | Client2LastName | England         | Yes    | No                  | 25  | No                  | No              | false                        | false                       | Yes                                 | Yes                                  |
  And click on continue guests
  And User Navigates to Your Household Page And Fill The below Data and Continues to Debts Page
    | housingStatus     | maritalStatus     | ageUnde16Children | ageBetween16and18child | adultsResponsible | houseAwareOfDebtSituation | employment          | partnerEmployment  | noOfVehicles |
    | Renting - Council | Cohabiting        | 0                 | 0                      | 0                 | false                     | Part-time employed  | Part-time employed | 1            |
  Then User fills the Debt Details for Client and assert Total Amount "5000"
    | creditor            | debttype             |liability|amountOwed  | areYouBehindWithPayments |furtherAction |furtherActionType                |typeOfAction    |isthedebtsubjecttoaguarantor|isDebtTypeMortagage|originalReGularPayment|originalReGularPaymentForEvery|arrangementRepayInsurance|ongoingMobileService|isCurrentYearArrear|
    | HSBC                | Personal loan        |3        |4000        | Yes                      |Yes           |   Default notice                |false           | false                      |false              |200                   |4                             |Yes                      |     false          |false              |
    | NPower              | Electricity arrears  |3        |500         | false                    |false         |   No action taken (arrears only)|false           | false                      |false              |5                     |4                             |false                    |       No           |false              |
    | Leeds City Council  | Council tax arrears  |3        |1000        | false                    |false         |   No action taken (arrears only)|false           | false                      |false              |5                     |4                             |No                       |       No           |No                 |
  And user selects options from Global Questions as "No"
  And User clicks on continue The screen
  Then user clicks on create budget and submits screen
  And Navigate to the Income page and enter the data as DataTable and Assert Total Income as "780.26"
    | field                                   | amount    |      index  |
    | Wage                                    | 300.13    |        4    |
    | Local Housing Allowance/Housing Benefit | 180       |        4    |
    | Wage                                    | 300.13    |        4    |
  And Navigate to the Your Spendings Fixed page and enter the data as DataTable and Assert Total Fixed Spendings as "5"
    | field                              | amount    |      index  |   arrears   |
    | Rent                               | 238       |        4    |     No      |
    | Council tax                        | 40        |        4    |     No      |
    | TV licence                         | 40        |        3    |     No      |
    | Electricity                        | 50        |        4    |     No      |
    | Gas                                | 50        |        4    |     No      |
    | Water supply                       | 18        |        4    |     No      |
    | Car insurance                      | 48        |        4    |     No      |
    | Road tax                           | 10        |        4    |     false   |
    | Fuel, parking and toll road charges| 220       |        5    |     false   |
    | Breakdown cover                    | 4         |        4    |     false   |
    | MOT and ongoing vehicle maintenance| 23        |        4    |     false   |
  And User clicks on continue The screen
  And Navigate to the Your Spendings Flexible page and enter the data as DataTable and Assert The totatl Spedings As "527.23  "
    | field                              | amount    |      index  |   arrears      |
    | Groceries                          | 188       |        5    |     false      |
    | Home phone, internet and TV package| 42        |        5    |     No         |
    | Mobile phone                       | 18        |        4    |     No         |
    | Clothing and footwear              | 17        |        4    |     false      |
  And User clicks on continue The screen
  Then User is navigated to Advice your budget to review budget
  And User clicks on continue The screen
  And User clicks on continue The screen
  Then User Naigates to Final Questions Page
  Then User Navigates to Asset Page And add Asset
    |field    |value|owner  |shareValue|
    |Vehicle  |5000 |3      |50        |
  And User clicks on continue The screen
  And User Perform Action on Final Question page Without Assets89930
  And Navigate to the Priority Arrears page and select Calculate
  And User Navigates to Review Your Options Page DMP as recommended Solution
  And User Ends the session and Logout from the Application
  And Perform Logout And Close Browser
