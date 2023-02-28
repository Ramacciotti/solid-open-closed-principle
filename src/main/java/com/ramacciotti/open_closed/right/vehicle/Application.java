package com.ramacciotti.open_closed.right.vehicle;

import com.ramacciotti.open_closed.VehicleType;

public class Application {

    private static VehicleType vehicleType;

    public static void main(String[] args) {

        vehicleType = VehicleType.CAR;

        if (vehicleType == VehicleType.CAR) {

            Car car = new Car("red", "1998");

        } else if (vehicleType == VehicleType.MOTORCYCLE) {

            MotorCycle motorCycle = new MotorCycle("red", "1998", true);

        }

    }

}
