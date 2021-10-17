package oopTasks.highway;


import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Highway highway = new Highway();
        highway.vehicleEntry("AB111CD", CarType.CAR);
        Thread.sleep(100);
        highway.vehicleEntry("AB222CD", CarType.CAR);
        Thread.sleep(100);
        highway.vehicleEntry("AB333CD", CarType.CAR);
        Thread.sleep(100);

        highway.searchVehicle("AB222CD");
        highway.vehicleLeave("AB222CD");

        System.out.println("Cześć zaczynamy...\nmożesz operować na komendach:\n[wjazd] \n" +
                "[wyjazd]\n" +
                "[sprawdz]\n" +
                "póżniej odpowiadaj na pytania serwisu:-)");

//        String[] command=new String[3];
//        Scanner scanner = new Scanner(System.in);
//        do{
//            System.out.println("Wprowadź komende: ");
//            command = scanner.nextLine();
//
//        }while (command.equalsIgnoreCase("quit"));

//        String command;
//
//        do {
//
//            System.out.println("Wprowadz komende: "); //może być wypisanie wszystkich opcji
//            command = scanner.nextLine();  //do Stringa o nazwie command dodaję to co jest w nextLine
//            String[] words = command.split(" ");
//            //words jest wektorem String[] podzielonym przez split(" ")
//            //argumentem split jest regex w postaci pojedynczej spacji
//            // jeżeli ktyoś wpisze: "serwis aukcyjny allegro" to otrzyma
//            // words = { "serwis", "aukcyjny", "allegro"}
//
//            // user list
//            if (words[0].equalsIgnoreCase("wjazd")) {
//                highway.vehicleEntry(handle(words));handle(words);
//            }else if (words[0].equalsIgnoreCase("subject")) {
//                subjectHandler.handle(words);
//            }
//            else if (words[0].equalsIgnoreCase("category")) {
//                categoryHandler.handle(words);
//            }
//            else if (words[0].equalsIgnoreCase("question")) {
//                questionHandler.handle(words);
//            }
//            else if (words[0].equalsIgnoreCase("test")) {
//                learningHandler.handle();
//            }
//        } while (!command.equalsIgnoreCase("quit"));
//
//    }
//    public void handle(String[] words) {
//        if (words[1].equalsIgnoreCase("list")) {
//            handleListUsers();
//        } else if (words[1].equalsIgnoreCase("add")) {
//            handleAddUser(words);
//        }

    }
}
