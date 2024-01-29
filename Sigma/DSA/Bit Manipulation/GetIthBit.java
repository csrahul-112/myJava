import java.util.*;

public class GetIthBit {
    public static void getIthBit(int num, int i){
        int BitMask = 1 << i;
        if((num&(BitMask)) == 0){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which ith bit is req : ");
        int num = sc.nextInt();
        System.out.print("Enter the ith bit : ");
        int i = sc.nextInt();

        sc.close();

        getIthBit(num, i);
    }
}
