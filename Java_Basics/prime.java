import java.util.*;
public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        if(n == 2) {
            System.out.println("prime");
        } else {
            boolean isPrime = true;
            for(int i = 2; i<= n-1; i++) {
                if ( n % i == 0) {  // n is multiple of i ( i is not eqal to 1 and n )
                    isPrime = false;
                }
            }
            if(isPrime == true) {
                System.out.println("its a prime number ");
            } else {
                System.out.println("its a not a Prime number");
            }

        }
       
    }
}