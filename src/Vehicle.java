/*
 * Created on 2024-03-28
 *
 * Copyright (c) 2024 Nadine von Frankenberg
 */

import vehicles.operation.Startable;

public abstract class Vehicle implements Startable {
    @Override
    public void start() {
        System.out.println("Vehicle is starting");
    }
}
