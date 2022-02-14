Feature: Validation of E2E scenario 89944
  @89944
  @OnlineBatchE2E_All_Scenario
  Scenario: Validate End TO End 89944 scenario
  #Given User is in login page for Online
    And In the Establish Client Needs page capture the details for Online
      |         | firstname |   lastname     | whereDoTheyLive|ukDebt|insolvencySolutions|age|areTheySelfEmployed|healthCondition|referredBY  |financialDifficulty       |doTheyLiveWithPartner|partnerUkDebts|inCoupleDebitAdvice|healthIssue|partnerSelfEmployed|partnerAge|
      | Client1 | Client1   |Client1LastName |Scotland        |Yes   |No                 |30 |No                 |No             |Other       |Reduced income or benefits|Yes                  |No            |Yes                |false      |No                 |30        |
   # Then Client Registered With StepChnage
   # |firstName|domain       |dateOfBirth|
   # |Client1  |@stepchana.com|10/01/1983 |
  And Create Step Change Account page and Enter Valid data89944
    #And user Navigate to Create Step Change Account page and Enter Valid data
    And User Clicks On HouseHolds And Fills the Details as below
      |housingStatus              |maritalStatus    |ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment        |partnerEmployment      |noOfVehicles|
      |Renting - private landlord |Cohabiting       |0                |0                     |0                |false                    |Full-time employed|Full-time employed     |0           |
    Then User fills the Debt Details Online for Client and assert Total Amount "7200"
      | creditor   | debttype      |amountOwed  | liability    |areYouBehindWithPayments |furtherAction |furtherActionType |isthedebtsubjecttoaguarantor|isDebtTypeMortagage|originalReGularPayment|originalReGularPaymentForEvery|
      | HSBC       | Personal loan |15000       | Client1      |No                       |   false      |   false          | false                      |false              |355                   |4                             |
      | Aqua Loans | Credit card   |10000       | Your Partner |No                       |   false      |   false          | false                      |false              |false                 |false                         |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have added everything"
    Then User Will be Navigated to Questions and Answer the questions as below
      |guarantor|disputeddebt|debtUnenforceable|
      |No       |No          |No               |
    And User Navigates Create Your Budget and clicks on Continue button
    And Navigate to the Online Income page and enter the data as below Assert Total Income as "1500.00"
      |header                  | field            | amount    |whoPays     |index|
      |Earnings                | Wage             | 1450      |Client1     |4    |
      |Earnings                | Wage             | 1050      |Your Partner|4    |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have finished"
    And Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as "1500.00"
      |header                 | field                           | amount    |      index  |   arrears   |whoPays|
      |Home and contents      |Rent                             |1776.88    |4            |No           |Shared |
      |Home and contents      |Council tax                      |100        |4            |No           |Shared |
      |Home and contents      |TV licence                       |13.12      |3            |No           |Shared |
      |Utilities              |Electricity                      |50         |4            |No           |Shared |
      |Utilities              |Gas                              |50         |4            |No           |Shared |
      |Utilities              |Water supply                     |50         |4            |No           |Shared |
      |Pensions and insurances|Buildings and contents insurance |20         |4            |No           |Shared |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have finished"
    Then User Navigates to Have You Forgotten Any Item and selects I dont have this and continues
    Then User Navigates to Advice on Your Budget
    And User Navigated to Final Questions and Continues
    Then User Navigates to Priority Payments and Continues and Select No Savings
    Then User Navigates to Review Your Options and Continues
    And Close the Session
    And Quit Browser
