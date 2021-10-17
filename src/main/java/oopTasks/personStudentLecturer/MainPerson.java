package oopTasks.personStudentLecturer;

public class MainPerson {
    public static void main(String[] args) {

        Person student01 = new Student("UW",(byte)2, 5800);
        student01.setName("Xiński");
        student01.setAddress("ble ble ble");
        System.out.println(student01.toString());

        Person lecturer01 = new Lecturer("math",8500);
        lecturer01.setName("yiński");
        lecturer01.setAddress("ble ble");
        System.out.println(lecturer01.toString());
    }
}
