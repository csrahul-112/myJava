public class BubbleSort {
    public static void swap(int n, int m){
        int temp = n;
        n = m;
        m = temp;
    }

    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        int swap = 0;
        for(int i = 0; i < (arr.length - 1); i++){
            for(int j = 0; j < (n - 1); j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }

            }
            n--;//because larger elements reached their pos and need not to be sorted
            if(swap == 0){
                System.out.println("Already sorted");
                break;
            }
    
        }
        return arr;
    }

    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};
        int arr1[] = {1, 2, 3, 4, 5};

        bubbleSort(arr);
        bubbleSort(arr1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
