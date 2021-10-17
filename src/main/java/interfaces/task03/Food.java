package interfaces.task03;

public class Food {
    private String nameOfFood;
    private TypeOfFood typeOfFood;
    private float weight;

    public Food(String nameOfFood, TypeOfFood typeOfFood, float weight) {
        this.nameOfFood = nameOfFood;
        this.typeOfFood = typeOfFood;
        this.weight = weight;
    }

    public String getNameOfFood() {
        return nameOfFood;
    }

    public TypeOfFood getTypeOfFood() {
        return typeOfFood;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Food{" +
                "nameOfFood='" + nameOfFood + '\'' +
                ", typeOfFood=" + typeOfFood +
                ", weight=" + weight +
                '}';
    }
}
