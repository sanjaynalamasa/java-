import java.util.*;
public class sum_of_natural_numbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int sum = 0;
        int val = 1;
        while(val <= input) {
            // sum = sum + val;
            sum += val;
            val++;
        }
        System.out.println(sum);

    }
    
}
