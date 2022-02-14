Feature:Validation of E2E scenario 89937
  @SC89937
  @CSR_BatchE2E_All_Scenario
  @CSR_BatchE2E_SET_01
  Scenario: E2E Sole Client Payment Suspension Registration Scotland
    Given User is in login page
    When User enters the credentials and click on login Button
    And Click On New Button
    And Select PhoneCall Option
    And Create new debt Advice case
    And Select Referral Route as "Direct"
    And Select who Referred Them as "Other"
    And Select cause Of Financial difficulty
    And In the Establish Client Needs page capture the details from datatable for Financial Difficulety "Unemployment or redundancy"
      |         | firstname |   lastname     | whereDoTheyLive|ukDebt|insolvencySolutions|age|areTheySelfEmployed|healthCondition|consentForStepChangeToRecord|consentForStepChangeToShare|isYourPartnerAvailableToSpeakWithUs|doYouHavePermissionTOShareTheDetails|
      | Client1 | Client1   |Client1LastName |Scotland        |Yes   |No                 |27 |No                 |No             |false                       |false                      |false                              |false                               |
    And click on Create Account Button
    And Registers the User Details
      |title|firstName|surname        |dateOfBirth|domain      |phoneNumber   |phoneType|postCode|preferredContactMethod|address|captureAddressManually|
      |Mr   |Client1  |Client1LastName|10101978   |gmx.com     |+44 7944423456|Mobile   |PO167GZ |Email                 |1      |true                  |
    And User Navigates to Your Household Page And Fill The below Data and Continues to Debts Page
      |housingStatus              |maritalStatus|ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment                         |partnerEmployment|noOfVehicles|
      |In temporary accommodation |Single       |0                |0                     |0                |false                    |Unemployed: not looking for work   |false            |0           |
    And Action on Your Debt page
    And Action on Create your budget from dashbord and proceed
    And Action on Your income pageSCB
    And Navigate to the Your Spendings Fixed page and enter the data as DataTable and Assert Total Fixed Spendings as "210.00"
      | field                            | amount    |      index  |   arrears   |
      | Board                            | 210       |       4     |     No      |
    And User clicks on continue The screen
    And Navigate to the Your Spendings Flexible page and enter the data as DataTable and Assert The totatl Spedings As "315.00"
      | field                                | amount    |      index  |   arrears       |
      | Groceries                            | 105       |        3    |     false       |
    And User clicks on continue The screen
    And Action on Review budgetAndSummary pageSCB
    And Action on Assets PageSCB
    And Action on Future changes PageSCB
    And Action on Final questions PageSCB
    And Action on Arrangements for priority arrears PageSCB
    And Action on review your option from dashbordSCB
    And Perform Logout And Close Browser
    #And User Ends the session and Logout from the ApplicationSCB89937
  
  
  
  
  
  
  
  
  
      
      
