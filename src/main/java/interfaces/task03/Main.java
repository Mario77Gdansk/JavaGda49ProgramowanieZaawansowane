package interfaces.task03;

public class Main {
    public static void main(String[] args) {
        Crocodile crocodile = new Crocodile();
        Programmer programmer = new Programmer();
        Wegan wegan = new Wegan();
// BREAKFAST
        crocodile.eat(new Food("BREAKFAST", TypeOfFood.MEAT, 5000f));
        wegan.eat(new Food("BREAKFAST", TypeOfFood.FRUITS, 500));
        programmer.eat(new Food("BREAKFAST", TypeOfFood.DAIRY, 400));
//LUNCH
        crocodile.eat(new Food("LUNCH", TypeOfFood.FRUITS, 5000f));
        wegan.eat(new Food("LUNCH", TypeOfFood.MEAT, 500));
        programmer.eat(new Food("LUNCH", TypeOfFood.DAIRY, 400));
//DINNER
        crocodile.eat(new Food("DINNER", TypeOfFood.DAIRY, 4000f));
        wegan.eat(new Food("DINNER", TypeOfFood.FRUITS, 300));
        programmer.eat(new Food("DINNER", TypeOfFood.DAIRY, 300));
//SUPPER
        crocodile.eat(new Food("SUPPER", TypeOfFood.FRUITS, 4000f));
        wegan.eat(new Food("SUPPER", TypeOfFood.FRUITS, 300));
        programmer.eat(new Food("SUPPER", TypeOfFood.DAIRY, 300));

        Eater[] eaters = new Eater[3];
        eaters[0] = crocodile;
        eaters[1] = programmer;
        eaters[2] = wegan;

        int maxGrams = 0;
        Eater maxGramsEater = null;
        int maxMeals = 0;
        Eater maxMealsEater = null;

        for (Eater eater : eaters) {
            System.out.print("I'm the " + eater.toString() + ". I've ate " + eater.howManyMealsEated() + " meals.   ");
            System.out.println("I've ate " + eater.howManyGramsEated() + " grams");

            if(eater.howManyMealsEated()>maxMeals){
                maxMeals=eater.howManyMealsEated();
                maxMealsEater=eater;
            }
            if (eater.howManyGramsEated() > maxGrams) {
                maxGrams = eater.howManyGramsEated();
                maxGramsEater=eater;
            }
        }

        System.out.println("The WINNER is "+maxGramsEater.toString()+" with the "+maxGrams+" grams as result");
        System.out.println("The WINNER is "+maxMealsEater.toString()+" with the "+maxMeals+" grams as result");

    }
}
