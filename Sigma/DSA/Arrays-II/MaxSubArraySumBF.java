public class MaxSubArraySumBF {
    public static void maxSubArraySumBF(int arr[]){
        int end = (arr.length - 1);
        int ts = 0;
        int mSum = Integer.MIN_VALUE;

        for(int i = 0; i <= end; i++){
            for(int j = i; j <= end; j++){
                int sum = 0;
                for(int k = i; k <= j; k++){
                    sum += arr[k];  //adding elements of sub arrays
                }
                int cSum = sum; // everytime initializing cSum with sum of current subarray sum
                System.out.print(cSum + " ");
                if(cSum > mSum){// now if the current subarray sum is greater then maximum sum till now then we put cSum in mSum as new Maximum Sum
                    mSum = cSum;
                }
                ts++;
            }
            System.out.println();
        }
        System.out.println("The maximum sum out of all SubArrays of given Array is = " + mSum);
        System.out.println("Total SubArrays = " + ts);
    }

    public static void main(String args[]){
        int math[] = {-1, 22, -8, -6, 17, 2, -19};
        //int arr[] = {1, -2, 6, -1, 3};

        maxSubArraySumBF(math);
    }
}
