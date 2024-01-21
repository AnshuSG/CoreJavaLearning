package src.oops_13jan.abstraction.Interfaces;

public class Son implements FatherI{
    @Override
    public void loan1k() {
        System.out.println("I will pay loan");
        FatherI.Print();
        System.out.println(FatherI.a);

    }

}
