import java.util.*;
public class income_tax_cal {
    public static void main(String args[]) {
        int tax;
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        if (income < 500000) {
            System.out.println("you have 0% tax:" + income);
            tax = 0;
        }
        else if ((income >= 500000) && (income < 1000000)) {
            System.out.println("you have to pay 20% tax:");
            tax = (int) (income * 0.2);
        }
        else {
            System.out.println("you have to pay 30% tax to amount of:"+ income);
            tax = (int)(income * 0.3);
        }
        System.out.println("Your income after tax is:" + (income - tax ));
        System.out.println("tax ammount is"+ tax);

    }
    
}
