package oopTasks.personStudentLecturer;

public class Lecturer extends Person{
    protected String specialisation;
    protected double salary;

    public Lecturer(String specialisation, double salary) {
        this.specialisation = specialisation;
        this.salary = salary;
    }

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "specialisation='" + specialisation + '\'' +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
