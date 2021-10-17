package interfaces.task03;

public class Wegan implements Eater{
    private int mealsEated=0;
    private int gramsEated=0;

    @Override
    public void eat(Food food) {
        if (food.getTypeOfFood() == TypeOfFood.FRUITS) {
            mealsEated++;
            gramsEated += food.getWeight();
        }
        else
        {
 //           System.out.println("I can't eat this shit");
        }
    }

    @Override
    public int howManyMealsEated() {
        return mealsEated;
    }

    @Override
    public int howManyGramsEated() {
        return gramsEated;
    }

    @Override
    public String toString() {
        return "Wegan{}";
    }
}
