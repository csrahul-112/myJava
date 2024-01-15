import java.util.*;

public class ReverseTheNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        sc.close();

        int temp = 0;

        while(true){
            if(num > 0){
                int lastDigit = num % 10;
                num /= 10;
                temp = (temp*10) + lastDigit;
            }
            if(num == 0){
                break;
            }
        }
        num = temp;
        System.out.println("Reversed number:\n" + num);
    }
}
