package src.oops_14jan.innerClass;

public class lab158 {
    public static void main(String[] args) {
       // parent parent = new parent();
        //child child = new child();
        //parent = child;
       // //child = parent;



        Hello hello = new Child2();
        Hello hello2 = new Hello();

        Child2 hai= (Child2)hello; // Downcasting in class
        Child2 hai2= (Child2)hello2; // Downcasting in class


    }

}


class Hello{}
class Child2 extends Hello{}

class parent{}
class child extends parent{}