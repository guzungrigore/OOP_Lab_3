package Classes.TypeOfCoffee;

public class VietnameseCoffee extends Americano {

    private int condensedMilk;

    public VietnameseCoffee() {
        super("Liberica", 100, 75, false, 150);
        this.condensedMilk = 25;
    }

    public void makeVietnameseCoffee() {
        makeAmericano();
        System.out.println("On top of that he added " + condensedMilk + " grams of condensed milk");
    }


}
