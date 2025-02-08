public class arrays_assignment_prblm_1 {
    public static boolean Ass(int nums[]) {
        //Approach 2 :-
       for(int i=0; i<nums.length-1; i++) {
        int temp = nums[i];
        if(nums[i] == temp) {
            return true;
        }
        temp++;

   //approach 1 :- Brute Force

        // for(int j=i+1; j<nums.length; j++) {
        //     if(nums[i] == nums[j]) {
        //         return true;
        //     }

        // }
     }
     return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,5,1,0};
        Ass(nums);
    }
    
}
