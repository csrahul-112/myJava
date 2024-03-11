import java.util.ArrayList;

public class PairSum1 {

    public static Boolean sumExistBF(ArrayList<Integer> num, int target){
        for(int i = 0; i < num.size(); i++){
            for(int j = i + 1; j < num.size(); j++){
                if (num.get(i) + num.get(j) == target) {
                    return true;
                }
            }
        }

        return false;
    }

    public static Boolean sumExist(ArrayList<Integer> num, int target){
        int sum = 0, sp = 0, ep = num.size() - 1; 
        while(sp < ep){
            sum = num.get(sp) + num.get(ep);
            if (sum == target) {
                return true;
            }
            if (sum > target) {
                ep--;
            }else{
                sp++;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(2);
        num.add(4);
        num.add(5);
        num.add(7);

        int target = 12;

        System.out.println(sumExistBF(num, target));

    }
}
