public class FindOccurencces {
    public static void findOccurencces(int[] arr,int key, int i){
        if(i == arr.length){
            return;
        }
        if(arr[i] == key){
            System.out.print(i + " ");
        }
        findOccurencces(arr, key, i+1);
    }
    public static void main(String args[]){
        int[] arr = {2, 4, 1, 5, 6, 9, 4};
        findOccurencces(arr, 4, 0);
    }
}
