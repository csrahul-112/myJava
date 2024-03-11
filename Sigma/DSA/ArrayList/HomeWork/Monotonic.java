import java.util.*;

public class Monotonic {
    public static Boolean isMonotonic(ArrayList<Integer> list){
        boolean isIncreasing = true;
        for(int i = 0; i < list.size()-1; i++){
            if (list.get(i) > list.get(i+1)) {
                isIncreasing = false;
                break;
            }
        }

        if (isIncreasing == false) {
            for(int i = 0; i < list.size()-1; i++){
                if (list.get(i) < list.get(i+1)) {
                    return false;
                }
            }
        }

        return true;

        
    }
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        System.out.println(isMonotonic(list));
    }
}
