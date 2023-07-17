package decorator.toppings;

import decorator.BasePizza;

public class OliveOil extends ToppingDecorator{
    BasePizza basePizza;

    public OliveOil(BasePizza basePizza) {
        this.basePizza=basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost()+30;
    }
}
