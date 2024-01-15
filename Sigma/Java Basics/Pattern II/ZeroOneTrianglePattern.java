import java.util.*;

public class ZeroOneTrianglePattern {
    
    public static void zeroOneTrianglePattern(int x){
        
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= i; j++){
                if (i % 2 != 0 && j % 2 != 0) {
                    System.out.print("1 ");
                }else if (i % 2 == 0 && j % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        
        return;

    }
//Shradha di's Logic
    public static void zeroOneTrianglePattern1(int x){

        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= i; j++){
                if((i + j) % 2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        return;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows :");
        int row = sc.nextInt();

        sc.close();

        zeroOneTrianglePattern(row);
        zeroOneTrianglePattern1(row);

    }
}
