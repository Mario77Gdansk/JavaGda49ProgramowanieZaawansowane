package generic.homework.task04;

import java.util.Arrays;

public class Library<E> {
    public int librarySize = 4;
    E[] table;

    public Library(int n) {
        this.librarySize = n;
        this.table = (E[]) new Object[librarySize];
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


    public void add(E e) {
        if (getActualSize() == librarySize) {
            increaseLibraryCapacity();
        }
        table[getActualSize()] = e;
    }
    public void display() {
        for (E element : table) {
            System.out.print(element+"   ");
            System.out.println();
        }
    }

    private void increaseLibraryCapacity() {
        int newLibrarySize = table.length * 2; //poprzez mnożenie przez 2
        table = Arrays.copyOf(table, newLibrarySize); // tu jest ewidentnie
    }//zwiększenie rozmiaru poprzez pomnożenie przez 2. Tu leży przyczyna NULLi przy wypisywaniu
}


