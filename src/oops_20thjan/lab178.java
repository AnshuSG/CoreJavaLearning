package src.oops_20thjan;

import java.util.List;


public class lab178 {
    public static void main(String[] args) {
        List Fruits = List.of("apple", "orange", "grapes", "banana", "watermelon");
        List marks = List.of(1, 2, 3, 4, 5, 67, 9);
        List Shoppingitems = List.of("aataa", "milk", "bread", "butter");
        List differentdatatypes = List.of("sg", 1, 2.5, true);

        System.out.println(Fruits.get(0));
        System.out.println(Fruits.size());
        System.out.println(Fruits.indexOf("banana"));
        System.out.println(Fruits);
        System.out.println(Fruits.isEmpty());
        //Fruits.add("SG");

        //Fruits.remove("orange");
        System.out.println(Fruits);

        //ArrayList and Linkedlist have full auth on add and remove


    }
}
