import java.util.*;

public class PrintReverse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to reverse:");
        int num = sc.nextInt();

        sc.close();
        while(true){
            if(num>0){
                int lastDigit = num % 10;
                num /= 10;
                System.out.print(lastDigit);

            }
            if(num == 0){
                break;
            }
        }
        System.out.println();
    }
}
