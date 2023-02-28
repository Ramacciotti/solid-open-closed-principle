package com.ramacciotti.open_closed.wrong;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    // We have for now 2 vehicles, car and motorcycle
    // If we wanted to add another vehicle, we would have to modify this class to add more properties to diferentiate them

    private String color;

    private String year;

    private boolean cargo;

    public Vehicle(String color, String year) {
        this.color = color;
        this.year = year;
    }

    void buildCar() {
        System.out.println("** Creating Car");
        System.out.println("** Color: " + color + " / Year: " + year);
    }

    void buildMotorcycle(){
        System.out.println("** Creating Motorcycle");
        System.out.println("** Color: " + color + " / Year: " + year + " / Cargo: " + cargo);
    }

    void startVehicle() {
        System.out.println("** Starting Vehicle");
    }

}
