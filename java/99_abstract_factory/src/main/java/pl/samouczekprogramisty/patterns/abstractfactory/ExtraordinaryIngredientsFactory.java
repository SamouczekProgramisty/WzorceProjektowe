package pl.samouczekprogramisty.patterns.abstractfactory;

import pl.samouczekprogramisty.patterns.*;

public class ExtraordinaryIngredientsFactory implements IngredientsFactory {
    @Override
    public Egg prepareEgg() {
        return new OstrichEgg();
    }

    @Override
    public Flour prepareFlour() {
        return new OatFlour();
    }

    @Override
    public Milk prepareMilk() {
        return new GoatMilk();
    }
}
