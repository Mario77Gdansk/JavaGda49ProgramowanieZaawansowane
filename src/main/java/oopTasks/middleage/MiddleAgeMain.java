package oopTasks.middleage;

public class MiddleAgeMain {
    public static void main(String[] args) {
        King king = new King("Lear");
        Peasant peasant01 = new Peasant("John");
        Peasant peasant02 = new Peasant("Rick");
        Townsman townsman01 = new Townsman("Carpenter");
        Townsman townsman02 = new Townsman("Sealsman");
        Soldier soldier01 = new Soldier("Kneht");
        Soldier soldier02 = new Soldier("Knecht");
        Citizen[] citizens = new Citizen[]{king, peasant01,peasant02,townsman01,townsman02,soldier01,soldier02};
        Town town = new Town(citizens);
        System.out.println(town.howManyCanVote()+" can vote");
        town.whoCanVote();
    }
}
