package com.zerobank.stepdefinitions;

import com.zerobank.pages.FindTransactionsPages;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FindTransactionsSD {
    FindTransactionsPages ftPages = new FindTransactionsPages();


    @And("the user enters date range from {string}  to {string}")
    public void theUserEntersDateRangeFromTo(String fromDate, String toDate) {
        ftPages.fromDate.sendKeys(fromDate);
        ftPages.toDate.sendKeys(toDate);
    }


    @And("clicks find")
    public void clicksFind() {
        ftPages.findButton.click();
    }



    @Then("verify the results should be sorted by most recent date between {string}  to {string} in the {string} column")
    public void verifyTheResultsShouldBeSortedByMostRecentDateBetweenToInTheColumn(String fromDate, String toDate, String columnName) {

        String listOfInfo1 = BrowserUtils.listOfTable("1",columnName);
        String listOfInfo2 = BrowserUtils.listOfTable("2",columnName);
        String listOfInfo3 = BrowserUtils.listOfTable("3",columnName);


        int cellFromDate = Integer.parseInt(fromDate.replace("-", ""));
        int cellToDate = Integer.parseInt(toDate.replace("-", ""));
        int cellDate1 = Integer.parseInt(listOfInfo1.replace("-", ""));
        int cellDate2 = Integer.parseInt(listOfInfo2.replace("-", ""));
        int cellDate3 = Integer.parseInt(listOfInfo3.replace("-", ""));

        assertTrue((cellDate1 >= cellFromDate && cellDate1 <= cellToDate));
        assertTrue((cellDate2 >= cellFromDate && cellDate2 <= cellToDate));
        assertTrue((cellDate3 >= cellFromDate && cellDate3 <= cellToDate));


        assertTrue((cellDate1 >= cellDate2));
        assertTrue((cellDate2 >= cellDate3));
    }




    @Then("verify the results should not contain {string}  between {string}  to {string} in the {string} column")
    public void verifyTheResultsShouldNotContainBetweenToInTheColumn(String fromDate, String toDate, String columnName, String notContainDate) {

        String listOfInfo1 = BrowserUtils.listOfTable("1","Date");
        String listOfInfo2 = BrowserUtils.listOfTable("2","Date");


        int cellFromDate = Integer.parseInt(fromDate.replace("-", ""));
//        System.out.println("cellFromDate = " + cellFromDate);

        int cellToDate = Integer.parseInt(toDate.replace("-", ""));
//        System.out.println("cellToDate = " + cellToDate);

//        int cellNotContainDate = Integer.parseInt(notContainDate.replace("-", ""));
        int cellNotContainDate = 20120901;
//        System.out.println("cellNotContainDate = " + cellNotContainDate);

        int cellDate1 = Integer.parseInt(listOfInfo1.replace("-", ""));
//        System.out.println("cellDate1 = " + cellDate1);

        int cellDate2 = Integer.parseInt(listOfInfo2.replace("-", ""));
//        System.out.println("cellDate2 = " + cellDate2);

        assertTrue((cellNotContainDate != cellDate1 && cellNotContainDate != cellDate2));


    }

    @When("the user enters description {string}")
    public void theUserEntersDescription(String keyWord) {
        ftPages.description.sendKeys(keyWord);
    }



    @Then("results table should contain {string} and should not contain {string}")
    public void resultsTableShouldContainAndShouldNotContain(String keyWord1, String keyWord2) {


        if (keyWord1.equalsIgnoreCase("ONLINE")) {
            String listOfInfo1 = BrowserUtils.listOfTable("1","Description");
            String listOfInfo2 = BrowserUtils.listOfTable("2","Description");

            assertTrue(listOfInfo1.contains(keyWord1));
            assertTrue(listOfInfo2.contains(keyWord1));

            assertFalse(listOfInfo1.contains(keyWord2));
            assertFalse(listOfInfo2.contains(keyWord2));

        }else if (keyWord1.equalsIgnoreCase("OFFICE")) {
            String listOfInfo1 = BrowserUtils.listOfTable("1","Description");

            assertTrue(listOfInfo1.contains(keyWord1));

            assertFalse(listOfInfo1.contains(keyWord2));
        }

    }






    @Then("results table should show at least {string} result under {string}")
    public void resultsTableShouldShowAtLeastResultUnder(String number, String header) {
        int number1 = Integer.parseInt(number);
        BrowserUtils.filledColumns(number1, header);

    }

    @Then("results table should show at least {int} result under {string}")
    public void resultsTableShouldShowAtLeastResultUnder(int number, String header) {
        BrowserUtils.waitFor(1);
        BrowserUtils.filledColumns(number, header);
        BrowserUtils.waitFor(1);

    }

    @When("user selects type {string}")
    public void userSelectsType(String type) {
        Select selectObj = new Select(ftPages.type);
//        selectObj.selectByIndex(0);
//        selectObj.selectByValue("2");
//        selectObj.selectByVisibleText("Savings");

        selectObj.selectByVisibleText(type);


    }

    @But("results table should show no result under {string}")
    public void resultsTableShouldShowNoResultUnder(String header) {
        BrowserUtils.waitFor(1);
        BrowserUtils.emptyColumns(header);
        BrowserUtils.waitFor(1);
    }

}


