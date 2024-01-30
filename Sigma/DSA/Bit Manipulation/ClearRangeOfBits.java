import java.util.*;

public class ClearRangeOfBits {
    public static int clearLastBits(int num, int i){
        int BitMask = (~0) << i;
        return num & BitMask; 
    }
    public static int clearInitialBits(int num, int i){
        int BitMask = (1<<i)-1;
        return num & BitMask;
    }
    public static int clearRangeOfBits(int num1, int num2){
        return num1 | num2;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to operate on :");
        int num = sc.nextInt();
        System.out.println("Enter the starting of Range that is i :");
        int i = sc.nextInt();
        System.out.println("Enter the end of the range that is j :");
        int j = sc.nextInt();

        sc.close();

        System.out.println(clearInitialBits(num, j));
        System.out.println(clearLastBits(num, i));
        System.out.println(clearRangeOfBits(clearInitialBits(num, j), clearLastBits(num, i)));
    }
}
