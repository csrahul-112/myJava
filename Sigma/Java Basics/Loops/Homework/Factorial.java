import java.util.*;
public class Factorial {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for Factorial : ");
        int num = sc.nextInt();

        sc.close();

        int fact = 1;

        for(int i = 1; i <=num; i++){
            fact = fact * i;

        }
        System.out.println("The factorial of given no is : " + fact);
    }
}
