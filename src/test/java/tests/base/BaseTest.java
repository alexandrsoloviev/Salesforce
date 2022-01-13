package tests.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import pages.*;

import java.util.concurrent.TimeUnit;

@Listeners(TestListener.class)
public abstract class BaseTest {


    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected AccountListPage accountListPage;
    protected AccountModalPage accountModalPage;
    protected AccountDetailsPage accountDetailsPage;
    protected ContactListPage contactListPage;
    protected ContactModalPage contactModelPage;
    protected ContactDetailsPage contactDetailsPage;

    @BeforeMethod(description = "Setup and start browser")
    public void setUp(ITestContext context) {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        context.setAttribute("driver", driver);
        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        accountListPage = new AccountListPage(driver);
        accountModalPage = new AccountModalPage(driver);
        accountDetailsPage = new AccountDetailsPage(driver);
        contactListPage = new ContactListPage(driver);
        contactModelPage = new ContactModalPage(driver);
        contactDetailsPage = new ContactDetailsPage(driver);
    }


    @AfterMethod(alwaysRun = true, description = "Close browser")
    public void tearDown() {
        driver.quit();
    }


}

