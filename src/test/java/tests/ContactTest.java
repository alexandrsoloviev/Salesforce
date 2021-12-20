package tests;

import models.Contact;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ContactTest extends BaseTest {

    @Test(description = "User fills in contact's form and checks that account with entered parameters is created")
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
                "Advertisement",
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


        assertEquals(contactDetailsPage.getFieldValueByNameText("Name"),contact.getSalutation()+" "+ contact.getFirstName()+" "+ contact.getLastName(), "the text doesn't match");
        assertEquals(contactDetailsPage.getFieldValueByNameText("Title"),contact.getTitle(), "the text doesn't match");
        assertEquals(contactDetailsPage.getFieldValueByNameText("Assistant"),contact.getAssistant(), "the text doesn't match");
        assertEquals(contactDetailsPage.getFieldValueByNameText("Description"),contact.getDescription(), "the text doesn't match");
        assertEquals(contactDetailsPage.getFieldValueByNameText("Department"),contact.getDepartment(), "the text doesn't match");
        assertEquals(contactDetailsPage.getFieldValueByNameText("Lead Source"),contact.getLeadSource(), "the text doesn't match");
        assertEquals(contactDetailsPage.getFieldValueByNameLink("Phone"),contact.getPhone(),"the text doesn't match");
        assertEquals(contactDetailsPage.getFieldValueByNameLink("Mobile"),contact.getMobile(),"the text doesn't match");
        assertEquals(contactDetailsPage.getFieldValueByNameLink("Email"),contact.getEmail(),"the text doesn't match");
        assertEquals(contactDetailsPage.getFieldValueByNameLink("Fax"),contact.getFax(),"the text doesn't match");
        assertEquals(contactDetailsPage.getFieldValueByNameLink("Home Phone"),contact.getHomePhone(),"the text doesn't match");
        assertEquals(contactDetailsPage.getFieldValueByNameLink("Other Phone"),contact.getOtherPhone(),"the text doesn't match");
        assertEquals(contactDetailsPage.getFieldValueByNameLink("Asst. Phone"),contact.getAsstPhone(),"the text doesn't match");
        assertEquals(contactDetailsPage.getFieldValueByNameAddress("Mailing Address"), contact.getMailingStreet() + "\n" + contact.getMailingCity() + ", " + contact.getMailingStateProvince() + " " + contact.getMailingZipPostalCode() + "\n" + contact.getMailingCountry());
        assertEquals(contactDetailsPage.getFieldValueByNameAddress("Other Address"), contact.getOtherStreet() + "\n" + contact.getOtherCity() + ", " + contact.getOtherStateProvince() + " " + contact.getOtherZipPostalCode() + "\n" + contact.getOtherCountry());






    }
}
