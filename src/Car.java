/*
 * Created on 2024-03-28
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import vehicles.operation.Driveable;

public abstract class Car extends Vehicle implements Driveable {

    @Override
    public void drive() {
        System.out.println("Car drives");
    }

    public void honk() {
        System.out.println("beep");
    }
}
