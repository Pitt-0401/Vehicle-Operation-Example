/*
 * Created on 2024-03-28
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import vehicles.operation.Driveable;
import vehicles.operation.Flyable;

public class App {
    public static void main(String[] args) throws Exception {

        Vehicle vehicle;

        vehicle = new SUV(); // new Plane;
        vehicle.start();
        vehicle = operateVehicle(vehicle);
    }

    // operateVehicle() demonstrates an 'advanced' version of how instanceof can be applied
    public static Vehicle operateVehicle(Vehicle vehicle) {
        // Checks if vehicle implements Driveable or Flyable
        /* The following code demonstrates 'pattern matching'
         * If the object does implement Drivable (line 23):
         * we can call the methods defined by these interfaces directly 
         * on the checked types without needing to create new instances!
         */
        if (vehicle instanceof Driveable driveable) {
            driveable.drive(); // Call drive() method on anything that is Driveable
            if (vehicle instanceof Car) {
                // Here we explicitly cast vehicle to Car to access Car-specific methods
                ((Car) vehicle).honk();
            }
        } else if (vehicle instanceof Flyable flyable) {
            flyable.fly(); // Call fly() method on anything that is Flyable
        } else {                        
            System.out.println("Vehicle type not specified or unsupported");
        }
        return vehicle;
    }
}
