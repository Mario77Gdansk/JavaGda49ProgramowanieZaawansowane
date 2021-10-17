package dziedziczenie.paintCalculator.model;

public class Trapeze extends Figure {

    private double a, b, h;

    public Trapeze(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public double calculateSurface() {
        return (a + b) * h * 0.5;
    }
}
