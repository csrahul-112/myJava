import java.util.Stack;

public class PubshAtBottom {

    public static void pushAtBottom(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int val = s.peek();
        s.pop();
        pushAtBottom(s, data);
        s.push(val);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s.isEmpty());
        System.out.println(s);

        pushAtBottom(s,5);

        System.out.println(s);

        
    }
}
