import java.util.*;

public class PowerOf2 {
    
    public static boolean checkPowerOf2(int num){
        return (num&(num-1)) == 0;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        sc.close();
        
        System.out.println(checkPowerOf2(num));
    }
}
