package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactListPage extends BasePage{

    public static final By BREADCRUMBS_LABEL = By.xpath("//nav[@aria-label='Breadcrumbs']//span");


    @Override
    public boolean isPageOpen() {
        return isExist(BREADCRUMBS_LABEL);
    }

    public ContactListPage(WebDriver driver) {
        super(driver);
    }

    public ContactListPage open(){
        driver.get(BASE_URL + "/lightning/o/Contact/list?filterName=Recent");
        return this;
    }
    public ContactModalPage clickNew(){
        driver.findElement(NEW_BUTTON).click();
        return  new ContactModalPage(driver);
    }
}
