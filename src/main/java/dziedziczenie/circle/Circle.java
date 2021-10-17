package dziedziczenie.circle;

public class Circle {
    final protected double PI = Math.PI;
    protected int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    protected final double calculateSufrace() {
        return PI * radius * radius;
    }

// to tworzenie więcej niż jednej metody o tej samej sygnaturze, ale różniących się ilością argumentów
    protected final double calculateSufrace(boolean negative) {
        return 2.0; // działanie bez sensu ale nie to chciałem przekazać
    }

    protected final double calculateSufrace(int value) {
        return 2.0; // działanie bez sensu ale nie to chciałem przekazać
    }

    protected final double calculateSufrace(float value) {
        return 2.0; // działanie bez sensu ale nie to chciałem przekazać
    }
}
