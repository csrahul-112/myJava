import java.util.*;

public class CheckPalindrome {

    public static int reverseNumbber(int x){
        int lastDigit = 0;
        int revNum = 0;
        int myNum = x;
    
        while(x > 0){
            lastDigit = x % 10;
            revNum = (revNum * 10) + lastDigit;
            x /= 10;
        }
        System.out.println("The reverse of the number "+ myNum + " is " + revNum);
        return revNum;
    }

    public static void checkPalindrome(int p){
        if (reverseNumbber(p) == p) {
            System.out.println("your number is palindrome.");
        }else{
            System.out.println("your number is not palindrome.");
        }

        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int num = sc.nextInt();

        sc.close();

        checkPalindrome(num);
    }
}
