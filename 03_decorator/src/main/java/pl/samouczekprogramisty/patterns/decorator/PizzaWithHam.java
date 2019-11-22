package pl.samouczekprogramisty.patterns.decorator;

import java.math.BigDecimal;

public class PizzaWithHam extends Pizza {

    private static final BigDecimal HAM_PRICE = new BigDecimal(7);
    private final Pizza basePizza;

    public PizzaWithHam(Pizza basePizza) {
        this.basePizza = basePizza;
        this.toppings.addAll(basePizza.toppings);
        this.toppings.add("ham");
    }

    @Override
    public BigDecimal getPrice() {
        return basePizza.getPrice().add(HAM_PRICE);
    }
}
