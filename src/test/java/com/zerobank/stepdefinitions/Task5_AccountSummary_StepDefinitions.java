package com.zerobank.stepdefinitions;

import com.zerobank.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Task5_AccountSummary_StepDefinitions {

    Task1_LoginPage task1LoginPage = new Task1_LoginPage();
    Task2_AccountSummaryPage task2_accountSummaryPage = new Task2_AccountSummaryPage();
    Task3_AccountActivityPage task3_accountActivityPage = new Task3_AccountActivityPage();
    Task4_PayBillsPage task4_payBillsPage = new Task4_PayBillsPage();
    Task5_AccountSummaryPage task5_accountSummaryPage = new Task5_AccountSummaryPage();


    //account summary -->
    @When("user clicks on Account Summary link")
    public void user_clicks_on_account_summary_link() {
        task5_accountSummaryPage.accountSummaryLink.click();
    }
    @When("user clicks on Savings link")
    public void user_clicks_on_savings_link() {
        task5_accountSummaryPage.accountSummaryPageSavingLink.click();
    }
    @Then("verify that user sees Account Activity tab")
    public void verify_that_user_sees_account_activity_tab() throws InterruptedException {
        String expectedText = "Account Activity";
        String actualText = task5_accountSummaryPage.SavingsPageAccountActivityTitle.getText();
        assertEquals(expectedText, actualText);
        Thread.sleep(3000);
    }
    @Then("verify that user sees Savings selected on Account Dropdown")
    public void verify_that_user_sees_savings_selected_on_account_dropdown() throws InterruptedException {

        Select dropDownMenu = new Select(task5_accountSummaryPage.dropdownElement);

        String expectedText = "Savings";
        String actualText = dropDownMenu.getFirstSelectedOption().getText();

        System.out.println(actualText);
        assertEquals(expectedText, actualText);
        Thread.sleep(3000);

    }

//task5-b - brokerage
@When("user clicks on Brokerage link")
public void user_clicks_on_brokerage_link() {
    task5_accountSummaryPage.brokerageLink.click();
}

    @Then("verify that user sees Brokerage selected on Account Dropdown")
    public void verify_that_user_sees_brokerage_selected_on_account_dropdown() throws InterruptedException {

        Select dropDownMenu = new Select(task5_accountSummaryPage.dropdownElement);

        String expectedText = "Brokerage";
        String actualText = dropDownMenu.getFirstSelectedOption().getText();

        System.out.println(actualText);
        assertEquals(expectedText, actualText);
        Thread.sleep(3000);

    }

    //Task5-c Checking

    @When("user clicks on Checking link")
    public void user_clicks_on_checking_link() {
        task5_accountSummaryPage.checkingLink.click();
    }

    @Then("verify that user sees Checking selected on Account Dropdown")
    public void verify_that_user_sees_checking_selected_on_account_dropdown() throws InterruptedException {

        Select dropDownMenu = new Select(task5_accountSummaryPage.dropdownElement);

        String expectedText = "Checking";
        String actualText = dropDownMenu.getFirstSelectedOption().getText();

        System.out.println(actualText);
        assertEquals(expectedText, actualText);
        Thread.sleep(3000);

    }


    //Task5-d Checking

    @When("user clicks on Credit Card link")
    public void user_clicks_on_creditCard_link() {
        task5_accountSummaryPage.creditCardLink.click();
    }

    @Then("verify that user sees Credit Card selected on Account Dropdown")
    public void verify_that_user_sees_creditCard_selected_on_account_dropdown() throws InterruptedException {

        Select dropDownMenu = new Select(task5_accountSummaryPage.dropdownElement);

        String expectedText = "Credit Card";
        String actualText = dropDownMenu.getFirstSelectedOption().getText();

        System.out.println(actualText);
        assertEquals(expectedText, actualText);
        Thread.sleep(3000);

    }



    //Task5-e Checking

    @When("user clicks on Loan link")
    public void user_clicks_on_loan_link() {
        task5_accountSummaryPage.loanLink.click();
    }

    @Then("verify that user sees Loan selected on Account Dropdown")
    public void verify_that_user_sees_loan_selected_on_account_dropdown() throws InterruptedException {

        Select dropDownMenu = new Select(task5_accountSummaryPage.dropdownElement);

        String expectedText = "Loan";
        String actualText = dropDownMenu.getFirstSelectedOption().getText();

        System.out.println(actualText);
        assertEquals(expectedText, actualText);
        Thread.sleep(3000);

    }









}//endstepdefinition
