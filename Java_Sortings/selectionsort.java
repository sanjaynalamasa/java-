public class selectionsort {
    public static void Selection(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos] > arr[j]) {    
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i]=temp;
        }
    }
    public static void printing(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
       Selection(arr);
       printing(arr);
    
    }
}
