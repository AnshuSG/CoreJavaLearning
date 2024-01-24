package src.oops_14jan.interview;

import org.w3c.dom.ls.LSOutput;

public class I1 {
    public static void main(String[] args) {
        System.out.println(H.a);
        //H.m1();
        sg g=new sg();
        g.m1();


    }
}


interface H{
    int a =10;
    void m1();

}

class sg implements H{

    @Override
    public void m1() {
        System.out.println("m1 called");
    }
}