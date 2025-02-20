class ChaiShop{
     String branchName = "Boooom";
    class Thikka{
        String evariki = "Nake";

    }

}

public class InnerClass {
   
    public static void main(String[] args) {
        ChaiShop branch1 = new ChaiShop();
        System.out.println(branch1.branchName);

        ChaiShop.Thikka th = branch1.new Thikka();
        System.out.println(th.evariki);
        
    }
    
}
