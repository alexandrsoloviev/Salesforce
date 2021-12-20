package models;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Contact {



    String firstName;
    String lastName;
    String salutation;
    String leadSource;
    String title;
    String phone;
    String mobile;
    String email;
    String mailingStreet;
    String mailingCity;
    String mailingStateProvince;
    String mailingZipPostalCode;
    String mailingCountry;
    String otherStreet;
    String otherCity;
    String otherStateProvince;
    String otherZipPostalCode;
    String otherCountry;
    String fax;
    String homePhone;
    String otherPhone;
    String asstPhone;
    String assistant;
    String department;
    String description;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSalutation() {
        return salutation;
    }

    public String getLeadSource() {
        return leadSource;
    }

    public String getTitle() {
        return title;
    }

    public String getPhone() {
        return phone;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getMailingStreet() {
        return mailingStreet;
    }

    public String getMailingCity() {
        return mailingCity;
    }

    public String getMailingStateProvince() {
        return mailingStateProvince;
    }

    public String getMailingZipPostalCode() {
        return mailingZipPostalCode;
    }

    public String getMailingCountry() {
        return mailingCountry;
    }

    public String getOtherStreet() {
        return otherStreet;
    }

    public String getOtherCity() {
        return otherCity;
    }

    public String getOtherStateProvince() {
        return otherStateProvince;
    }

    public String getOtherZipPostalCode() {
        return otherZipPostalCode;
    }

    public String getOtherCountry() {
        return otherCountry;
    }

    public String getFax() {
        return fax;
    }

    public String getHomePhone() {
        return homePhone;
    }

    public String getOtherPhone() {
        return otherPhone;
    }

    public String getAsstPhone() {
        return asstPhone;
    }

    public String getAssistant() {
        return assistant;
    }

    public String getDepartment() {
        return department;
    }

    public String getDescription() {
        return description;
    }

    public Contact(String firstName, String lastName, String salutation, String leadSource, String title, String phone, String mobile, String email, String mailingStreet, String mailingCity, String mailingStateProvince, String mailingZipPostalCode, String mailingCountry, String otherStreet, String otherCity, String otherStateProvince, String otherZipPostalCode, String otherCountry, String fax, String homePhone, String otherPhone, String asstPhone, String assistant, String department, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salutation = salutation;
        this.leadSource = leadSource;
        this.title = title;
        this.phone = phone;
        this.mobile = mobile;
        this.email = email;
        this.mailingStreet = mailingStreet;
        this.mailingCity = mailingCity;
        this.mailingStateProvince = mailingStateProvince;
        this.mailingZipPostalCode = mailingZipPostalCode;
        this.mailingCountry = mailingCountry;
        this.otherStreet = otherStreet;
        this.otherCity = otherCity;
        this.otherStateProvince = otherStateProvince;
        this.otherZipPostalCode = otherZipPostalCode;
        this.otherCountry = otherCountry;
        this.fax = fax;
        this.homePhone = homePhone;
        this.otherPhone = otherPhone;
        this.asstPhone = asstPhone;
        this.assistant = assistant;
        this.department = department;
        this.description = description;
    }
}
