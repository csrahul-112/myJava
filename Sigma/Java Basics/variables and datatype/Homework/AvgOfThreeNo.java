import java.util.*;

public class AvgOfThreeNo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();

        sc.close();
        
        int Average = (a+b+c)/3;

        System.out.println("Average of the given numbers:\n" + Average);

    }
}
