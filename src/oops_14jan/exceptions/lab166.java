package src.oops_14jan.exceptions;

public class lab166 {

    public static void main(String[] args) {
        //Junior QA Code

        int a = 0;
        try {
            a = Integer.parseInt(args[0]);
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            exception.getMessage();
        }

        try {
            int b = 10 / a;
        } catch (ArithmeticException exception) {
            exception.printStackTrace();
            exception.getMessage();
        }


        try {
            String ip = args[0];
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
            exception.getMessage();
        }



    }
}
