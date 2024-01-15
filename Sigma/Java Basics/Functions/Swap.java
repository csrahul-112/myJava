import java.util.*;

public class Swap {

    public static void swap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        int b = sc.nextInt();

        sc.close();
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a is : " + a);
        System.out.println("b is : " + b);
        return;
    }

    public static void swap(int num1, int num2){
        int  temp;

        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("a is : " + num1);
        System.out.println("b is : " + num2);
        return;        
    }


    public static void main(String args []){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a : ");
       int a = sc.nextInt();
       System.out.println("Enter b : ");
       int b = sc.nextInt();

       sc.close();
       
       swap(a, b);
       swap();



    }    
}
