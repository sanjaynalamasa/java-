public class Inheritance {
    public static void main(String[] args) {
        Fish f1 = new Fish();
        f1.eat();
        f1.breath();
        f1.color = "red";
        f1.swim();
    }
    
}
class Animal{
    String color;
    void eat() {
        System.out.println("Animal Eats");
    }
    void breath() {
        System.out.println("it breath Air");
    }
}

class Fish extends Animal{
    int fins;
    void swim() {
        System.out.println("Fish can Swim");
    }
}
