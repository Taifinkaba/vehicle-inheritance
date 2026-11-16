package com.pluralsight;

public class Moped extends Vehicle{
    public Moped(String color, int numberOfPassengers, int cargoCapacity, int fuelCapacity) {
        super(color, numberOfPassengers, cargoCapacity, fuelCapacity);
    }

    public static void main(String[] args) {
        Moped slowRide = new Moped("Red", 1, 0, 5);

        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Moped fuel capacity: " + slowRide.getFuelCapacity());
    }
}
