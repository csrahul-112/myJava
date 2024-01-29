import java .util.*;

public class SetIthBit {

    public static int setIthBit(int num, int i){
        int BitMask = 1<<i;

        num = (num) | BitMask;

        return num;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the the number in which you want to set the ith bit :");
        int num = sc.nextInt();
        System.out.println("Enter the ith pos :");
        int i = sc.nextInt();

        sc.close();

        System.out.println(setIthBit(num, i));
    }
}
