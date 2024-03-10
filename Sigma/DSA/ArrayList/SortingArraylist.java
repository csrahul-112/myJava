import java.util.ArrayList;
import java.util.Collections;

public class SortingArraylist {
    public static void main (String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(14);
        list.add(8);
        list.add(10);
        list.add(4);
        list.add(1);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
