package decorator.pizza;

import decorator.BasePizza;

public class PastaPizza extends BasePizza {
    @Override
    public int cost() {
        return 160;
    }
}
