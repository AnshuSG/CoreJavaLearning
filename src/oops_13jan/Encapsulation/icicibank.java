package src.oops_13jan.Encapsulation;

public class icicibank {
String name;
long bal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {

        if(bal > 0) {
            this.bal = bal;
        }
        else{
            System.out.println("Not allowed!!");
        }


    }

    public icicibank(String name, long bal) {
    this.name = name;
    this.bal = bal;
}

}
