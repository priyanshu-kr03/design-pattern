package decorator.pizza;

import decorator.BasePizza;

public class VegLoaded extends BasePizza {

    @Override
    public int cost() {
        return 170;
    }
}
