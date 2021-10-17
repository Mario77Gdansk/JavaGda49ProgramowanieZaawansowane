package collections.homework.task04;

import java.rmi.NoSuchObjectException;
import java.util.*;

public class BookServiceExtended {
    private List<Book> books = new ArrayList<>();

    public void add(Book book) {
        books.add(book);
    }

    public void remove(Book book) throws NoSuchObjectException {
        if (books.contains(book)) {
            books.remove(book);
        }
        throw new NoSuchObjectException("There is no such book in the BookServiceExtended");
    }

    public List<Book> getAll() {
        return books;
    }

    public List<Book> findByGenre(Genre genre) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getGenre() == genre) {
                results.add(book);
            }
        }
        return results;
    }
    public Map<Genre, String> mapBooks(){
        Map<Genre, String> mapBooks = new HashMap<>();
        for (Book book:books) {
            mapBooks.putIfAbsent(book.getGenre(),book.getTitle());
        }
        return mapBooks;
    }

    public List<Book> findByYear(int yearOfPublication) {
        List<Book> results = new ArrayList<>();
        for (Book book : books) {
            if (book.getYearOfPublication() < yearOfPublication) {
                results.add(book);
            }
        }
        return results;
    }

    public Book findTheMostExpensive() {
        Book mostExpensive = null;
        for (Book book : books) {
            if (mostExpensive == null || mostExpensive.getPrice() < book.getPrice()) {
                mostExpensive = book;
            }

        }
        return mostExpensive;
    }

    public Book findTheCheapest() {
        Book theCheapest = null;
        for (Book book : books) {
            if (theCheapest == null || theCheapest.getPrice() > book.getPrice()) {
                theCheapest = book;
            }

        }
        return theCheapest;
    }

    public List<Book> findByNumberOfAuthors(int numberOfAuthors) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthors().size() == numberOfAuthors) {
                result.add(book);
            }
        }
        return result;
    }

    public List<Book> sortByParam(Boolean param) {
        if (param) {
            Collections.sort(books);
        } else {
            Collections.reverse(books);

        }
        return books;
    }

    public Boolean isInTheList(Book book) {
        return books.contains(book);
    }
    public List<Book> findByAuthor (Author author){
        List<Book> results = new ArrayList<>();
        for (Book book:books) {
            if(book.getAuthors().contains(author)){
                results.add(book);
            }

        }
        return results;
    }
}
