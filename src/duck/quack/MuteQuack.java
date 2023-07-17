package duck.quack;

public class MuteQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Cannot make sound");
    }
}
