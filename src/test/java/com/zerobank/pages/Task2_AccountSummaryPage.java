package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Task2_AccountSummaryPage {

    public Task2_AccountSummaryPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Task2: Account summary Page

    @FindBy(id = "online-banking")
    public WebElement moreServicesButton;

    @FindBy(id = "account_summary_link")
    public WebElement accountSummaryText;

    @FindBy(xpath = "//h2[.='Cash Accounts']")
    public WebElement cashAccoutsText;

    @FindBy(xpath = "//h2[.='Investment Accounts']")
    public WebElement investmentAccoutsText;

    @FindBy(xpath = "//h2[.='Credit Accounts']")
    public WebElement creditAccountsText;

    @FindBy(xpath = "//h2[.='Loan Accounts']")
    public WebElement loanAccountsText;

    @FindBy(xpath = "((//div[@class='board-content'])[3]//tr/th)[1]")
    public WebElement accountColumnText;

    @FindBy(xpath = "((//div[@class='board-content'])[3]//tr/th)[2]")
    public WebElement creditCardColumnText;

    @FindBy(xpath = "((//div[@class='board-content'])[3]//tr/th)[3]")
    public WebElement balanceColumnText;



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
