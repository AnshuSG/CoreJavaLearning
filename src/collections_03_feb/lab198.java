package src.collections_03_feb;

import java.util.LinkedHashMap;
import java.util.Map;

public class lab198 {
    public static void main(String[] args) {
        //Map<String,Integer> map = new HashMap<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        //Map<String,Integer> map = new TreeMap<>();
        map.put("id", 1);
        map.put("id1", 2);
        map.put("id2", 3);
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("id"));
        System.out.println(map.containsValue(2));
        System.out.println(map.keySet());
        System.out.println(map.get("id3"));
        System.out.println(map.values());


        for (Map.Entry<String, Integer> item : map.entrySet()) {
            System.out.println(item.getKey() + " " + item.getValue());
        }

    }
}
