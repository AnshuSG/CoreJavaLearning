package src.oops_7jan.inheritance.multilevel;

public class lab148 {
    public static void main(String[] args) {
        GrandFather g = new Son();
        g.Bhk3();

        Father f = new Son();
        f.BHK2();
        f.Bhk3();

        Son s = new Son();
        s.BHK1();
        s.BHK2();
        s.Bhk3();

        //Son s1= new GrandFather();



    }


}
