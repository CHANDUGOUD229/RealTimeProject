Feature: Validation of E2E scenario 89947
  @89947 
  @OnlineBatchE2E_All_Scenario
  Scenario: Validate End TO End 89947 scenario
  #Given User is in login page for Online
    And In the Establish Client Needs page capture the details for Online
      |         | firstname |   lastname     | whereDoTheyLive|ukDebt|insolvencySolutions|age|areTheySelfEmployed|healthCondition|referredBY  |financialDifficulty       |doTheyLiveWithPartner|partnerUkDebts|inCoupleDebitAdvice|healthIssue|partnerSelfEmployed|partnerAge|
      | Client1 | Client1   |Client1LastName |Scotland        |Yes   |No                 |36 |No                 |No             |Other       |Unemployment or redundancy|Yes                  |Yes           |Yes                |false      |No                 |22        |
    #Then Client Registered With StepChnage
    #|firstName|domain         |dateOfBirth|
    #|Client1  |@satepchane.com |10/01/1983 |
    And Create Step Change Account page and Enter Valid data899447
    #And user Navigate to Create Step Change Account page and Enter Valid data
    And User Clicks On HouseHolds And Fills the Details as below
      |housingStatus        |maritalStatus    |ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment        |partnerEmployment               |noOfVehicles|
      | Renting - Council   |Cohabiting       |0                |0                     |0                |false                    |Full-time employed|Unemployed: not looking for work|0           |
    And User Navigates Create Your Budget and clicks on Continue button
    And User Clicks On Continue Button and Marks the Debt completion as "No, I have income to add later"
    And Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as "1500.00"
      |header                 | field                           | amount    |      index  |   arrears   |whoPays|
      |Home and contents      |Rent                             |1151.88    |4            |No           |Shared |
      |Home and contents      |Council tax                      |100        |4            |No           |Shared |
      |Home and contents      |TV licence                       |13.12      |3            |No           |Shared |
      |Utilities              |Electricity                      |50         |4            |No           |Shared |
      |Utilities              |Gas                              |50         |4            |No           |Shared |
      |Utilities              |Water supply                     |50         |4            |No           |Shared |
      |Pensions and insurances|Buildings and contents insurance |20         |4            |No           |Shared |
    And User Clicks On Continue Button and Marks the Debt completion as "No, I have spending to add later"
    Then User Navigates to Income Page
    And Navigate to the Online Income page and enter the data as below Assert Total Income as "1500.00"
      |header                  | field            | amount    |whoPays     |index|
      |Earnings                | Wage             | 1200      |Client1     |4    |
      |Benefits and Tax Credits| Universal Credit | 550       |Your Partner|1    |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have finished"
    Then User fills the Debt Details Online for Client and assert Total Amount "7200"
      | creditor   | debttype   |amountOwed  | liability    |areYouBehindWithPayments |furtherAction |furtherActionType |isthedebtsubjecttoaguarantor|isDebtTypeMortagage|haveYouRepaidAnyArrearsInTheLast12Months|whatTypeOfMortgageIsIt|isItOnaStandardVariableRate|mortagagePaymentAmount|mortagagePaymentFrequency|isClientLiableForAllPayments|linkMainHome|ownerOfPayment|
      | Littlewoods| Catalogue  |6000        | Client1      |No                       |   false      |   false          | No                         |false              |No                                      |Repayment             |No                         |934.92                |4                        |false                       |Yes         |1      |
      | Wonga      | Payday loan|2000        | Client1      |Yes                      |   Yes        |   Default notice | false                      |false              |No                                      |Repayment             |No                         |934.92                |4                        |false                       |Yes         |1      |
      | Aqua Loans | Credit card|3500        | Your Partner |No                       |   false      |   false          | false                      |false              |No                                      |Repayment             |No                         |934.92                |4                        |false                       |Yes         |1      |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have added everything"
    Then User Will be Navigated to Questions and Answer the questions as below
      |guarantor|disputeddebt|debtUnenforceable|
      |No       |No          |No               |
    And Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as "1500.00"
      |header                 | field                             | amount| whoPays     |   arrears   |index|
      |Food and housekeeping  |Groceries                          |200    |Shared       |false        |5    |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have finished"
    Then User Navigates to Have You Forgotten Any Item and selects I dont have this and continues
    Then User Navigates to Advice on Your Budget
    And User Navigated to Final Questions and Continues and Fill Assets
      |assetType |assetEstimatedValue|whoOwnsTheAsset|
      |Other item|2500               |Client1        |
      |Other item|4000               |Your Partner   |
    Then User Navigates to Priority Payments and Continues and Select No Savings
    Then User Navigates to Review Your Options and Continues
    And Close the Session
    And Quit Browser