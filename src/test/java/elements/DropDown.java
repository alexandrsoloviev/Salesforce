package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {

    String dropDownLocatorAccount = "//div[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//div[@class='uiMenu']";
    String optionsLocatorAccount = "//div[contains(@class,'visible')]//a[text()='%s']";
    String dropDownLocatorContact = "//div[contains(@class,'modal-body')]//label[text()='%s']/ancestor::lightning-combobox[@class='slds-form-element']//input";
    String optionsLocatorContact = "//lightning-base-combobox-item//span[text()='%s']";



    WebDriver driver;
    String label;

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOptionsAccount(String option) {
        System.out.println("Select option '%s' into dropdown with label '%S'");
        driver.findElement(By.xpath(String.format(dropDownLocatorAccount,this.label))).click();
        driver.findElement(By.xpath(String.format(optionsLocatorAccount,option))).click();

    }

    public void selectOptionsContact(String option){
        System.out.println("Select option '%s' into dropdown with label '%S'");
        driver.findElement(By.xpath(String.format(dropDownLocatorContact,this.label))).click();
        driver.findElement(By.xpath(String.format(optionsLocatorContact,option))).click();
    }
}
