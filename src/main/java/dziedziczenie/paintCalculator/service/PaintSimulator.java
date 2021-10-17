package dziedziczenie.paintCalculator.service;

import dziedziczenie.paintCalculator.model.*;

public class PaintSimulator {



    public static double calculatePaintQuantity(Figure[] figures, double canCapacity) {
        double currentSum = 0;
        for (Figure figure : figures) {
            currentSum += figure.calculateSurface();
        }
        return Math.ceil(currentSum/canCapacity);
    }
}
