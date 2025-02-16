public class even_odd_Binary {
    public static void OddorEven(int n) {
        int bitMask = 1;
        if( (n & bitMask) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
       
        OddorEven(10);
        OddorEven(5);
        OddorEven(9);
       
    }
    
}
