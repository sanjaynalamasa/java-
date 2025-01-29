// // public class swap {
// //     public static void main(String args[]) {
// //         int a = 5;
// //         int b = 10;
// //         int temp = a;
// //         a = b;
// //         b = temp;
// //         System.out.println(a);
// //         System.out.println(b);
// //     }
// // }




// //using functions
public class swap {
public static void swapofnumbers(int a, int b) { 
        int temp = a;
        a = b;
        b = temp;
        // System.out.println(a);
        // System.out.println(b);
}
public static void main(String args[]) {
    int a = 5;
    int b = 10;
    swapofnumbers(a,b);
    System.out.println(a); //call by value here
    System.out.println(b);
}
}







// public class swap {
//     public static int[] swap(int[] arr) {
//         int temp = arr[0];
//         arr[0] = arr[1];
//         arr[1] = temp;
//         return arr; // Return the swapped array
//     }

//     public static void main(String args[]) {
//         int[] arr = {5, 10};
//         System.out.println("Before swap: " + arr[0] + ", " + arr[1]);

//         arr = swap(arr); // Update the reference with the returned array
//         System.out.println("After swap: " + arr[0] + ", " + arr[1]);
//     }
// }
