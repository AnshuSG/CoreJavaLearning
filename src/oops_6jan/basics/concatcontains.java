package src.oops_6jan.basics;

public class concatcontains {

    public static void main(String[] args) {

        String name="Surekha";  // String Pool
        String name2 = new String("Ganti");  // Heap Area

        String str1 = "Hello";
        str1 = str1.concat('\t'+"World");
        System.out.println(str1);
        System.out.println(str1 + '\t' + "Rekha");
        System.out.println(name2.contains("F"));

        String ExpResult = "Password@123";
        String ActResult = "password@123";

        if (ActResult.equalsIgnoreCase(ExpResult))
        {
            System.out.println("Yes");
        }




    }
}
