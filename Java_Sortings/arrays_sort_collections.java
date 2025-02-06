import java.util.Arrays;
import java.util.*;

public class arrays_sort_collections {
    public static void Print(Integer arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        Integer arr[] = {5,3,6,5,6,2,8,3};
        Arrays.sort(arr, Collections.reverseOrder());
        Print(arr);
    }
    
}
