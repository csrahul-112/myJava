import java.util.*;

public class PrimeInRange {
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

    public static void primeRange(int num){
        for(int i = 2; i <= num; i++)
        if(isPrime(i) == true){
            System.out.println(i + " is a prime number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number till which you want the prime numbers : ");
        int num = sc.nextInt();

        sc.close();

        primeRange(num);
        

    }
}
