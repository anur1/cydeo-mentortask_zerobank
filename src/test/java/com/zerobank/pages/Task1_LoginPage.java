package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Task1_LoginPage {

    public Task1_LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    //Task1 : Login Negative Test
    @FindBy(id = "user_login")
    public WebElement usernameBox;

    @FindBy(id = "user_password")
    public WebElement passwordBox;

    @FindBy (name = "submit")
    public WebElement signinButton;


    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMessageText;



    //Task2: Account summary Page

    @FindBy(id = "online-banking")
    public WebElement moreServicesButton;

    @FindBy (id="account_summary_link")
    public WebElement accountSummaryText;





    /*




    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    public WebElement profileName;

    @FindBy(id = "logout_link")
    public WebElement logout;






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
*/

}
