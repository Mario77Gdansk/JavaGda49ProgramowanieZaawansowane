package interfaces.task05;

import java.util.Comparator;

public class Student implements Comparable {
    private String name, surname;
    private int indexNo;

    public Student(String name, String surname, int indexNo) {
        this.name = name;
        this.surname = surname;
        this.indexNo = indexNo;
    }

    @Override
    public int compareTo(Object o) {
        Student other = (Student)o;
        return Integer.compare(this.indexNo, other.indexNo);
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", indexNo=" + indexNo +
                '}';
    }
}
