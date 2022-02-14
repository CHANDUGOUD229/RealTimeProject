Feature: Validation of E2E scenario 89941
  @JointMPA_NI_LinkingAIP_CalcSavings_SC89941
  @CSR_BatchE2E_All_Scenario
  @CSR_BatchE2E_SET_01
  @CSR_Batch40/41
  Scenario: Validate HomePage Functionality_SC89941
    Given User is in login page
    When User enters the credentials and click on login Button
    And Click On New Button
    And Select PhoneCall Option
    And Create new debt Advice case
    And Select Referral Route as "Direct"
    And Select who Referred Them as "Other"
    And Select cause Of Financial difficulty
    And User creates Establish clientOne and clientTwo client details as JointMPA
    And click on Create Account Button
    And Registers the User Details
      |title|firstName|surname        |dateOfBirth|domain      |phoneNumber   |phoneType|postCode|preferredContactMethod|address|captureAddressManually|
      |Mr   |Client1  |Client1LastName|10101978   |inbox.com   |+44 7944423456|Mobile   |PO167GZ |Email                 |1      |true                  |
      |Mr   |Client2  |Client2LastName|10101977   |inbox.com   |+44 7944423456|Mobile   |PO167GZ |Email                 |1      |false                 |
    And User Navigates to Your Household Page And Fill The below Data and Continues to Debts Page
      |housingStatus              |maritalStatus|ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment        |partnerEmployment|noOfVehicles|
      |Owns property outright     |Married      |0                |0                     |0                |false                    |Retired           |Retired          |0           |
    And Navigate to the Spending Fixed Costs page and enter the data as JointMPA
    And Navigate to the Debts page and enter the data as JointMPA
    And Navigate to the Income page and enter the data as JointMPA
    And Navigate to the Spending Flexible Costs page and enter the data as JointMPA
    And Navigate through Review your budget and make no changes as JointMPA
    And Navigate to the Final Questions page and  enter details in Assets page as JointMPA
    And add answers for all the final questions as JointMPA
    And Navigate to the Priority Arrears page and select Calculate as JointMPA
    And Navigate to Savings page and click Yes as JointMPA
    Then continue with Review your options as JointMPA
    And Choose your solution as JointMPA download the PAP
    And User Ends the session and Logout from the Application
    And Perform Logout And Close Browser
