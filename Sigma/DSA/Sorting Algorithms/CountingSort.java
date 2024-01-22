public class CountingSort {

    public static void countingSort(int[] arr){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        int[] count = new int[largest + 1];
        for (int i = 0; i < arr.length; i++){
            count[arr[i]]++;
        }
        for(int i = 0; i < count.length; i++){
            System.out.print(count[i] + " ");
        }
        System.out.println();

        int j = 0;
        for(int i = 0; i < count.length; i++){
            while (count[i] > 0) {
                arr[j] = i;
                count[i]--;
                j++;
            } 
                
        }

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){
        int arr[] = {0, 1, 4, 5, 3, 7, 8, 2, 1, 3, 7, 4, 3, 1, 6};

        countingSort(arr);
    }
    
}
