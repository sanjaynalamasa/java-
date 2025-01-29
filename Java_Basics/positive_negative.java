import java.util.*;
public class positive_negative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String check = (num >= 0)? "positive" : "negative";
        System.out.println(check+ " your number : "+ num);
    }
    
}
