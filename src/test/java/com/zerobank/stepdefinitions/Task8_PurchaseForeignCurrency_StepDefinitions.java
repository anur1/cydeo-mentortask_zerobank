package com.zerobank.stepdefinitions;

import com.zerobank.pages.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


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
        task8_purchaseForeignCurrencyPage.we_tab_of_PurchaseForeignCurrency.click();
    }
    @Then("user sees following currencies listed in dropdown box")
    public void user_sees_following_currencies_listed_in_dropdown_box(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

        Thread.sleep(3000);

        Select dropDownMenu = new Select(task8_purchaseForeignCurrencyPage.we_dropDownMenu_of_currency);

        List<WebElement> optionsList = dropDownMenu.getOptions();

        int size = optionsList.size();
        for(int i =0; i<size ; i++){
            String option = optionsList.get(i).getText();
            System.out.println(option);
        }

        List<String> testData =
        for(int i =1; i<size ; i++){
            String option = optionsList.get(i).getText();
            assertTrue(dataTable.cel);
        }

        Thread.sleep(1000);



    }




}//endstepdefinition


