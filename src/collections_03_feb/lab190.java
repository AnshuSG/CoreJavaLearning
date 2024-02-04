package src.collections_03_feb;

import java.util.HashSet;
import java.util.Set;

public class lab190 {
    public static void main(String[] args) {
        Set<String> fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("watermelon");
        //fruits.add(123);
        System.out.println(fruits);
        System.out.println(fruits.isEmpty());
        System.out.println(fruits.contains("apple"));
        System.out.println(fruits.size());


    }

}
