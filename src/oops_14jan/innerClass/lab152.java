package src.oops_14jan.innerClass;

public class lab152 {

    public static void main(String[] args) {


        Car c = new Car("Lambo146");
        Car.Engine engine = c.new Engine("400CC");
        engine.start();
    }




}

class Car{
  String make;
public Car(String make){this.make = make;}

    void drive(){
        System.out.println("You can drive a car");
    }

    public class Engine{
  String horsepower;
  public Engine(String horsepower){
      this.horsepower = horsepower;
  }

void start(){
    System.out.println("Engine started :" + make);
}

    }



}
