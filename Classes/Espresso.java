package Classes;

public class Espresso {

    private String typeOfCoffee;
    private int quantityOfWater;
    private int quantityOfCoffee;
    private boolean sugar;

    public Espresso(String typeOfCoffee, int quantityOfWater, int quantityOfCoffee, boolean sugar) {
        this.typeOfCoffee = typeOfCoffee;
        this.quantityOfWater = quantityOfWater;
        this.quantityOfCoffee = quantityOfCoffee;
        this.sugar = sugar;
    }

    public Espresso() {
        this.typeOfCoffee = "Arabica";
        this.quantityOfWater = 50;
        this.quantityOfCoffee = 20;
        this.sugar = false;
    }

    public void makeEspresso() {
        if (sugar) {
            System.out.println("Firstly, the barista grinds " + quantityOfCoffee + " grams of " + typeOfCoffee + " type of coffee beans," +
                    " after that he adds Sugar and " + quantityOfWater + " ml of water on the coffee.");
        } else {
            System.out.println("Firstly, the barista grinds " + quantityOfCoffee + " grams of " + typeOfCoffee + " type of coffee beans," +
                    " after that he adds " + quantityOfWater + " ml of water on the coffee.");
        }
    }

    public void setSugar(boolean sugar) {
        this.sugar = sugar;
    }
}
