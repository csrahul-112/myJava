import java.util.*;

public class ClearLastBits {

    public static int clearLastBits(int num, int i){
        int BitMask = ((-1)<<i);//~0 == -1 we could've taken any one of these

        return num&BitMask;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to clear its last bits :");
        int num = sc.nextInt();
        System.out.println("Enter the number of bits to clear from last :");
        int i = sc.nextInt();

        sc.close();

        System.out.println(clearLastBits(num, i));
    }
}
