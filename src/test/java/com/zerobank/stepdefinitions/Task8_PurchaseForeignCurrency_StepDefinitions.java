package com.zerobank.stepdefinitions;

import com.zerobank.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;

import static org.junit.Assert.assertEquals;


public class Task8_PurchaseForeignCurrency_StepDefinitions {

    Task1_LoginPage task1LoginPage = new Task1_LoginPage();
    Task2_AccountSummaryPage task2_accountSummaryPage = new Task2_AccountSummaryPage();
    Task3_AccountActivityPage task3_accountActivityPage = new Task3_AccountActivityPage();
    Task4_PayBillsPage task4_payBillsPage = new Task4_PayBillsPage();
    Task5_AccountSummaryPage task5_accountSummaryPage = new Task5_AccountSummaryPage();

    Task6_AccountActivityPage task6_accountActivityPage = new Task6_AccountActivityPage();

    Task7_AddNewPayeePage task7_addNewPayeePage = new Task7_AddNewPayeePage();
    //add new payee -->
    Task8_PurchaseForeignCurrencyPage task8_purchaseForeignCurrencyPage = new Task8_PurchaseForeignCurrencyPage();


    //code comes here

    @When("user clicks on Purchase Foreign Currency tab")
    public void user_clicks_on_purchase_foreign_currency_tab() {

    }
    @Then("user sees following currencies listed in dropdown box")
    public void user_sees_following_currencies_listed_in_dropdown_box(io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }




}//endstepdefinition


