import java.util.Stack;

public class ReverseString {
    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while (idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder revString = new StringBuilder("");
        while (!s.isEmpty()) {
            revString.append(s.pop());
        }
        return revString.toString();
    }
    public static void main(String args[]){
        String str = "hahaahabklelvishyadav";

        System.out.println(reverseString(str));
    }
}
