public class PowerOf2 {
    public static boolean PowerOf2OrNot(int n) {
        return (n&(n-1)) == 0;
    }
    public static void main(String[] args) {
        System.out.println(PowerOf2OrNot(16));
        
    }
    
}
