package src.oops_13jan.accessmodifiers.criminal;

import src.oops_13jan.accessmodifiers.police.cop;

public class Thief {
    public static void main(String[] args) {
        cop  cop = new cop(10);
        System.out.println(cop.gun);
        //cop.canIShoot();
    }
}
