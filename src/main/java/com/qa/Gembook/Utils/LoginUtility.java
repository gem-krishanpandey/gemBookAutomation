package com.qa.Gembook.Utils;

import com.gemini.generic.reporting.GemTestReporter;
import com.gemini.generic.reporting.STATUS;
import com.qa.Gembook.Locators.Locator;
import org.openqa.selenium.By;

import static com.gemini.generic.ui.utils.DriverAction.*;

public class LoginUtility {

    public static void launchUrl() {
        String expectedUrl = "https://gembook.geminisolutions.com/";
        String actualUrl = getCurrentURL();
        if (actualUrl.equalsIgnoreCase(expectedUrl)){
            System.out.println("Url matched");
        }
        else {
            System.out.println("Wrong url");
        }
    }

    public static void clickOnSignIn() {
        if (isExist(Locator.signin)){
            click(Locator.signin);
            waitSec(2);
            GemTestReporter.addTestStep("User clicks on sign in button","Successfully clicked on sign in button", STATUS.PASS,takeSnapShot());
        }else {
            GemTestReporter.addTestStep("User clicks on sign in button","Unable to click on sign in button", STATUS.FAIL,takeSnapShot());
        }
    }

    public static void EnterUserName() {
        if (isExist(Locator.userNameField)){
            GemTestReporter.addTestStep("User clicks on input field to input user name","Sucessfully clicked on input field ",STATUS.PASS,takeSnapShot());
        }else {
            GemTestReporter.addTestStep("User clicks on input field to input user name","Sucessfully clicked on input field ",STATUS.PASS,takeSnapShot());
        }
        typeText(Locator.userNameField,"krishan.pandey@geminisolutions.com");
        click(Locator.nextButton);
    }
}
