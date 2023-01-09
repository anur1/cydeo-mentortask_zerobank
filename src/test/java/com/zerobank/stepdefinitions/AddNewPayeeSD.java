package com.zerobank.stepdefinitions;

import com.zerobank.pages.AddNewPayeePages;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class AddNewPayeeSD {
    AddNewPayeePages newPayeePages = new AddNewPayeePages();

    @And("creates new payee using following information")
    public void createsNewPayeeUsingFollowingInformation(Map<String, String> credentials) {
        BrowserUtils.addInfo(credentials.get("Payee Name"), credentials.get("Payee Address"),credentials.get("Account"),credentials.get("Payee details"));
        newPayeePages.addButton.click();
    }

    @Then("message {string} should be displayed")
    public void messageShouldBeDisplayed(String expectedMessage) {
        String actualMessage = newPayeePages.message.getText();
        assertEquals(expectedMessage, actualMessage);
    }
}
