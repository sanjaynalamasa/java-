public class arrays_assignment_prblm_1 {
    public static void Ass(int nums[]) {
        for(int i=1; i<nums.length; i++) {
           int temp = nums[0];
           if(nums[i] == temp) {
            System.out.println("true");
            temp++;
           }
           else {
            System.out.println("false");
           }
        }


    }
    public static void main(String[] args) {
        int nums[] = {1,5,3,0};
        Ass(nums);
    }
    
}
