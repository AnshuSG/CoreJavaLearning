package src.oops_20thjan;

import java.io.File;
import java.io.FileReader;

public class lab172 {

    public static void main(String[] args) throws Exception {
        main("sg");

    }

    static void main(String a) throws Exception {
        FileReader f = new FileReader(new File("c://a.txt"));
        if (a.equalsIgnoreCase(a)) {
            throw new ArithmeticException();
        }
    }
}
