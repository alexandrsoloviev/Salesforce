package pages;

import models.Account;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountDetailsPage extends BasePage{

    public static final By DETAILS_LINK = By.xpath("//a[@id = 'detailTab__item']");
    String fieldValueText = "//records-lwc-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-text";
    String fieldValueLink = "//records-lwc-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//a";
    String fieldValueNumber = "//records-lwc-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-number";
    String fieldValueAddress = "//records-lwc-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-address";


    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }

    public AccountDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String getFieldValueByNameText(String fieldName){
        return driver.findElement(By.xpath(String.format(fieldValueText,fieldName))).getText().replaceAll(",","");
    }

    public String getFieldValueByNameLink(String fieldName){
        return driver.findElement(By.xpath(String.format(fieldValueLink,fieldName))).getText();
    }

    public String getFieldValueByNameNumber(String fieldName){
        return driver.findElement(By.xpath(String.format(fieldValueNumber,fieldName))).getText().replaceAll(",","");
    }

    public String getFieldValueByNameAddress(String fieldName){
        return driver.findElement(By.xpath(String.format(fieldValueAddress,fieldName))).getText();

    }






}
