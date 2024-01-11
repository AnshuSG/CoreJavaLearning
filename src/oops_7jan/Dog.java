package src.oops_7jan;

public class Dog {
    String name;

    Dog(){
        System.out.println("DC");
    }

    Dog(String nameref )
    {
        this.name = nameref;
        System.out.println("PC");
    }

    void bark()
    {
int age=10;
        System.out.println("name is:" + this.name);
    }


}
