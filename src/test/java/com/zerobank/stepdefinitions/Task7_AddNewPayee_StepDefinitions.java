package com.zerobank.stepdefinitions;

import com.zerobank.pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class Task7_AddNewPayee_StepDefinitions {

    Task1_LoginPage task1LoginPage = new Task1_LoginPage();
    Task2_AccountSummaryPage task2_accountSummaryPage = new Task2_AccountSummaryPage();
    Task3_AccountActivityPage task3_accountActivityPage = new Task3_AccountActivityPage();
    Task4_PayBillsPage task4_payBillsPage = new Task4_PayBillsPage();
    Task5_AccountSummaryPage task5_accountSummaryPage = new Task5_AccountSummaryPage();

    Task6_AccountActivityPage task6_accountActivityPage = new Task6_AccountActivityPage();

    Task7_AddNewPayeePage task7_addNewPayeePage = new Task7_AddNewPayeePage();
    //add new payee -->



    @When("user clicks on Pay Bills link")
    public void user_clicks_on_pay_bills_link() {
        task7_addNewPayeePage.payBillsLink.click();
    }
    @When("user sees Pay Bills page")
    public void user_sees_pay_bills_page() throws InterruptedException {
        Thread.sleep(2000);
        assertEquals("Pay Bills", task7_addNewPayeePage.payBillsTabText.getText());
    }
    @When("user clicks on Add New Payee tab")
    public void user_clicks_on_add_new_payee_tab() {
        task7_addNewPayeePage.addNewPayeeTab.click();
    }
    @When("user adds following new payee as information")
    public void user_adds_following_new_payee_as_information(Map<String, String> givenTableValues) throws InterruptedException {
       task7_addNewPayeePage.newPayeeNameBox.sendKeys(givenTableValues.get("Payee Name"));
       task7_addNewPayeePage.newPayeeAddressBox.sendKeys(givenTableValues.get("Payee Address"));

       task7_addNewPayeePage.newPayeeAccountBox.sendKeys(givenTableValues.get("Account"));
        task7_addNewPayeePage.newPayeeDetailsBox.sendKeys(givenTableValues.get("Payee details"));
        task7_addNewPayeePage.addButton.click();
        Thread.sleep(3000);
    }
    @Then("user sees following {string} on the screen")
    public void user_sees_following_on_the_screen(String string) throws InterruptedException {
        Thread.sleep(1000);

        System.out.println("task7_addNewPayeePage.message.getText() = " + task7_addNewPayeePage.message.getText());
        String actualMessage = task7_addNewPayeePage.message.getText();
        Thread.sleep(1000);

        assertEquals(string, actualMessage);
        Thread.sleep(1000);



    }









}//endstepdefinition


