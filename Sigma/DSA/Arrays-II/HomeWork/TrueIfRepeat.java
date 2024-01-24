public class TrueIfRepeat {

    public static boolean trueIfRepeat(int[] arr){
        //Solution in TC = O(n*n)
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int arr[] = {1, 2, 3, 6, 9, 1};
        int arr1[] = {1, 2, 3, 4, 5, 6, 7};
        int arr2[] = {1, 1, 1, 3, 4, 5, 3, 2, 0};

        System.out.println(trueIfRepeat (arr));
        System.out.println(trueIfRepeat(arr1));
        System.out.println(trueIfRepeat(arr2));
    }
}
