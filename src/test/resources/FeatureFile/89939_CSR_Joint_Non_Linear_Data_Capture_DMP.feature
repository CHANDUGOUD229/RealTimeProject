Feature: Validation of E2E scenario 89939
  @JointClientReferral_ERR_TPP_Vehicle_SC89939
  @CSR_BatchE2E_All_Scenario
  @CSR_BatchE2E_SET_03
  Scenario:  [Advisor] E2E - Joint Client - DMP - Non Linear Data capture - Linking - Arrangements for priority arrears
    Given User is in login page
    When User enteres the credentials and click on login Button
    And Click On New Button
    And Select PhoneCall Option
    And Create new debt Advice case
    And Select Referral Route as "Direct"
    And Select who Referred Them as "Other"
    And Select cause Of Financial difficulty
    Then Register case
    Then clientOne and clientTwo gets register with the valid emails
    And Navigate to 'Your Household' page and Enter given data
    And From the debts page navigate to the 'Income' page via the top menu enter the data
    And Using the Back button navigate back to the 'Debts' page and enter the data
    And Navigate linear through the screens to the 'Spending Fixed Costs' page and enter the data
    And Navigate via the top menu to the 'Income' page and complete the data
    And Navigate Back to Debts and verify New Linked record has been created
    And Navigate to the 'Spending Flexible Costs' page and enter the following data
    And Add no 'Assets' or 'Future Changes'
    And Navigate through 'Review your budget'
    And Navigate to the 'Final Questions' page and select <No> for all questions
    And Navigate to the Priority Arrears page and verify AIP for HSBC CCJ presented
    And Navigate to Savings page and click <No>
    And Navigate to the solutions page, verify DMP is the joint recommended solution
    And Perform Logout And Close Browser
#  Below steps are not required as per scenario refinement session.
#    And Select joint solution
#    And Download the PAP
#    And Select save and exit, End Session
#    And Search and open the case in 'Read Only' interaction
#    And Navigate to the summary page and detailed view and verify the details
#    Then End Session 