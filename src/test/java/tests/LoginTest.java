package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void login() {
        boolean isHomePageOpened = loginPage
                .open()
                .login("sedoi8990-bseq@force.com", "1234qwer")
                .isPageOpen();

        assertTrue(isHomePageOpened, "Page opened");
    }


}
