public class Clear_Bit {
    public static int Update_ith_bit(int n, int i, int newBit) {
         n = ClearBit(n, i);
         int bitMask = newBit<<i;
         return n | bitMask;
    }
    public static int ClearBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }
       public static void main(String[] args) {
        // System.out.println(ClearBit(10, 1));
       System.out.println(Update_ith_bit(10, 2, 1));
        
    }
    
}
