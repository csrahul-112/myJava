import java.util.*;

public class InterLeaveOfQueue {
    public static void interLeaveOfQueue(Queue<Integer> q){
        int size = q.size();
        int sz;
        if (size % 2 == 0) {
            sz = size;
        }else{
            sz = size + 1;
        }

        Queue<Integer> q1 = new LinkedList<>();
        for(int i = 0; i < sz/2; i++){
            q1.add(q.remove());
        }

        while (!q1.isEmpty()) {
            q.add(q1.remove());
            if (!q1.isEmpty()) {
                q.add(q.remove());
            }
        }

    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < 11; i++){
            q.add(i+1);
        }
        System.out.println(q.size());

        System.out.println();
        int sz = q.size();

        interLeaveOfQueue(q);

        for(int i = 0; i < sz; i++){
            System.out.print(q.remove() + " ");
        }
        
    }
}
