import java.util.ArrayList;

public class WaterStored2Pointer {

    public static int waterStored2Pointer (ArrayList<Integer> height){
        int maxWater = Integer.MIN_VALUE;
        int sp = 0, ep = (height.size() - 1);
        while(sp < ep){
            int ht = Integer.min(height.get(sp), height.get(ep));
            int wt = ep - sp;
            int currWater = wt * ht;

            maxWater = Integer.max(maxWater, currWater);

            if(height.get(sp) < height.get(ep)){
                sp++;
            }else{
                ep--;
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

        System.out.println(waterStored2Pointer(height));
    }
}
