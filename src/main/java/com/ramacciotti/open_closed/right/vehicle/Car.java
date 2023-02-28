package com.ramacciotti.open_closed.right.vehicle;

import lombok.Data;

@Data
public class Car implements IVehicle {

    // Now we have an specific class for Car
    // If we wanted to add another vehicle, we would create another class
    // This means that this one wont be modified

    private String color;

    private String year;

    public Car(String color, String year) {
        this.color = color;
        this.year = year;
        configureVehicle(color, year);
    }

    @Override
    public void configureVehicle(String color, String year) {
        this.color = color;
        this.year = year;
        System.out.println("** Creating Car");
        System.out.println("** Color: " + color + " / Year: " + year);
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting vehicle...");
    }

}
