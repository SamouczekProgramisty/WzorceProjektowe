package pl.samouczekprogramisty.patterns.decorator.exercise;

import pl.samouczekprogramisty.patterns.decorator.Pizza;

import java.math.BigDecimal;

public class PizzaWithBasil extends PizzaWithTopping {

    private static final BigDecimal BASIL_PRICE = new BigDecimal(2);

    public PizzaWithBasil(Pizza basePizza) {
        super(basePizza, BASIL_PRICE);
    }
}
