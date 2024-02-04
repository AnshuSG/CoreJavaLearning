package src.collections_03_feb;

public class lab201 {

    public static void main(String[] args) {

        temp("sg");
        temp(123);
        temp(123.8);


        Integer result = max(3, 4);
        System.out.println(result);

        printFunc(6, 7);
    }


    public static <T> void temp(T x) {
        System.out.println(x);
    }


    public static Integer max(Integer a, Integer b) {
        if (a > b) {
            return a;

        } else {
            return b;
        }
    }

    public static <T> void printFunc(T a, T b) {
        System.out.println(a);
        System.out.println(b);
    }

}

