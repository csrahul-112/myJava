import java.util.*;

public class DiamondPattern {

    public static void diamondPattern(int n){
        int m = n;
        //printing Upper side of Diaond
        int oddRowUp = 0;        
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - i); j++){
                System.out.print("  ");
            }
            
            for(int j = 1; j <= (i+oddRowUp) ; j++){
                System.out.print("* ");
                
            }
            oddRowUp +=1;
            System.out.println();
        }
        
        //Printing Lower side of Diamond
        int oddRowDown = m-1;
        for(int i = m; i >= 1; i--){
            for(int j = 1; j <= (m - i); j++){
                System.out.print("  ");
            }
            
            for(int j = 1; j <= (i+oddRowDown) ; j++){
                System.out.print("* ");
                
            }
            oddRowDown -=1;
            System.out.println();
        }
        return;
    }

    public static void ShraddhaDiDiamond(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= (n - i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= ((2 * i) - 1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n; i >= 1; i--){
            for(int j = 1; j <= (n - i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= ((2 * i) - 1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows in upper half of diamond :");
        int upperRow = sc.nextInt();

        sc.close();

        diamondPattern(upperRow);
        System.out.println("\n\n");
        ShraddhaDiDiamond(upperRow);
    }
}
