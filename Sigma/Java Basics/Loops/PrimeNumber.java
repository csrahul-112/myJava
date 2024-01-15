import java.util.Scanner;
public class PrimeNumber {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you Number : ");
        int num = sc.nextInt();

        sc.close();

        if (num == 2 || num == 3) {
            System.out.println(num + " is a Prime number.");                
        }else{        
            for(int i = 2; i <= num/2; i++ ){

                if (num % i == 0) {
                    System.out.println(num + " is Composite Number");
                    break;
                } else if(num % i != 0 && i == num / 2){
                    System.out.println(num + " is a Prime Number");
                }

            }
        }
    }
}
