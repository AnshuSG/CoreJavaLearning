package src.oops_14jan.innerClass;

public class lab153 {
    public static void main(String[] args) {

        OOC ooc = new OOC();
       OOC.SNCI icref =  new OOC.SNCI();
       icref.show();



    }
}


class OOC{
static int o =1000;
int a = 100;

    static class SNCI{

        void show(){
            //System.out.println(a);
            System.out.println(o);
        }


    }
}