import java.util.*;
public class ternary_operator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int check = (a > b)? a : b;
        System.out.println(check+":is big");
    }
    
}
