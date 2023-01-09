package com.zerobank.stepdefinitions;

import com.zerobank.pages.Task1_LoginPage;
import com.zerobank.pages.Task2_AccountSummaryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

//Account summary
//Account summary page should have the title Zero – Account summary. Account
//summary page should have to following account types: Cash Accounts, Investment
//Accounts, Credit Accounts, Loan Accounts. Credit Accounts table must have columns
//Account, Credit Card and Balance.


public class Task2_AccountSummary_StepDefinitions {

    Task1_LoginPage task1LoginPage = new Task1_LoginPage();
    Task2_AccountSummaryPage accountSummaryPage = new Task2_AccountSummaryPage();

    //enter into Account Summary page
    //Check if captions are correct


    @When("user clicks on More Services button under Online Banking")
    public void user_clicks_on_more_services_button_under_online_banking() {
        accountSummaryPage.moreServicesButton.click();
    }

    @When("user clicks on {string} link")
    public void user_clicks_on_link(String string) {
        accountSummaryPage.accountSummaryText.click();
    }

    @Then("page displays {string},  {string}, {string}, {string}")
    public void page_displays(String string, String string2, String string3, String string4) {
        assertEquals(string, accountSummaryPage.cashAccoutsText.getText());
        assertEquals(string2, accountSummaryPage.investmentAccoutsText.getText());
        assertEquals(string3, accountSummaryPage.creditAccountsText.getText());
        assertEquals(string4, accountSummaryPage.loanAccountsText.getText());
    }

    @Then("table displays columns {string}, {string}, {string}")
    public void table_displays_columns(String string, String string2, String string3) {
        assertEquals(string, accountSummaryPage.accountColumnText.getText());
        assertEquals(string2, accountSummaryPage.creditCardColumnText.getText());
        assertEquals(string3, accountSummaryPage.balanceColumnText.getText());


    }


}
