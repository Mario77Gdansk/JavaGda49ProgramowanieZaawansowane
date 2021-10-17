package dziedziczenie.circle;

public class MyCircle extends Circle{


    protected double PI = 3.14d;

    public MyCircle(int radius) {
        super(radius);
    }


//    public Circle(int radius) {nie da się tego zrobić
//        super(radius);
//        this.radius = radius;
//        System.out.println("Say sth");
//    }

// nie wolno tego zrobić bo zobacz że w Circle masz metodę calculateSurface jako final
//    @Override
//    protected final double calculateSufrace() {
//        return PI*radius*radius;
//    }
}
