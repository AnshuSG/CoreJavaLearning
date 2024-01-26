package src.oops_20thjan;

public class lab170 {

    public static void main(String[] args) {


        extracted(0);


    }

    private static void extracted(int b) {
        int a;
//        if (b==0)
//        {
//            throw new ArithmeticException("b cant be zero");
//        }
//        else
//        {
//a=10/b;
//        }
//
//        System.out.println(a);


        try {
           a=10/b;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {


        }

        }


    }



