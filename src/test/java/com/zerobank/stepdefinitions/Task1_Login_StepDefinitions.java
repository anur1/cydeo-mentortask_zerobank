package com.zerobank.stepdefinitions;

import com.zerobank.pages.Task1_LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class Task1_Login_StepDefinitions {

    Task1_LoginPage task1LoginPage = new Task1_LoginPage();


    //positive login test
    //use valid credentials   @LoginFunction
    @Given("user logs in his-her own account")
    public void user_logs_in_his_her_own_account() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        task1LoginPage.usernameBox.sendKeys(ConfigurationReader.getProperty("username"));
        task1LoginPage.passwordBox.sendKeys(ConfigurationReader.getProperty("password"));
        task1LoginPage.signinButton.click();
        Driver.getDriver().navigate().back();
    }


    //negative login test
    //use invalid credentials   @LoginFunction
    @When("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String string) {
        task1LoginPage.usernameBox.sendKeys(string);
    }
    @When("user types password {string}")
    public void user_types_password(String string) {
        task1LoginPage.passwordBox.sendKeys(string);
    }
    @When("user clicks on the sign in button")
    public void user_clicks_on_the_sign_in_button() throws InterruptedException {
        task1LoginPage.signinButton.click();
        Thread.sleep(1000);
    }
    @Then("verify that {string} is displayed")
    public void verify_that_is_displayed(String string)  {

        String expectedErrorMessageText = string;
        String actualErrorMessageText = task1LoginPage.errorMessageText.getText();
        assertEquals(expectedErrorMessageText, actualErrorMessageText);
    }


}
