import java.util.*;

public class SumOFTwonum {
    public static void sumOfTwoNumber(int num1, int num2){// parameters or formal parameters
        int sum = num1 + num2;
        System.out.println("sum is : " + sum);
        return;
    }

    public static void sumCalculateWithInput(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        int sum = a + b;
        System.out.println("sum is : " + sum);
    }

    public static void sumCalculateWithOtherFunction(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();
        
        sumOfTwoNumber(a, b); //arguments or actual parameters
    }

    public static int sumCalculate(int num1, int num2){ // parameters or formal parameters
        int sum = num1 + num2;
        System.out.println("Sum is : " + sum);
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        sumOfTwoNumber(a, b); //arguments or actual parameters
        sumCalculateWithInput();
        sumCalculateWithOtherFunction();
        sumCalculate(a, b); //arguments or actual parameters

    }
}
