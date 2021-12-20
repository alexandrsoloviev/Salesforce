package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPage extends BasePage{

    String fieldValueLink = "//records-lwc-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//a";
    String fieldValueText = "//records-lwc-detail-panel//span[text()='%s']/ancestor::div[contains(@class,'slds-form-element')]//slot[@slot='outputField']";
    String fieldValueAddress = "//records-lwc-detail-panel//span[text()='%s']/ancestor::force-record-layout-item//lightning-formatted-address";
    public static final By DETAILS_LINK = By.xpath("//a[@id = 'detailTab__item']");

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String getFieldValueByNameText(String fieldName){
        return driver.findElement(By.xpath(String.format(fieldValueText,fieldName))).getText();
    }
    public String getFieldValueByNameAddress(String fieldName){
        return driver.findElement(By.xpath(String.format(fieldValueAddress,fieldName))).getText();

    }
    public String getFieldValueByNameLink(String fieldName){
        return driver.findElement(By.xpath(String.format(fieldValueLink,fieldName))).getText();
    }


}
