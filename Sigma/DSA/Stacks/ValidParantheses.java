import java.util.Stack;

public class ValidParantheses {
    public static boolean validParantheses(String str){
        Stack<Character> s = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                s.push(str.charAt(i));
            }else if (str.charAt(i) == ')' || str.charAt(i) == '}' || str.charAt(i) == ']') {
                if (s.isEmpty()) {
                    return false;
                }
                if ((s.peek() == '(' && str.charAt(i) == ')') 
                ||(s.peek() == '{' && str.charAt(i) == '}') 
                ||(s.peek() == '[' && str.charAt(i) == ']')) {
                    s.pop();
                }   
            }else{
                System.out.println("Invalid String");
                return false;
            }
        }
        if (s.isEmpty()) {
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        String str = new String("{[]{}()}");

        System.out.println(validParantheses(str));


    }
}
