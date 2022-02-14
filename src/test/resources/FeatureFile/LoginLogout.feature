Feature: Validation of E2E scenario 89933
  @LoginLogut
  Scenario: E2E - Sole Client - Financial Solutions - Registration - Linking - England - End Session ESC0003
    Given User is in login page
    When User enters the credentials and click on login Button
    And Select PhoneCall Option
    And Create new debt Advice case
    And Perform Logout And Close Browser