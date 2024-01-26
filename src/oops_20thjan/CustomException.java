package src.oops_20thjan;

public class CustomException extends Exception{

    public CustomException(String msg)
    {
super(msg);
        System.out.println("If i got this,Custom Exception");
    }


}
