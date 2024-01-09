package src.oops_6jan.basics;

public class equals {
    public static void main(String[] args) {
        String str1 = "Hello";
        StringBuilder stringbuilder = new StringBuilder("Hello");
        String s3 = stringbuilder.toString();
        System.out.println(stringbuilder);
        String str2 = new String("Hello");
        String str3 = new String("hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        //strings are mutable whereas Stringbuffer and stringbuilder are immutable in nature


        StringBuilder sb3 =  new StringBuilder("Surekha");
        sb3.append("Ganti");
        sb3.append(123);
        sb3.reverse();
        System.out.println(sb3);

        StringBuffer sb4 =  new StringBuffer("Surekha");
        sb4.append("Ganti");
        System.out.println(sb4);


    }
}
