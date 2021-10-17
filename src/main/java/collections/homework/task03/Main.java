package collections.homework.task03;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int[] randomValues = new int[100];
        for (int i = 0; i < 100; i++) {
            randomValues[i] = random.nextInt(50);
        }
        Set<Integer> randomValuesSet = new HashSet<>();
        Set<Integer> randomDuplicatedValuesSet = new HashSet<>();

        System.out.println(Arrays.toString(randomValues));

        for (int item : randomValues) {
            if (randomValuesSet.add(item)) {
                randomValuesSet.add(item);
            } else {
                randomDuplicatedValuesSet.add(item);
            }
        }
        System.out.println(randomValuesSet);
        System.out.println(randomDuplicatedValuesSet);

    }
}
