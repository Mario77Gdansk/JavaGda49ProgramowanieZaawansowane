package tasks;

public class Main {
    public static void main(String[] args) {
        SuperBohater bohater1 = new SuperBohater("SpiderMan","climbing");
        SuperBohater bohater2 = new SuperBohater("superMan", "flying");
        SuperBohater bohater3 = new SuperBohater("KungFuPanda", "fighting");
        bohater1=bohater2;
        bohater1 = null;
        System.out.println(bohater2==null);

        bohater1=null;
        bohater2=bohater1;
        bohater1=bohater3;
        System.out.println(bohater1==null);
        System.out.println(bohater2==null);
        System.out.println(bohater3==null);

        String ala1 = "Ala";
        String ala2 = "Ala";
        String ala3 = new String("Ala");
        String ala4 = new String("Ala");

        System.out.println(ala1==ala2);
        System.out.println(ala1==ala3);
        System.out.println(ala4==ala3);
        System.out.println(ala1.equals(ala2));
        System.out.println(ala1.equals(ala3));
        System.out.println(ala3.equals(ala4));

    }
}
