public class overloading_with_paras {
    // //fun to calculate sum of 2 num
    // public static int sum(int a, int b) {
    //     return a + b;
    // }


    // //fun to calculate sum of 3 num
    // public static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }


    //fun to cal sum of two numbers using int return
    public static int sum(int a, int b){
        return a + b;
    }

    //fun to cal sum of two numbers using float return  
    public static float sum(float a, float b) {  // dont use the int int 
        return a + b;
        
    }



    public static void main(String args[]) {
        System.out.println(sum(10, 20));
        // System.out.println(sum(10, 20, 30));

    }
    
}
