package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PurchaseForeignCurrencyPage {

    public PurchaseForeignCurrencyPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "//a[.='Purchase Foreign Currency']")
    public WebElement purchaseForeignCurrency;

    @FindBy(id = "pc_currency")
    public WebElement currency;

    @FindBy (id = "pc_amount")
    public WebElement amount;

    @FindBy (id = "pc_calculate_costs")
    public WebElement calculate;





}
