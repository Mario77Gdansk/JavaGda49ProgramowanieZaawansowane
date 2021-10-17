package dziedziczenie.library.model;

public class Author extends Man{


    public Author(String name, String surname) {
        super(name, surname);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
