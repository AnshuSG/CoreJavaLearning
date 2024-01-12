package src.oops_7jan.inheritance;

public class Programming {


    int Version;
    String author;

    Programming(){
        System.out.println("Programming DC");
    }

    Programming(int Versionno, String authorname){
        this.Version = Versionno;
        this.author = authorname;
    }

    void printinfo(){
        System.out.println("Versionno:" + Version + "Author:" + author);
    }

    void car(){
        System.out.println("Lambogharni");
    }

    void bhk3()
    {
        System.out.println("BHK3");
    }


}
