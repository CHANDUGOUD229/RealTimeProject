package com.stepChangeRem.remediation.pages.helper.online;

import com.stepChangeRem.remediation.pages.EstablishClientNeedsPage;
import com.stepchange.atf.controls.Button;
import com.stepchange.atf.controls.Checkbox;
import com.stepchange.atf.controls.Dropdown;
import com.stepchange.atf.controls.TextField;
import org.openqa.selenium.By;

import java.util.List;
import java.util.Map;

public class OnlineClientDetailsHelper extends EstablishClientNeedsPage{
    private Dropdown whatTheCauseOfFinancialDifficulty;
    private TextField firstName;
    private TextField surname;
    private Button whereDoTheyLive;
    private Button doTheyHaveAtLeastOneUKDebt;
    private Button areTheyCurrentlyOnAnyOfTheseInsolvencySolutions;
    private TextField howOldAreThey;
    private Button areTheySelfEmployed;
    private Button doTheyCurrentlyHaveAnyHealthConditions;
    private Checkbox permissionTorecordGivenBy;
    private Button consentForStepChangeToRecord;
    private Button consentForStepChangeToShare;
    private Button addClient;
    private Button continueButton;
    private Button isYourPartnerAvailableToSpeakWithUs;
    private Button doYouHavePermissionTOShareTheDetails;
    private Button confirm;
    private Button clientLivesInSameAddress;
    private Dropdown referredBY;
    private Dropdown  financialDifficulty;
    private Button doTheyLiveWithPartner;
    private Button partnerUkDebts;
    private Button inCoupleDebitAdvice;
    private Button partnerSelfEmployed;
    private TextField ageOfPartner;

    public TextField getAgeOfPartner() {
        return ageOfPartner = new TextField(By.name("$PpyWorkPage$pClientDetails$l2$pAge"));
    }

