package src.oops_14jan.exceptions;

import java.io.FileInputStream;

public class lab164 {
    public static void main(String[] args) {

        //String name=null;
        //name.trim(); // Unchecked runtime exception

        try {
            FileInputStream f = new FileInputStream("dsadsa.txt");  // Checked compile time exception

        }
        catch(Exception e)
        {

        }
    }
}
