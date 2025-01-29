public class binary_dec {
    public static void binaryDec(int n) {
        int myNum =  n ;
        int dec = 0;
        int pow = 0;
        while(n > 0) {
            int lastDigit = n % 10;
            dec = dec + (int)(lastDigit * Math.pow(2, pow));
            pow++;
            n = n /10 ;
        }
        System.out.println("decimal of = " + dec + " binary of = "+ myNum);
        
    }
    public static void main(String[] args) {
        binaryDec(101);
    }
    
}
