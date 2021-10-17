package collections.homework.task01;

import java.util.Arrays;

public class SDAArrayList<E> {

    private static final int INITIAL_CAPACITY = 4;
    private Object[] elementaryArray;
    private int size = 0;

    public SDAArrayList() {
        elementaryArray = new Object[INITIAL_CAPACITY];
    }

    public void add(E e) {
        if (size == elementaryArray.length) { //tylko jeżeli jest równy, program uniemożliwia stan size<elmentaryArray.length
            increaseArraySize();
        }

    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bound exception. Please provide valid index");
        }
        Object removedElement = elementaryArray[index];
        for (int i = index; i < size - 1; i++) {
            elementaryArray[i] = elementaryArray[i + 1];
        }
        size--;
        decreaseArraySize();
        return (E) removedElement;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bound exception. Please provide valic index");
        }
        return (E) elementaryArray[index];
    }

    public void display() {
        for (Object element : elementaryArray) {
            System.out.print(element+"   ");
        }
    }

    private void increaseArraySize() {
        int newIncreasedCapacity = elementaryArray.length * 2; //poprzez mnożenie przez 2
        elementaryArray = Arrays.copyOf(elementaryArray, newIncreasedCapacity); // tu jest ewidentnie
    }//zwiększenie rozmiaru poprzez pomnożenie przez 2. Tu leży przyczyna NULLi przy wypisywaniu

    private void decreaseArraySize() {
        elementaryArray = Arrays.copyOf(elementaryArray, elementaryArray.length - 1);
    }

    public int getSize() {
        return size;
    }
}
