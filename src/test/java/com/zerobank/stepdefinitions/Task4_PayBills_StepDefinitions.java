package com.zerobank.stepdefinitions;

import com.zerobank.pages.Task1_LoginPage;
import com.zerobank.pages.Task2_AccountSummaryPage;
import com.zerobank.pages.Task3_AccountActivityPage;
import com.zerobank.pages.Task4_PayBillsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;




public class Task4_PayBills_StepDefinitions {

    Task1_LoginPage task1LoginPage = new Task1_LoginPage();
    Task2_AccountSummaryPage task2_accountSummaryPage = new Task2_AccountSummaryPage();
    Task3_AccountActivityPage task3_accountActivityPage = new Task3_AccountActivityPage();
    Task4_PayBillsPage task4_payBillsPage = new Task4_PayBillsPage();


    //enter into Pay Bills page
    //click
    @And("user clicks on {string} link_three")
    public void userClicksOnLink_three(String string) {
        task4_payBillsPage.payBillsLink.click();
    }




    @And("user enters {string} to amount and {string} to date inputbox")
    public void userEntersToAmountAndToDateInputbox(String string, String string2) throws InterruptedException {
        task4_payBillsPage.amountInputBox.sendKeys(string);
        task4_payBillsPage.dateInputBox.sendKeys(string2);

        Thread.sleep(3000);
    }

    @And("user clicks on Pay button")
    public void userClicksOnPayButton() {
        task4_payBillsPage.payButton.click();
    }

    @Then("user sees {string} as success message")
    public void userSeesAsSuccessMessage(String string) {
        assertEquals(string, task4_payBillsPage.successfulPaymentMessageText.getText());

    }

    @And("user do not enter anything to amount and date inputbox")
    public void userDoNotEnterAnythingToAmountAndDateInputbox() {

    }


    @Then("user sees {string} as empty input box message")
    public void userSeesAsEmptyInputBoxMessage(String string) {
        String actualResult = task4_payBillsPage.amountInputBox.getAttribute("validationMessage");

        assertEquals(string, actualResult);

    }
}//endstepdefinition
