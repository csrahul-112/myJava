public class MaxSASumKadane {

    public static void maxSASumKadane(int arr[]){
        int mSum = Integer.MIN_VALUE;
        int cSum = 0;
        int element = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){//Using mSum because it will only be negative and in Kadane its going to be zero if its not negative
            //this for loop is for checking if all the element of the array is negative if so handle that case by returning the smallest negative number or greatest integer out of all.
            if(element < arr[i]){
                element = arr[i];
            }
        }
        if(element < 0){//handeling all negative integer here
            System.out.println("The maximum sum of subarray  out of all Subarray is = " + element);
        }else{//handeling the normal cases
            for(int i = 0; i < arr.length; i++){
                cSum += arr[i];
                if(cSum < 0){
                    cSum =0;
                }
                mSum = Integer.max(cSum, mSum);
            }
            System.out.println("The maximum sum of subarray  out of all Subarray is = " + mSum);

        }


        
    }

    public static void main(String args[]){
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int arr2[] = {-2, -3, -4, -8};
        int arr3[] = {1, 2, 3, 5, 9};

        maxSASumKadane(arr2);
        maxSASumKadane(arr);
        maxSASumKadane(arr3);
    }    
}
