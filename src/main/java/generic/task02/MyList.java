package generic.task02;

import java.util.Arrays;

public class MyList<E> {
    private int n;
    private E[] table;

    public MyList(int n) {
        this.n = n;
        this.table = (E[]) new Object[n]; //to jest taki myk aby w tym miejscu
        // utworzyć nową tablicę. Nie dało się zapisać new E[n]
    }

    protected boolean contains(E element) {
        for (E item : table) {
            if (element == item) {
                return true;
            }
        }
        return false;
    }

    protected int getActualSize() {
        int position = 0;
        for (E item : table) {
            if (item == null) {
                return position;
            } else {
                position++;
            }
        }
        return position;
    }

    protected boolean addElement(E element) {
        if (getActualSize() < this.n) {
            table[getActualSize()] = element;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        for (E element : table) {
            stringBuilder.append(element + ", ");
        }
        return stringBuilder.toString();
    }
}