package dziedziczenie.library.model;

public abstract class Item {

    protected String title;
    protected Author author;

    public Item(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", author=" + author +
                '}';
    }
}
