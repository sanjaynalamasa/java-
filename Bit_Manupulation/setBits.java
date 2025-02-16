public class setBits {
    public static int SetBitANumber(int n) {
        int count = 0;
        while(n >0) {
            if((n & 1) != 0) { //check the LSB
                count++;
            }
            n = n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(SetBitANumber(10));
        
    }
    
}
