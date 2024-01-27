package src.oops_20thjan;

import java.util.ArrayList;
import java.util.List;

public class lab179 {
    public static void main(String[] args) {
        // List mylist = new List();// Not possible becoz list is an interface
        List mylist = new ArrayList();
        mylist.add(1);
        mylist.add("SG");
        mylist.add(123);
        mylist.add(true);
        System.out.println(mylist);
        mylist.set(1, "YAK");
        System.out.println(mylist);
        mylist.remove("YAK");
        System.out.println(mylist);

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }


        for (Object o : mylist) {
            System.out.println(o);
        }

    }


}




