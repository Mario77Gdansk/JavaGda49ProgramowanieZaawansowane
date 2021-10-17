package collections.homework.task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Author author01 = new Author("Adam", "Mickiewicz", 'M');
        Author author02 = new Author("Astrid", "Lidgren", 'F');
        Author author03 = new Author("Jan", "Brzechwa", 'M');
        Author author04 = new Author("Jane", "Rowling", 'F');
        Author author05 = new Author("Zofia", "Nałkowska", 'F');

        Book book01 = new Book("Pan Tadeusz", 45f, (short) 2010, Arrays.asList(author01) ,Genre.poetry);
        Book book02 = new Book("Harry Potter", 85f, (short) 2015, Arrays.asList(author04) ,Genre.fantasy);
        Book book03 = new Book("Dzieci z Bullerbyn", 15f, (short) 2010, Arrays.asList(author02) ,Genre.comedy);
        Book book04 = new Book("Nowele Polskie", 55f, (short) 1955, Arrays.asList(author01, author03,author05) ,Genre.drama);
        BookService bookService = new BookService();
        bookService.add(book01);
        bookService.add(book02);
        bookService.add(book03);
        bookService.add(book04);
        System.out.println(bookService.sortByParam(true));
        System.out.println(bookService.findTheMostExpensive());
    }
}
