package src.oops_7jan;

public class lab144 {
    public static void main(String[] args) {
       BankAccount sbi = new BankAccount();
       sbi.PrintDetails();

       BankAccount hdfc =  new BankAccount("HDFC","hdfc001");
       hdfc.PrintDetails();

        BankAccount icici =  new BankAccount("ICICI", "ICICI003");
        icici.PrintDetails();

    }
}
