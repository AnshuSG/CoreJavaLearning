package src.oops_13jan.accessmodifiers.police;

public class cop {

    public int gun;

     public cop(int gun){
        this.gun = gun;
    }


    protected void canIShoot(){
        System.out.println("of course shoot");
    }
}
