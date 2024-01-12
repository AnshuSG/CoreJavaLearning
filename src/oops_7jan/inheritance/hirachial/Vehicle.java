package src.oops_7jan.inheritance.hirachial;



public class Vehicle {

    Vehicle(){
        System.out.println("DC Vehicle");
    }
    void VehicleTopSpeed(){
        System.out.println("yeah from:" + getClass().getSimpleName());
    }

}
