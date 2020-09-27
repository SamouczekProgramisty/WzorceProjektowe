package pl.samouczekprogramisty.patterns.decorator.exercise;

import pl.samouczekprogramisty.patterns.decorator.Pizza;

import java.math.BigDecimal;

public class PizzaWithMozzarella extends PizzaWithTopping {

    private static final BigDecimal MOZZARELLA_PRICE = new BigDecimal(5);

    public PizzaWithMozzarella(Pizza basePizza) {
        super(basePizza, MOZZARELLA_PRICE);
    }
}
