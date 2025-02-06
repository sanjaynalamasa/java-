public class max_subarray_kadanes {
    public static void MaxSubArrayKadans(int number[]) {
        int currSum = 0;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++) {
            currSum += number[i];
            if(currSum < 0) {
                currSum = 0;
            // } else {
            //     if(currSum > maxsum) {
            //         maxsum = currSum;
            //     }
             }
             maxsum = Math.max(maxsum, currSum);
        }
      
        System.out.println("max Sum: "+maxsum);
    }
    public static void main(String[] args) {
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        MaxSubArrayKadans(number);
    }
    
}
