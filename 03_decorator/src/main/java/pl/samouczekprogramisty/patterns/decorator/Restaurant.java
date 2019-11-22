package pl.samouczekprogramisty.patterns.decorator;

import java.text.DecimalFormat;

public class Restaurant {
    public static void main(String[] args) {
        Pizza margherita = new Pizza();
        Pizza withMozzarella = new PizzaWithMozzarella(margherita);
        Pizza withMozzarellaAndHam = new PizzaWithHam(withMozzarella);
        Pizza withMozzarellaHamAndBasil = new PizzaWithBasil(withMozzarellaAndHam);

        DecimalFormat df = new DecimalFormat("#,00 zł");
        System.out.println(String.format("Margherita kosztuje %s.", df.format(margherita.getPrice())));
        System.out.println(String.format("Pizza z mozzarellą kosztuje %s.", df.format(withMozzarella.getPrice())));
        System.out.println(String.format("Pizza z mozzarellą i szynką kosztuje %s.", df.format(withMozzarellaAndHam.getPrice())));
        System.out.println(String.format("Pizza z mozzarellą, szynką i bazylią kosztuje %s.", df.format(withMozzarellaHamAndBasil.getPrice())));
    }
}
