package com.pluralsight;

public class Moped extends Vehicle{
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        System.out.println("Moped color: " + slowRide.getColor());
        System.out.println("Moped fuel capacity: " + slowRide.getFuelCapacity());
    }
}
