import java.util.*;
public class parameter1 {
    public static int CalculateSum(int num1, int num2) { //parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum =  CalculateSum(a, b); //arguments or actual parameters
        System.out.println("the Sum is "+ sum);
    }
    
}
