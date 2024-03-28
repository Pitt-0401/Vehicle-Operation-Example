# Vehicle Operation Demo - Polymorphism & Interfaces

## Overview

- **Interface Implementation**: The project uses three primary interfaces: `Startable`, `Driveable`, and `Flyable`. These interfaces represent the capabilities of the operation of vehicles.
- **Class Hierarchy**: `Car`, `Motorcycle`, and `Plane` represent specific types of `Vehicle`s. The superclass `Vehicle` implements the `Startable` interface. Each subclass implements either the `Driveable` or `Flyable` interface, as appropriate.
- **Pattern Matching with `instanceof`**: One of the key learning points of this project is the demonstration of pattern matching with the `instanceof` operator (see `App.java`, `operateVehicle()`). _Pattern matching_ allows for type checking and conditional execution based on whether an object is an instance of a specific class or interface, enabling more readable and efficient code.
   - _Note: This is a more advanced way of using instanceof than the traditional check._
- **Polymorphism**: This project illustrates polymorphic behavior through the use of interfaces and class inheritance. Vehicles can be operated in a general manner while still performing actions specific to their type, such as driving, flying, or honking.

## Getting Started

To run this project, install a Java Development Kit (min. JDK v17) installed on your machine. 
Download or clone the repository, navigate to the project directory, and compile/run the Java files.
