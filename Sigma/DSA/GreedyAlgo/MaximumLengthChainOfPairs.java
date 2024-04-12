import java.util.Arrays;
import java.util.Comparator;

public class MaximumLengthChainOfPairs {
    public static void main(String ars[]){
        int[][] pairs = {{5, 24}, {39,60}, {5,28}, {27, 40}, {50,90}};

        Arrays.sort(pairs, Comparator.comparingDouble(o -> o[1]));
        for(int i = 0; i < pairs.length; i++){
            System.out.println(pairs[i][1]);
        }
        

        int noOfPairs = 1;
        int lastSecNo = pairs[0][1];

        for(int i = 1; i < pairs.length; i++){
            if (pairs[i][0] >= lastSecNo) {
                noOfPairs++;
                lastSecNo = pairs[i][1];
            }
        }

        System.out.println("The Max Length of Chain of givrn list of pairs is " + noOfPairs);
    }
}
