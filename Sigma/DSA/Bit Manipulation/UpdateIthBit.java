import java.util.*;

public class UpdateIthBit {
    public static int clearIthBit(int num, int i){
        int BitMask = ~(1<<i);

        return num&BitMask;
    }

    public static int setIthBit(int num, int i){
        int BitMask = 1<<i;

        return num|BitMask;
    }

    public static int updateIthBit(int num, int i, int UpdatedBit){
        // if(UpdatedBit == 0){
        // return clearIthBit(num, i);
        // }
        // return setIthBit(num, i);

        //There is one more logic for this function.
        num = clearIthBit(num, i);
        int BitMask = UpdatedBit<<i;
        return num | BitMask;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to update its ith bit :");
        int num = sc.nextInt();
        System.out.println("Enter updated value of ith bit :");
        int UpdatedBit = sc.nextInt();
        System.out.println("Emter the index i :");
        int i = sc.nextInt();

        sc.close();

        // if(UpdatedBit == 0){
        //     System.out.println(clearIthBit(num, i));
        // }else{
        //     System.out.println(setIthBit(num, i));
        // }

        System.out.println(updateIthBit(num, i, UpdatedBit));
    }
}
