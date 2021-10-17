package oopTasks.personStudentLecturer;

public class Student extends Person {
    protected String typeOfUniversity;
    protected byte yearOfStudies;
    protected double studiesPrice;

    public Student(String typeOfUniversity, byte yearOfStudies, double studiesPrice) {
        this.typeOfUniversity = typeOfUniversity;
        this.yearOfStudies = yearOfStudies;
        this.studiesPrice = studiesPrice;
    }

    public String getTypeOfUniversity() {
        return typeOfUniversity;
    }

    public void setTypeOfUniversity(String typeOfUniversity) {
        this.typeOfUniversity = typeOfUniversity;
    }

    public short getYearOfStudies() {
        return yearOfStudies;
    }

    public void setYearOfStudies(byte yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    public double getStudiesPrice() {
        return studiesPrice;
    }

    public void setStudiesPrice(double studiesPrice) {
        this.studiesPrice = studiesPrice;
    }

    @Override
    public String toString() {
        return "Student{" +
                "typeOfUniversity='" + typeOfUniversity + '\'' +
                ", yearOfStudies=" + yearOfStudies +
                ", studiesPrice=" + studiesPrice +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
