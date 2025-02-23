class Parent{
    Parent(int a) {
        System.out.println("parent "+ a);
    }
}
class Child extends Parent{
    Child(int b) {
        super(b);
        System.out.println("Child");

    }
}
public class constructor_inheritance {
    public static void main(String [] args) {
        Child ch = new Child(4);

    }
    
}
