import java.util.*;

public class PrimeOptimized {

    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }else if (n == 1){
            System.out.println("neither prime nor composite");
            return false;
        }else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0){
                    return false; 
                }
            }
            return true;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        sc.close();

        System.out.println(isPrime(num));

    }
    
}
