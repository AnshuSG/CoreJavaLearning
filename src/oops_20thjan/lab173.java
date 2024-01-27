package src.oops_20thjan;

import java.io.File;
import java.io.FileReader;

public class lab173 {

    public static void main(String[] args) {
        int a = 10 / 0;  //Unchecked exception JVM will handle

        //Checked exception
        try {
            FileReader f = new FileReader(new File("C://h.txt"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
