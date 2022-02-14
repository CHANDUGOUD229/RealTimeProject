Feature: Validation of E2E scenario 89950
  @89950
  @OnlineBatchE2E_All_Scenario

  Scenario: Validate End TO End 89950 scenario
    #Given User is in login page for Online
    And In the Establish Client Needs page capture the details for Online
      |         | firstname |   lastname     | whereDoTheyLive|ukDebt|insolvencySolutions|age|areTheySelfEmployed|healthCondition|referredBY  |financialDifficulty       |doTheyLiveWithPartner|partnerUkDebts|inCoupleDebitAdvice|healthIssue|partnerSelfEmployed|partnerAge|
      | Client1 | Client1   |Client1LastName |Wales           |Yes   |No                 |48 |No                 |No             |Other       |Unemployment or redundancy|Yes                  |Yes           |Yes                |false      |No                 |42        |
   # Then Client Registered With StepChnage
   # |firstName|domain      |dateOfBirth|
   # |Client1  |@stepange.com|10/01/1973 |
    And Create Step Change Account page and Enter Valid data89950
    And User Clicks On HouseHolds And Fills the Details as below
      |housingStatus                        |maritalStatus    |ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment                      |partnerEmployment |noOfVehicles|
      |Shared ownership (mortgage and rent) |Civil Partnership|2                |0                     |0                |false                    |Unemployed: not looking for work|Full-time employed|0           |
    Then User fills the Debt Details Online for Client and assert Total Amount "7200"
      | creditor  | debttype |amountOwed  | liability             |areYouBehindWithPayments |furtherAction |furtherActionType |isthedebtsubjecttoaguarantor|isDebtTypeMortagage|haveYouRepaidAnyArrearsInTheLast12Months|whatTypeOfMortgageIsIt|isItOnaStandardVariableRate|mortagagePaymentAmount|mortagagePaymentFrequency|isClientLiableForAllPayments|linkMainHome|ownerOfPayment|
      | Nationwide| Mortgage |20000       | Client1 & Your Partner|No                       |   false      |   false          | No                         |true               |No                                      |Repayment             |No                         |934.92                |4                        |false                       |Yes         |1      |
    And User Clicks On Continue Button and Marks the Debt completion as "No, I have items to add later"
    And User Navigates Create Your Budget and clicks on Continue button
    And User Clicks On Continue Button and Marks the Debt completion as "No, I have income to add later"
    And Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as "1500.00"
      |header                 | field                             | amount| whoPays     |   arrears   |index|
      |Pensions and insurances|Buildings and contents insurance   |20     |Shared       |No           |4    |
      |Care and health costs  |Childcare                          |100    |Shared       |No           |4    |
      |School costs           |School uniform                     |20     |Shared       |false        |4    |
      |Personal costs         |Clothing and footwear              |60     |Shared       |false        |4    |
      |Food and housekeeping  |Groceries                          |350    |Shared       |false        |5    |
    And User Clicks On Continue Button and Marks the Debt completion as "No, I have spending to add later"
    Then User Navigates to Income Page
   And Navigate to the Online Income page and enter the data as below Assert Total Income as "1500.00"
      |header                  | field            | amount    |whoPays|index|
      |Benefits and Tax Credits| Universal Credit | 600       |Client1 |1    |
      |Benefits and Tax Credits| Child Benefit    | 34.40     |Client1 |1    |
    And User Clicks On Continue Button and Marks the Debt completion as "No, I have income to add later"
    Then User fills the Debt Details Online for Client and assert Total Amount "7200" After Navigating back completing 1
      | creditor            | debttype           |      amountOwed  | liability     |  areYouBehindWithPayments |furtherAction |furtherActionType                |ongoingMobileService|
      | British Gas         | Electricity arrears|      4000        | Client1       |  false                    |      false   |  No action taken (arrears only) |No                  |
      | Natwest             | Credit card        |      3000        | Your Partner  |  Yes                      |      false   |  Default notice                 |false               |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have added everything"
    Then User Will be Navigated to Questions and Answer the questions as below
      |guarantor|disputeddebt|debtUnenforceable|
      |No       |No          |No               |
    And User click on Continue Button to debt
    Then User Navigates to Income Page
    And Navigate to the Online Income page and enter the data as below Assert Total Income as "1500.00"
      |header  | field | amount    |whoPays     |index|
      |Earnings| Wage  | 1100      |Your Partner|4    |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have finished"
    And Navigate to the Online Spendings Fixed page and enter the data as below Assert Total Income as "1500.00"
      |header            | field         | amount    |      index  |   arrears   |whoPays|
      |Home and contents |Rent           |251.96     |4            |No           |Shared |
      |Home and contents |Council tax    |100        |4            |No           |Shared |
      |Home and contents |TV licence     |13.12      |3            |No           |Shared |
      |Utilities         |Electricity    |50         |4            |No           |Shared |
      |Utilities         |Gas            |50         |4            |No           |Shared |
      |Utilities         |Water supply   |50         |4            |No           |Shared |
    And User Clicks On Continue Button and Marks the Debt completion as "Yes, I have finished"
    Then User Navigates to Advice on Your Budget and Complete Cutbacks
    |cutBackFor           |canYouCutback|
    |Groceries            |No           |
    |Clothing and footwear|No           |
    And User Navigated to Final Questions and Continues and Fill Mortgage Details
      |isMortgage|mortgagedPropertyValue|mortgageSplit|
      |true      |50000                 |Yes          |
      |false     |0                     |Yes          |
    Then User Navigates to Priority Payments and Continues
    Then User Navigates to Review Your Options and Continues
    And Close the Session
    And Quit Browser