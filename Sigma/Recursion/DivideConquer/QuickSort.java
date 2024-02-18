public class QuickSort {
    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        return;
    }
    public static void quickSort(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        //kaam
        int pIdx = partition(arr, si, ei);
        quickSort(arr, si, pIdx-1);
        quickSort(arr, pIdx+1, ei);
    }

    public static int partition(int[] arr, int si, int ei){
        int pivotIdx = ei;//choosen index for pivot element
        int i = si-1;//it will track our array for correct pos'n of element smaller then that at pivot element

        //Swapping and putting element at thier correct side respective of pivot element
        for(int j = si; j < arr.length; j++){
            if(arr[j] < arr[pivotIdx]){
                int temp = arr[j];
                arr[j] = arr[++i];
                arr[i] = temp;
            }
        }

        //now we will put pivot element at its correct position in array 
        int temp = arr[pivotIdx];
        arr[pivotIdx] = arr[++i];
        arr[i] = temp;
        return i; 



    }
    public static void main(String args[]){
        int arr[] = {2, 3, 1, 5, 4, 6, 7, 2};
        quickSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
