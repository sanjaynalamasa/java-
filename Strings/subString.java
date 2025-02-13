public class subString {
    public static String subString(String str, int si, int ei) {
        String subS = "";
        for(int i=si; i<ei; i++) {
            subS += str.charAt(i); 
        }
        return subS;
//this totally we written but we have a function in java

    }
    public static void main(String[] args) {
        String str = "helloworld";
        //function in java has build
        System.out.println(str.substring(0,5));



        // System.out.println(subString(str, 0, 9));
      
        
    }
    
}
