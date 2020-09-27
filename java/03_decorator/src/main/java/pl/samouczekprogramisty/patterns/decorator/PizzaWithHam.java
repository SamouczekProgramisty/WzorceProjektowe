package pl.samouczekprogramisty.patterns.decorator;

import java.math.BigDecimal;

public class PizzaWithHam extends Pizza {

    private static final BigDecimal HAM_PRICE = new BigDecimal(7);
    private final Pizza basePizza;

    public PizzaWithHam(Pizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public BigDecimal getPrice() {
        return basePizza.getPrice().add(HAM_PRICE);
    }
}
