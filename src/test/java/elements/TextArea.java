package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {

    WebDriver driver;
    String label;
    String textareaLocatorAccount = "//div[contains(@class,'textarea')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//textarea";
    String textareaLocatorContact = "//div[contains(@class,'slds-form-element')]//label[text()='Other Street']/ancestor::lightning-textarea[contains(@class,'slds-form-element')]//textarea";


    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeIntoAccount(String text){
        System.out.printf("Writing text '%s' into textarea with label '%s'\n", text, this.label);
        driver.findElement(By.xpath(String.format(textareaLocatorAccount, this.label))).sendKeys(text);

    }

    public void writeIntoContact(String text){
        System.out.printf("Writing text '%s' into textarea with label '%s'\n", text, this.label);
        driver.findElement(By.xpath(String.format(textareaLocatorContact, this.label))).sendKeys(text);
    }
}
