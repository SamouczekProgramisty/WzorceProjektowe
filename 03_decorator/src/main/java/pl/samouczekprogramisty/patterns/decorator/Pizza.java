package pl.samouczekprogramisty.patterns.decorator;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Pizza {
    private static final BigDecimal BASE_PRICE = new BigDecimal(12);
    final List<String> toppings = new LinkedList<>();

    public BigDecimal getPrice() {
        return BASE_PRICE;
    }

    @Override
    public String toString() {
        if (toppings.isEmpty()) {
            return "Pizza";
        }
        return String.format("Pizza with %s", String.join(", ", toppings));
    }
}
