package collections;

import java.util.LinkedList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<String> lista = new LinkedList<>();
        wyswietlListe(lista);

    }
    private static void wyswietlListe(List lista){
        System.out.println(lista);
    }
}
