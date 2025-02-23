public class class_objects {
    public static void main(String[] args) {
        Pen p1 =  new Pen(); //created a pen object called p1.
        p1.setColor("blue");
        System.out.println(p1.getColor(null));
        p1.setTip(40);
        System.out.println(p1.getTip(5)); //calling the objects by 

        //created a Student object called s1.
        Student s1 = new Student();
        s1.calPercentage(55,66,66);
        System.out.println(s1.percentage);

        //created a BankAccount object myAcc.
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "sanjaynalamasa";
        //myAcc.password = "6566565"; it cant acces but we have method so we can acces by setPassword
        myAcc.setPassword("8855552");
        System.out.println(myAcc.userName+" ");
    }
}
class Pen{
    //attributes or properties of pen
    String color;
    int tip;
    //functions
    //getter
     String getColor(String newColor) {
        return this.color;
     }
     int getTip(int newTip) {
        return this.tip = newTip;
     } 

     //setter
     void setColor(String newColor) {
        this.color = newColor;
     }
     void setTip(int newTip) {
        this.tip = newTip;
     }
}

class Student{
    String name;
    int age;
    float percentage;
    void calPercentage(int phy, int chem, int math) {
        percentage = (phy + chem + math) / 3;
    }
}

class BankAccount{
    public String userName;
    private String password;

    //method
    public void setPassword(String password) {
        password = password;

    }
}
    