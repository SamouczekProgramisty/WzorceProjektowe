package pl.samouczekprogramisty.patterns.abstractfactory;

import pl.samouczekprogramisty.patterns.Egg;
import pl.samouczekprogramisty.patterns.Flour;
import pl.samouczekprogramisty.patterns.Milk;

public class PancakeRobot {
    private final IngredientsFactory ingredientsFactory;

    public PancakeRobot(IngredientsFactory ingredientsFactory) {
        this.ingredientsFactory = ingredientsFactory;
    }

    public static void main(String[] args) {
        PancakeRobot standardRobot = new PancakeRobot(new StandardIngredientsFactory());
        standardRobot.preparePancake();

        PancakeRobot extraordinaryRobot = new PancakeRobot(new ExtraordinaryIngredientsFactory());
        extraordinaryRobot.preparePancake();
    }

    public void preparePancake() {
        Egg egg = ingredientsFactory.prepareEgg();
        Flour flour = ingredientsFactory.prepareFlour();
        Milk milk = ingredientsFactory.prepareMilk();

        System.out.println(String.format("Mixing ingredients: %s, %s, %s", egg, flour, milk));
    }
}