package com.amigoscode._2_developers._12_classes;

import java.math.BigDecimal;

public class PersonMain {
    public static void main(String[] args) {
        Address address = new Address("Canada", "Montreal", "O'Brien", "1234", "H7E7E1");
        Car car = new Car("Honda", "Civic", "black");
        Home home = new Home(111.1, 4, new BigDecimal("1200"));
        Person alex = new Person("Alex", "Lau", "alexlau@email.com", address);
        alex.setCar(car);
        alex.setHome(home);

        System.out.println("Person Name: " + alex.getName());
        System.out.println("Person Address: " + alex.getAddress());
        System.out.println("Person Car: " + alex.getCar());
        System.out.println("Person Home: " + alex.getHome());

        System.out.println();
        System.out.println(alex);

    }
}
