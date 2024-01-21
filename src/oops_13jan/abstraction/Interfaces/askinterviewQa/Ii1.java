package src.oops_13jan.abstraction.Interfaces.askinterviewQa;

public class Ii1 {
    public static void main(String[] args) {

        Hello h= new Hello();
        h.say();
        h.hello();

        I9  i = new Hello();
         i.hello();

    }


}

interface I9
{
    void say();
    default  void hello(){
        System.out.println("Hello default");
            }

}

interface P{

}


class Hello implements I9{


    @Override
    public void say() {
        System.out.println("Say");
    }

    @Override
    public void hello() {
        System.out.println("Hello of Hello");
    }
}