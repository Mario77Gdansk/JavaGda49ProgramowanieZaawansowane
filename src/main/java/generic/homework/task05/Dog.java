package generic.homework.task05;

public class Dog extends Animal {

    private String lastOwnerName;

    public Dog(String name, String lastOwnerName) {
        super(name);
        this.lastOwnerName = lastOwnerName;

    }

    public String getLastOwnerName() {
        return lastOwnerName;
    }

    public void setLastOwnerName(String lastOwnerName) {
        this.lastOwnerName = lastOwnerName;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "lastOwnerName='" + lastOwnerName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
