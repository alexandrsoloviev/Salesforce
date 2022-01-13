package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
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


}
