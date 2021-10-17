package generic.homework.task02;

import generic.task02.MyList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] table = {"Ala", "ma", "kota", "a", "kot", "ma","Ale"};
        int counter = CountIf.countIf(table, new Validator<String>() {
            @Override
            public boolean validate(String value) {
                return value.length()<3;
            }
        });
        System.out.println(counter);

    }
}
