package com.zerobank.stepdefinitions;

import com.zerobank.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Task6_AccountActivity_StepDefinitions {

    Task1_LoginPage task1LoginPage = new Task1_LoginPage();
    Task2_AccountSummaryPage task2_accountSummaryPage = new Task2_AccountSummaryPage();
    Task3_AccountActivityPage task3_accountActivityPage = new Task3_AccountActivityPage();
    Task4_PayBillsPage task4_payBillsPage = new Task4_PayBillsPage();
    Task5_AccountSummaryPage task5_accountSummaryPage = new Task5_AccountSummaryPage();

    Task6_AccountActivityPage task6_accountActivityPage = new Task6_AccountActivityPage();

    //account activity -->
    //Task6a
    @When("user clicks on Account Activity link")
    public void user_clicks_on_account_activity_link() {
        task6_accountActivityPage.accountActivityLink.click();
    }
    @When("user clicks on Find Transactions tab")
    public void user_clicks_on_find_transactions_tab() {
        task6_accountActivityPage.findTransactionsTab.click();
    }


    @When("the user enters date range from “{string}” to “{string}”")
    public void the_user_enters_date_range_from_to(String string, String string2) throws InterruptedException {
        task6_accountActivityPage.fromDateInputBox.sendKeys(string);
        task6_accountActivityPage.toDateInputBox.sendKeys(string2);
        Thread.sleep(3000);

    }


    @And("clicks on find")
    public void clicksOnFind() {
        task6_accountActivityPage.findButton.click();
    }

    @Then("verify that user sees the date in range “{string}” to “{string}”")
    public void verify_that_user_sees_the_date_in_range_to(String string, String string2) throws InterruptedException {

        Thread.sleep(4000);
        System.out.println("--");


        List<WebElement> allRows = task6_accountActivityPage.rows;
        int rowsCount = task6_accountActivityPage.rows.size();
        System.out.println("rowsCount = " + rowsCount);
        WebElement element1  = task6_accountActivityPage.rows.get(1);
        System.out.println(element1.getText());

        System.out.println("-xxx-");
        WebElement rowsa = task6_accountActivityPage.row1_1;
        System.out.println(rowsa.getText());
        System.out.println("--");


        System.out.println(string);
        System.out.println(string2);

        int numericDate1 = Integer.parseInt(string.replace("-", ""));
        int numericDate2 =Integer.parseInt(string2.replace("-", ""));

        assertTrue(numericDate2 >= numericDate1);




    }





    @Then("verify that dates are sorted by most recent date")
    public void verify_that_dates_are_sorted_by_most_recent_date() {



    }



}//endstepdefinition