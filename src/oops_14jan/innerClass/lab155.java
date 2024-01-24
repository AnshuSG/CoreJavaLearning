package src.oops_14jan.innerClass;

import src.oops_13jan.Encapsulation.Student;

public class lab155 {
    public static void main(String[] args) {

        student s1 = new student() {
            @Override
            public void setId() {

            }
        };



     B b = new B(){
// This is anonymous class
         //no name implements
     };

    }

}



abstract class B{
int var_b = 12;

}


interface student{

    int id=10;
  void setId();
}