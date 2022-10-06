package Classes.TypeOfCoffee;

import Classes.Espresso;

public class IrishCoffee extends Espresso {

    private int whiskey;
    private int cream;

    public IrishCoffee() {
        super("Liberica", 75, 50, false);
        this.whiskey = 25;
        this.cream = 40;
    }

    public void makeIrishCoffee () {
        makeEspresso();
        System.out.println("On top of that he adds " + whiskey + " ml of whiskey and " + cream + " ml of cream");
    }
}
