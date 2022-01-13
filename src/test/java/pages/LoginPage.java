package pages;

import io.qameta.allure.Step;
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

    @Step("Open site")
    public LoginPage open(){
        driver.get(BASE_URL);
        return this;
    }

   @Step("Get error message")
   public String getErrorMessage(){
        return driver.findElement(ERROR_MESSAGE).getText();
   }

   @Step("Login as user '{login}' using password '{password}'")
    public HomePage login(String login,String password){
        driver.findElement(USER_NAME_INPUT).sendKeys(login);
        driver.findElement(USER_PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return new HomePage(driver);
    }
    @Step("Login as user using password with wrong login or pass")
    public LoginPage loginWithsWrongData(String login,String password){
        driver.findElement(USER_NAME_INPUT).sendKeys(login);
        driver.findElement(USER_PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();
        return this;
    }

}
