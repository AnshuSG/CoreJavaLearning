package src.oops_20thjan;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

public class lab181 {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
        Collection stringlist = new ArrayList();

        mylist.add(1);
        stringlist.add("SG");
        Vector v = new Vector<>(); //only one thread wil be running
        v.add("SG");//t1
        v.add("SR");//t1
        System.out.println(v);


    }
}
