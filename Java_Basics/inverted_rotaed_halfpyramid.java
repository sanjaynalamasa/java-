import java.util.*;
public class inverted_rotaed_halfpyramid {
    public static void halfPyramid(int n) {
        for(int i = 1; i <= n; i++) {
            //spaces
            for(int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            }
            //stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();
        halfPyramid(n);
    }
}
