public class ArraySwap {

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

        arraySwap(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
