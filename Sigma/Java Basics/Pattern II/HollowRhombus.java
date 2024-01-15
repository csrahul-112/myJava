import java.util.*;

public class HollowRhombus {
    public static void hollowRhombus(int n){
        for(int i = 1; i <= n; i++){
            //spaces
            for(int j = 1; j <= (n - i); j++){
            System.out.print("  ");
            }
            //Stars on boundary of rhombus which is nothing but the hollow rectangle after spaces
            for(int j = 1; j <= n; j++){
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows :");
        int row = sc.nextInt();

        sc.close();

        hollowRhombus(row);

    }
}
