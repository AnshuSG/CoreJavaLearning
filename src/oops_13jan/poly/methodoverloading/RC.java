package src.oops_13jan.poly.methodoverloading;

import src.oops_13jan.poly.methodoverloading.person;

public class RC {

    //Method Overloading, same name different parameters
    public static void main(String[] args) {
        new person().Gift(1);
        new person().Gift(6.7);
        new person().Gift("Surekha");
    }
}
