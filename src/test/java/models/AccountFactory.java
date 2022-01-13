package models;

import com.github.javafaker.Faker;

public class AccountFactory {

    static Faker faker = new Faker();

    public static Account get(){
        return Account.builder()
                .accountName(faker.funnyName().name())
                .webSite(faker.internet().safeEmailAddress())
                .phone(faker.phoneNumber().phoneNumber())
                .fax(faker.phoneNumber().subscriberNumber(5))
                .employees("2000")
                .annualRevenue("1000")
                .billingCity(faker.address().cityName())
                .billingStateProvince(faker.address().state())
                .shippingCity(faker.address().cityName())
                .shippingStateProvince(faker.address().state())
                .billingZipPostalCode(faker.address().zipCode())
                .billingCountry(faker.address().country())
                .shippingZipPostalCode(faker.address().zipCode())
                .shippingCountry(faker.address().country())
                .type("Analyst")
                .industry("Apparel")
                .description(faker.chuckNorris().fact())
                .billingStreet(faker.address().streetAddress())
                .shippingStreet(faker.address().streetAddress())
                .build();




    }
}
