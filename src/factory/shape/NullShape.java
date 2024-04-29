package factory.shape;

public class NullShape implements Shape{
    @Override
    public void draw() {
        System.out.println("Wrong choice");
    }
}
