import java.util.*;
public class avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        float num3 = sc.nextFloat();
        double avg = (num1 + num2 + num3) / 3 ;
        System.out.println(avg);
    }
}