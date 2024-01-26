package src.oops_20thjan;

public class lab174bankexample {
    public static void main(String[] args) throws CustomException{

Bank jpChase= new Bank("USD",100);
Bank hdfc= new Bank("INR",100);
Bank icici = new Bank("INR", 100);

        System.out.println(hdfc.add(jpChase));
        //System.out.println(hdfc.add(icici)); // custom exception
    }
}
