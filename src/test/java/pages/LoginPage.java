package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public static final By USER_NAME_INPUT = By.id("username");
    public static final By USER_PASSWORD_INPUT = By.id("password");
    public static final By LOGIN_BUTTON = By.id("Login");
    public static final By ERROR_MESSAGE = By.id("error");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(LOGIN_BUTTON);
    }

    public LoginPage open(){
        driver.get(BASE_URL);
        return this;
    }

   public String getErrorMessage(){
        return driver.findElement(ERROR_MESSAGE).getText();
   }

    public HomePage login(String login,String password){
        driver.findElement(USER_NAME_INPUT).sendKeys(login);
        driver.findElement(USER_PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver);
    }

    public LoginPage loginWithsWrongData(String login,String password){
        driver.findElement(USER_NAME_INPUT).sendKeys(login);
        driver.findElement(USER_PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return this;
    }

}
