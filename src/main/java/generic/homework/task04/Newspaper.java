package generic.homework.task04;

public class Newspaper {
    String title;

    public Newspaper(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "title='" + title + '\'' +
                '}';
    }
}
