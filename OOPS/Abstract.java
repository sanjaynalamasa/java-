public class Abstract {
    public static void main(String args[]) {
        Chicken h1 =  new Chicken();
        // h1.eat();
        // h1.walk();

    }
    
}
abstract class Animal1{
      //constructor
          Animal1() {
        System.out.println("Animal constructor Called");
    }
    void eat(){  //we cannot create a object 
        System.out.println("animal eat");
    }

    abstract void walk(); //we cannot write the implementation in abstract methods.
}
class Horse extends Animal1{

    Horse() {
        System.out.println("Horse constructor called");
    }
    void walk() {
        System.out.println("walks with 4 legs");  //this is implementation in another class
    }
}
class Chicken extends Horse{
    Chicken() {
        System.out.println("chicken constructor called");
    }
    void walk() {
        System.out.println("walks with 2 legs");
    }

}
