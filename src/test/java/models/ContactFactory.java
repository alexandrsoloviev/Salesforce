package models;

import com.github.javafaker.Faker;

public class ContactFactory {

    static Faker faker = new Faker();

    public static Contact get(){
        return Contact.builder()
                .firstName(faker.funnyName().name())
                .lastName(faker.name().lastName())
                .salutation("Mr.")
                .leadSource("Advertisement")
                .title(faker.funnyName().name())
                .phone(faker.phoneNumber().phoneNumber())
                .mobile(faker.phoneNumber().phoneNumber())
                .email(faker.internet().emailAddress())
                .mailingStreet(faker.address().streetName())
                .mailingCity(faker.address().cityName())
                .mailingStateProvince(faker.address().state())
                .mailingZipPostalCode(faker.address().zipCode())
                .mailingCountry(faker.address().country())
                .otherStreet(faker.address().streetName())
                .otherCity(faker.address().cityName())
                .otherStateProvince(faker.address().state())
                .otherZipPostalCode(faker.address().zipCode())
                .otherCountry(faker.address().country())
                .fax(faker.phoneNumber().subscriberNumber(7))
                .homePhone(faker.phoneNumber().phoneNumber())
                .otherPhone(faker.phoneNumber().phoneNumber())
                .asstPhone(faker.phoneNumber().phoneNumber())
                .assistant(faker.name().fullName())
                .department(faker.address().state())
                .description(faker.chuckNorris().fact())
                .build();
    }
}
