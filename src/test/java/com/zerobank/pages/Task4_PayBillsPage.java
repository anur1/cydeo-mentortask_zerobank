package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task4_PayBillsPage {

    public Task4_PayBillsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    //Task3: Account activity Page

    @FindBy(xpath = "//span[@id='pay_bills_link']")
    public WebElement payBillsLink;

    @FindBy (xpath = "//input[@id='sp_amount']")
    public WebElement amountInputBox;

    @FindBy (xpath = "//input[@id='sp_date']")
    public WebElement dateInputBox;

    @FindBy (xpath = "//input[@id='pay_saved_payees']")
    public WebElement payButton;

    @FindBy (xpath = "//div[@id='alert_content']/span")
    public WebElement successfulPaymentMessageText;











}
