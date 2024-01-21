package src.oops_14jan;

public class lab150 {

    public static void main(String[] args) {
        StaticDemo s1= new StaticDemo();
        s1.Versionno = 199;
        StaticDemo.Colegename = "TTA";
        StaticDemo s2= new StaticDemo();
        s2.Versionno = 299;

        s1.PrintVersion();;
        s2.PrintVersion();



    }
}
