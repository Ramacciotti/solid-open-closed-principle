package com.ramacciotti.open_closed.right.vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {

    protected String color;

    protected String year;

    protected void startVehicle() {
        System.out.println("** Starting Vehicle");
    }

}
