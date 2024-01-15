import java.util.*;

public class HollowRectangle {
    public static void holllowRectangle(int row, int col){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= col; j++){
                if(i == 1 || i == row || j == 1 || j == col){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }

        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of Rows :");
        int row = sc.nextInt();
        System.out.println("Enter the no. of Coloumns :");
        int col = sc.nextInt();

        sc.close();

        holllowRectangle(row, col);


        
    }
}
