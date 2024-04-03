import java.util.*;

public class QueueUsingTwoStackRemoveN {
static class Queue{
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();


    public static boolean isEmpty(){
        return s1.isEmpty();
    }

    public static void add(int data){
        s1.push(data);
        return;
    }

    public static int remove(){
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int val = s2.pop();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return val;
    }

    public static int peek(){
        if (isEmpty()) {
            System.out.println("Empty Queue");
            return -1;
        }

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        int val = s2.peek();
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        return val;
    }

}
    public static void main(String args[]){
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        q.remove();
        System.out.println(q.remove());
    }
}
