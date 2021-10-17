package generic.homework.task05;

public class Cat extends Animal {

    private boolean isCastrated;
    public Cat(String name, boolean isCastrated) {
        super(name);
        this.isCastrated = isCastrated;
    }

    public boolean isCastrated() {
        return isCastrated;
    }

    public void setCastrated(boolean castrated) {
        isCastrated = castrated;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isCastrated=" + isCastrated +
                ", name='" + name + '\'' +
                '}';
    }
}
