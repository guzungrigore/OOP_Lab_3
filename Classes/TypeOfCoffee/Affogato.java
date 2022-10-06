package Classes.TypeOfCoffee;

import Classes.Espresso;

public class Affogato extends Espresso {

    private int iceCream;

    public Affogato() {
        super("Robusta", 50, 30, false);
        iceCream = 100;
    }

    public void makeAffogato() {
        makeEspresso();
        System.out.println("On top of that he adds " + iceCream + " grams of ice cream.");
    }


}
