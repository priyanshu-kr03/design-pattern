package decorator.toppings;

import decorator.pizza.BasePizza;

public class Mushrooms extends ToppingDecorator{

    BasePizza basePizza;

    public Mushrooms(BasePizza basePizza) {
        this.basePizza=basePizza;
    }
    @Override
    public int cost() {
        return this.basePizza.cost()+30;
    }
}
