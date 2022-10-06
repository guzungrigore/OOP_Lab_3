package Classes.TypeOfCoffee;

import Classes.CoffeeWithMilk;

public class Macchiato extends CoffeeWithMilk {

    public Macchiato() {
        super("Arabica", 100, 30, true, 0, 30);

    }

    public void makeMacchiato() {
        makeEspresso();
        System.out.println("On top of that he took " + getFoam() + "ml of milk and turned it into foam and poured it on top");
    }
}
