import java.util.*;
public class week {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch (week) {
            case 1: System.out.println("monday");
                    break;
            case 2: System.out.println("tuesday");
                    break;
            case 3: System.out.println("wednesday");
                    break;
            case 4: System.out.println("thusday");
                    break;
            case 5: System.out.println("Friday");
                    break;
            case 6: System.out.println("saturday");
                    break;
            case 7: System.out.println("sunday-Funday");
                    break;
            default: System.out.println("enter 1-7 numbers only...");
        }

    }
    
}
