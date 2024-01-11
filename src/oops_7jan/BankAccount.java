package src.oops_7jan;



public class BankAccount {
    String bankName;
    int balance;
  String bankCode;

    BankAccount(){
 bankName = "SBI";
 bankCode = "SBI001";
        System.out.println("default Constructor");
    }

    BankAccount(String bname,String bCode){
        this.bankName = bname;
        this.bankCode = bCode;
        System.out.println("Parametrised  Constructor");
    }
    void PrintDetails(){
        System.out.println("bankname :" + bankName);
        System.out.println("BankCode:" + bankCode);
        System.out.println("Balnce : " + balance);
    }
}
