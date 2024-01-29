import java.util.*;

public class ClearIthBit {
    public static int clearIthBit(int num, int i){
        int BitMask = ~(1<<i);

        return((num)&(BitMask));
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to clear ith bit :");
        int num = sc.nextInt();
        System.out.println("Enter the ith value :");
        int i = sc.nextInt();

        sc.close();

        System.out.println(clearIthBit(num, i));

        
    }
}
