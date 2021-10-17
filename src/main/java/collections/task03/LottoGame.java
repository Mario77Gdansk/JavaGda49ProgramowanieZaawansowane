package collections.task03;

import java.util.*;

import static java.util.Collections.addAll;

public class LottoGame {

    public static Set<Integer> lotto = new HashSet<>();
    public static Set<Integer> randomSet = new HashSet<>();


    public static void play() {
        int nextNumber;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Etap wprowadzania ...   ");
        while (lotto.size() < 6) {
            do {
                System.out.print("liczba ... :");
                nextNumber = scanner.nextInt();
            } while (nextNumber < 1 || nextNumber > 49);
            lotto.add(nextNumber);
        }

    }

    public static Set<Integer> doTheLots() {
        Random randomNumber = new Random();
        do {
            randomSet.add(randomNumber.nextInt(49) + 1);
        }
        while (randomSet.size() < 6);

        return randomSet;
    }

    protected static void showTheSet(Set<Integer> set) {
        for (int element : set) {
            System.out.print(element + "  ");
        }
        System.out.println();
    }

    protected static int showTheResult(Set<Integer> setA, Set<Integer> setB) {
        setA.addAll(setB);
        return 12 - setA.size();
    }

}

