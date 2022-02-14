Feature: Validation of E2E scenario 89954
  @89954
  @OnlineBatchE2E_All_Scenario
  Scenario: Validate End TO End 89954 scenario
    #Given User is in login page for Online
    And In the Establish Client Needs page capture the details for Online
      |         | firstname |   lastname     | whereDoTheyLive|ukDebt|insolvencySolutions|age|areTheySelfEmployed|healthCondition|referredBY                 |financialDifficulty   |doTheyLiveWithPartner|healthIssue|
      | Client1 | Client1   |Client1LastName |Northern Ireland|Yes   |No                 |53 |No                 |No             |Friend or family suggestion|Injury or health issue|No                   |false      |
    And On Step Change Account Registration Continue without registration
    And User Clicks On HouseHolds And Fills the Details as below
      |housingStatus              |maritalStatus|ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment        |partnerEmployment |noOfVehicles|
      |Renting - private landlord |Separated       |0                |0                     |0                |false                    |Part-time employed|false             |0           |
    Then User fills the Debt Details Online for Client and assert Total Amount "9000"
      | creditor      | debttype             |      amountOwed  | liability | areYouBehindWithPayments |ongoingMobileService|furtherAction |furtherActionType                 |originalReGularPayment|originalReGularPaymentForEvery|isthedebtsubjecttoaguarantor|isDebtTypeMortagage|whatTypeOfMortgageIsIt|isItOnaStandardVariableRate|mortagagePaymentAmount|mortagagePaymentFrequency|linkAssets|assetWorth|ownerOfTheAsset|isClientLiableForAllPayments|arrangementRepayInsurance|reasonForSpending               |spentAmount|
      | HSBC          |  Credit card         |      3600        | You       |  No                      |false               |       No     |   false                          |  false               |4                             |No                          |false              |0                     |false                      |0                     |0                        |false     |false     |false          |false                       |false                    |false                           |false      |
      | Littlewoods   |  Catalogue           |      3600        | You       |  Yes                     |false               |      Yes     |   Default notice                 |  false               |4                             |No                          |false              |0                     |false                      |0                     |0                        |false     |false     |false          |false                       |false                    |false                           |false      |
      | Lowell        |  Mobile phone arrears|      7200        | You       |  false                   |No                  |      false   |   No action taken (arrears only) |  false               |4                             |No                          |false              |0                     |false                      |0                     |0                        |false     |false     |false          |false                       |false                    |false                           |fasle      |
      | Lowell        |  Insurance arrears   |      1800        | You       |  false                   |false               |      false   |   No action taken (arrears only) |  false               |4                             |No                          |false              |0                     |false                      |0                     |0                        |false     |false     |false          |false                       |No                       |Buildings and contents insurance|25         |
      | Barclaycard   | Credit card          |      1800        | You       |  No                      |               false|    No        |   false                          |  false               |4                             |No                          |false              |0                     |false                      |0                     |0                        |false     |false     |false          |false                       |false                    |false                           |fasle      |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have added everything"
    Then User Will be Navigated to Questions and Answer the questions as below
      |guarantor|disputeddebt|debtUnenforceable|
      |No       |No          |No               |
    And User Navigates Create Your Budget and clicks on Continue button
    And Navigate to the Online Income page and enter the data as below Assert Total Income as "1500.00"
      |header  | field            | amount    |      index  |owner|
      |Earnings| Wage   | 1500       |        4    |0    |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have finished"
    And Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as "1700.00"
      |header                     | field           | amount    |      index  |   arrears   |isMortagageLink|creditor|debtType|whoIsDebtor|mortgageBalance|paidArrearsIn12Months|typeOfMortgage|isSVR|mainHome|assetWorth|assetBelogsto|
      |Home and contents          |Rent             |1000       |4            |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Utilities                  |Electricity      |30         |4            |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Home and contents          |Rates            |150        |4            |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Utilities                  |Gas              |30         |4            |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Home and contents          |TV licence       |13         |4            |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Food and housekeeping      |Smoking products |200        |5            |false        |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Utilities                  |Water supply     |30         |5            |No           |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
      |Food and housekeeping      |Groceries        |222        |5            |false        |false          |HSBC    |Mortgage|Client1    |90000          |No                   |Repayment     |No   |No      |170000    |Client1      |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have finished"
    And User Continues After Checks Item Type Not Applicable "Clothing and footwear"
    Then User Navigates to Advice on Your Budget and Complete Cutbacks and provide reason as below
      |cutBackFor      |canYouCutback|reasonforNoCutback                |
      |Groceries       |No           |false                             |
      |Smoking products|No           |Only entertainment cost in budget |
    And User Navigated to Final Questions and Continues
    And User Navigated to Registration from Final Questions
    #Then Client Registered With StepChnage
    # |firstName |domain         |dateOfBirth|
    # |Client1AB4|@stepchange.com|10/11/1985|
    And Create Step Change Account page and Enter Valid data89954
    #And user Navigate to Create Step Change Account page and Enter Valid data
    Then User Navigates to Priority Payments and Continues
    Then User Agrees to repay arrears on Priority Payments and Continues
    Then User Navigates to Review Your Options and Continues
    And Close the Session
    And Quit Browser