import java.util.*;

public class InvertedHalfNumberPyramid {
    public static void invertedHalfNumberPyramid(int n){
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows of Pyramid :");
        int n = sc.nextInt();

        sc.close();

        invertedHalfNumberPyramid(n);


    }
}
