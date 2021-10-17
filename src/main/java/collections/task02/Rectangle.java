package collections.task02;

public class Rectangle extends Figure {
    protected int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    double calculateField() {
        return this.a * this.b;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rectangle rectangle = (Rectangle) o;

        if (a != rectangle.a) return false;
        return b == rectangle.b;
    }

    @Override
    public int hashCode() {
        int result = a;
        result = 31 * result + b;
        return result;
    }

    @Override
    public String toString() {
        return "Rectangle{ Field=" + calculateField() + '}';
    }
}
