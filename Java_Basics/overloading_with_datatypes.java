public class overloading_with_datatypes {
    //fun to call int sum 
    public static int sum(int a, int b) {
        return a + b;
    }
    //fun to call float sum
    public static float sum(float a, float b) {
        return a + b;
    }    
    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10.5f, 20.5f));
    }
}
