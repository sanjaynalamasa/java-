public class Set_ith_Bit {
    public static int SetBitith(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }
    public static void main(String[] args) {
       System.out.println(SetBitith(4, 1));
        
    }
    
}
