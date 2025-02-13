public class equals_in_Strings {
    public static void main(String args[]) {
        String s1 = "sanjay";
        String s2 = "sanjay";
        String s3 = new String("sanjay");
        if(s1 == s2) {
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings Not Equal");
        }

        if(s1== s3) {  //to overcome this problem we write
            System.out.println("Strings are Equal");
        } else {
            System.out.println("Strings are not Equal");
        }

        //this the solution
        if(s1.equals(s3)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are Not equal");
        }



    }
    
}
