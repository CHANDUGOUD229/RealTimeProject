Feature: Validation of E2E scenario 89933
  @SoleClientfinancialSolution_89933
  @CSR_BatchE2E_All_Scenario
  @CSR_BatchE2E_SET_01
  Scenario: E2E - Sole Client - Financial Solutions - Registration - Linking - England - End Session ESC0003
    Given User is in login page
    When User enters the credentials and click on login Button
    And Click On New Button
    And Select PhoneCall Option
    And Create new debt Advice case
    And Select Referral Route as "Direct"
    And Select who Referred Them as "Other"
    And Select cause Of Financial difficulty
    And In the Establish Client Needs page capture the details from datatable for Financial Difficulety "Unemployment or redundancy"
      |         | firstname |   lastname     |whereDoTheyLive|ukDebt|insolvencySolutions|age|areTheySelfEmployed|healthCondition|consentForStepChangeToRecord|consentForStepChangeToShare|isYourPartnerAvailableToSpeakWithUs|doYouHavePermissionTOShareTheDetails|
      | Client1 | Client1   |Name            |England        |Yes   |No                 |55 |No                 |No             |false                       |false                      |false                              |false                               |
    And click on Create Account Button
    And Registers the User Details
      |title|firstName|surname        |dateOfBirth|domain      |phoneNumber   |phoneType|postCode|preferredContactMethod|address|captureAddressManually|
      |Mr   |Client1  |Client1LastName|10101955   |bt.com      |+44 7944423456|Mobile   |PO167GZ |Email                 |1      |true                  |
    And User Navigates to Your Household Page And Fill The below Data and Continues to Debts Page
      |housingStatus              |maritalStatus|ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment        |partnerEmployment |noOfVehicles|
      |Mortgaged                  |Married      |0                |0                     |0                |false                    |Full-time employed|false             |0           |
    Then User fills the Debt Details for Client and assert Total Amount "6000"
      | creditor            | debttype        |      amountOwed  | liability |  areYouBehindWithPayments |furtherAction |furtherActionType |originalReGularPayment|originalReGularPaymentForEvery|isthedebtsubjecttoaguarantor|isDebtTypeMortagage|whatTypeOfMortgageIsIt|isItOnaStandardVariableRate|mortagagePaymentAmount|mortagagePaymentFrequency|linkMainHome|linkAssets|assetWorth|ownerOfTheAsset|isClientLiableForAllPayments|
      | Argos               |  Personal loan  |      6000        | 1         |  No                       |      No      |   false          |  300                 |4                             |No                          |false              |0                     |false                      |0                     |0                        |false       |false     |false     |false          |No                          |
      | Nationwide          |  Mortgage       |      20000       | 1         |  No                       |      No      |   false          |  false               |4                             |No                          |true               |2                     |No                         |310                   |4                        |true        |true      |466.88    |1              |No                          |
    And user selects options from Global Questions as "No"
    And User clicks on continue The screen
    Then user clicks on create budget and submits screen
    And Navigate to the Income page and enter the data as DataTable and Assert Total Income as "100.00"
      | field            | amount    |      index  |
      | Wage             | 1000      |        4    |
    And Navigate to the Your Spendings Fixed page and enter the data as DataTable and Assert Total Fixed Spendings as "886.03"
      | field                             | amount    |      index  |   arrears   |
      | Council tax                       | 100       |        4    |     No      |
      | TV licence                        | 13.12     |        3        |     No      |
      | Electricity                       | 50        |        4    |     No      |
      | Gas                               | 50        |        4    |     No      |
      | Water supply                      | 50        |        4    |     No      |
      | Buildings and contents insurance  | 20        |        4    |     No      |
    And User clicks on continue The screen
    And Navigate to the Your Spendings Flexible page and enter the data as DataTable and Assert The totatl Spedings As "1246.03"
      | field                           | amount    |      index  |   arrears       |
      | Groceries                       | 200       |        4    |     false       |
    And User clicks on continue The screen
    Then User is navigated to Advice your budget to review budget
    And User clicks on continue The screen
    And User clicks on continue The screen
    Then User Naigates to Final Questions Page
    Then User Navigates to Asset Page And performs the below Opertations
    |field    |mainHomeAmount|mainHomeOwner|isAllClientAssetsCaptured|isMainHome|
    |Main home|100000        |Client1      |true                     |true      |
    And User clicks on continue The screen
    And User Perform Action in Final Question page
    And Navigate to the Priority Arrears page and Continues
    And User Navigates to Review Your Options Page89933
    And User Ends the session and Logout from the Application
    And Perform Logout And Close Browser


  
  
  
  
  