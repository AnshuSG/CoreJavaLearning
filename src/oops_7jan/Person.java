package src.oops_7jan;

public class Person {
String name;
int age;
int rollno;

public Person(){
    System.out.println("DC");

}

    public Person(String refname){

     this.name = refname;
    }

    public Person(String refname,int age){

        this.name = refname;
        this.age= age;
    }

    public Person(String refname,int age,int rollno){

        this.rollno = rollno;
    }

    void PrintDetails(){
        System.out.println("Your name is :" + this.name);
    }

    void PrintDetails(int age){
        System.out.println("Your age is :" + this.age);
    }
    void PrintDetails(int rollno,int age){
        System.out.println("Your rollno is :" + this.rollno);
    }

}
