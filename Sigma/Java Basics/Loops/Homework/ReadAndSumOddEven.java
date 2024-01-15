import java.util.*;

public class ReadAndSumOddEven {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int sumOdd = 0;
        int sumEven = 0;

        for(int i = 1; i < 5; i++){
            int num = sc.nextInt();

            if (num % 2 == 0) {
                sumEven += num;
            }
            if (num % 2 != 0) {
                sumOdd += num;
            }
        }

        sc.close();

        System.out.println("Sum of Even inputs is : " + sumEven);
        System.out.println("Sum of Odd inputs is : " + sumOdd);
    }
}
