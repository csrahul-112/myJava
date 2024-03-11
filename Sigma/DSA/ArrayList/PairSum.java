import java.util.ArrayList;

public class PairSum {
    public static Boolean pairSum(ArrayList<Integer> list, int target){
        int bp = -1, n = list.size();
        for(int i = 0; i < list.size(); i++){
            if (list.get(i) > list.get(i+1)) {
                bp = i;
                break;
            }
        }

        int sp  = bp+1, ep = bp;
        while(sp != bp){
            if (list.get(sp) + list.get(ep) == target) {
                return true;
            }
            if (list.get(sp) + list.get(ep) > target) {
                ep = (ep + n - 1) % n;
            }else{
                sp = (sp + 1) % n;
            }
        }
        return false;
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(7);
        list.add(9);
        list.add(10);

        int target = 15;
        
        System.out.println(pairSum(list, target));
        
    }
}
