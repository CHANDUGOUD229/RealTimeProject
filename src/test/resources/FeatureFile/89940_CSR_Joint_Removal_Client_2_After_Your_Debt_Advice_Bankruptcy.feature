Feature:Validation of E2E scenario 89940

  @JointClientBankruptcy_89940
  @CSR_BatchE2E_All_Scenario
  @CSR_BatchE2E_SET_02
  @CSR_Batch40/41
  Scenario: JointClient_Bankruptcy_RemoveClient2
    Given User is in login page
    When User enters the credentials and click on login Button
    And Click On New Button
    And Select PhoneCall Option
    And Create new debt Advice case
    And Select Referral Route as "Direct"
    And Select who Referred Them as "Other"
    And Select cause Of Financial difficulty
#  Given User is in login page
#  When User enteres the credentials and logged in
#  Then User in HomePage and select mandatory fields
#  And User Enter details on Capture Refferal Page
    And In the Establish Client Needs page capture the details from datatable for Financial Difficulety "Unemployment or redundancy"
      |         | firstname | lastname        | whereDoTheyLive | ukDebt | insolvencySolutions | age | areTheySelfEmployed | healthCondition | consentForStepChangeToRecord | consentForStepChangeToShare | isYourPartnerAvailableToSpeakWithUs | doYouHavePermissionTOShareTheDetails |
      | Client1 | Client1   | Client1LastName | Wales           | Yes    | No                  | 38  | No                  | No              | false                        | false                       | false                               | false                                |
      | Client2 | Client2   | Client2LastName | Wales           | Yes    | No                  | 34  | No                  | No              | false                        | false                       | Yes                                 | Yes                                  |
    And click on Create Account Button
#  And User Enter Clients details on EstablishClient Needs page
    And Registers the User Details
      | title | firstName | surname         | dateOfBirth | domain    | phoneNumber    | phoneType | postCode   | preferredContactMethod | address | captureAddressManually |
      | Mr    | Client1   | Client1LastName | 10101978    | games.com | +44 7944423456 | Mobile    | PO16   7GZ | Email                  | 1       | false                  |

#  And user Register with  Client1 Details In Account Registration Page

    And User Navigates to Your Household Page And Fill The below Data and Continues to Debts Page
      | housingStatus     | maritalStatus     | ageUnde16Children | ageBetween16and18child | adultsResponsible | houseAwareOfDebtSituation | employment                   | partnerEmployment  | noOfVehicles |
      | Renting - Council | Civil Partnership | 0                 | 0                      | 0                 | false                     | Unemployed: looking for work | Zero hour contract | 0            |

#  And User Navigated to YourHouseHold Page and fill required data

    Then User fills the Debt Details for Client and assert Total Amount "31500"
      | creditor   | debttype      | amountOwed | liability | areYouBehindWithPayments | furtherAction | furtherActionType | originalReGularPayment | originalReGularPaymentForEvery | isthedebtsubjecttoaguarantor | isDebtTypeMortagage | whatTypeOfMortgageIsIt | isItOnaStandardVariableRate | mortagagePaymentAmount | mortagagePaymentFrequency | linkAssets | assetWorth | ownerOfTheAsset | isClientLiableForAllPayments |
      | Blackhorse | Credit Card   | 10000      | 1         | No                       | No            | false             | false                  | 3                              | No                           | false               | 0                      | false                       | 0                      | 0                         | false      | false      | false           | false                        |
      | HSBC       | Personal loan | 10500      | 1         | No                       | No            | false             | 200                    | 4                              | No                           | false               | 0                      | No                          | 0                      | 0                         | false      | 0          | 0               | false                        |
      | HSBC       | Personal loan | 11000      | 1         | No                       | No            | false             | 300                    | 4                              | No                           | false               | 0                      | No                          | 0                      | 0                         | false      | 0          | 0               | false                        |
    And user selects options from Global Questions as "No"
    And User clicks on continue The screen
    Then user clicks on create budget and submits screen
    And user Navigated to Spending-Fixed cost page and fill the data
    And Navigate to the Your Spendings Fixed page and enter the data as DataTable and Assert Total Fixed Spendings as "655.08"
      | field                            | amount | index | arrears |
      | Rent                             | 251.96 | 4     | No      |
      | Council tax                      | 100    | 4     | No      |
      | TV licence                       | 13.12  | 3     | No      |
      | Electricity                      | 50     | 4     | No      |
      | Gas                              | 50     | 4     | No      |
      | Water supply                     | 50     | 4     | No      |
      | Buildings and contents insurance | 20     | 4     | No      |
      | Childcare                        | 100    | 4     | No      |
      | School uniform                   | 20     | 4     | false   |
    And User Naviagated to Income page from top Navigation and fill required fields
#    And Navigate to the Income page and enter the data as DataTable and Assert Total Income as "1500.00"
#      | field                                      | amount | index | owner |
#      | Other earnings                             | 20     | 2     | 2     |
#      | Child Benefit                              | 34.40  | 1     | 3     |
#      | Local Housing Allowance/Housing Benefit    | 100    | 1     | 3     |
#      | Jobseeker's Allowance (contribution-based) | 229.70 | 1     | 3     |
    And user Naviagated to Spending-Flexible cost Page By clicking Hyperlink and fill Required fields
    And Navigate to the Your Spendings Flexible page and enter the data as DataTable and Assert The totatl Spedings As "1500.00"
      | field                 | amount | index | arrears |
      | Groceries             | 350    | 5     | false   |
      | Mobile phone          | 50     | 4     | No      |
      | Clothing and footwear | 60     | 4     | false   |
    And User clicks on continue The screen
#    And User Enters Debt1, Debt2 and Debt3 Details In YourDebts Page
#    And User Clicks Continue Button In Creating Your Budget Page
#    And user Navigated to Spending-Fixed cost page and fill the data
#    And User Naviagated to Income page from top Navigation and fill required fields
#    And user Naviagated to Spending-Flexible cost Page By clicking Hyperlink and fill Required fields
    And User Select Advice On your Budget Navigated to Review Budget and Budget Summary pages
    And User Perform Action on Final Question page

    And User perform Action on Your Priority payments page
    And User perform Action on Review your option page and navigate to DashBoard
#  And User Select About you and Client2 is removed from Establish Client Need page
#  And User make No Changes in Your House Hold Page
#  And User verify Your Debts Page
#  And User verify Your income page
#  And User Verify Your Spending Flexible Cost Page
#  And User Perform Action on Advice On your Budget Page
#  And User Perform Action on Final Question Page
#    And User perform Action on Your Priority payments page ++Cmt By Priya
#  And user perform Action on Review Your Option page
    And User Select Non Proceed Case  from Your Debt Advice Page
 #   And Perform Logout And Close Browser
#  And User End the Session
#  And User verify the data by open the case
#  And user Ends the Session

  
   
 