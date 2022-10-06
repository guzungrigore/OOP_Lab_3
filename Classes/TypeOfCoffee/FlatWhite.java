package Classes.TypeOfCoffee;

import Classes.CoffeeWithMilk;

public class FlatWhite extends CoffeeWithMilk {

    public FlatWhite() {
        super("Excelsa", 75, 50, true, 75, 0);
    }

    public void makeFlatWhite() {
        makeEspresso();
        System.out.println("On top of that he took " + milk + "ml of milk poured it on top");
    }
}
