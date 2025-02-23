public class hybrid_inheritance {
     
    
}

class Animal{
    int legs = 4;
    void breath() {
        System.out.println("breath");
    }
    void walk(){
        System.out.println("walk");
    }
}

class Fish extends Animal{
    int fins = 6;
    void swim() {
        System.out.println("it can Swim");
    }
}
class Shark extends Fish{
    void eat(){
        System.out.println("it eats all fishes");
    }
}
class Bird extends Animal{
    String bName = "peacock";
    void fly() {
        System.out.println("it can fly");
    }
}
class Mammal extends Animal{
    String mName = "karthik";
    void any(){
        System.out.println("Antthing comes under this");
    }
}
