import java.util.*;
public class StringQuestion {
    public static int Question(String str) {
        boolean haslowerCase = false;
        int count = 0;
        
        for(int i=0; i<str.length(); i++) {
           char ch = str.charAt(i);
           if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o') {
            count++;
           }
        }
        return count;

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter An Sentence");
        String str = sc.next();
        // Question(str);
        System.out.println(Question(str));

    }
    
}
