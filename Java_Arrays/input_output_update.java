import java.util.*;
public class input_output_update {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[100];
        marks[0] = sc.nextInt(); //phy
        marks[1] = sc.nextInt(); //chem
        marks[2] = sc.nextInt(); //maths

        System.out.println("phy marks: "+ marks[0]);
        System.out.println("chem marks: "+ marks[1]);
        System.out.println("math marks: "+ marks[2]);
        //update
        // marks[2] = 100;
        marks[2] = marks[2] +1 ;
        System.out.println("maths Marks Update: "+ marks[2]);
        
    }
}