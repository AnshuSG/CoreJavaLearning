package src.oops_14jan.innerClass;

public class lab156 {
    public static void main(String[] args) {
        Thread t = new Thread(){
  public void run()
  {
      System.out.println(" I am a thread");
  }
        };

        t.run();
    }
}
