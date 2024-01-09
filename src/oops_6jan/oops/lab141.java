package src.oops_6jan.oops;

public class lab141 {
    public static void main(String[] args) {
        // Person - class blueprint
        // p - ref variable
        // new Person() - Object Real
        // OOPs concept

        Person p = new Person();
        p.Sleep();
        p.name = "Surekha";
        System.out.println(p.name);

        Person p2= new Person();
        p2.eat();
        p2.name = "Ganti";
        System.out.println(p2.name);

        new Person();
Person p3 = new Person();
        System.out.println(p3.isMarried());

    }
}
