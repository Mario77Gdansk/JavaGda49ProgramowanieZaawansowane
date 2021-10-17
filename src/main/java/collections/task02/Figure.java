package collections.task02;

public abstract class Figure implements Comparable<Figure>{
    abstract double calculateField();

    @Override
    public String toString() {
        return "Figure{}";
    }


    @Override
    public int compareTo(Figure figure) {
        return Double.compare(this.calculateField(), figure.calculateField());
    }
}
