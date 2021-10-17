package collections.task01;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<String> testList = new ArrayList<>();
        System.out.println(testList.add("Ala"));
        System.out.println(testList.add("Adam"));
        System.out.println(testList.add("Basia"));
        System.out.println(testList.add("Basia"));
        System.out.println(testList.add("Basia"));
        System.out.println(testList.add("Basia"));
        System.out.println(testList.add("Basia"));
        System.out.println(testList.add("Bartek"));
        testList.set(2, "Tomasz");
        System.out.println(testList.indexOf("Adam"));
        System.out.println(testList.lastIndexOf("Basia"));
        System.out.println(testList.remove("Basia"));
        System.out.println(testList.lastIndexOf("Basia"));
        System.out.println(testList.remove(3));
        showDuplicates(testList);
        System.out.println(removeDuplicates(testList));
        removeDuplicatesWithoutSet(testList);
        System.out.println(testList);

    }

    public static void showDuplicates(List<String> list) {
        for (String element : list) {
            if (list.indexOf(element) != list.lastIndexOf(element)) System.out.println(element);

        }
    }


    private static Set removeDuplicates(List<String> list) {
        Set<String> set = new HashSet<>();
        set.addAll(list);
        return set;
    }

    private static void removeDuplicatesWithoutSet(List<String> list) {
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (list.indexOf(iterator.next()) != list.lastIndexOf(iterator.next())) {
                iterator.remove();
            }
        }

    }
}
