package oopTasks.computer;

public class ComputerMain {
    public static void main(String[] args) {
        Computer computer01 = new Computer(400,"AMD",ProcesorType.MULTI_CORE);
        Computer computer02 = new Computer(500,"INTEL",ProcesorType.MULTI_CORE);
        Computer computer03 = new Computer(400,"APPLE",ProcesorType.MULTI_CORE);
        Computer computer04 = new Laptop(350,"Lenovo",ProcesorType.MULTI_CORE,21,false);
        Computer computer05 = new Laptop(450,"MyBOOK",ProcesorType.MULTI_CORE,21,true);

        Computer[] computers = new Computer[5];
        computers[0] = computer01;
        computers[1] = computer02;
        computers[2] = computer03;
        computers[3] = computer04;
        computers[4] = computer05;

        for (Computer item:computers
             ) {
            System.out.println(item.toString());

        }

    }
}
