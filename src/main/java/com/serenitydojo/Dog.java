package com.serenitydojo;

public class Dog {
    private final String name;
    private final String favouriteToy;
    private final int age;

    public Dog(String name, String favouriteToy, int age) {
        this.name = name;
        this.favouriteToy = favouriteToy;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteToy() {
        return favouriteToy;
    }

    public int getAge() {
        return age;
    }
}
