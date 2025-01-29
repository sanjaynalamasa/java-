public class zerosmoves {
    public static void ZeroMove(int nums[]) {
        int nonZeroindex = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[nonZeroindex] = nums[i];
                nonZeroindex++;
            }
        }
        for(int i=nonZeroindex; i<nums.length; i++) {
            nums[i] =0;
        }
        // for(int i=0; i<nums.length; i++) {
        //     System.out.print(nums[i]);
        // }
    }
    public static void main(String[] args) {
        int nums[] = {1,2,0,9,0,5,0,6};
        ZeroMove(nums);
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]);
        }
      
      
        
    }
    
}
