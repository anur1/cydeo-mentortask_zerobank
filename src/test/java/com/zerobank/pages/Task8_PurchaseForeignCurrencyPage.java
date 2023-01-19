package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task8_PurchaseForeignCurrencyPage {

    public Task8_PurchaseForeignCurrencyPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//span[@id='pay_bills_link']")
    public WebElement payBillsLink;




}
