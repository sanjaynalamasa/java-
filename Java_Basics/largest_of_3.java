import java.util.*;
public class largest_of_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if ((a >= b) && (a >= c)) {
            System.out.println("A is BIG");
        }
        else if (b >= c) {
            System.out.println("B is BIG");
        }
        else {
            System.out.println("C is big");
        }
    }
    
}
