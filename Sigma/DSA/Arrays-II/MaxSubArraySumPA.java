public class MaxSubArraySumPA {

    public static void maxSubArraySumPA(int arr[]){
        int mSum = Integer.MIN_VALUE;
        int pFixArr[] = new int[arr.length];
        

        //Prefix array calc
        pFixArr[0] = arr[0];
        for(int i = 1; i < pFixArr.length; i++){
            pFixArr[i] = pFixArr[i-1] + arr[i];
        }

        //
        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){

                int cSum =  i == 0 ? pFixArr[j] : pFixArr[j] - pFixArr[i-1];
                
                if(cSum > mSum){
                    mSum = cSum;
                }
            }
        }
        System.out.println(mSum);
    }

    public static void main(String args[]){
        int arr[] = {1, -2, 6, -1, 3};

        maxSubArraySumPA(arr);
    }
}
