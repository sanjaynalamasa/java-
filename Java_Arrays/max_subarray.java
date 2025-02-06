public class max_subarray {
    public static void MaxSumArray(int number[]) {
        int maxSum = Integer.MIN_VALUE;
        int ms;
        int currSum = 0;
        for(int i=0; i<number.length; i++) {
            int start = i;
            for(int j=i; j<number.length; j++) {
                int end = j;
                currSum=0;
                for(int k=start; k<=end; k++) {
                    currSum += number[k];
                }
                System.out.println(currSum);
                if(currSum > maxSum) {
                    maxSum = currSum;
                }
                // System.out.println();
            }
            // System.out.println();
        }
        System.out.println("Max Sum: "+maxSum);

    }
    public static void main(String[] args) {
        int number[] = {1,-2,6,-1,3};
        MaxSumArray(number);
    }
    
}
