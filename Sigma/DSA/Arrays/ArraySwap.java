public class ArraySwap {
    public static void arraySwap1(int arr[]){
        int si = 0;
        int ei = arr.length-1;

        while(si <= ei){
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }

    public static void arraySwap(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
             
        }
    }

    public static void main(String args[]){
        int arr[] = {0, 1, 2, 3, 4, 5, 6, 7};

        arraySwap1(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