    public Button getPartnerSelfEmployed(String label) {
        return partnerSelfEmployed=new Button(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l2$pIsSelfEmployed']/../label[.='"+label+"']"));
    }

    public Button getPartnerUkDebts(String label) {
        return partnerUkDebts=new Button(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pPartnerHasUKDebt']/../label[.='"+label+"']"));
    }

    public Button getInCoupleDebitAdvice(String label) {
        return inCoupleDebitAdvice=new Button(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l1$pReceiveAdviceAsCouple']/../label[.='"+label+"']"));
    }

    public Button getDoTheyLiveWithPartner(int index, String label) {
        return doTheyLiveWithPartner=new Button(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l"+index+"$pLiveWithPartner']/../label[.='"+label+"']"));
    }

    public Dropdown getReferredBY() {
        return referredBY=new Dropdown(By.name("$PpyWorkPage$pReferralSource"));
    }

    @Override
    public Dropdown getFinancialDifficulty() {
        return financialDifficulty=new Dropdown(By.name("$PpyWorkPage$pMainCauseOfFinancialDifficulty"));
    }

    public Button getClientLivesInSameAddress() {
        return clientLivesInSameAddress=new Button(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l2$pSameAddress']/../label[.='Yes']"));
    }

    public Button getConfirm() {
        return confirm=new Button(By.xpath("//button[.='Confirm']"));
    }

    public Checkbox getPermissionTorecordGivenBy() {
        return permissionTorecordGivenBy=new Checkbox(By.xpath("//input[@name='$PpyWorkPage$pConsent$pConsentGranted']/../label"));
    }

    public Button getDoYouHavePermissionTOShareTheDetails(String youHavePermissionTOShareTheDetails) {
        return doYouHavePermissionTOShareTheDetails=new Button(By.xpath("//input[@name='$PpyWorkPage$pConsent$pInformationShareGranted']/../label[.='"+youHavePermissionTOShareTheDetails+"']"));
    }

    public OnlineClientDetailsHelper(){}
    public Button getContinueButton() {
        return continueButton=new Button(By.xpath("//button[.='Continue']"));
    }

    public Button getAddClient() {
        return addClient=new Button(By.xpath("//button[.='Add client 2']"));
    }


    public Button getConsentForStepChangeToRecord(int index, String whereDoTheyLiveValue) {
        return consentForStepChangeToRecord=new Button(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l"+index+"$pHasGivenVulnerabilityCaptureConsent']/../label[.='"+whereDoTheyLiveValue+"']"));
    }

    public Button getConsentForStepChangeToShare(int index, String whereDoTheyLiveValue) {
        return consentForStepChangeToShare=new Button(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l"+index+"$pVulnerabilityShareConsent']/../label[.='"+whereDoTheyLiveValue+"']"));
    }

    public Dropdown getWhatTheCauseOfFinancialDifficulty() {
        return whatTheCauseOfFinancialDifficulty;
    }

    public TextField getFirstName(int index) {
        return firstName=new TextField(By.name("$PpyWorkPage$pClientDetails$l"+index+"$ppyFirstName"));
    }

    public TextField getSurname(int index) {
        return surname=new TextField(By.name("$PpyWorkPage$pClientDetails$l"+index+"$ppyLastName"));
    }

    public Button getWhereDoTheyLive(int index, String whereDoTheyLiveValue) {
        return whereDoTheyLive=new Button(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l"+index+"$pCountryOfResidence']/../label[.='"+whereDoTheyLiveValue+"']"));
    }

    public Button getDoTheyHaveAtLeastOneUKDebt(int index, String doTheyHaveAtLeastOneUKDebtValue) {
        return doTheyHaveAtLeastOneUKDebt=new Button(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l"+index+"$pHasUKDebt']/../label[.='"+doTheyHaveAtLeastOneUKDebtValue+"']"));
    }

    public Button getAreTheyCurrentlyOnAnyOfTheseInsolvencySolutions(int index, String areTheyCurrentlyOnAnyOfTheseInsolvencySolutionsValue) {
        return areTheyCurrentlyOnAnyOfTheseInsolvencySolutions=new Button(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l"+index+"$pInsolvencySolution']/../label[.='"+areTheyCurrentlyOnAnyOfTheseInsolvencySolutionsValue+"']"));
    }

    public TextField getHowOldAreThey(int index) {
        return howOldAreThey=new TextField(By.name("$PpyWorkPage$pClientDetails$l"+index+"$pAge"));
    }

    public Button getAreTheySelfEmployed(int index, String areTheySelfEmployedValue) {
        return areTheySelfEmployed=new Button(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l"+index+"$pIsSelfEmployed']/../label[.='"+areTheySelfEmployedValue+"']"));
    }

    public Button getDoTheyCurrentlyHaveAnyHealthConditions(int index, String healthConditions) {
        return doTheyCurrentlyHaveAnyHealthConditions=new Button(By.xpath("//input[@name='$PpyWorkPage$pClientDetails$l"+index+"$pRequiresAdditionalAssistance']/../label[.='"+healthConditions+"']"));
    }

    public Button getIsYourPartnerAvailableToSpeakWithUs(String isYourPartnerAvailableToSpeakWithUsValue) {
        return isYourPartnerAvailableToSpeakWithUs=new Button(By.xpath("//input[@name='$PpyWorkPage$pConsent$pOtherClientAvailable']/../label[.='"+isYourPartnerAvailableToSpeakWithUsValue+"']")) ;
    }

    public void filleClientDetails(List<Map<String, String>> clientNeedsList) {
//        switchToActiveFrame();
        for (int noOfClients = 0; noOfClients < clientNeedsList.size(); noOfClients++) {
            Map<String, String> client = clientNeedsList.get(noOfClients);
            if(noOfClients>1) {
                System.out.println("Application Cannot Add more than 2 CLients");
                break;
            }
            this.getWhereDoTheyLive(noOfClients + 1, client.get("whereDoTheyLive")).click();
            this.getDoTheyHaveAtLeastOneUKDebt(noOfClients + 1, client.get("ukDebt")).click();
            verifyOverLayDisplayed();
            enterAge(client,noOfClients + 1);
            this.getAreTheySelfEmployed(noOfClients + 1, client.get("areTheySelfEmployed")).click();
            this.getReferredBY().selectFromDropdownByText(client.get("referredBY"));
            this.getFinancialDifficulty().selectFromDropdownByText(client.get("financialDifficulty"));
            this.getDoTheyLiveWithPartner(noOfClients + 1, client.get("doTheyLiveWithPartner")).click();
            if(client.get("doTheyLiveWithPartner")!=null && client.get("doTheyLiveWithPartner").equalsIgnoreCase("Yes"))
            {
                this.getPartnerUkDebts(client.get("doTheyLiveWithPartner")).click();
                this.getInCoupleDebitAdvice(client.get("doTheyLiveWithPartner")).click();
                this.getContinueButton().click();
            }
            if(client.get("doTheyLiveWithPartner")!=null && client.get("doTheyLiveWithPartner").equalsIgnoreCase("Yes"))
            {
                this.getPartnerSelfEmployed(client.get("partnerSelfEmployed")).click();
                this.getAgeOfPartner().enterText(client.get("partnerAge"));
            }
        }
        this.getContinueButton().click();



    }

    private void addClient(int noOfClients, Map<String, String> client) {
        if(noOfClients>0)
        {
            this.getAddClient().click();
            this.getIsYourPartnerAvailableToSpeakWithUs(client.get("isYourPartnerAvailableToSpeakWithUs")).click();
            if(client.get("isYourPartnerAvailableToSpeakWithUs").equalsIgnoreCase("No"))
            {
                this.getDoYouHavePermissionTOShareTheDetails(client.get("doYouHavePermissionTOShareTheDetails")).click();
            }
            this.getPermissionTorecordGivenBy().click();
            this.getConfirm().click();
            this.getClientLivesInSameAddress().click();
        }
        else
        {
            this.getWhereDoTheyLive(noOfClients + 1, client.get("whereDoTheyLive")).click();
        }
    }

    private void fillHealthConditionDetails(Map<String, String> client,int noOfClients) {
        if(client.get("healthCondition").equalsIgnoreCase("Yes"))
        {
            this.getConsentForStepChangeToRecord(noOfClients + 1, client.get("consentForStepChangeToRecord")).click();
            if(client.get("consentForStepChangeToRecord").equalsIgnoreCase("Yes"))
            {
                this.getConsentForStepChangeToShare(noOfClients + 1, client.get("consentForStepChangeToShare")).click();

            }

        }
    }

    private void enterAge(Map<String, String> client,int index) {
        this.getHowOldAreThey(index).enterText(client.get("age"));
        this.getHowOldAreThey(index).enter();
//        for (int i = 0; i < getBrowser().getMaxAttempts(); i++) {
//            try {
//                this.getHowOldAreThey(index).enterText(client.get("age"));
//            } catch (Exception e) {
//            }
//        }
    }

}
