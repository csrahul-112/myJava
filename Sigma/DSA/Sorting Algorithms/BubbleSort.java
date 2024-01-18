public class BubbleSort {
    public static void swap(int n, int m){
        int temp = n;
        n = m;
        m = temp;
    }

    public static int[] bubbleSort(int[] arr){
        int sortedArr[] = new int[arr.length];

        for(int i = 0; i < (arr.length - 1); i++){
            for(int j = 0; j < (arr.length - 1 - i); j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
    
        }
        return sortedArr;
    }

    public static void main(String args[]){
        int arr[] = {5, 4, 1, 3, 2};

        bubbleSort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
