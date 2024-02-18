public class ChangingArray {
    public static void changingarray(int[] arr, int i, int val){
        //BaseCase
        if(i >= arr.length){
            return;
        }
        //Recursion
        arr[i] = val;
        changingarray(arr, i+1, val+1);
        arr[i] = arr[i] - 2;

    }
    public static void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String args[]){
        int arr[] = new int[5];
        changingarray(arr, 0, 1);
        printArr(arr);

    }    
}
