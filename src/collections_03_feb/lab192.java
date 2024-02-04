package src.collections_03_feb;

import java.util.Set;
import java.util.TreeSet;

public class lab192 {
    public static void main(String[] args) {
        //Set Coursesets = new HashSet();
        //Set Coursesets = new LinkedHashSet();
        Set Coursesets = new TreeSet();
        Coursesets.add("ATB");
        Coursesets.add("MTB");
        Coursesets.add("PTB");
        Coursesets.add("LTB");
        Coursesets.add("OTB");
        System.out.println(Coursesets);


    }
}
