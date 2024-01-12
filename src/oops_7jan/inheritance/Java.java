package src.oops_7jan.inheritance;

public class Java extends Programming {


    String newFeature;

    Java(){
        System.out.println("Java DC");
    }

    Java(String feature){
        this.newFeature = feature;
    }

    void printinfo(){
        System.out.println("Feature is :" + newFeature);
        System.out.println("author is:" + author);
    }
}
