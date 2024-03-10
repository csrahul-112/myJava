import java.util.ArrayList;

public class FindMax {
    
    public static void main (String args[]) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(3);
        list.add(4);
        int max = Integer.MIN_VALUE;

        for(int i  = list.size() - 1 ; i >= 0; i--){
            // if (max < list.get(i)) {
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));

        }
        System.out.println(max);
    }
}


