package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Input {
    WebDriver driver;
    String label;
    String inputIntoAccountLocator = "//div[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//input";
    String inputIntoContactLocator = "//div[contains(@class,'modal-body')]//label[text()='%s']/ancestor::lightning-input[contains(@class,'slds-form-element')]//input";


    public Input(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void writeIntoAccount(String text){
        System.out.printf("Writing text '%s' into input with label '%s'\n", text, this.label);
        driver.findElement(By.xpath(String.format(inputIntoAccountLocator, this.label))).sendKeys(text);

    }

    public void writeIntoContact(String text){

        driver.findElement(By.xpath(String.format(inputIntoContactLocator,this.label))).sendKeys(text);
    }
}
