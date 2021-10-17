package generic.homework.task02;


class CountIf {
    public static <T> int countIf(T[] table, Validator<T> validator) {
        int counter = 0;
        for (T item:table) {
            if (validator.validate(item)){
                counter++;
            }

        }
        return counter;
    }
}


