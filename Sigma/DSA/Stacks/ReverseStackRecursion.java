import java.util.Stack;

public class ReverseStackRecursion {

    public static void pushAtBottom(Stack<Integer> s, int data){
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int val = s.pop();
        pushAtBottom(s, data);
        s.push(val);
    }

    public static void reverseStackRecusrsion(Stack<Integer> s){
        
        if (s.isEmpty()) {
            return;
        }
        
        int top = s.pop();
        reverseStackRecusrsion(s);
        pushAtBottom(s, top);
        
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);

        reverseStackRecusrsion(s);

        System.out.println("Reverset stack ->"+s);
    }
}
