class owner {
    //we have to write a Interface just replace class name and write Interface and Extends to Implements
    String ownerName = "Animutyam";
    int ownerAge = 20;
    int ownerNumber = 123;

    //we can write a method also
    void boom() {
        System.out.println("Boom");
    }

    //method overRiding
   
    void fun1() {
        System.out.println(2);
    }

}

class chaiPodiSuppler{
    String suppilerName;
    int supplierAge;
    int supplierHeight;

}

class ChaiShop extends owner {
    String ownerName = "Animutyam";
    int ownerAge = 20;
    int ownerNumber = 123;
    String branchName;
    int cupsSold;
    int pricePerCup;

    public ChaiShop(String bn, int cs, int ppc) {
        this.branchName = bn;
        this.cupsSold = cs;
        this.pricePerCup = ppc;
        
    }


    public void Display() {
        System.out.println("branchName "+ branchName);
        System.out.println("cupsSold "+ cupsSold);
        System.out.println("priceperCup "+ pricePerCup);
    }

    void fun() {
        System.out.println(1);
    }
    void fun(int a) {
        System.out.println(1);
    }
    void fun(int a, int b) {
        System.out.println(3);
    }
    void fun(int a, String b) {
        System.out.println(4);
    }
    void fun(String a, int b) {
        System.out.println(5);
    }  

    //method overRiding
    @Override
    void fun1() {
        System.out.println(1);
    }
}  

    //Another class XeroxShop
    class XeroxShop extends owner{
        String branchName;
        int papersSold;
        int pricePerPaper;

           //constructor of  XeroxShop
           XeroxShop(String branchName, int papersSold, int pricePerPaper) {
        this.branchName = branchName;
        this.papersSold = papersSold;
        this.pricePerPaper = pricePerPaper;
    }

    public void Display() {
        System.out.println("branchName"+ branchName);
        System.out.println("papersSold"+papersSold);
        System.out.println("priceperpapers"+ pricePerPaper);
    }
    }

    //Room class
    class Room {
        int roomNo;
        int noOfChairs;
        boolean isAcRoom;
    }
   
   

public class Oops {
    public static void main(String[] args) {
       ChaiShop branch1 = new ChaiShop("adda", 7, 5);
       branch1.Display();
       System.out.println(branch1.ownerName);
       branch1.boom();

       branch1.fun();
       branch1.fun(2);
       branch1.fun(5, 6);
       branch1.fun(9,"hello");
       branch1.fun("sanjay", 5);  

       //method overRiding
       branch1.fun1();

       //secound one 
       XeroxShop Xbranch1 = new XeroxShop("Chaitanya", 10, 5);
       Xbranch1.Display();
       System.out.println(Xbranch1.ownerName);
       Xbranch1.boom();

        
    }
    
}













