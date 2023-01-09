package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task3_AccountActivityPage {

    public Task3_AccountActivityPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Task3: Account activity Page

    @FindBy(xpath = "//span[@id='account_activity_link']")
    public WebElement accountActivityLink;

    @FindBy(xpath = "//a[@href='#ui-tabs-1']")
    public WebElement showTransactionsTab;

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement accountDropDown;






}
