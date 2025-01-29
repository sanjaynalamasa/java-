import java.util.Scanner;
public class input {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a string");
    String input = sc.next();
    System.out.println(input);
    input = sc.nextLine();
    System.out.println(input);
    System.out.println("enter a number");
    int number = sc.nextInt();
    System.out.println(number);
    System.out.println("enter a float decimal number");
    float price = sc.nextFloat();
    System.out.println(price);
    System.out.println("enter a boolean value here");
    boolean val = sc.nextBoolean();
    System.out.println(val);
    System.out.println("enter Short number below 128");
    short num = sc.nextShort();
    System.out.println(num);
    System.out.println("enter a long number");
    long numb = sc.nextLong();
    System.out.println(numb);
    }
}
