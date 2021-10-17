package oopTasks.middleage;

public class King extends Citizen {


    public King(String name) {
        super(name);
    }

    @Override
    protected boolean canVote() {
        return false;
    }
}
