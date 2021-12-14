package tests;

import models.Contact;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ContactTest extends BaseTest{

    @Test
    public void contactShouldBeCreated(){
        loginPage
                .open()
                .login("sedoi8990-bseq@force.com", "1234qwer");

        boolean isContactModalOpen = contactListPage
                .open()
                .clickNew()
                .isPageOpen();

        assertTrue(isContactModalOpen, "Contact modal page is not open");

        Contact contact = new Contact("test",
                "test",
                "Mr.",
                "test",
                "test",
                "test",
                "test@test.test",
                "test",
                "test",
                "test",
                "test",
                "test",
                "test",
                "test",
                "test",
                "test",
                "test",
                "test",
                "test",
                "test",
                "test",
                "test",
                "test",
                "test");

        boolean isDetailsPageOpen = contactModelPage
                .searchAccounts()
                .create(contact)
                .isPageOpen();

        assertTrue(isDetailsPageOpen, "Details page is not open");



    }
}
