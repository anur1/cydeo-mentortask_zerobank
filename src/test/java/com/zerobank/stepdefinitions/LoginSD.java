package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityNavigationPages;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginSD {
    AccountActivityNavigationPages navigationPages = new AccountActivityNavigationPages();



// With valid credentials
    @Given("the user is logged in")
    public void the_user_is_logged_in(){
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        navigationPages.username.sendKeys(ConfigurationReader.getProperty("username"));
        navigationPages.password.sendKeys(ConfigurationReader.getProperty("password"));
        navigationPages.signIn.click();
        Driver.getDriver().navigate().back();
    }


// With invalid credentials


    @When("the user on the login page")
    public void theUserOnTheLoginPage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @And("the user type username {string}")
    public void theUserTypeUsername(String username) {
        navigationPages.username.sendKeys(username);
    }

    @And("the user type password {string}")
    public void theUserTypePassword(String password) {
        navigationPages.password.sendKeys(password);
    }

    @When("the user click the sign in button")
    public void the_user_click_the_sign_in_button() {
        navigationPages.signIn.click();
    }

}


