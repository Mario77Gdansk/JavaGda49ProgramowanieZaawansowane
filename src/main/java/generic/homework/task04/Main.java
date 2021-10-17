package generic.homework.task04;

public class Main {
    public static void main(String[] args) {
        Book book01 = new Book("Potter","Rowling");
        Book book02 = new Book("Lord of the rings","Tolkien");
        Newspaper newspaper01 = new Newspaper("Dziennik Bałtycki");
        Newspaper newspaper02 = new Newspaper("Playboy");
        Movie movie01 = new Movie("Rambo 1",1987);
        Movie movie02 = new Movie("Rambo 2",1989);

        Library<Object> library = new Library<>(4);
        library.add(book01);
        library.add(book02);
        library.add(newspaper01);
        library.add(newspaper02);
        library.add(movie01);
        library.add(movie02);

        library.display();


    }
}
