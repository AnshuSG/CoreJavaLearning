package src.oops_13jan.accessmodifiers.police;

public class jrCop {
    public static void main(String[] args) {
        cop jrCop = new cop(2);
        System.out.println(jrCop.gun);
        jrCop.canIShoot();
    }
}
