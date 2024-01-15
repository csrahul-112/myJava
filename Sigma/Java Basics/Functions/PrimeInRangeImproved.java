import java.util.*;

public class PrimeInRangeImproved {
    public static boolean isPrime(int n){
        if(n == 2){
            return true;
        }else if (n == 1 || n == 0){
            System.out.println(n +  " is neither prime nor composite");
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

    public static void primeInRange(int x, int y){
        for(int i = x; i <= y; i++){
            if (isPrime(i) == true) {
                System.out.println(i + " is a prime number");
            }else{
                continue;
            }

        }
        return;

    }

    public static void main(String args[]){
        System.out.println("Program to Find Prime number in some range provided : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting of Range : ");
        int startNum = sc.nextInt();
        System.out.print("Enter the Ending of Range : ");
        int endNum = sc.nextInt();

        sc.close();

        primeInRange(startNum, endNum);
    }
}
