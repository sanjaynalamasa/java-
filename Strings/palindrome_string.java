public class palindrome_string {
    public static boolean Palindrom(String str) {
        int n = str.length();
        for(int i=0; i<str.length()/2; i++) {
            if(str.charAt(i)  != str.charAt(n-1-i)) {
            //    System.out.println("Not A Palindrome");
                return false;
            }
        }
        // System.out.println("A Palindrome");
        return true;
    }
   
    public static void main(String[] args) {
        String str = "madam";
       System.out.println(Palindrom(str));
    }
}
