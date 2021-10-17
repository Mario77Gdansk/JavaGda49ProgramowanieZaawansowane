package dziedziczenie.library;

import dziedziczenie.library.model.*;

import java.util.Arrays;

public class LibraryMain {
    public static void main(String[] args) {

        Author author01 = null;
        Author author02 = null;
        Author author03 = null;
        Author author04 = null;
        Author author05 = null;

        try {
            author01 = new Author("Adam", "Mickiewicz");
            author02 =new Author("Eliza", "Orzeszkowa");
            author03 =new Author("Stanisław", "Reymont");
            author04 =new Author("Adam", "Niezgódka");
            author05 =new Author("Jan", "Nowak");
        } catch (IllegalSurnameNameException e) {
            System.out.println("Ponownie podaj nazwisko z wielkiej litery");
        }

        Item item01 = new Book("Pan Tadeusz", author01);
        Item item02 = new Book("Nad Niemnem", author02);
        Item item03 = new Book("Dziady", author01);
        Item item04 = new Book("Chłopi", author03);
        Item item05 = new Magazine("Pan Tadeusz", author04);
        Item item06 = new Magazine("Reymont", author01);
        Item item07 = new Magazine("Pan", author01);
        Item item08 = new Magazine("aaa", author02);


        Item[] items = new Item[]{
                item01, item02, item03, item04,
                item05, item06, item07, item08
        };
        Library library = new Library(items);


        System.out.println("wyszukiwanie po tytule");
        try {
            System.out.println(Arrays.toString(library.searchTheTitle("Zofia ")));
        } catch (NoBookFoundException e) {
            e.printStackTrace();
            System.out.println("Nie znaleziono książki o takim tytule");
        }
        System.out.println("wyszukiwanie po autorze");
        System.out.println(Arrays.toString(library.searchTheAuthor(author02)));
        System.out.println("wyszukiwanie po frazie");
        System.out.println(Arrays.toString(library.searchTheItem("Reymont")));
        System.out.println(author05);


    }


}
