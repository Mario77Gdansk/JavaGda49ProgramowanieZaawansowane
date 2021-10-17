package generic.homework.task03;

public class Swap {
    public static <T> void swap(T[] table, int index1, int index2){
        T t = table[index1];
        table[index1]=table[index2];
        table[index2]=t;

    }
}
