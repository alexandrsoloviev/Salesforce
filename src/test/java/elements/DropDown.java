package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDown {

    String dropDownLocator = "//div[contains(@class,'modal-body')]//span[text()='%s']/ancestor::div[contains(@class,'uiInput')]//div[@class='uiMenu']";
    String optionsLocator = "//div[contains(@class,'visible')]//a[text()='%s']";


    WebDriver driver;
    String label;

    public DropDown(WebDriver driver, String label) {
        this.driver = driver;
        this.label = label;
    }

    public void selectOptions(String option) {
        System.out.println("Select option '%s' into dropdown with label '%S'");
        driver.findElement(By.xpath(String.format(dropDownLocator,this.label))).click();
        driver.findElement(By.xpath(String.format(optionsLocator,option))).click();

    }
}
