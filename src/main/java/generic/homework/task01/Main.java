package generic.homework.task01;

import java.util.Random;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {
        String name = "Mariusz";
        Random random = new Random();
        Pair pair = new Pair(name, random()) ;
        System.out.println(pair);

    }
}
