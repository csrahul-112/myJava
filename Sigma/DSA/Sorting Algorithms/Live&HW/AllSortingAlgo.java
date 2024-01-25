public class AllSortingAlgo {

    //BubbleSort
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i = n-1; i >= 0; i--){
            for(int j = i-1; j >= 0; j--){
                if(arr[j]<arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + ", ");
        }System.out.println();
    }

    //SelectionSort
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            int maxPos = i;
            for(int j = i+1; j < n; j++){
                if(arr[maxPos] < arr[j]){
                    maxPos = j;
                }
            }
            int temp = arr[maxPos];
            arr[maxPos] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    //InsertionSort
    public static void insertionSort(int[] arr){
        int n = arr.length;
        for(int i = (n-2); i >= 0; i--){
            int curr = arr[i];
            int post = i+1;
            while(post < (n-1) && arr[post] > curr){
                arr[post-1] = arr[post];
                post++;
            }
            arr[post-1] = curr;
        }

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }


    //CountingSort
    public static void countingSort(int[] arr){
        
    }

    public static void main(String args[]){
        int arr[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);

        


    }    
}
