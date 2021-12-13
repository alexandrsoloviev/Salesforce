package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TextArea {

    WebDriver driver;
    String label;
    String textareaLocator = "//div[contains(@class,'textarea')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//textarea";


    public TextArea(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void write(String text){
        System.out.printf("Writing text '%s' into textarea with label '%s'\n", text, this.label);
        driver.findElement(By.xpath(String.format(textareaLocator, this.label))).sendKeys(text);

    }
}
