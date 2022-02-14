Feature: Joint Client - DPP - registration via advisor- data capture completed online - Interaction type Post - send manual comm by post
  @JointClient_DPP
  Scenario: Validate HomePage Functionality
  Given User is in login page
  When User enters the credentials and click on login Button
  And Click On New Button
  And Select PhoneCall Option
  And Create new debt Advice case
  And Select Referral Route as "Direct"
  And Select who Referred Them as "Other"
  #And Click On CaptureReferralContinue Button
  And Select cause Of Financial difficulty
  And Fill the Client details
  And user adds second Client details
  And click on continue guests
  And user Navigate to Your Household page and enters all the details
  And user click on continue in debt screen
  And user navigates to creating your budget screen and enters all the details



 #And user logs out from Application

  
  
  
  
  
  
  