package src.oops_14jan.exceptions;

public class lab165 {

    public static void main(String[] args) {

        try{
            String sh = args[0];
            int x = Integer.parseInt(sh);
            int a = 10/x;
            System.out.println(a);
            System.out.println(x);
        }

        catch(ArithmeticException | NumberFormatException |ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.getMessage());

        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());

        }
        finally {
            System.out.println("I will be executed anyhow");
        }

    }


}
