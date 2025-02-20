class ChaiShop {
    String branchName;
    int cupsSold;
    int pricePerCup;
    
    public ChaiShop(String branchName, int cs, int ppc) {
        // System.out.println("Constructor here");
        // System.out.println(bn +" "+cs+ " "+ppc);
        // branchName = bn;
        // cupsSold = cs;
        // pricePerCup = ppc;
        
        this.branchName = branchName;
        this.cupsSold = cs;
        this.pricePerCup = ppc;
        
        
        // System.out.println(this.branchName);
    }
    
     public void display() {
        System.out.println(this.branchName);
         System.out.println(cupsSold);
          System.out.println(pricePerCup);
    }
    
    public void classfun(String s) {
        System.out.println("Class lopala fun "+ s);
    }
    
    public void revenue() {
        System.out.println("revenue "+ cupsSold * pricePerCup);
    }
}

class Main {
    // public static void fun() {
    //     System.out.println("Iam In function");
    // }
    
   
    
    
    public static void main(String[] args) {
        // fun();
        // classfun();
        
        
        
        ChaiShop branch1 = new ChaiShop("Adda", 5, 7);
        branch1.display();
         branch1.revenue();
        ChaiShop branch2 = new ChaiShop("boom", 8, 0);
        branch2.display();
        
        
        
        // branch1.branchName = "Bahubali Adda";
        // branch1.cupsSold = 5;
        // System.out.println(branch1.branchName);
        // System.out.println(branch1.cupsSold);
        // System.out.println(branch1.pricePerCup);
        
        //we can write like this also
        // String sboom = "boom";
        // branch1.classfun("boom");
        // branch1.classfun(sboom);
        
        
        // ChaiShop branch2 = new ChaiShop();
        // branch2.branchName = "jalsoKottu";
        // branch2.cupsSold = 10;
        // System.out.println(branch2.branchName);
        // System.out.println(branch2.cupsSold);
    }
}