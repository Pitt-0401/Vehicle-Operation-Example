/*
 * Created on 2024-03-28
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import vehicles.operation.Flyable;

public class Plane extends Vehicle implements Flyable {

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }
}
