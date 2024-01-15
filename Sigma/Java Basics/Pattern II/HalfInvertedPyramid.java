import java.util.*;

public class HalfInvertedPyramid {
    public static void halfInvertedPyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }      
        
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of Pyramid :");
        int n = sc.nextInt();


        sc.close();

        halfInvertedPyramid(n);

    }
}
