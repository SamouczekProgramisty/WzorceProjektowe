package pl.samouczekprogramisty.patterns.abstractfactory;

import pl.samouczekprogramisty.patterns.Egg;
import pl.samouczekprogramisty.patterns.Flour;
import pl.samouczekprogramisty.patterns.Milk;

public interface IngredientsFactory {
    Egg prepareEgg();
    Flour prepareFlour();
    Milk prepareMilk();
}
