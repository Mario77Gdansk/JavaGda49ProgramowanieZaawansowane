package oopTasks.middleage;

 abstract class Citizen {

     protected String name;

     public Citizen(String name) {
         this.name = name;
     }

     public String getName() {
         return name;
     }

    protected abstract boolean canVote();
}
