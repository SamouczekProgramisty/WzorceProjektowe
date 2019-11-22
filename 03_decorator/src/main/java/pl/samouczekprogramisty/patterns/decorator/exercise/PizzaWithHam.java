package pl.samouczekprogramisty.patterns.decorator.exercise;

import pl.samouczekprogramisty.patterns.decorator.Pizza;

import java.math.BigDecimal;

public class PizzaWithHam extends PizzaWithTopping {

    private static final BigDecimal HAM_PRICE = new BigDecimal(7);

    public PizzaWithHam(Pizza basePizza) {
        super(basePizza, HAM_PRICE);
    }
}
