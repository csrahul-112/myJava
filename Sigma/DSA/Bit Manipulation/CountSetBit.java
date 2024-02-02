import java.util.Scanner;

public class CountSetBit {
    public static int countSetBits(int num){
        int count = 0;

        while(num > 0){
                if((num & 1) == 1){
                count++;
                }
                num = num >> 1;
        }
        return count;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to count its bits :");
        int num = sc.nextInt();

        sc.close();

        System.out.println(countSetBits(num));
    }
}
