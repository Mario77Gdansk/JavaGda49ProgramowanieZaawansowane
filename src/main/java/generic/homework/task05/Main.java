package generic.homework.task05;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Dog dog01 = new Dog("Burek", "Wiesław");
        Dog dog02 = new Dog("Azor", "Leszek");
        Dog dog03 = new Dog("Reksio", "Bożena");
        Dog dog04 = new Dog("Kundelek", "Krystyna");
        Cat cat01 = new Cat("Puszek",false);
        Cat cat02 = new Cat("Filemon",true);
        Cat cat03 = new Cat("Kicio",true);
        Cat cat04 = new Cat("Pussy",true);

        AnimalHouse<Animal> animalHouse = new AnimalHouse<>(new ArrayList<>());

        animalHouse.addAnimal(dog01);
        animalHouse.addAnimal(dog02);
        animalHouse.addAnimal(dog03);
        animalHouse.addAnimal(dog04);
        animalHouse.addAnimal(cat01);
        animalHouse.addAnimal(cat02);
        animalHouse.addAnimal(cat03);
        animalHouse.addAnimal(cat04);

        animalHouse.display();

        animalHouse.getBackAnimal(dog03);

        animalHouse.display();



    }
}
