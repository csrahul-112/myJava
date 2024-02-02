import java.util.*;

public class FastExponentiation {
    public static int fastExponentiation(int num, int pow){
        int ans = 1;
        while(pow > 0){
            if((pow&1) == 1){
                ans = ans*num;
            }
            pow = pow>>1;
            num = num*num;
        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to calculate its exponential value :");
        int num = sc.nextInt();
        System.out.println("Enter the exponent of num :");
        int pow = sc.nextInt();

        sc.close();

        System.out.println(fastExponentiation(num, pow));

    }
}
