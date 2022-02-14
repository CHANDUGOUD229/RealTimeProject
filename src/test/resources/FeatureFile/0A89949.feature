Feature: Validation of E2E scenario 89949

  Scenario: Validate HomePage Functionality
    Given User in login page
    When User enters the credentials and click on login Button
    And click On NEW Button
    And Select Phonecall Option
    And Create New debt Advice case
    And In Capture Referrals Organisation capture Referral route
    And In the Establish Clients Needs page capture Financial difficulty
    And Continue as a guest 
    And Navigate to Your Household Page and enter the data
    And Navigate to the Debts Page and enter the data
    And Navigate to the Income Page and enter the data
    And Navigate to the Spending Fixed Costs Page and enter the data
    And Navigate to the Spending Flexible Costs Page and enter the data
    Then Verify Understanding your situation details
    Then verify Review your budget indicated as complete Monthly summary
    And Navigate to the Final Questions section
    And Add no Assets or Future Changes Guest
    And On the Final Questions page select <No> for all questions
    And Navigate to the Priority Arrears page
    Then Navigate to the Your debt advice page and verify DRO is one of the recommended solutions
    When Proceed with DRO for Client1 and DRO for Client2 and register the client
    And Perform Logout And Close Browser