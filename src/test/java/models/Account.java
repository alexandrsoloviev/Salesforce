package models;

public class Account {

    String accountName;
    String webSite;
    String phone;
    String fax;
    String employees;
    String annualRevenue;
    String billingCity;
    String billingStateProvince;
    String shippingCity;
    String shippingStateProvince;
    String billingZipPostalCode;
    String billingCountry;
    String shippingZipPostalCode;
    String shippingCountry;

    String type;
    String industry;

    String description;
    String billingStreet;
    String shippingStreet;


    public Account(String accountName, String webSite, String phone, String fax, String employees, String annualRevenue, String billingCity, String billingStateProvince, String shippingCity, String shippingStateProvince, String billingZipPostalCode, String billingCountry, String shippingZipPostalCode, String shippingCountry, String type, String industry, String description, String billingStreet, String shippingStreet) {
        this.accountName = accountName;
        this.webSite = webSite;
        this.phone = phone;
        this.fax = fax;
        this.employees = employees;
        this.annualRevenue = annualRevenue;
        this.billingCity = billingCity;
        this.billingStateProvince = billingStateProvince;
        this.shippingCity = shippingCity;
        this.shippingStateProvince = shippingStateProvince;
        this.billingZipPostalCode = billingZipPostalCode;
        this.billingCountry = billingCountry;
        this.shippingZipPostalCode = shippingZipPostalCode;
        this.shippingCountry = shippingCountry;
        this.type = type;
        this.industry = industry;
        this.description = description;
        this.billingStreet = billingStreet;
        this.shippingStreet = shippingStreet;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmployees() {
        return employees;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }

    public String getAnnualRevenue() {
        return annualRevenue;
    }

    public void setAnnualRevenue(String annualRevenue) {
        this.annualRevenue = annualRevenue;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    public String getBillingStateProvince() {
        return billingStateProvince;
    }

    public void setBillingStateProvince(String billingStateProvince) {
        this.billingStateProvince = billingStateProvince;
    }

    public String getShippingCity() {
        return shippingCity;
    }

    public void setShippingCity(String shippingCity) {
        this.shippingCity = shippingCity;
    }

    public String getShippingStateProvince() {
        return shippingStateProvince;
    }

    public void setShippingStateProvince(String shippingStateProvince) {
        this.shippingStateProvince = shippingStateProvince;
    }

    public String getBillingZipPostalCode() {
        return billingZipPostalCode;
    }

    public void setBillingZipPostalCode(String billingZipPostalCode) {
        this.billingZipPostalCode = billingZipPostalCode;
    }

    public String getBillingCountry() {
        return billingCountry;
    }

    public void setBillingCountry(String billingCountry) {
        this.billingCountry = billingCountry;
    }

    public String getShippingZipPostalCode() {
        return shippingZipPostalCode;
    }

    public void setShippingZipPostalCode(String shippingZipPostalCode) {
        this.shippingZipPostalCode = shippingZipPostalCode;
    }

    public String getShippingCountry() {
        return shippingCountry;
    }

    public void setShippingCountry(String shippingCountry) {
        this.shippingCountry = shippingCountry;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBillingStreet() {
        return billingStreet;
    }

    public void setBillingStreet(String billingStreet) {
        this.billingStreet = billingStreet;
    }

    public String getShippingStreet() {
        return shippingStreet;
    }

    public void setShippingStreet(String shippingStreet) {
        this.shippingStreet = shippingStreet;
    }




}
