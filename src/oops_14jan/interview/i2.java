package src.oops_14jan.interview;

public class i2 {
    public static void main(String[] args) {
        System.out.println(PP.a);

        PP f= new foo();
        rofl f1=new foo();
        foo f3=new foo();
        f1.say();
        f1.m1();

    }


}


interface PP{

    int a=10;
    void m1();



}

abstract  class rofl implements PP{
  abstract  void say();
}

class foo extends rofl{

    @Override
    public void m1() {
        System.out.println("m1");
    }

    @Override
    void say() {
        System.out.println("say");
    }
}


