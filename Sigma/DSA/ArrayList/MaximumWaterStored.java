import java.util.ArrayList;

//Program to find the container which can store maximum water with given heights

public class MaximumWaterStored {
    public static int waterStored(ArrayList<Integer> height){
        int maxWater = Integer.MIN_VALUE;

        for(int i = 0; i < height.size(); i++){
            for(int j = i+1; j < height.size(); j++){
                int ht = Integer.min(height.get(i), height.get(j));
                int wt = j - i;
                int currWater = ht * wt;
                maxWater = Integer.max(maxWater, currWater);
            }
        }

        return maxWater;
    }
    public static void main(String args[]){
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.println(waterStored(height));

        
    }
}
