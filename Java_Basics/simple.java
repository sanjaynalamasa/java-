import java.util.*;
public class simple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        double cost = pencil + pen + eraser ;
        double tax = 0.18f * cost;
        System.out.println("After tax you will get"+ tax);
        
    }
    
}
