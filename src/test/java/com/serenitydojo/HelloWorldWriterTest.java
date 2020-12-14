package com.serenitydojo;

import org.junit.Test;

public class HelloWorldWriterTest {

    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericalVariables() {

        final int ageThisYear = 42;

        int ageNextYear = ageThisYear + 1;

        double weight = 15.5;

        System.out.println("age = " + ageNextYear);
        System.out.println("weight = " + weight);
    }

    @Test
    public void workingWithStrings() {

        String firstName = " Sarah-Jane  ";

        String upperCaseFirstName = firstName.replace("Sarah","Mary");

        System.out.println(upperCaseFirstName.trim());
    }

    @Test
    public void whenCreatingObjects() {

        Cat felix = new Cat("Felix", "Tuna");
        felix.setName("Felix");
        felix.setFavouriteFood("Tuna");

        Cat spot = new Cat("Spot", "Mouse");
        spot.setName("Spot");
        spot.setFavouriteFood("mouse");

        System.out.println(felix.getName() + " likes " + felix.getFavouriteFood());
        System.out.println(spot.getName() + " likes " + spot.getFavouriteFood());


    }
}
