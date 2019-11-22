package pl.samouczekprogramisty.patterns.decorator;

import java.math.BigDecimal;

public class PizzaWithBasil extends Pizza {

    private static final BigDecimal BASIL_PRICE = new BigDecimal(2);
    private final Pizza basePizza;

    public PizzaWithBasil(Pizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public BigDecimal getPrice() {
        return basePizza.getPrice().add(BASIL_PRICE);
    }
}
