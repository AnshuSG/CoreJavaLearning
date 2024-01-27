package src.oops21jan;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class lab184 {
    public static void main(String[] args) {
        List ttaCourselist = new ArrayList<>();
        ttaCourselist.add("ATB");
        ttaCourselist.add("MTB");
        ttaCourselist.add("STB");
        ttaCourselist.add("KTB");
        ttaCourselist.add("JTB");

        ListIterator lt = ttaCourselist.listIterator();
        while (lt.hasNext()) {
            System.out.println(lt.next());
        }
        System.out.println("------------------");
        ListIterator lt2 = ttaCourselist.listIterator(ttaCourselist.size());
        while (lt2.hasPrevious()) {
            //ttaCourselist.add("Gen AI");// concurrent modification exception
            //lt2.add("utb");
            System.out.println(lt2.previous());
        }


    }
}
