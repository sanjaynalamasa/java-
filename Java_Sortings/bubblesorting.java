public class bubblesorting {
    public static void BubbleSort(int arr[]) {
        for(int i=0; i<arr.length-1; i++) {
            int swap =0;
            if(swap == arr.length-1-i) {
                break;
            }
            for(int j=0; j<arr.length-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
        }
    }
    public static void printing(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        BubbleSort(arr);
        printing(arr);

    }
}
