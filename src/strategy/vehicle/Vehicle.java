package strategy.vehicle;

import strategy.driveStrategy.DriveStrategy;

public class Vehicle {
    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    DriveStrategy driveStrategy;

    public void drive() {
        driveStrategy.drive();
    }

}
