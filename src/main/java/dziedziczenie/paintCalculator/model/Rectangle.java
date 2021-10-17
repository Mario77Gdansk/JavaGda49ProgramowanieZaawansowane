package dziedziczenie.paintCalculator.model;

public class Rectangle extends Figure {
    protected int a;
    protected int b;

    public Rectangle(int a, int b) {
        if(a<0 || b<0) {
            throw new IllegalArgumentException("There is no possibility to create negative length figure");
        }
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculateSurface() {
        return a * b;
    }
}
