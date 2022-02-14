Feature:Validation of E2E scenario 89934
  @SC89934
  @CSR_BatchE2E_All_Scenario
  @CSR_BatchE2E_SET_01
  Scenario: E2E Sole IVA NI Groceries multiple frequencies
    Given User is in login page
    When User enters the credentials and click on login Button
    And Click On New Button
    And Select PhoneCall Option
    And Create new debt Advice case
    And Select Referral Route as "Direct"
    And Select who Referred Them as "Other"
    And Select cause Of Financial difficulty
    And In the Establish Client Needs page capture the details from datatable for Financial Difficulety "Unemployment or redundancy"
      |         | firstname |   lastname     | whereDoTheyLive    |ukDebt|insolvencySolutions|age|areTheySelfEmployed|healthCondition|consentForStepChangeToRecord|consentForStepChangeToShare|isYourPartnerAvailableToSpeakWithUs|doYouHavePermissionTOShareTheDetails|
      | Client1 | Client1   |Client1LastName |Northern Ireland    |Yes   |No                 |45 |No                 |No             |false                       |false                      |false                              |false                               |
    And click on Create Account Button
    And Registers the User Details
      |title|firstName|surname        |dateOfBirth|domain      |phoneNumber   |phoneType|postCode|preferredContactMethod|address|captureAddressManually|
      |Mr   |Client1  |Client1LastName|10101978   |email.com   |+44 7944423456|Mobile   |PO167GZ |Email                 |1      |true                  |
    And User Navigates to Your Household Page And Fill The below Data and Continues to Debts Page
      |housingStatus                   |maritalStatus|ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment        |partnerEmployment|noOfVehicles|
      |Renting - Housing Association   |Divorced     |2                |0                     |0                |false                    |Student           |false            |0           |
    And Navigate to Debts and enter the data
    And Navigate to YourIncome89934 page and enter the data
    And Navigate to Spending fixed costs page and enter the data
    And Navigate to Spending Flexible Costs and enter the data
    And Navigate through Review your budget and ensure Food and housekeeping34
    And Add no 'Assets' or 'Future Changes89934'
    And Navigate to the'Final Questions' and select <No> for all questions
    And Navigate to Priority Arrears and select 'Calculate' where required
    And Navigate to Savings and select <No>
    And Navigate to 'Your debt advice'
    And Navigate to 'Your preferred solution' and proceed with the solution as per test case
    And Perform Logout And Close Browser




  
  
  
  
