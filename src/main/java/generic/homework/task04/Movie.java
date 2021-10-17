package generic.homework.task04;

public class Movie {
    String title;
    int yearOfProduction;

    public Movie(String title, int yearOfProduction) {
        this.title = title;
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
