package src.oops_14jan.innerClass;

public class lab157 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am thread");
            }
        };

        r.run();
    }
}
