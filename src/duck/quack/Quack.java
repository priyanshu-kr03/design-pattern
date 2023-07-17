package duck.quack;

public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Making sound Quack");
    }
}
