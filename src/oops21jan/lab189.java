package src.oops21jan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lab189 {
    public static void main(String[] args) {
        List<Integer> marks = new ArrayList<>();
        marks.add(56);
        marks.add(89);
        marks.add(75);
        marks.add(64);

        Collections.sort(marks);
        System.out.println(marks);


        Student student = new Student(1, "SG");
        Student student2 = new Student(10, "ASD");
        Student student3 = new Student(3, "BNM");

        List<Student> students = new ArrayList<>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        System.out.println(students);
        Collections.sort(students);
        // Comparable -> 1 id or name not both are not allowed -

        //Collections.sort(students);

        // Comparator - id, name
        // Create a class and implement comparator and tell the Interge
        System.out.println(students);


    }


}
