package pages;

import io.qameta.allure.Step;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
@Log4j2
public abstract class BasePage {

    public static final String BASE_URL = "https://godeltechnologiesltd.lightning.force.com";
    public static final By NEW_BUTTON = By.xpath("//a[@title='New']");
    public static final By SAVE_BUTTON = By.xpath("//button[@title='Save']");


    WebDriver driver;
    WebDriverWait wait;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 20);
    }
    @Step("Be sure that page is open")
    public abstract boolean isPageOpen();

    protected boolean isExist(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();

        } catch (NoSuchElementException ex) {
            log.debug(">>>>>Page is not loaded<<<<<");
            return false;
        }
    }

}
