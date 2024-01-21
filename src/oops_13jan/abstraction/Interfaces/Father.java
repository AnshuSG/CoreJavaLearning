package src.oops_13jan.abstraction.Interfaces;

interface FatherI {
    void  loan1k();
  int a= 10;
    static void Print()
    {
        System.out.println("I am static method");

    }

    default void Print2(){
        System.out.println("I am default method");
    }
}
