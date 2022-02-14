Feature:Validation of E2E scenario 89929
@JointClient_NonLinearDataCapture_89929
@CSR_BatchE2E_All_Scenario
@CSR_BatchE2E_SET_02
Scenario: Validate EndToEndFlow

#//[Advisor] E2E - Joint Client - Non linear data capture - Linking spending to debts - Signposting
# - send email comms - solution undecided - PAP = recommended- re select DMP - DCS
Given User is in login page
When User enters the credentials and click on login Button
#And User Clicks On A Case And Navigates to Flexible Spendings
And Click On New Button
And Select PhoneCall Option
And Create new debt Advice case
And Select Referral Route as "Direct"
And Select who Referred Them as "Other"
And Select cause Of Financial difficulty
And In the Establish Client Needs page capture the details from datatable for Financial Difficulety "Unemployment or redundancy"
    |         | firstname |   lastname     | whereDoTheyLive|ukDebt|insolvencySolutions|age|areTheySelfEmployed|healthCondition|consentForStepChangeToRecord|consentForStepChangeToShare|isYourPartnerAvailableToSpeakWithUs|doYouHavePermissionTOShareTheDetails|
    | Client1 | Client1   |Client1LastName |England         |Yes   |No                 |56 |No                 |No             |false                       |false                      |false                              |false                               |
    | Client2 | Client2   |Client2LastName |England         |Yes   |No                 |57 |No                 |No             |false                       |false                      |Yes                                |Yes                                 |
And click on Create Account Button
And Registers the User Details
    |title|firstName|surname        |dateOfBirth|domain      |phoneNumber   |phoneType|postCode|preferredContactMethod|address|captureAddressManually|
    |Mr   |Client1  |Client1LastName|10101978   |att.net     |+44 7944423456|Mobile   |PO167GZ |Email                 |1      |true                  |
    |Mr   |Client2  |Client2LastName|10101977   |att.net     |+44 7944423456|Mobile   |PO167GZ |Email                 |1      |false                 |
And User Navigates to Your Household Page And Fill The below Data and Continues to Debts Page
    |housingStatus              |maritalStatus|ageUnde16Children|ageBetween16and18child|adultsResponsible|houseAwareOfDebtSituation|employment        |partnerEmployment |noOfVehicles|
    |Mortgaged                  |Married      |0                |0                     |0                |false                    |Part-time employed|Part-time employed|0           |
Then User fills the Debt Details for Client and assert Total Amount "1600"
        | creditor            | debttype        |      amountOwed  | liability |  areYouBehindWithPayments |furtherAction |furtherActionType |originalReGularPayment|originalReGularPaymentForEvery|isthedebtsubjecttoaguarantor|isDebtTypeMortagage|whatTypeOfMortgageIsIt|isItOnaStandardVariableRate|mortagagePaymentAmount|mortagagePaymentFrequency|ownerOfPayment|linkMainHome|linkAssets|assetWorth|ownerOfTheAsset|isClientLiableForAllPayments|
        | Argos               |  Store card     |      100         | 1         |  Yes                      |      Yes     |   Default notice |  false               |4                             |No                          |false              |0                     |false                      |0                     |0                        |3             |false       |false     |false     |false          |false                       |
        | Next                |  Catalogue      |      1500        | 2         |  Yes                      |      Yes     |   Default notice |  false               |4                             |No                          |false              |0                     |false                      |0                     |0                        |1             |false       |false     |false     |false          |false                       |
        | HSBC                |  Mortgage       |      90000       | 3         |  No                       |      No      |   false          |  false               |4                             |No                          |true               |2                     |No                         |310                   |4                        |3             |true        |false     |170000    |3              |false                       |
And user selects options from Global Questions as "No"
And User clicks on continue The screen
Then user clicks on create budget and submits screen
#Then User Do Sign Posting
 #   |service    |
  #  |Adfam      |
   # |Anxiety UK |
And Navigate to the Income page and enter the data as DataTable and Assert Total Income as "1281.67"
    | field            | amount    |      index  |owner|
    | Wage             | 370       |        4    |0    |
    | Wage             | 370       |        4    |0    |
    | Other earnings   | 125       |        2    |3    |
And Navigate to the Your Spendings Fixed page and enter the data as DataTable and Assert Total Fixed Spendings as "831.12"
    | field                           | amount    |      index  |   arrears   |
    | Council tax                     | 116       |        4    |     No      |
    | TV licence                      | 13.12     |        3    |     No      |
    | Electricity                     | 71        |        4    |     No      |
    | Gas                             | 50        |        4    |     No      |
    | Water supply                    | 46        |        4    |     No      |
    | Buildings and contents insurance| 25        |        4    |     No      |
    | Public transport                | 200       |        5    |     false   |
And User clicks on continue The screen
And Navigate to the Your Spendings Flexible page and enter the data as DataTable and Assert The totatl Spedings As "1161.62"
    | field                                 | amount    |      index  |   arrears      |
    | Groceries                             | 217       |        5    |     false      |
    | Home phone, internet and TV package   | 35        |        4    |     No         |
    | Clothing and footwear                 | 20        |        4    |     false      |
    | Other food and housekeeping           | 54        |        4    |     false      |
#     | Clothing and footwear           | 60        |        4    |     false      |
And User clicks on continue The screen
Then User is navigated to Advice your budget to review budget
And User clicks on continue The screen
And User clicks on continue The screen
And User Perform Action on Final Question pages and devide main Home as "170000" into equal portion of "50"
And Navigate to the Priority Arrears page and Continues
And User Navigates to Review Your Options Page and Selects DMP as recommended solution
And User Ends the session and Logout from the Application
And Perform Logout And Close Browser