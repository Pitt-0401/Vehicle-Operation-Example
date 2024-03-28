/*
 * Created on 2024-03-28
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import vehicles.operation.Driveable;

public class Motorcycle extends Vehicle implements Driveable {

    @Override
    public void drive() {
        System.out.println("Motorcycle drives");
    }
}
