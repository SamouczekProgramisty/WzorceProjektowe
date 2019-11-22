package pl.samouczekprogramisty.patterns.decorator.exercise;

import pl.samouczekprogramisty.patterns.decorator.Pizza;

import java.math.BigDecimal;

public abstract class PizzaWithTopping extends Pizza {
    private final Pizza basePizza;
    private final BigDecimal toppingPrice;

    public PizzaWithTopping(Pizza pizza, BigDecimal toppingPrice) {
        this.basePizza = pizza;
        this.toppingPrice = toppingPrice;
    }

    @Override
    public BigDecimal getPrice() {
        return basePizza.getPrice().add(toppingPrice);
    }

    @Override
    public String toString() {
        return "Pizza with toppings";
    }
}
