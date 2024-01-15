import java.util.*;

public class SolidRhombus {

    public static void solidRhombus(int x){
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= (x - i); j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= x; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Rows :");
        int row = sc.nextInt();

        sc.close();

        solidRhombus(row);
    }
}
