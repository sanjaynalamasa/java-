public class day4 {
    public static void Day4(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        Day4(5);
        
    }
}