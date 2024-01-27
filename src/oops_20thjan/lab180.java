package src.oops_20thjan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab180 {

    public static void main(String[] args) {
        List<String> mylist = new ArrayList<>();
        mylist.add("SG");
        mylist.add("SA");
        mylist.add("SR");


        //mylist.add(1);
        System.out.println(mylist);
        mylist.set(0, "yak");
        System.out.println(mylist);
        mylist.remove("yak");
        System.out.println(mylist);

        System.out.println("------");

        //for loop
        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
        System.out.println("-----------------------");
        //for each loop
        for (String o : mylist) {
            System.out.println(o);
        }
        System.out.println("-----------------------");
        //iterator
        Iterator iterator = mylist.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
