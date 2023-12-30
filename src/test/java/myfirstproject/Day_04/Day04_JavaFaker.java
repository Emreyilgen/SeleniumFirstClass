package myfirstproject.Day_04;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class Day04_JavaFaker {

    /*
    Java Faker class is used for fake test data

   INTERVIEW QUES!!!!!
    Where do you get your test data from?
    - BA (They write the acceptance criteria)
    - Test Leader
    - Manual Tester
    - Developer
    - Database call
    - API calls
   -** Most commonly java faker class is used for test data (if company allows) **
        it generate data randomly

     */

    @Test
    public void javaFakerTest(){
        Faker faker = new Faker();
        String firstName= faker.name().firstName();
        System.out.println("firstName = " + firstName);

        //LAst name
        String lastName= faker.name().lastName();
        System.out.println("lastName = " + lastName);

        String funnyName = faker.funnyName().name();
        System.out.println("funnyName = " + funnyName);


        System.out.println("faker.name().title() = " + faker.name().title());

        System.out.println("faker.address().city() = " + faker.address().city());

        System.out.println("faker.address().state() = " + faker.address().state());

        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());

        System.out.println("faker.phoneNumber().cellPhone() = " + faker.phoneNumber().cellPhone());
        System.out.println("faker.phoneNumber().phoneNumber() = " + faker.phoneNumber().phoneNumber());

        System.out.println("faker.internet().emailAddress() = " + faker.internet().emailAddress());

        System.out.println("faker.number().digit() = " + faker.number().digit());
        System.out.println("faker.number().numberBetween(1000,30000) = " + faker.number().numberBetween(1000, 30000));

        System.out.println("faker.internet().image() = " + faker.internet().image());

        System.out.println("faker.internet().avatar() = " + faker.internet().avatar());


    }
}
