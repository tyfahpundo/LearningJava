package practice;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101,"Tafadzwa");
        map.put(102,"Tafara");
        map.put(103,"Tanyaradzwa");
        map.put(104,"Tadiwa");
        map.put(105,"Delight");

        System.out.println(map);
        System.out.println(map.containsKey(101));
        System.out.println(map.containsKey(106));
        map.remove(101);
        System.out.println(map);

        System.out.println(map.containsValue("Tafara"));
        System.out.println(map.isEmpty());

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.entrySet());

        for(Object i: map.values()){
            System.out.println(i);
        }
        for(Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+"     "+entry.getValue());
        }
    }
}
