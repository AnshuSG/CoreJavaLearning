package src.oops_14jan.exceptions;

public class lab169 {


    public static void main(String[] args) {
        Extracted2();
        System.out.println("Main execute");
    }


    private static void Extracted2(){
Extracted1();
        System.out.println("Extracted 2 execute");
    }

    private static void Extracted1(){
 Extracted();
        System.out.println("Extracted1 execute");
    }
    private static void Extracted(){

        try
        {
            String name = null;
            name.length();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }


    }
}


