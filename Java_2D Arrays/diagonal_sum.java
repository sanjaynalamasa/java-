public class diagonal_sum {
    public static int DiaSum(int matrix[][]) {
        int sum = 0;  
 // Brute Force Approach:-
        // for(int i=0; i<matrix.length; i++) {
        //     for(int j=0; j<matrix[0].length; j++) {
        //         if(i == j) {
        //             sum += matrix[i][j];
        //         } else if(i+j == matrix.length-1) {
        //             sum += matrix[i][j];

        //         }
        //     }
        // }


      // Approach 2 :-
            for(int i=0; i<matrix.length; i++) {
                //PD
                sum += matrix[i][i];
                //SD
                if(i != matrix.length-1-i) {
                    sum += matrix[i][matrix.length-i-1];
                }
            }
        
      return sum;

    }
    
    public static void main(String[] args) {
        int matrix[][] = //{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        {{0,1,2},{3,4,5},{6,7,8}};
        // DiaSum(matrix);
        System.out.println(DiaSum(matrix));

    }
    
}
