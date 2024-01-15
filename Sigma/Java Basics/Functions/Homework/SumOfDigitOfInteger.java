import java.util.*;

public class SumOfDigitOfInteger {

    public static int sumOfDigitOfInteger(int x){
        int sumOfDigit = 0;
        int lastDigit = 0;

        while(x > 0){
            lastDigit = x % 10;
            sumOfDigit += lastDigit;
            x /= 10;

        }

        return sumOfDigit;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer for sum of its digit : ");
        int num = sc.nextInt();

        sc.close();

        System.out.println(sumOfDigitOfInteger(num));
    }
}
