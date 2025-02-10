import java.util.HashMap;
public class syntax_HashMap{
    public static void main(String args[]) {
        HashMap <Integer,Integer> sanjay = new HashMap<>();           
        // sanjay.put(10, 20);
        // sanjay.put(100, 110);    
        // sanjay.put(200,210);
        // sanjay.put(200, 211);
        // int prev = sanjay.get(100);
        // sanjay.put(100,prev+1);
        // // sanjay.get(10);
        // System.out.println(sanjay.get(10));
        // System.out.println(sanjay.get(100));
        // System.out.println(sanjay.get(200));
        // System.out.println(sanjay.get(200));

        // System.out.println(sanjay.get(3));



        sanjay.put(3, 9);
        sanjay.put(4, 40);
        // sanjay.put(7, 2);
        int n = 7;

        if(sanjay.containsKey(n)) {
            int prev = sanjay.get(n);
            sanjay.put(n, prev+1);
        } else {
            sanjay.put(7, 1);
        }
    
        // System.out.println(sanjay.get(n));
        for(int Boom:sanjay.keySet()) {
            System.out.println(Boom+" "+sanjay.get(Boom));
        }

    }
}