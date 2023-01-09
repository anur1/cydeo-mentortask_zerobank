package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityNavigationPages;
import com.zerobank.pages.AddNewPayeePages;
import com.zerobank.pages.PurchaseForeignCurrencyPage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AccountActivityNavigationSD {
    AccountActivityNavigationPages navigationPages = new AccountActivityNavigationPages();
    AddNewPayeePages newPayeePages = new AddNewPayeePages();
    PurchaseForeignCurrencyPage purchaseForeignCurrency = new PurchaseForeignCurrencyPage();



    @Then("the {string} page should be displayed")
    public void thePageShouldBeDisplayed(String header) {
        if (header.equalsIgnoreCase("Account Activity")) {
            String expectedResult = "active";
            String actualResult = navigationPages.accountActivitySelected.getAttribute("class");
            assertEquals(expectedResult, actualResult);
        }else if (header.equalsIgnoreCase("Pay Bills")) {
            String expectedResult = "active";
            String actualResult = navigationPages.payBillsSelected.getAttribute("class");
            assertEquals(expectedResult, actualResult);
        }
    }

    @And("Account drop down should have {string} selected")
    public void accountDropDownShouldHaveSelected(String part)   {

        Select selectObj = new Select(navigationPages.accountDropdown);
//        selectObj.selectByIndex(0);
//        selectObj.selectByValue("2");
//        selectObj.selectByVisibleText("Savings");

        switch (part){
            case "Savings":
                selectObj.selectByVisibleText("Savings");
            break;

            case "Brokerage":
                selectObj.selectByVisibleText("Brokerage");
            break;

            case "Checking":
                selectObj.selectByVisibleText("Checking");
            break;

            case "Credit Card":
                selectObj.selectByVisibleText("Credit Card");
            break;

            case "Loan":
                selectObj.selectByVisibleText("Loan");
            break;
        }

    }

    @And("Account drop down should have following parts")
    public void accountDropDownShouldHaveFollowingParts(List<String> expectedResults) {
        Select selectObj = new Select(navigationPages.accountDropdown);


        List<String> actualResults = BrowserUtils.getElementsText(selectObj.getOptions());
//        System.out.println("expectedResults = " + expectedResults);
//        System.out.println("actualResults = " + actualResults);

        assertTrue(actualResults.containsAll(expectedResults));
    }


//    @And("the user logged out")
//    public void theUserLoggedOut() {
//        navigationPages.profileName.click();
//        navigationPages.logout.click();
//    }




    @When("the user clicks on Online Baking More Services")
    public void theUserClicksOnOnlineBakingMoreServices() {
        navigationPages.moreServices.click();
    }


    @And("the user clicks on {string} link")
    public void theUserClicksOnLink(String step) {
        if (step.equalsIgnoreCase("Account Summary")) {

        }else if (step.equalsIgnoreCase("Account Activity")) {
            navigationPages.accountActivity.click();
        }else if (step.equalsIgnoreCase("Transfer Funds")) {

        }else if (step.equalsIgnoreCase("Pay Bills")) {
            navigationPages.payBills.click();
        }else if (step.equalsIgnoreCase("My Money Map")) {

        }else if (step.equalsIgnoreCase("Online Statements")) {

        }
    }


    @Then("verify {string} should be displayed")
    public void verifyShouldBeDisplayed(String errorMessage) {
        String actualMessage = navigationPages.errorMessage.getText();
        assertEquals(errorMessage, actualMessage);
    }

    @And("the user accesses the {string} tab")
    public void theUserAccessesTheTab(String tab) {
        if (tab.equalsIgnoreCase("Show Transactions")) {
            navigationPages.showTransactions.click();
        }else if (tab.equalsIgnoreCase("Find Transactions")) {
            navigationPages.findTransactions.click();
        }else if (tab.equalsIgnoreCase("Add New Payee")) {
            newPayeePages.addNewPayee.click();
        }else if (tab.equalsIgnoreCase("Purchase Foreign Currency")) {
            purchaseForeignCurrency.purchaseForeignCurrency.click();
        }
    }



}


