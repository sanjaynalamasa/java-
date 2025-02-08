import java.util.*;
public class matrixarray_largest {
    public static void LarSma(int matrix [][]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(largest < matrix[i][j]) {
                   largest = matrix[i][j];
                }
            }
        }
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                if(smallest > matrix[i][j]) {
                    smallest = matrix[i][j];
                }
            }
        }
        System.out.println(largest +" "+"largestnumber");
        System.out.println(smallest +" "+"smallest number");
    }
    public static void main(String[] args) {
        int matrix[][] = new int [3][3];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<matrix.length; i++) {
            for(int j=0; j<matrix[0].length; j++) {
                matrix[i][j]=sc.nextInt();
            }
        }
        LarSma(matrix);
    }
    
}
