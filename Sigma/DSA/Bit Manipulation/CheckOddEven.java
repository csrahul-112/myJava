import java.util.Scanner;

public class CheckOddEven {
    public static void OddOrEven(int num){
        if((num&1) == 0){
            System.out.println("Number is even.");
        }else{
            System.out.println("Number is odd.");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check : ");
        int num = sc.nextInt();

        sc.close();

        // int checker = (num&1);

        // if (checker == 1){
        //     System.out.println("Number is odd.");
        // }else{
        //     System.out.println("The number is even.");
        // }
        OddOrEven(num);
    }
}
