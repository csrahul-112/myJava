import java.util.*;


public class ClearRangeOfBits {
    public static int clearLastBits(int num, int j){
        int BitMask = ((~0) << (j+1));
        return BitMask; 
    }
    public static int clearInitialBits(int num, int i){
        int BitMask = (1<<i)-1;
        return BitMask;
    }
    public static int clearRangeOfBits(int num, int num1, int num2){
        return num & (num1 | num2);
    }

    //Shradhadi's code
    public static int ClearRangeOfBitsSD(int num, int i, int j){
        int a = ((~0) << (j+1));
        int b = ((1<<i) - 1);
        int BitMask = a|b;

        return num & BitMask;
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

        System.out.println(clearRangeOfBits(num, clearInitialBits(num, i), clearLastBits(num, j)));
        System.out.println(ClearRangeOfBitsSD(num, i, j));
    }
}
