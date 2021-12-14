package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactDetailsPage extends BasePage{

    public static final By DETAILS_LINK = By.xpath("//a[@id = 'detailTab__item']");

    @Override
    public boolean isPageOpen() {
        return isExist(DETAILS_LINK);
    }

    public ContactDetailsPage(WebDriver driver) {
        super(driver);
    }
}
