public class arrays_assignment_2 {
    public static int Ass(int nums[]) {
        int target = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == target) {
                return target;
            } 
    
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[] = {4,5,6,7,0,1,2};
        Ass(nums);
    }
    
}
