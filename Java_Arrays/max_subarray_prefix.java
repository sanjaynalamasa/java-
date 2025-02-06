public class max_subarray_prefix {
    public static void MaxSubArray(int numbers[]) {
        int maxsum = Integer.MIN_VALUE;
        int currSum = 0;
        int prefix[] = new int[numbers.length];
        //calculate prefix sum
       prefix[0] = numbers[0];
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + numbers[i];
        }
        
        for(int i=0; i<numbers.length; i++) {
            int start = i;
            for(int j=i; j<numbers.length; j++) {
                int end = j;
                currSum = start == 0? prefix[end] : prefix[end] - prefix[start-1];
                if(maxsum < currSum) {
                    maxsum = currSum;
                }
            }
        }
            System.out.println("max sum: "+maxsum);
    }
    public static void main(String[] args) {
        // int number[] = {1,-2,6,-1,3};
        int number[] = {-2,-3,4,-1,-2,1,5,-3};
        MaxSubArray(number);

    }

}
    

