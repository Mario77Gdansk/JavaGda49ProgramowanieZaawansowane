package generic.homework.task05;

import java.util.ArrayList;
import java.util.List;

public class AnimalHouse<E extends Animal> {
    List<E> animals;

    public AnimalHouse(List<E> animals) {
        this.animals = animals;
    }


    public void addAnimal(E e) {
        animals.add(e);
    }

    public E getBackAnimal(E e) {
        if (animals.contains(e)) {
            animals.remove(e);
            return e;
        } else {
            return null;
        }
    }

        public void display() {
            for (E e : animals) {
                System.out.print(e+"   ");
                System.out.println();
            }
        }

    }

