package generic.task02;

public class Main {
    public static void main(String[] args) {
        MyList myList = new MyList(3);
        System.out.println(myList.getActualSize());
        myList.addElement("Adam");
        System.out.println(myList.getActualSize());
        myList.addElement("Zosia");
        System.out.println(myList.getActualSize());
        System.out.println("[" + myList.toString() + "]");
        System.out.println("Czy zawiera null? ... " + myList.contains(null));
        System.out.println("Czy zawiera \"Zosia\"? ... " + myList.contains("Zosia"));
        System.out.println("próba dodania elementu \"Feliks\" ... " + myList.addElement("Feliks"));
        System.out.println("próba dodania elementu \"Feliks\" ... " + myList.addElement("Feliks"));
        ;


    }
}
