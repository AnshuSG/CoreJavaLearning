package src.oops_20thjan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class lab175 {
    public static void main(String[] args) {
        String path = "C://a.txt";
        try {
            FileInputStream file = new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
