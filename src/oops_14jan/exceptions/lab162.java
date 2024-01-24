package src.oops_14jan.exceptions;

public class lab162 {
    public static void main(String[] args) {

        try {
            String name = null;
            name.trim();
            System.out.println("i m sg");
        }
        catch(Exception e){
            System.out.println(" You are trying to print a null whicj is not possible in java");

        }
        System.out.println(" I am the end");



    }





}
