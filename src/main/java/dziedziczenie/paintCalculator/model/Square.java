package dziedziczenie.paintCalculator.model;

import dziedziczenie.paintCalculator.model.Rectangle;

public class Square extends Rectangle {

    public Square(int a) {
        super(a, a);
    }

    @Override
    public double calculateSurface() {
        return a * a;
    }
}
