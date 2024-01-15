import java.util.*;

public class ButterflyPattern {
    public static void butterflyPattern(int x){
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2 * (x - i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }

        for(int i = x; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= 2 * (x - i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        int row = sc.nextInt();

        sc.close();

        butterflyPattern(row);
    }
}
