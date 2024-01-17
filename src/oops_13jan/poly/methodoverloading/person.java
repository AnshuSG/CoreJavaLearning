package src.oops_13jan.poly.methodoverloading;

public class person {


    void Gift(String a)
    {
        System.out.println("A is string :" + a);
    }
    int Gift(int x){
        System.out.println(x);
        return x;

    }

    int Gift(float x){
        System.out.println(x);
        return 89;

    }

void Gift(double x){
    System.out.println("x :" + x);
}

}
