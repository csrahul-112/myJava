public class LargestInArray {
    public static int largestInArray(int arr[]){
        int largest = Integer.MIN_VALUE;
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
                index = i;
            }else{
                continue;
            }
        }
        System.out.println("The largest number is at index : " + index);
        
        return largest;
    }

    public static void main(String args[]){


        int arr[] = { 3, 8, 19, 1, 2, 99, 81, 7};
        
        int largest = largestInArray(arr);
        System.out.println("The largest element in the array is :" + largest);
    }    
}
