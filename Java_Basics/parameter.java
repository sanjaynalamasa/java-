import java.util.*;
public class parameter {
    public static void CalculateSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("the sum is "+ sum );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        CalculateSum(a, b);
    }
}