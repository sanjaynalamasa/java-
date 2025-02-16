public class clear_last_i_bit {
    public static int ClearithBit(int n, int i) {
        int bitMask = ((~0)<<i);
        return n & bitMask;
    }
    public static void main(String[] args) {
        System.out.println(ClearithBit(15, 2));
        
    }
    
}
