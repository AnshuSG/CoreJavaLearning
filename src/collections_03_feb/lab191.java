package src.collections_03_feb;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class lab191 {
    public static void main(String[] args) {
        Set Coursesets = new HashSet();
        Coursesets.add("ATB");
        Coursesets.add("MTB");
        Coursesets.add("PTB");
        Coursesets.add("LTB");
        Coursesets.add("OTB");

        System.out.println(Coursesets);

        for (Object o : Coursesets) {
            System.out.println(o);
        }

        Iterator it = Coursesets.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
