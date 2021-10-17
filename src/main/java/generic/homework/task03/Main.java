package generic.homework.task03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Swap swap = new Swap();
        String[] wyrazy = {"jeden", "dwa", "trzy","cztery"};
        Integer[] liczby = {1,2,3,4,};
        Swap.swap(wyrazy,2,3);
        Swap.swap(liczby,2,3);
        System.out.println(Arrays.toString(wyrazy));
        System.out.println(Arrays.toString(liczby));

    }
}
