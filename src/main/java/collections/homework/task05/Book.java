package collections.homework.task05;

import java.util.List;
import java.util.Objects;

public class Book implements Comparable<Book>{
    private String title;
    private float price;
    private short yearOfPublication;
    private List<Author> authors;
    private Genre genre;

    public Book(String title, float price, short yearOfPublication, List<Author> authors, Genre genre) {
        this.title = title;
        this.price = price;
        this.yearOfPublication = yearOfPublication;
        this.authors = authors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public short getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(short yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;

        Book book = (Book) o;

       return Float.compare(book.price, price)==0&&
               yearOfPublication==book.yearOfPublication&&
               Objects.equals(title, book.title)&&
               Objects.equals(authors, book.authors)&&
               genre==book.genre;
       //to jest z palca iloczyn logiczny porównań
    }


    @Override
    public int hashCode() {
        return Objects.hash(title,price,yearOfPublication,authors,genre);
        // to przepisałem - zapytaj o to !!!!!!!
    }


    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yearOfPublication=" + yearOfPublication +
                ", authors=" + authors +
                ", genre=" + genre +
                '}';
    }

    @Override
    public int compareTo(Book book) {
        return book.getTitle().compareTo(title);
    }
}
