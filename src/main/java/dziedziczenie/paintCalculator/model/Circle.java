package dziedziczenie.paintCalculator.model;

public class Circle extends Figure {

    protected int radius;

    public Circle(int radius) {
        if(radius<0){
            throw new IllegalArgumentException("There is no possibility to create negative radius cicle");
        }
        this.radius = radius;
    }

    @Override
    public double calculateSurface() {
        return Math.PI*radius*radius;
    }
}
