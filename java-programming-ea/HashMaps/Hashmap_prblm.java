import java.util.HashMap;
public class Hashmap_prblm {
    public static void main(String[] args) {
        HashMap <String, Integer> repeat = new HashMap<>();
        String[] arr = {"Hello", "bolo", "Hello" , "tata"};
        for(int i=0; i<arr.length; i++) {
            String val = arr[i];
            // if(repeat.containsKey(val)) {
            //     int currVal = repeat.get(val);
            //     repeat.put(val, currVal+1);
            // } else {
            //     repeat.put(val, 1);
            // }
            repeat.put(val, repeat.getOrDefault(val,0)+1);
        }
        for(String print:repeat.keySet()) {
            int Boomval = repeat.get(print);
            System.out.println(print+" "+ Boomval);

        }


        
    }
    
}
