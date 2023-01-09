package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Task6_AccountActivityPage {

    public Task6_AccountActivityPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Task3: Account summary page


    @FindBy (xpath = "//span[@id='account_activity_link']")
    public WebElement accountActivityLink;

    @FindBy(xpath = "//a[.='Find Transactions']")
public WebElement findTransactionsTab;

    @FindBy (xpath = "//input[@id='aa_fromDate']")
    public WebElement fromDateInputBox;

    @FindBy (xpath = "//input[@id='aa_toDate']")
    public WebElement toDateInputBox;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement findButton;


    @FindBy (xpath = "//table/tbody")
    public List<WebElement> rows;

    @FindBy (xpath = "//*[@id=\"filtered_transactions_for_account\"]/table/tbody/tr[1]/td[1]")
    public WebElement row1_1;












}
