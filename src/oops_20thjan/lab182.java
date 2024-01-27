package src.oops_20thjan;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class lab182 {
    public static void main(String[] args) {
        List<String> mylist = new LinkedList();
        mylist.add("SG");
        mylist.add("SR");

        List<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);

        Iterator iterator = l.iterator();
        while (iterator.hasNext()) {
            // l.add(4); // Not possible with linked list iterator
            System.out.println(iterator.next());
        }
    }

}

