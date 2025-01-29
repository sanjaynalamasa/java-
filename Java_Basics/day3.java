public class day3 {
    public static void day(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=(n-i+1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        day(5);
        
    }
    
}
