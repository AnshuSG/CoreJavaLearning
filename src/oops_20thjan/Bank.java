package src.oops_20thjan;

public class Bank {



    private String Currency;
    private Integer amount;

    public Bank(String currency, Integer amount) {
        this.Currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return Currency;
    }

    public void setCurrency(String currency) {
        Currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

public Integer add(Bank bankname) throws CustomException{
        if (!(bankname.Currency.equalsIgnoreCase("INR")))
        {
throw new CustomException("USD to INR not supported");
        }
Integer sum=this.amount + bankname.amount;
        return sum;


}



}
