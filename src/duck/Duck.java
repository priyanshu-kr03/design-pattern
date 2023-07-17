package duck;

import duck.fly.FlyBehaviour;
import duck.quack.QuackBehaviour;

public abstract class Duck {
    QuackBehaviour quackBehaviour;
    FlyBehaviour flyBehaviour;
    public void performQuack() {
        quackBehaviour.quack();
    }
    public void performFlying() {
        flyBehaviour.fly();
    }
}
