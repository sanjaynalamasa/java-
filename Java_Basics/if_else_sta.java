import java.util.*;
public class if_else_sta {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("vote, drive");
        }
        if (age >= 13 && age < 18) {
            System.out.println("Teen Age Still Exist");
        }
        else {
            System.out.println("not Adult");
        }
        
    }
}