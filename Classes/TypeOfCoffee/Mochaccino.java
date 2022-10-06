package Classes.TypeOfCoffee;

import Classes.CoffeeWithMilk;

public class Mochaccino extends CoffeeWithMilk {

    private int chocolateSyrup;

    public Mochaccino() {
        super("Excelsa", 50, 50, true, 50, 50);
        this.chocolateSyrup = 10;
    }

    public void makeMochaccino() {
        makeEspresso();
        System.out.println("On top of that he adds " + chocolateSyrup + " grams of chocolate syrup, then take "
                + milk + " ml of milk and foams an other " + getFoam() + " ml.");
    }
}
