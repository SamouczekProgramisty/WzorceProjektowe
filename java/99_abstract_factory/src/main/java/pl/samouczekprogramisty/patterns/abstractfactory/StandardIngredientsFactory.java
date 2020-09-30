package pl.samouczekprogramisty.patterns.abstractfactory;

import pl.samouczekprogramisty.patterns.*;

public class StandardIngredientsFactory implements IngredientsFactory {
    @Override
    public Egg prepareEgg() {
        return new ChickenEgg();
    }

    @Override
    public Flour prepareFlour() {
        return new WheatFlour();
    }

    @Override
    public Milk prepareMilk() {
        return new CowMilk();
    }
}
