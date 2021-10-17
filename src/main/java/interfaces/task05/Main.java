package interfaces.task05;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student01 = new Student("Jan","Kochanowski",101);
        Student student02 = new Student("Tomasz","Pawlak",005);
        Student student03 = new Student("Janusz","Korczak",17);
        Student student04 = new Student("Tadeusz","Kościuszko",1);
        Student student05 = new Student("Zofia","Nałkowska",125);



        Student[] students = new Student[]{student01,student02,student03,student04,student05};
        for (Student student:students) {
            System.out.println(student);
        }

        Arrays.sort(students);
        for (Student student:students
        ) {
            System.out.println(student);
        }

    }


}
