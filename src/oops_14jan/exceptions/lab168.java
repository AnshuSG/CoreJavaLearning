package src.oops_14jan.exceptions;

import java.io.File;
import java.io.FileReader;

public class lab168 {

    public static void main(String[] args) {
        try{
            String path = "c://a.txt";
            File file = new File(path);
            FileReader filereader = new FileReader(file);

        }
        catch(Exception e)
        {

            System.out.println(e.getMessage());
    }
        finally {

        }
        }
}
