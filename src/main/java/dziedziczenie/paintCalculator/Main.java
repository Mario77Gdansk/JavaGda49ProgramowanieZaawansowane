package dziedziczenie.paintCalculator;

import dziedziczenie.paintCalculator.model.*;
import dziedziczenie.paintCalculator.service.PaintSimulator;

public class Main {

    public static void main(String[] args) {
        Figure figure01 = new Square(5); //25
        Figure figure02 = new Rectangle(2, 5); //10
        Figure figure03 = new Trapeze(5, 1, 2); //6
        Figure figure04 = new Circle(1); //3,14

        Figure[] figures = new Figure[]{figure01, figure02, figure03, figure04};


        System.out.println(PaintSimulator.calculatePaintQuantity(figures,10));
        Figure figure05 = new Square(-3);
    }
}
