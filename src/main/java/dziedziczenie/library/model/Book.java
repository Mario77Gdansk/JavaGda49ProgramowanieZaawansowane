package dziedziczenie.library.model;

public class Book extends Item {


    public Book(String title, Author author) {
        super(title, author);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
