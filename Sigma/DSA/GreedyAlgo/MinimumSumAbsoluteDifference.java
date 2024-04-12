import java.util.Arrays;

public class MinimumSumAbsoluteDifference {
    public static void main(String args[]){
        int[] A = {4, 1, 8, 7};
        int[] B = {2, 3, 6, 5};

        Arrays.sort(A);
        Arrays.sort(B);

        int maxAbsDiff = 0;

        for(int i = 0; i < A.length; i++){
            maxAbsDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("Maximum Absolute Difference is: " + maxAbsDiff);
    }
}
