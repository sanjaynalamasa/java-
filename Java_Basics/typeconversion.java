import java.util.*;
public class typeconversion {
    public static void main(String[] args) {
        //type conversion in java
        Scanner sc = new Scanner(System.in);
        //int number = sc.nextFloat(); this cannot convert because of compatible and destination is small than soure so.
        float number = sc.nextInt(); // it will possible to type conversion because of compatible and distination is bigger than source.
        System.out.println(number);
        
    }
    
}
