public class multi_level_inheritance {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.color = "White";
        System.out.println(d1.color);
        d1.legs = 4;
        System.out.println(d1.legs);
        d1.brak();
        d1.breath();
        d1.eat();

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
class Mammals extends Animal{
    int legs;
}

class Dog extends Mammals{
    void brak() {
        System.out.println("Dog Braks");
    }
}
