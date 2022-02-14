Feature: Validation of E2E scenario 89925
  @SoleClientMAPVehicles2likelyItems_SC89925
    @CSR_BatchE2E_All_Scenario
    @CSR_BatchE2E_SET_02
  Scenario Outline: Validation of E2E scenario 89925
    Given User is in login page
    When User enters the credentials and click on login Button
#    And User Clicks On A Case And Navigates to Flexible Spendings
    And Click On New Button
    And Select PhoneCall Option
    And Create new debt Advice case
    And Select Referral Route as "<arg1>"
    And Select who Referred Them as "<arg11>"
    And Select cause Of Financial difficulty
    And In the Establish Client Needs page capture the details from datatable for Financial Difficulety "Unemployment or redundancy"
      |         | firstname |   lastname     | whereDoTheyLive|ukDebt|insolvencySolutions|age|areTheySelfEmployed|healthCondition|consentForStepChangeToRecord|consentForStepChangeToShare|isYourPartnerAvailableToSpeakWithUs|doYouHavePermissionTOShareTheDetails|
      | Client1 | Client1   |Client1LastName |Scotland        |Yes   |No                 |28 |No                 |No             |false                       |false                      |false                              |false                               |
#      | Client2 | Client2   |Client2LastName |Northern Ireland|Yes   |No                 |53 |No                 |No             |false                       |false                      |false                                |false                               |
    And click on continue guests
    And User Navigates to Your Household Page And Fill The below Data and Continues to Debts Page
      |housingStatus                   |maritalStatus|ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment         |partnerEmployment|noOfVehicles|
      |Board payment (not with family) |Single       |0                |0                     |0                |false                    |Full-time employed |false            |2           |
    Then User fills the Debt Details for Client and assert Total Amount "1577"
      | creditor   | debttype      | amountOwed | liability |  areYouBehindWithPayments |furtherAction |furtherActionType |originalReGularPayment|originalReGularPaymentForEvery|isthedebtsubjecttoaguarantor|isDebtTypeMortagage|whatTypeOfMortgageIsIt|isItOnaStandardVariableRate|mortagagePaymentAmount|mortagagePaymentFrequency|isClientLiableForAllPayments|
      | HSBC       | Personal loan | 777        | 1         |  No                       |      No      |   false          | 200                  |          4                   | No                         | false             |        0             |      false                |       0              |        0                |No                          |
      | TSB        | Overdraft     | 800        | 1         |  No                       |      No      |   false          | false                |          false               | false                      | false             |        0             |      false                |       0              |        0                |false                       |
    And user selects options from Global Questions as "No"
    And User clicks on continue The screen
    Then user clicks on create budget and submits screen
    And Navigate to the Income page and enter the data as DataTable and Assert Total Income as "888.00"
      | field            | amount    |      index  |
      | Wage             | 888       |        4    |
    And Navigate to the Your Spendings Fixed page and enter the data as DataTable and Assert Total Fixed Spendings as "605.00"
      | field                                 | amount|index |   arrears   |
      | Board                                 | 300   | 4    |     No      |
      | Buildings and contents insurance      | 55   | 4    |     No      |
      | Life insurance                        | 20    | 4    |     No      |
      | Car insurance 1                       | 20    | 4    |     No      |
      | Car insurance 2                       | 20    | 4    |     No      |
      | Road tax 1                            | 5     | 4    |     false   |
      | Road tax 2                            | 5     | 4    |     false   |
      | Fuel, parking and toll road charges 1 | 60    | 5    |     false   |
      | Fuel, parking and toll road charges 2 | 60    | 5    |     false   |
      | Breakdown cover 1                     | 10    | 4    |     false   |
      | Breakdown cover 2                     | 10    | 4    |     false   |
      | MOT and ongoing vehicle maintenance 1 | 5     | 4    |     false   |
      | MOT and ongoing vehicle maintenance 2 | 5     | 4    |     false   |
      | Prescriptions and medicine            | 10     | 4    |     false   |
      | Dentistry                             | 10     | 4    |     false   |
      | Opticians                             | 10     | 4    |     false   |
 #   And Navigate to the Spending Fixed Costs page and enter the data
    And User clicks on continue The screen
    And Navigate to the Your Spendings Flexible page and enter the data as DataTable and Assert The totatl Spedings As "888"
      | field                                | amount    |      index  |   arrears       |
      | Groceries                            | 200       |        5    |     false       |
      | Mobile phone                         | 33        |        4    |     No          |
      | Home phone, internet and TV package  | 50        |        4    |     No          |
    And User clicks on continue The screen
    Then User is navigated to Advice your budget to review budget
    And User navigates to Assets page in debt advice of final questions
    #And User navigates to Assets page in debt advice of final questions
    And User Perform Action on Final Question page for MAP
    And Navigate to the Priority Arrears And Continue to next screens
    Then Navigate to the solutions page and verify DRO is one of the recommended solutions
      |title|firstName|surname        |dateOfBirth|domain      |phoneNumber   |phoneType|postCode|preferredContactMethod|address|
      |Mr   |Client1  |Client1LastName|10101978   |aol.com     |+44 7944423456|Mobile   |PO167GZ |Email                 |1      |
    And User Navigates to Review Your Options Page and Selects the MAP as the recommended solution
    And User Ends the session and Logout from the Application
    And Perform Logout And Close Browser
    Examples:
      | arg1   | arg11 |
      | Direct | Other |

