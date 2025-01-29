public class hollow_rhombus {
    public static void Rhombus_rec(int n) {
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=(n-i); j++) {
                System.out.print(" ");
            }
            //Stars- Hollow Rectangle
            for(int j=1; j<=n; j++) {
                if(i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Rhombus_rec(10);
    }
    
}
