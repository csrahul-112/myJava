import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapSack {
    public static void main(String aargs[]){
        int val[] = {60, 100, 120};
        int wt[] = {10, 20, 30};
        int W = 50;

        double ratio[][] = new double[wt.length][2];

        for(int i = 0; i < wt.length; i++){
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)wt[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalVal = 0;

        for(int i = wt.length-1; i >= 0; i--){
            int idx = (int)ratio[i][0];
            if (capacity >= wt[idx]) {
                finalVal += val[idx];
                capacity -= wt[idx];
            }else{
                finalVal += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("The Final Valuse of KnapSack is: " + finalVal);
    }
}
