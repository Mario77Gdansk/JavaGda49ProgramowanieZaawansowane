package oopTasks.middleage;

public class Soldier extends Citizen{

    public Soldier(String name) {
        super(name);
    }

    @Override
    protected boolean canVote() {
        return true;
    }
}
