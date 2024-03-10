import java.util.ArrayList;

public class SwapElement {
    public static void main(String args[]){
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);

        list.set(2, 10);

        System.out.println(list);

        int temp = list.get(3);
        list.set(3, list.get(4));
        list.set(4, temp);

        System.out.println(list);
    }
}
