package duck.fly;

public class FlyNoWay implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Cannot duck.fly");
    }
}
