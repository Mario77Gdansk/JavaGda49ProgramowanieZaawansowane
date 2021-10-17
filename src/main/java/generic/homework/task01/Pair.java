package generic.homework.task01;

public class Pair<T, U> {
    private T object01;
    private U object02;

    public Pair(T object01, U object02) {
        this.object01 = object01;
        this.object02 = object02;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "object01=" + object01 +
                ", object02=" + object02 +
                '}';
    }

    public T getObject01() {
        return object01;
    }

    public void setObject01(T object01) {
        this.object01 = object01;
    }

    public U getObject02() {
        return object02;
    }

    public void setObject02(U object02) {
        this.object02 = object02;
    }
}
