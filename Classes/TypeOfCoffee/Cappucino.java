package Classes.TypeOfCoffee;

import Classes.CoffeeWithMilk;

public class Cappucino extends CoffeeWithMilk {

    public Cappucino() {
        super("Arabica", 50, 20, false, 50, 20);
    }

    public void makeCappucino() {
        makeEspresso();
        System.out.println("On top of that he adds " + milk + " ml of milk an foams " + getFoam() + " ml");
    }
}
