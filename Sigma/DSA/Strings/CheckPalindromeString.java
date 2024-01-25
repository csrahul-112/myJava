import java.util.*;

public class CheckPalindromeString {
    public static boolean checkPalindromeString(String str){
        
        for(int i = 0; i < (str.length()/2); i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false;
            }
        }

        return true;
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String you want to check : ");

        String str = sc.next();

        System.out.println(checkPalindromeString(str));
    }
}
