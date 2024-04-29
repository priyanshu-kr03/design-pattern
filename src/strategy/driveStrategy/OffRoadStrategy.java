package strategy.driveStrategy;

public class OffRoadStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Drive slowly");
    }
}
