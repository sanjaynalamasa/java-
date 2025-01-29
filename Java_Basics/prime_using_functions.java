public class prime_using_functions {
    public static boolean isPrime(int n) {
        //corner cases
        //2
        if(n == 2) {
            return true;
        }

     



        // boolean isPrime = true;
        for(int i = 2; i <= n-1; i++) {
            if(n % i == 0) {
                return false;



                // isPrime = false;
                // break;
            }
        }
        // return isPrime;

        return true;
    }

    // printing prime numbers
    public static void primeInRange(int n) {
        for(int i = 2; i<=n; i++) {
            if(isPrime(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }


    
    public static void main(String[] args) {
        boolean a = isPrime(7);
        System.out.println(a);
        primeInRange(50);
    }
    
}
