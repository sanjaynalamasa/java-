public class tapping_rainwater {
    public static int TappingRainWater(int height[]) {
        //leftmaxsub array
        int n = height.length;
        int LeftMaxsubarray[] = new int[n];
        LeftMaxsubarray[0]=height[0];
        for(int i=1; i<n; i++) {
            LeftMaxsubarray[i] = Math.max(height[i], LeftMaxsubarray[i-1]);
        }

        //rightmax array
        int RightMaxSubarray[] = new int[n];
        RightMaxSubarray[n-1]=height[n-1];
        for(int i=n-2; i>=0; i--) {
            RightMaxSubarray[i] = Math.max(height[i], RightMaxSubarray[i+1]);
        }

        int tappedwater = 0;
        for(int i=0; i<n; i++) {
            int waterlevel = Math.min(RightMaxSubarray[i], LeftMaxsubarray[i]);
            tappedwater += waterlevel - height[i];
        }
        // System.out.println(tappedwater);
        return tappedwater;
        

    }
    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(TappingRainWater(height));
        // TappingRainWater(height);
        
    }
    
}
