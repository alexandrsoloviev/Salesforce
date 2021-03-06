package tests;

import models.Account;
import models.AccountFactory;
import org.testng.annotations.Test;
import tests.base.BaseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class AccountTest extends BaseTest {


    @Test(description = "User fills in account's form and checks that account with entered parameters is created")
    public void accountShouldBeCreated() {

        loginPage
                .open()
                .login("testsalesforce-vfzt@force.com", "dev123123123");

        boolean isAccountModalOpen = accountListPage
                .open()
                .clickNew()
                .isPageOpen();

        assertTrue(isAccountModalOpen, "Account modal page is not open");

        Account account = AccountFactory.get();


        boolean isDetailsPageOpen = accountModalPage
                .create(account)
                .isPageOpen();

        assertTrue(isDetailsPageOpen, "Details page is not open");

        assertEquals(accountDetailsPage.getFieldValueByNameText("Account Name"), account.getAccountName(), "the text doesn't match");
        assertEquals(accountDetailsPage.getFieldValueByNameLink("Website"), account.getWebSite(), "the text doesn't match");
        assertEquals(accountDetailsPage.getFieldValueByNameLink("Phone"), account.getPhone(), "the text doesn't match");
        assertEquals(accountDetailsPage.getFieldValueByNameLink("Fax"), account.getFax(), "the text doesn't match");
        assertEquals(accountDetailsPage.getFieldValueByNameNumber("Employees"), account.getEmployees(), "the text doesn't match");
        assertEquals(accountDetailsPage.getFieldValueByNameText("Annual Revenue"), "$" + account.getAnnualRevenue(), "the text doesn't match");
        assertEquals(accountDetailsPage.getFieldValueByNameAddress("Shipping Address"), account.getShippingStreet() + "\n" + account.getShippingCity() + ", " + account.getShippingStateProvince() + " " + account.getShippingZipPostalCode() + "\n" + account.getShippingCountry());
        assertEquals(accountDetailsPage.getFieldValueByNameAddress("Billing Address"), account.getBillingStreet() + "\n" + account.getBillingCity() + ", " + account.getBillingStateProvince() + " " + account.getBillingZipPostalCode() + "\n" + account.getBillingCountry());
        assertEquals(accountDetailsPage.getFieldValueByNameText("Type"), account.getType(), "the text doesn't match");
        assertEquals(accountDetailsPage.getFieldValueByNameText("Industry"), account.getIndustry(), "the text doesn't match");
        assertEquals(accountDetailsPage.getFieldValueByNameText("Description"), account.getDescription(), "the text doesn't match");


    }
}
