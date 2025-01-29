public class rec_pattern {
    public static void Recpattern(int n) {
        //techboy deepak resolution
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Recpattern(5);
        
    }
}