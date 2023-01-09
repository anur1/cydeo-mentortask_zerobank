package com.zerobank.stepdefinitions;

import com.zerobank.pages.PurchaseForeignCurrencyPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PurchaseForeignCurrencySD {
    PurchaseForeignCurrencyPage purchaseForeignCurrency = new PurchaseForeignCurrencyPage();


    @Then("following currencies should be available")
    public void followingCurrenciesShouldBeAvailable(List<String> expectedResults) {
        Select selectObj = new Select(purchaseForeignCurrency.currency);
//        selectObj.selectByIndex(0);
//        selectObj.selectByValue("2");
//        selectObj.selectByVisibleText("Savings");

        List<String> actualResults = BrowserUtils.getElementsText(selectObj.getOptions());
//        System.out.println("expectedResults = " + expectedResults);
//        System.out.println("actualResults = " + actualResults);

        assertTrue(actualResults.containsAll(expectedResults));

    }

    @When("user tries to calculate cost without selecting a currency")
    public void userTriesToCalculateCostWithoutSelectingACurrency() {
        purchaseForeignCurrency.amount.sendKeys("100");
        purchaseForeignCurrency.calculate.click();
    }


    @Then("{string} should be displayed")
    public void shouldBeDisplayed(String expectedErrorMessage) {
        Alert alert  = Driver.getDriver().switchTo().alert();
        String actualErrorMessage = alert.getText();
        assertEquals(expectedErrorMessage, actualErrorMessage);
    }

    @When("user tries to calculate cost without entering a value")
    public void userTriesToCalculateCostWithoutEnteringAValue() {
        purchaseForeignCurrency.amount.sendKeys("");
        purchaseForeignCurrency.calculate.click();
    }
}
