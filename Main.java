import Classes.Espresso;
import Classes.TypeOfCoffee.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Random rand = new Random();
        int randName = rand.nextInt(5)+1;
        String name;

        if (randName == 1){
            name = "Greg";
        } else if (randName == 2){
            name = "Alex";
        } else if (randName == 3){
            name = "Anna";
        } else if (randName == 4){
            name = "Bob";
        } else {
            name = "Alice";
        }

        int randCoffee = rand.nextInt(9)+1;



        switch (randCoffee) {
            case 1:
                System.out.println(name + " ordered an Espresso");
                Espresso espresso = new Espresso();
                espresso.makeEspresso();
                break;
            case 2:
                System.out.println(name + " ordered an Americano");
                Americano americano = new Americano();
                americano.makeAmericano();
                break;
            case 3:
                System.out.println(name + " ordered an Affogato");
                Affogato affogato = new Affogato();
                affogato.makeAffogato();
                break;
            case 4:
                System.out.println(name + " ordered a Cappucino");
                Cappucino cappucino = new Cappucino();
                cappucino.makeCappucino();
                break;
            case 5:
                System.out.println(name + " ordered a Flat White");
                FlatWhite flatWhite = new FlatWhite();
                flatWhite.makeFlatWhite();
                break;
            case 6:
                System.out.println(name + " ordered an Irish Coffee");
                IrishCoffee irishCoffee = new IrishCoffee();
                irishCoffee.makeIrishCoffee();
                break;
            case 7:
                System.out.println(name + " ordered a Macchiato");
                Macchiato macchiato = new Macchiato();
                macchiato.makeMacchiato();
                break;
            case 8:
                System.out.println(name + " ordered a Mochaccino");
                Mochaccino mochaccino = new Mochaccino();
                mochaccino.makeMochaccino();
                break;
            case 9:
                System.out.println(name + " ordered a Vietnamese Coffee");
                VietnameseCoffee vietnameseCoffee = new VietnameseCoffee();
                vietnameseCoffee.makeVietnameseCoffee();
                break;
        }

        System.out.println("And after all of this he served it to the customer");
    }
}