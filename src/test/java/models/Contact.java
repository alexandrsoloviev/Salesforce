package models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
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


}
