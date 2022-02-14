 Feature: Validation of E2E scenario 89923
  @89923
  @OnlineBatchE2E_All_Scenario
  Scenario: Validate End TO End 89923 scenario
  #Given User is in login page for Online
    And In the Establish Client Needs page capture the details for Online
      |         | firstname |   lastname     | whereDoTheyLive|ukDebt|insolvencySolutions|age|areTheySelfEmployed|healthCondition|referredBY                          |financialDifficulty       |doTheyLiveWithPartner|healthIssue|
      | Client1 | Client1   |Client1LastName |England         |Yes   |No                 |53 |No                 |No             |Online search for help with my debts|Unemployment or redundancy|No                   |false      |
    Then Client Registered With StepChnage
    |firstName|domain         |dateOfBirth|
    |Client1  |@stepchange.com|10/11/19865|
    And User Clicks On HouseHolds And Fills the Details as below
      |housingStatus              |maritalStatus|ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment        |partnerEmployment |noOfVehicles|
      |Mortgaged                  |Single       |0                |0                     |0                |false                    |Part-time employed|false             |0           |
    Then User fills the Debt Details Online for Client and assert Total Amount "7200"
      | creditor            | debttype        |      amountOwed  | liability |  areYouBehindWithPayments |furtherAction |furtherActionType |originalReGularPayment|originalReGularPaymentForEvery|isthedebtsubjecttoaguarantor|isDebtTypeMortagage|whatTypeOfMortgageIsIt|isItOnaStandardVariableRate|mortagagePaymentAmount|mortagagePaymentFrequency|linkMainHome|linkAssets|assetWorth|ownerOfTheAsset|isClientLiableForAllPayments|
      | Argos               |  Store card     |      1000        | Client1   |  Yes                      |      Yes     |   Default notice |  false               |4                             |No                          |true               |Repayment             |No                         |934.92                |4                        |Yes         |false     |false     |false          |false                       |
    And User Clicks On Continue Button and Marks the Debt completion as "No, I have items to add later"
    And User Navigates Create Your Budget and clicks on Continue button
    And Navigate to the Online Income page and enter the data as below Assert Total Income as "1500.00"
      |header  | field            | amount    |      index  |owner|
      |Earnings| Wage             | 670       |        4    |0    |
    And User Clicks On Continue Button and Marks the Debt completion as "No, I have income to add later"
    And Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as "1500.00"
      |header              | field             | amount    |      index  |   arrears   |isMortagageLink|creditor|debtType|whoIsDebtor|mortgageBalance|paidArrearsIn12Months|typeOfMortgage|isSVR|mainHome|assetWorth|assetBelogsto|
      |Home and contents   |Mortgage payment   |310        |4            |No           |true           |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Home and contents   |TV licence         |12.87      |3            |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Transport and travel|Public transport   |200        |5            |false        |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Utilities           |Water supply       |46         |4            |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
    And User Clicks On Continue Button and Marks the Debt completion as "No, I have spending to add later"
    And Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as "1500.00"
      |header                  | field             | amount    |      index  |   arrears   |isMortagageLink|creditor|debtType|whoIsDebtor|mortgageBalance|paidArrearsIn12Months|typeOfMortgage|isSVR|mainHome|assetWorth|assetBelogsto|
      |Food and housekeeping   |Groceries          |216        |5            |false        |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Food and housekeeping   |Meals at work      |55         |5            |false        |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
    And User Clicks On Continue Button and Marks the Debt completion as "No, I have spending to add later"
    And Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as "1500.00"
      |header                     | field                             | amount    |      index  |   arrears   |isMortagageLink|creditor|debtType|whoIsDebtor|mortgageBalance|paidArrearsIn12Months|typeOfMortgage|isSVR|mainHome|assetWorth|assetBelogsto|
      |Home and contents          |Council tax                        |116        |4            |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Utilities                  |Electricity                        |71         |4            |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Utilities                  |Gas                                |50         |4            |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Pensions and insurances    |Buildings and contents insurance   |25         |4            |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Communications and leisure |Home phone, internet and TV package|35         |4            |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Personal costs             |Clothing and footwear              |20         |4            |false        |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have finished"
    Then User fills the Debt Details Online for Client and assert Total Amount "7200" After Navigating back completing 2
      | creditor            | debttype        |      amountOwed  | liability |  areYouBehindWithPayments |furtherAction |furtherActionType |originalReGularPayment|originalReGularPaymentForEvery|isthedebtsubjecttoaguarantor|isDebtTypeMortagage|whatTypeOfMortgageIsIt|isItOnaStandardVariableRate|mortagagePaymentAmount|mortagagePaymentFrequency|linkAssets|assetWorth|ownerOfTheAsset|isClientLiableForAllPayments|
      | Barclaycard         | Credit card     |      1500        | Client1   |  Yes                      |      Yes     |   Default notice |  false               |4                             |No                          |false              |0                     |false                      |0                     |0                        |false     |false     |false          |false                       |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have added everything"
    Then User Will be Navigated to Questions and Answer the questions as below
      |guarantor|disputeddebt|debtUnenforceable|
      |No       |No          |No               |
    And User click on Continue Button to debt
    Then User Navigates to Income Page
    And Navigate to the Online Income page and enter the data as below Assert Total Income as "1500.00"
      |header      | field            | amount    |      index  |owner|
      |Earnings    | Other earnings   | 125       |        2    |0    |
      |Other income| Other income     | 300       |        5    |0    |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have finished"
    Then User Navigates to Advice on Your Budget
    And User Navigated to Final Questions and Continues Without changing the assets
    Then User Navigates to Priority Payments and Continues and Select No Savings
    Then User Navigates to Review Your Options and Continues
    And Close the Session
    And Quit Browser