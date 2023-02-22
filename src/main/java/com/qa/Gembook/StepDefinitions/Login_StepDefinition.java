package com.qa.Gembook.StepDefinitions;

import com.qa.Gembook.Utils.LoginUtility;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_StepDefinition {

    @When("^User clicks on signIn Button$")
        public void SignIn(){
            LoginUtility.clickOnSignIn();
        }

    @Then("User enters the {string}")
    public void userEntersThe(String url) {
        LoginUtility.EnterUserName();
    }

    @When("URL is launched")
    public void urlIsLaunched() {
        LoginUtility.launchUrl();
    }
}
