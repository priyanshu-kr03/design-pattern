package strategy.driveStrategy;

public class SportsCarStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Drive Fast");
    }
}
