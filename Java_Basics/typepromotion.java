public class typepromotion {
    public static void main(String[] args) {
        // 1. byte, short, char convert to int automatically
        // char a = 'a';
        // char b = 'b';
        // System.out.println(b-a);

        char a = 'a';
        char b = 'b';
        System.out.println((int) a );
        System.out.println((int) b);
        System.out.println(b-a);
        //2. long, float, double concerts which is big ones only data type convert
        int c = 10;
        float d = 20.6f;
        long e = 4566;
        double f = 56.366;
        double sum = c + d + e + f;
        System.out.println(sum);
        //note :
        // byte x = 5;   // prints error because of 
        // x = x * 10;  // its x * 10 is an treat a expression so btye so int cannot to byte 
        // System.out.println(x);

        byte x = 5;
        x = (byte) (x *  10);
        System.out.println(x);



    }
    
}
