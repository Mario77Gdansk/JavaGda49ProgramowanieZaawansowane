package collections.task04;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapaTest {
    public static void main(String[] args) {
//        String name;
//        Integer age;

        Map<String, Integer> hashMap = new TreeMap<>();

        hashMap.put("Adam", 25);
        hashMap.put("Zdzisława", 200);
        hashMap.put("Teresa", 125);
        hashMap.put("Tomasz", 35);
        hashMap.put("Barbara", 20);
        hashMap.put("Tadeusz", 75);

        System.out.println(hashMap);
        hashMap.put("Tomasz", 65);
        System.out.println(hashMap);
        for (String key : hashMap.keySet()) {
            System.out.println("key: "+ key + ", value " + hashMap.get(key));

        }
    }
}
