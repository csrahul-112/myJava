import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelection {
    public static void main(String args[]){
        int[] start = {1,3,0,5,8,5};
        int[] end = {2,4,6,7,9,9};

        //if unsorted array is given 
        int[][] activities = new int[end.length][3];
        for(int i = 0; i < end.length; i++){
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));
        for(int i = 0; i < end.length; i++){
            System.out.print(activities[i][2] + " ");
        }
        System.out.println();

        //lambda functions
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));



        //when array is sorted on basis on end time
        int maxAct = 0;
        ArrayList<Integer> A = new ArrayList<>();

        //1st activity - add it always since it's ending before any other and this will let us do more tasks
        maxAct = 1;
        A.add(activities[0][0]);
        int lastEnd = activities[0][2];

        //checking remaining activites
        for(int i = 1; i < end.length; i++){
            if (activities[i][1] >= lastEnd) {
                maxAct++;
                A.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("Maximum Activity are: "+maxAct);
        for(int i = 0; i < A.size(); i++){
            System.out.print("A" + A.get(i) + ", ");
        }
        System.out.println();
    }
}
