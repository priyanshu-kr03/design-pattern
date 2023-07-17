package decorator.toppings;

import decorator.BasePizza;

public class Veggies extends ToppingDecorator{

    BasePizza basePizza;

    public Veggies(BasePizza basePizza) {
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+60;
    }
}
