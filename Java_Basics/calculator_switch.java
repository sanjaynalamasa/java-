import java.util.*;
public class calculator_switch {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter Secound number");
        int num2 = sc.nextInt();
        System.out.println("enter the Operator");
        char operator = sc.next().charAt(0);
        switch (operator)  {
            case '+' : System.out.println((num1 + num2) +" the addition of : "+num1 + "and "+num2);
                      break;
            case '-' : System.out.println((num1 - num2) + " the sub of :"+num1 +"and " +num2);
                      break;
            case '*' : System.out.println((num1 * num2) +" the mul of : "+num1 + "and "+num2);
                      break;
            case '/' : System.out.println((num1 / num2) +" the div of : "+num1 + "and "+num2);
                      break;
            case '%' : System.out.println((num1 % num2) +" the mod of : "+num1 + "and "+num2);
                      break;
            default : System.out.println("enter valid operator please");



        }



    }
    
}
