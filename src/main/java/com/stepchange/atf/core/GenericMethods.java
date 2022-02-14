package com.stepchange.atf.core;

import com.stepchange.atf.controls.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.logging.Level;


public class GenericMethods extends BaseTest {

    protected String userID; // Contains the userID
    private static String PEGA_VERSION;
    private static boolean is72;


    private String caseID;


    /**
     * Logs in to pega 7.2 system
     *
     * @param userID   The PID to log in with
     * @param password The password
     */

    public void login(String userID, String password) {
        WebElement userIDField = getBrowser().getElementWhenReady(By.id("txtUserID"));
        userIDField.sendKeys(userID);
        WebElement passwordField = getBrowser().getElementWhenReady(By.id("txtPassword"));
        passwordField.sendKeys(password);
        WebElement submitButton = getBrowser().getElementWhenReady(By.id("loginButton"));
        submitButton.click();
        getBrowser().getLogWriter().log(" Logging in as user" + userID, Level.INFO);
        this.userID = userID;
    }


    public void logout() {
        getBrowser().leaveIFrame();
        while (true) {
            try {
                // logout();
                getBrowser().waitForElementToBeClickable(By.cssSelector("div[class*= logOff']"));
                getBrowser().getElementWhenReady(By.cssSelector("div[class* ='operator-menu with-icon']")).click();
                // sleep(getTimeout() /10) ;
                getBrowser().sleep(2000);
                getBrowser().getDriver().findElement(By.cssSelector("td[data-click*='logOff'")).click();
                getBrowser().sleep(getBrowser().getTimeout() / 5);
                getBrowser().getLogWriter().log(" Logging off" + userID, Level.INFO);
                break;
            } catch (Exception e) {
                e.printStackTrace(); // Just catch the exception
            }
        }

        while (true) {

            try {
                loadEnvironment();
                getBrowser().sleep(getBrowser().getTimeout() / 10);
                if (!getBrowser().getDriver().findElements(By.id("txtUserID")).isEmpty()) {
                    break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * Clicks the submit button. The submit button is selected by looking for the 'doFormSubmit' action which is common to submit button regardless of their text or class
     */

    public void clickSubmitButton() {
        getBrowser().scrollDown();
        int j = 0;
        while (j < getBrowser().getMaxAttempts()) {
            try {
                (new WebDriverWait(getBrowser().getDriver(), getBrowser().getTimeout())).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[.='Continue']")));
                break;
            } catch (Exception e) {
                if (e.getMessage().contains("Element is no longer valid")) {
                    j++;
                    getBrowser().sleep(getBrowser().getTimeout() / 10);
                }
            }
        }
        boolean buttonClicked = false;
        int iterationCounter = 0;
        while (!buttonClicked && ++iterationCounter < getBrowser().getMaxAttempts()) {
            try {
                getBrowser().getElementWhenReady(By.xpath("//*[.='Continue']")).submit();
                buttonClicked = true;
            } catch (WebDriverException e) {
                checkNotClickable(e);

            }
        }
    }


    /**
     * Switches to a different tab
     *
     * @param newTab Tab to switch to
     */

    public void switchTab(String newTab) {
        getBrowser().getElementWhenReady(By.xpath("//*[tabtitle='" + newTab + "']")).click();
    }


    public static String getPegaVersion() {
        return PEGA_VERSION;
    }

    public static void setPegaVersion(String pegaVersion) {
        PEGA_VERSION = pegaVersion;
    }


    public GenericMethods() {

    }


    public String getCaseID() {
        return caseID;
    }

    public void setCaseID(String caseID) {
        this.caseID = caseID;
    }


    public String returnCaseID(String prefix) {

        this.getBrowser().leaveIFrame();
        String tempCaseID = null;
        Iterator var3 = this.getBrowser().getDriver().findElements(By.tagName("label")).iterator();

        while (var3.hasNext()) {
            WebElement it = (WebElement) var3.next();
            if (it.getText().contains(prefix)) {
                if (tempCaseID == null) {
                    tempCaseID = it.getText();
                    this.getBrowser().getLogWriter().log(tempCaseID, Level.FINEST);
                    break;
                }
                this.getBrowser().getLogWriter().log("Multiple labels found", Level.INFO);
            }
        }
        this.getBrowser().switchToActiveIFrame();
        return tempCaseID;
    }


    public void clickcloseButton() {
        this.getBrowser().switchToActiveIFrame();
        int iterationCounter = 0;

        while (iterationCounter < getBrowser().getMaxAttempts()) {
            try {
                this.getBrowser().waitForElementToBeClickable(By.cssSelector("button[class*='ButtonToolbarRicon pzhc'][title*='Close this tab']"));
                this.getBrowser().getElementWhenReady(By.cssSelector("button[class*='ButtonToolbarRicon pzhc'][title*='Close this tab']"));
                break;
            } catch (Exception var3) {
                this.getBrowser().getLogWriter().log(var3.getMessage(), Level.FINEST);
                ++iterationCounter;
                this.getBrowser().sleep(20);
            }
        }

    }


    public void clickRefreshButton() {
        this.getBrowser().switchToActiveIFrame();
        int iterationCounter = 0;

        while (iterationCounter < getBrowser().getMaxAttempts()) {
            try {
                this.getBrowser().waitForElementToBeClickable(By.cssSelector("button[class*='ButtonToolbarMicon pzhc'][title*='Refresh this screen']"));
                this.getBrowser().getElementWhenReady(By.cssSelector("button[class*='ButtonToolbarRMicon pzhc'][title*='Refresh this screen']"));
                break;
            } catch (Exception var3) {
                this.getBrowser().getLogWriter().log(var3.getMessage(), Level.FINEST);
                ++iterationCounter;
                getBrowser().sleep(20);
            }
        }

    }


    public void clickSaveButton() {

        Button SaveButton = new Button(By.cssSelector("button[class*='ButtonToolbarMicon pzhc'][title*='Save changes']"));
        SaveButton.click();
    }


    public void clickPrintButton() {
        this.getBrowser().switchToActiveIFrame();
        Button print = new Button(By.cssSelector("button[data-click*='PrintCaseInfoView']"));
        print.click();
        getBrowser().sleep(this.getBrowser().getTimeout());
        this.getBrowser().leaveIFrame();


    }
    /**
     * Clicks the submit button. The submit button is selected by looking for the 'doFormSubmit' action which is common to submit button regardless of their text or class
     */

    public void clickContinueButton() {
        getBrowser().scrollDown();
        int j = 0;
        while (j < getBrowser().getMaxAttempts()) {
            try {
                (new WebDriverWait(getBrowser().getDriver(), getBrowser().getTimeout())).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[.='Continue']")));
                break;
            } catch (Exception e) {
                if (e.getMessage().contains("Element is no longer valid")) {
                    j++;
                    getBrowser().sleep(getBrowser().getTimeout() / 10);
                }
            }
        }
        boolean buttonClicked = false;
        int iterationCounter = 0;
        while (!buttonClicked && ++iterationCounter < getBrowser().getMaxAttempts()) {
            try {
            
                getBrowser().getElementWhenReady(By.xpath("//*[.='Continue']")).click();
                buttonClicked = true;
            } catch (WebDriverException e) {
                checkNotClickable(e);

            }
        }
        
        

}
  
  
}