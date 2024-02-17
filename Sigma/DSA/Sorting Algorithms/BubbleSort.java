public class BubbleSort {

    public static int[] bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < (arr.length - 1); i++){
            boolean swap = false;
            for(int j = 0; j < (n - 1); j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }

            }
            n--;//because larger elements reached their pos and need not to be sorted
            if(swap == false){
                break;
            }
    
        }
        return arr;
    }

    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};
        int arr1[] = {2, 1, 3, 4, 5};

        bubbleSort(arr);
        bubbleSort(arr1);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
