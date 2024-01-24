package src.oops_14jan.exceptions;

public class lab167 {

    public static void main(String[] args) {
  try{
      int a= 0;
      int x= 10/a;


  }
  catch(Exception e)
  {
      System.out.println(e.getMessage());
      System.out.println("Exit");
      //System.exit(0);
  }
  finally {
      System.out.println("I am the end");
  }
    }


}
