package src.oops_13jan.poly.methodoverriding;

public class RC {
    public static void main(String[] args) {
      Dog d= new Dog();
      d.bark();

      Hound h= new Hound();
      h.bark();

      Dog f= new Hound();  // Dynamic dispatch or Runtime Polymorphism
      f.bark();

      //Hound h = new Dog()  this is not possible
    }
}
