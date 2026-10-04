package com.amigoscode._2_developers._12_classes;

import java.math.BigDecimal;
import java.util.Objects;

public class Home {
    private double surface;
    private int numberOfRooms;
    private BigDecimal rent;

    public Home() {
    }

    public Home(double surface, int numberOfRooms) {
        this.surface = surface;
        this.numberOfRooms = numberOfRooms;
    }

    public Home(double surface, int numberOfRooms, BigDecimal rent) {
        this.surface = surface;
        this.numberOfRooms = numberOfRooms;
        this.rent = rent;
    }

    public double getSurface() {
        return surface;
    }

    public void setSurface(double surface) {
        this.surface = surface;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public BigDecimal getRent() {
        return rent;
    }

    public void setRent(BigDecimal rent) {
        this.rent = rent;
    }

    @Override
    public String toString() {
        return "Home{" +
                "surface=" + surface +
                ", numberOfRooms=" + numberOfRooms +
                ", rent=" + rent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Home home)) return false;
        return Double.compare(surface, home.surface) == 0 &&
                numberOfRooms == home.numberOfRooms &&
                Objects.equals(rent, home.rent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surface, numberOfRooms, rent);
    }
}
