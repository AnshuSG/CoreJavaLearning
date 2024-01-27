package src.oops21jan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class lab183 {
    public static void main(String[] args) {
        List<String> CourseList = new ArrayList<>();
        CourseList.add("ATB");
        CourseList.add("MTB");
        CourseList.add("PyAtb");
        CourseList.add("Lapib");
        CourseList.add("sdet blueprint");

        List numlist = new ArrayList();
        numlist.add(1);
        numlist.add(2);
        numlist.add(3);

        CourseList.addAll(numlist);


        Iterator iterator = CourseList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
            //CourseList.add("dffg"); // Concurrent modification exception
        }


    }


}
