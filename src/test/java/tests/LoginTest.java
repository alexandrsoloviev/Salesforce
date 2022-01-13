package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import tests.base.BaseTest;
import utils.AllureUtils;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @DataProvider(name = "incorrectLoginTest")
    public Object[][] incorrectLoginTest() {
        return new Object[][]{
                {"SomeLogin", "dev123123123", "Please check your username and password. If you still can't log in, contact your Salesforce administrator."},
                {"testsalesforce-vfzt@force.com", "SomePass", "Please check your username and password. If you still can't log in, contact your Salesforce administrator."},


        };
    }

    @Test(description = "User inputs login and password and authorizes on Salesforce platform")
    public void login() {
        boolean isHomePageOpened = loginPage
                .open()
                .login("testsalesforce-vfzt@force.com", "dev123123123")
                .isPageOpen();

        assertTrue(isHomePageOpened, "Page opened");
    }

    @Test(dataProvider = "incorrectLoginTest")
    public void negativeLoginTest(String login, String password, String errorMessage) {
        loginPage
                .open()
                .loginWithsWrongData(login, password)
                .isPageOpen();


        assertEquals(loginPage.getErrorMessage(), errorMessage);
        AllureUtils.takeScreenshot(driver);
    }


}
