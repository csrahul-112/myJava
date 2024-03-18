import java.util.Stack;

public class ReverseStackRecursion {

    public static void reverseStackRecusrsion(Stack<Integer> s){
        if (s.isEmpty()) {
            return;
        }
        
        int val = s.pop();
        reverseStackRecusrsion(s);
        s.push(val);
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
