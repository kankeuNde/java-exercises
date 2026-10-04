package com.amigoscode._2_developers._12_classes;

import java.util.Objects;

public class Person {
    private String name;
    private String surname;
    private String email;
    private Address address;
    private Car car;
    private Home home;

    public Person() {
    }

    public Person(String name, String surname, String email, Address address) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
    }

    public Person(String name, String surname, String email, Address address, Car car, Home home) {
        this(name , surname , email, address);
        this.car = car;
        this.home = home;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                ", car=" + car +
                ", home=" + home +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Person person)) return false;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, email);
    }
}
