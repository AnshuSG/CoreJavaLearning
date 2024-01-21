package src.oops_14jan;

public class lab151 {

    public static void main(String[] args) {
        PO1 po1= new PO1();
        PO1 po2 = new PO1();
        PO1.m2();
        po1.m1();
        po1.m2();

        PO1 po3 = null;
       // po3.m1();
        po3.m2();


    }




}


class PO1{
     static
     {
         System.out.println("SIB");
     }


    {
        System.out.println("IIB");
    }

   int a=10;
     static int b=20;


     void m1(){
         System.out.println("m1");
         System.out.println(a);
         System.out.println(b);
     }

     static void m2(){

         System.out.println("m2");
         //System.out.println(a);
         System.out.println(b);

     }


}