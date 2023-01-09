package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task5_AccountSummaryPage {

    public Task5_AccountSummaryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Task3: Account summary page


    @FindBy (xpath = "//span[@id= 'account_summary_link']")
    public WebElement accountSummaryLink;

    @FindBy (xpath = "//a[@style= 'text-decoration: underline']")
    public WebElement accountSummaryPageSavingLink;

    @FindBy (xpath = "//a[.= 'Account Activity']")
    public WebElement SavingsPageAccountActivityTitle;

    @FindBy (xpath = "//div//select[@id= 'aa_accountId']")
    public WebElement dropdownElement;

    //task5-b
    @FindBy (xpath = "//a[.='Brokerage']")
    public WebElement brokerageLink;

//task 5 - c
    @FindBy (xpath = "//a[.='Checking']")
    public WebElement checkingLink;

    //task 5 - d
    @FindBy (xpath = "//a[.='Credit Card']")
    public WebElement creditCardLink;

    //task 5 - e
    @FindBy (xpath = "//a[.='Loan']")
    public WebElement loanLink;










}
