package src.oops_14jan.innerClass;

public class lab154 {
    public static void main(String[] args) {
        SG.IPad ipad = new SG.IPad();
        ipad.eating();
    }
}



class SG{
int age = 31;
void eat(){
    System.out.println("I am eating");
}

static  class IPad{
    void eating(){
        System.out.println("I am ipad");
    }

}
}