package pages;

import elements.DropDown;
import elements.Input;
import elements.TextArea;
import models.Contact;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class ContactModalPage extends BasePage{

    public static final By MODAL_TITLE = By.xpath("//h2[text()='New Contact']");
    public static final By SAVE = By.xpath("//button[text()='Save']");

    public ContactModalPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isPageOpen() {
        return isExist(MODAL_TITLE);
    }

    public ContactDetailsPage create(Contact contact){
        new Input(driver,"First Name").writeIntoContact(contact.getFirstName());
        new Input(driver,"Last Name").writeIntoContact(contact.getLastName());
        new Input(driver, "Title").writeIntoContact(contact.getTitle());
        new DropDown(driver,"Salutation").selectOptionsContact(contact.getSalutation());
        new Input(driver,"Phone").writeIntoContact(contact.getPhone());
        new Input(driver,"Mobile").writeIntoContact(contact.getMobile());
        new Input(driver,"Email").writeIntoContact(contact.getEmail());
        new TextArea(driver,"Mailing Street").writeIntoContact(contact.getMailingStreet());
        new Input(driver, "Mailing City").writeIntoContact(contact.getMailingCity());
        new Input(driver, "Mailing State/Province").writeIntoContact(contact.getMailingStateProvince());
        new Input(driver, "Mailing Zip/Postal Code").writeIntoContact(contact.getMailingZipPostalCode());
        new Input(driver, "Mailing Country").writeIntoContact(contact.getMailingCountry());
        new TextArea(driver, "Other Street").writeIntoContact(contact.getOtherStreet());
        new TextArea(driver,"Description").writeIntoContact(contact.getDescription());
        new Input(driver,"Other City").writeIntoContact(contact.getOtherCity());
        new Input(driver,"Other State/Province").writeIntoContact(contact.getOtherStateProvince());
        new Input(driver,"Other Zip/Postal Code").writeIntoContact(contact.getOtherZipPostalCode());
        new Input(driver,"Other Country").writeIntoContact(contact.getOtherCountry());
        new Input(driver,"Fax").writeIntoContact(contact.getFax());
        new Input(driver,"Home Phone").writeIntoContact(contact.getHomePhone());
        new Input(driver,"Other Phone").writeIntoContact(contact.getOtherPhone());
        new Input(driver,"Asst. Phone").writeIntoContact(contact.getAsstPhone());
        new Input(driver,"Assistant").writeIntoContact(contact.getAssistant());
        new Input(driver,"Department").writeIntoContact(contact.getDepartment());

        return clickSave();
    }

    public ContactDetailsPage clickSave(){
        driver.findElement(SAVE).click();
        return new ContactDetailsPage(driver);
    }

    public ContactModalPage searchAccounts(){
       driver.findElement(By.xpath("//div[contains(@class,'modal-body')]//label[text()='Account Name']/ancestor::span//input")).click();
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='FIRSTNAME SECONDNAME']"))).click();
        return this;
    }
}
