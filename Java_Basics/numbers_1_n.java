import java.util.*;
public class numbers_1_n {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int exit = sc.nextInt();
        while(n <= exit) {
            System.out.print(n+ " ");
            
            n++;
        }
        System.out.println();
        System.out.println("numbers printed till 1 - "+(n-1));
        
    }
    
}
