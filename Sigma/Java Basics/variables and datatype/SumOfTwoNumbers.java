import java.util.*;
public class SumOfTwoNumbers {
    public static void main(String[] args){
            int num1, num2, sum = 0;
            Scanner sc = new Scanner(System.in);

            num1 = sc.nextInt();

            num2 = sc.nextInt();

            sc.close();

            sum = num1 + num2;

            System.out.println(sum);
    }
}
