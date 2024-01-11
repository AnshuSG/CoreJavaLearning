package src.oops_7jan;

import java.sql.SQLOutput;

public class ATBPerson {
    String name;
    long phone;
    String Email;
    boolean isMarried;
    String CourseName;

    //Default Constructor

  ATBPerson(){
      System.out.println("I am default");

      CourseName = "ATB";


  }

    ATBPerson(String ValuefromObjref){
      this.name = ValuefromObjref;

    }

    void talk(){
        System.out.println("Talk!");
    }

    void printDetails(){
        System.out.println(this.name);
        System.out.println(CourseName);
    }










}
