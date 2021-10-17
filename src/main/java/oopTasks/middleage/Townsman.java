package oopTasks.middleage;

public class Townsman extends Citizen{

    public Townsman(String name) {
        super(name);
    }

    @Override
    protected boolean canVote() {
        return true;
    }
}
