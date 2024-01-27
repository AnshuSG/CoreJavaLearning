package src.oops21jan;

import java.util.Enumeration;
import java.util.Vector;

public class lab185 {
    public static void main(String[] args) {
        Vector<String> v2 = new Vector();
        v2.add("SG");
        v2.add("SA");
        v2.add("SR");
        //v2.add(1);

        Enumeration e = v2.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

    }
}
