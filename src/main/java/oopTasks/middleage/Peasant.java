package oopTasks.middleage;

public class Peasant extends Citizen {

    public Peasant(String name) {
        super(name);
    }

    @Override
    protected boolean canVote() {
        return false;
    }
}
