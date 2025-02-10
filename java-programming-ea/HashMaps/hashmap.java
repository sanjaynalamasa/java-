import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        HashMap <Integer, Integer> num=new HashMap<>();
        int arr[] = {1,5,9,5,2,0,5};
        for(int i=0; i<arr.length; i++) {
            int val = arr[i];
            if(num.containsKey(val)) {
                int currVal = num.get(val);
                num.put(val, currVal+1);
            } else {
                num.put(val, 1);
            }
        }
        for(int Boom:num.keySet()) {
            int Boomval = num.get(Boom);
            System.out.println(Boom+" "+Boomval);
        }

    }
    
}
