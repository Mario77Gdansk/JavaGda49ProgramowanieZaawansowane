package generic.homework.task02;

import java.util.Arrays;

public class MyTable<T> {
    private int n;
    T[] myGenericTable;

    public MyTable(int n) {
        this.n = n;
        this.myGenericTable = (T[]) new Object[n];
        //wytłumaczenie w generic.task02.MyList
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T item:myGenericTable){
            stringBuilder.append(item+",  ");
        }
        return stringBuilder.toString();
    }
}
