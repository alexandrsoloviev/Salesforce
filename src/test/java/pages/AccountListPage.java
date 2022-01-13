package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountListPage extends BasePage{

    public static final By BREADCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']//span");

    public AccountListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(BREADCRUMBS_LABEL);
    }

    @Step("Open account list page")
    public AccountListPage open(){
        driver.get(BASE_URL + "/lightning/o/Account/list?filterName=Recent");
        return this;
    }

    @Step("Click 'NEW BUTTON' on account modal page")
    public AccountModalPage clickNew(){
        driver.findElement(NEW_BUTTON).click();
        return  new AccountModalPage(driver);
    }


}
