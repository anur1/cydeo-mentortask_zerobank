package com.zerobank.stepdefinitions;

import com.zerobank.pages.Task1_LoginPage;
import com.zerobank.pages.Task2_AccountSummaryPage;
import com.zerobank.pages.Task3_AccountActivityPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;

//Account Activity
//Account Activity page should have the title Zero – Account activity.
//In the Account drop down default option should be Savings. Account drop down
//should have the following options: Savings, Checking, Loan, Credit Card, Brokerage.
//Transactions table should have column names Date, Description, Deposit,
//Withdrawal.


public class Task3_AccountActivity_StepDefinitions {

    Task1_LoginPage task1LoginPage = new Task1_LoginPage();
    Task2_AccountSummaryPage task2_accountSummaryPage = new Task2_AccountSummaryPage();
    Task3_AccountActivityPage task3_accountActivityPage = new Task3_AccountActivityPage();

    //enter into Account Activity page
    //Check if captions are correct

    @And("user clicks on {string} link_two")
    public void userClicksOnLink_two(String string) {
        task3_accountActivityPage.accountActivityLink.click();
    }

    @Then("user sees {string} tab")
    public void user_sees_tab(String string) {
       assertEquals(string, task3_accountActivityPage.showTransactionsTab.getText());
    }



    @Then("Account dropdown menu should contain following parts")
    public void account_dropdown_menu_should_contain_following_parts() {

        Select selectDropDownElement = new Select(task3_accountActivityPage.accountDropDown);
        List<WebElement> allDropDownOptions = selectDropDownElement.getOptions();
        for (WebElement eachOption : allDropDownOptions)
        {
            System.out.println(eachOption.getText());

        }

    }

}
