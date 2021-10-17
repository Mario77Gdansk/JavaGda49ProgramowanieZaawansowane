package tasks;

public class SuperBohater {
    private String nazwa;
    private String supermoc;

    public SuperBohater(String nazwa, String supermoc) {
        this.nazwa = nazwa;
        this.supermoc = supermoc;
    }

    @Override
    public String toString() {
        return "SuperBohater{" +
                "nazwa='" + nazwa + '\'' +
                ", supermoc='" + supermoc + '\'' +
                '}';
    }
}
