import java.util.*;
public class avg {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        int avg = ((marks[0] + marks[1] + marks[2])/3);
        System.out.println("the percentage is: "+avg+"%");
        
    }
    
}
