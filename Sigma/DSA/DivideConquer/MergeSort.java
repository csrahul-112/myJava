public class MergeSort {
    public static void printArr(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        return;
    }
    public static void mergeSort(int[] arr, int si, int ei){
        
        //BaseCase
        if(si == ei){
            return;
        }

        int mid = si + ((ei - si) / 2);
        //kaam
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }
    public static void merge(int[] arr, int si, int mid, int ei){
        int i = si;
        int j = mid+1;
        int k = 0;

        int temp[] = new int [ei - si + 1];

        //merging the already sorted parts of array from samllest to greatest parts
        while(i <= mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k++] = arr[i++];
            }else{
                temp[k++] = arr[j++];
            }
        }

        //if elements left on any side because other side's condition met
        //left side
        while (i <= mid) {
           temp[k++] = arr[i++]; 
        }

        //right side
        while(j <= ei){
            temp[k++] = arr[j++];
        }

        //now copying the temp array to og array
        for(i = si, k = 0; k < temp.length; i++, k++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args){
        int[] arr = {7, 2, 3, 1};
        mergeSort(arr, 0, arr.length-1);

        printArr(arr);
    }
}
