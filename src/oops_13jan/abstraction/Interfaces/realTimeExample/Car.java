package src.oops_13jan.abstraction.Interfaces.realTimeExample;

public class Car implements  Engine,Break {

 void Start(){
     System.out.println("Car started");
     breaks();
     StartEngine();
 }

    @Override
    public void breaks() {
        System.out.println("Break is working fine");
    }

    @Override
    public void StartEngine() {
        System.out.println("Engine started");
    }
}
