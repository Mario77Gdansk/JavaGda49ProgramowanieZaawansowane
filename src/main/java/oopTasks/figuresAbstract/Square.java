package oopTasks.figuresAbstract;

public class Square extends Rectangle {
    public Square() {
        color = "unknown";
        isColored = false;
        width = length;
    }

    public Square(String color, boolean isColored, float size) {//tu nie wiedziałem , wprowadził zmienną size ale lokalnie w konstruktorze
        super(color, isColored, size, size);
    }

    @Override
    public void setWidth(float width) {
        super.setWidth(width);
        super.setLength(width);
    }
    @Override
    public void setLength(float length) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public String toString() {
        return String.format("Square with size=%s which is a sublass of %s",width, super.toString());
    }



}
