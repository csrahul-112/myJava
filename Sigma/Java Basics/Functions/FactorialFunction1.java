import java.util.Scanner;

public class FactorialFunction1 {
    public static int factorialCalculation(int n){
        int f = 1;
        for(int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for Factorial : ");
        int num = sc.nextInt();

        sc.close();

        int fact = factorialCalculation(num);
        System.out.println(fact);
    }
}
