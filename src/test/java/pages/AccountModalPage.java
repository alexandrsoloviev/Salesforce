package pages;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import models.Account;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountModalPage extends BasePage{

    public static final By MODAL_TITLE = By.xpath("//*[contains(@class,'inlineTitle')]");

    @Override
    public boolean isPageOpen() {
        return isExist(MODAL_TITLE);
    }

    public AccountModalPage(WebDriver driver) {
        super(driver);
    }


    public AccountDetailsPage create(Account account) {

        new Input(driver, "Account Name").writeIntoAccount(account.getAccountName());
        new Input(driver, "Website").writeIntoAccount(account.getWebSite());
        new Input(driver,"Phone").writeIntoAccount(account.getPhone());
        new Input(driver,"Fax").writeIntoAccount(account.getFax());
        new Input(driver,"Employees").writeIntoAccount(account.getEmployees());
        new Input(driver,"Annual Revenue").writeIntoAccount(account.getAnnualRevenue());
        new Input(driver,"Billing City").writeIntoAccount(account.getBillingCity());
        new Input(driver,"Billing State/Province").writeIntoAccount(account.getBillingStateProvince());
        new Input(driver,"Billing Zip/Postal Code").writeIntoAccount(account.getBillingZipPostalCode());
        new Input(driver,"Billing Country").writeIntoAccount(account.getBillingCountry());
        new Input(driver,"Shipping City").writeIntoAccount(account.getShippingCity());
        new Input(driver,"Shipping State/Province").writeIntoAccount(account.getShippingStateProvince());
        new Input(driver,"Shipping Zip/Postal Code").writeIntoAccount(account.getShippingZipPostalCode());
        new Input(driver,"Shipping Country").writeIntoAccount(account.getShippingCountry());

        new DropDown(driver, "Type").selectOptionsAccount(account.getType());
        new DropDown(driver,"Industry").selectOptionsAccount(account.getIndustry());

        new TextArea(driver,"Description").writeIntoAccount(account.getDescription());
        new TextArea(driver,"Billing Street").writeIntoAccount(account.getBillingStreet());
        new TextArea(driver,"Shipping Street").writeIntoAccount(account.getShippingStreet());


        return clickSave();
    }

    public AccountDetailsPage clickSave(){
        driver.findElement(SAVE_BUTTON).click();
        return new AccountDetailsPage(driver);
    }


}
