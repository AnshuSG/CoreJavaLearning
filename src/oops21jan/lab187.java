package src.oops21jan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lab187 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(90);
        marks.add(45);
        marks.add(78);

        Collections.sort(marks);
        System.out.println(marks);

    }
}
