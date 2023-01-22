package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task8_PurchaseForeignCurrencyPage {

    public Task8_PurchaseForeignCurrencyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//span[@id='pay_bills_link']")
    public WebElement payBillsLink;

    @FindBy(xpath = "//a[.='Purchase Foreign Currency']")
    public WebElement we_tab_of_PurchaseForeignCurrency;

    @FindBy(xpath = "//select[@id='pc_currency']")
    public WebElement we_dropDownMenu_of_currency;

    @FindBy (xpath =  "//input[@id='purchase_cash']")
    public WebElement weButton_OfPurchase;




}
