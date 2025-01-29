public class floyds_pattern {
    public static void floyd(int n) {
        int counter = 1;
        //outer loop 
        for(int i=1; i<=n; i++) {
            //inner loop- how many times counter will be printed.
            for(int j=1; j<=i; j++) {
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyd(10);
    }
    
}