package com.zerobank.stepdefinitions;

import com.zerobank.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

        Thread.sleep(2000);
        System.out.println("--");


        //get size of table   //print elements of table
        List<WebElement> allRows = task6_accountActivityPage.rows;
        int rowsCount = task6_accountActivityPage.rows.size();
        System.out.println("rowsCount = " + rowsCount);
        WebElement element1 = task6_accountActivityPage.rows.get(1);
        System.out.println(element1.getText());


        //get rows of date column
        System.out.println("-xxx-");
        WebElement rows1_1 = task6_accountActivityPage.row1_1;
        WebElement rows2_1 = task6_accountActivityPage.row2_1;
        WebElement rows3_1 = task6_accountActivityPage.row3_1;
        //get what cell contains
        String stringRow1 = rows1_1.getText();
        String stringRow2 = rows2_1.getText();
        String stringRow3 = rows3_1.getText();

        //print what cell contains
        System.out.println(stringRow1);
        System.out.println(stringRow2);
        System.out.println(stringRow3);
        System.out.println("-xxx-");


        //compare if second date is bigger than first date entered
        System.out.println(string);
        System.out.println(string2);
        int numericDate1 = Integer.parseInt(string.replace("-", ""));
        int numericDate2 = Integer.parseInt(string2.replace("-", ""));

        assertTrue(numericDate2 >= numericDate1);

        // compare if all dates are bigger than first date entered
        int numericRow1_1 = Integer.parseInt(stringRow1.replace("-", ""));
        int numericRow2_1 = Integer.parseInt(stringRow2.replace("-", ""));
        int numericRow3_1 = Integer.parseInt(stringRow3.replace("-", ""));
        System.out.println(numericRow1_1);
        System.out.println(numericRow2_1);
        System.out.println(numericRow3_1);

        assertTrue(numericDate1 <= numericRow1_1);
        assertTrue(numericDate1 <= numericRow2_1);
        assertTrue(numericDate1 <= numericRow3_1);


    }


    @Then("verify that dates are sorted by most recent date")
    public void verify_that_dates_are_sorted_by_most_recent_date() {

        //get rows of date column
        System.out.println("-xxx-");
        WebElement rows1_1 = task6_accountActivityPage.row1_1;
        WebElement rows2_1 = task6_accountActivityPage.row2_1;
        WebElement rows3_1 = task6_accountActivityPage.row3_1;
        //get what cell contains
        String stringRow1 = rows1_1.getText();
        String stringRow2 = rows2_1.getText();
        String stringRow3 = rows3_1.getText();

        // compare if dates are sorted
        int numericRow1_1 = Integer.parseInt(stringRow1.replace("-", ""));
        int numericRow2_1 = Integer.parseInt(stringRow2.replace("-", ""));
        int numericRow3_1 = Integer.parseInt(stringRow3.replace("-", ""));
        System.out.println(numericRow1_1);
        System.out.println(numericRow2_1);
        System.out.println(numericRow3_1);

        assertTrue(numericRow2_1 <= numericRow1_1 && numericRow3_1 <= numericRow2_1);


    }


    //task6-b

    @When("user enters {string} string to description input box")
    public void userEntersStringToDescriptionInputBox(String string) throws InterruptedException {
        Thread.sleep(3000);
        task6_accountActivityPage.descriptionInputBox.clear();
        String UpperCaseString = string.toUpperCase();
        task6_accountActivityPage.descriptionInputBox.sendKeys(UpperCaseString);

        //note: conversion from small "i" to big "İ" makes trouble
    }

    @Then("user sees descriptions containing {string} string on the table")
    public void userSeesDescriptionsContainingStringOnTheTable(String string) throws InterruptedException {
        //get size of table   //print elements of table
        Thread.sleep(3000);

        WebElement text1 = task6_accountActivityPage.row1_2_Text;
        // WebElement text2 = task6_accountActivityPage.row2_2_Text;        Thread.sleep(3000);

        System.out.println(text1.getText());
        //System.out.println(text2.getText());

        assertTrue(text1.getText().contains(string));
        //assertTrue(text2.getText().contains(string));


        Thread.sleep(3000);

    }


    //task6-d


    @Then("sees at least one Deposit result on the table")
    public void sees_at_least_one_deposit_result_on_the_table() throws InterruptedException {
        Thread.sleep(2000);
        WebElement deposit1 = task6_accountActivityPage.row1_3;
        WebElement deposit2 = task6_accountActivityPage.row2_3;
        WebElement deposit3 = task6_accountActivityPage.row3_3;

        System.out.println(deposit1.getText());
        System.out.println(deposit2.getText());
        System.out.println(deposit3.getText());

        assertTrue(deposit1.getText().isEmpty() || deposit2.getText().isEmpty() || deposit3.getText().isEmpty());


    }

    @Then("sees at least one Withdrawal result on the table")
    public void sees_at_least_one_withdrawal_result_on_the_table() throws InterruptedException {
        Thread.sleep(3000);
        WebElement withdrawal1 = task6_accountActivityPage.row1_4;
        WebElement withdrawal2 = task6_accountActivityPage.row2_4;
        WebElement withdrawal3 = task6_accountActivityPage.row3_4;

        System.out.println(withdrawal1.getText());
        System.out.println(withdrawal2.getText());
        System.out.println(withdrawal3.getText());

        assertTrue(withdrawal1.getText().isEmpty() || withdrawal2.getText().isEmpty() || withdrawal3.getText().isEmpty());

    }

    @When("user selects “Deposit” from Type dropdown")
    public void user_selects_deposit_from_type_dropdown() {

        Select dropDownMenu = new Select(task6_accountActivityPage.dropDownElement_Type);

        dropDownMenu.selectByVisibleText("Deposit");


    }

    @Then("user sees no Withdrawal result on the table")
    public void sees_no_withdrawal_result_on_the_table() throws InterruptedException {


    }

    @Then("sees at least one Deposit result on the table_two")
    public void seesAtLeastOneDepositResultOnTheTable_two() throws InterruptedException {

        Thread.sleep(1000);

        WebElement deposit1 = task6_accountActivityPage.row1_3;
        WebElement deposit2 = task6_accountActivityPage.row2_3;

        System.out.println(deposit1.getText());
        System.out.println(deposit2.getText());

        assertTrue(!deposit1.getText().isEmpty() || !deposit2.getText().isEmpty());


    }


    @But("sees no Withdrawal result on the table_two")
    public void seesNoWithdrawalResultOnTheTable_two() {
        WebElement withdrawal1 = task6_accountActivityPage.row1_4;
        WebElement withdrawal2 = task6_accountActivityPage.row2_4;

        System.out.println("xxxx");
        System.out.println(withdrawal1.getText());
        System.out.println(withdrawal1.getText());

        assertTrue(withdrawal1.getText().isEmpty() && withdrawal2.getText().isEmpty());


    }


    @When("user selects Withdrawal from Type dropdown")
    public void userSelectsWithdrawalFromTypeDropdown() {
        Select dropDownMenu = new Select(task6_accountActivityPage.dropDownElement_Type);

        dropDownMenu.selectByVisibleText("Withdrawal");


    }


    @Then("sees at least one Withdrawal result on the table_two")
    public void seesAtLeastOneWithdrawalResultOnTheTable_two() throws InterruptedException {
        Thread.sleep(1000);


        WebElement withdrawal1 = task6_accountActivityPage.row1_4;

        System.out.println("xxxxyyyyy");
        System.out.println(withdrawal1.getText());

        assertTrue(!withdrawal1.getText().isEmpty());


    }


    @Then("sees no Deposit result on the table")
    public void sees_no_deposit_result_on_the_table() throws InterruptedException {
        Thread.sleep(1000);

        WebElement deposit1 = task6_accountActivityPage.row1_3;

        System.out.println(deposit1.getText());

        assertTrue(deposit1.getText().isEmpty());

    }

}//endstepdefinition


