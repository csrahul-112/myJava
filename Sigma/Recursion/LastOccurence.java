public class LastOccurence {
    public static int lastOccurence(int[] arr, int key, int i){
        if(i == -1){
            return -1;
        }
        if(arr[i] == key){
            return i;
        }
        return lastOccurence(arr, key, i-1);
        

    }
    public static void main (String args[]){
        int arr[] = {10, 4, 5, 2, 8, 9, 2, 1};
        int key = 2;
        int n = arr.length;

        System.out.println(lastOccurence(arr, key, n-1));
    }
}
