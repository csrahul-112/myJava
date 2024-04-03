import java.util.*;
import java.util.LinkedList;

public class QueueReversal {
    public static void queueReversal(Queue<Integer> q){
        Stack<Integer> s = new Stack<>();
        while (!q.isEmpty()) {
            s.push(q.remove());
        }
        while (!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void main(String args[]){
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < 5; i++){
            q.add(i+1);
        }
        queueReversal(q);

        int size = q.size();
        for(int i = 0; i < size; i++){
            System.out.print(q.remove()+ " ");
        }


    }
}
