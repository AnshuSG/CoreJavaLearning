package src.oops_14jan;

public class StaticDemo {


    public static String Colegename ="TESTINGTESTINGA";

    public int Versionno = 3;



    //static Method
    public static void printname(){

        int age = 40;
        System.out.println("name is :" + Colegename);
        // You can't have an Instance variable into the Static Method!!
        //System.out.println("Version is :" + Versionno);

    }

//Non static Method
    public void PrintVersion(){
  int age = 40;


        System.out.println("name is :" + Colegename);
        System.out.println("Version is :" + Versionno);

    }

}
