
package collections.homework.task01;
public class Main {
    public static void main(String[] args) {
        SDAArrayList<Integer> arrayList = new SDAArrayList<>();
        arrayList.add(55);
        arrayList.add(22);
        arrayList.add(33);
        arrayList.add(44);
        arrayList.add(66);
        arrayList.add(77);
        arrayList.add(88);
        arrayList.add(99);
        arrayList.display();
        System.out.println("remove element: "+arrayList.remove(2));
        arrayList.display();
        System.out.println(arrayList.get(2));
        System.out.println("getSize: "+arrayList.getSize());

    }

}
