package com.zerobank.pages;


import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Task7_AddNewPayeePage {

    public Task7_AddNewPayeePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//span[@id='pay_bills_link']")
    public WebElement payBillsLink;

    @FindBy(xpath = "//a[.='Pay Bills']")
    public WebElement payBillsTabText;

    @FindBy (xpath = "//a[.='Add New Payee']")
    public WebElement addNewPayeeTab;

    //new payee info
    @FindBy (xpath = "//input[@id='np_new_payee_name']")
    public WebElement newPayeeNameBox;

    @FindBy (xpath = "//textarea[@id='np_new_payee_address']")
    public WebElement newPayeeAddressBox;

    @FindBy (xpath = "//input[@id='np_new_payee_account']")
    public WebElement newPayeeAccountBox;

    @FindBy (xpath = "//input[@id='np_new_payee_details']")
    public WebElement newPayeeDetailsBox;

    @FindBy (xpath = "//div[@id='alert_content']")
    public  WebElement newPayeeAddedAlertText;


}
