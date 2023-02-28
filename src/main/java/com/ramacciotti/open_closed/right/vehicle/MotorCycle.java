package com.ramacciotti.open_closed.right.vehicle;

import lombok.Data;

@Data
public class MotorCycle implements IVehicle {

    // Now we have an specific class for MotorCycle
    // If we wanted to add another vehicle, we would create another class
    // This means that this one wont be modified

    private String color;

    private String year;

    private boolean cargo;

    public MotorCycle(String color, String year, boolean cargo) {
        this.color = color;
        this.year = year;
        this.cargo = cargo;
        configureVehicle(color, year);
    }

    @Override
    public void configureVehicle(String color, String year) {
        this.color = color;
        this.year = year;
        System.out.println("** Creating Motorcycle...");
        System.out.println("** Color: " + color + " / Year: " + year + " / Cargo: " + cargo);
        startVehicle();
    }

    @Override
    public void startVehicle() {
        System.out.println("Starting vehicle...");
    }

}
