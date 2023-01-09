package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class AccountActivityNavigationPages {

    public AccountActivityNavigationPages(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(id = "user_login")
    public WebElement username;

    @FindBy(id = "user_password")
    public WebElement password;

    @FindBy(name = "submit")
    public WebElement signIn;

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    public WebElement profileName;

    @FindBy(id = "logout_link")
    public WebElement logout;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessage;

    @FindBy(id = "online-banking")
    public WebElement moreServices;


    @FindBy(id = "account_activity_link")
    public WebElement accountActivity;

    @FindBy(id = "account_activity_tab")
    public WebElement accountActivitySelected;

    @FindBy(id = "pay_bills_link")
    public WebElement payBills;

    @FindBy(id = "pay_bills_tab")
    public WebElement payBillsSelected;


    @FindBy(id = "aa_accountId")
    public WebElement accountDropdown;

    @FindBy(xpath = "//a[.='Show Transactions']")
    public WebElement showTransactions;

    @FindBy(xpath = "//a[.='Find Transactions']")
    public WebElement findTransactions;


}
