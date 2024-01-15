import java.util.*;

public class FloyedTriangle {
    
    public static void floyedTriangle(int x){
        int count = 1;
        for(int i =1; i <= x; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows of the Triangle :");
        int row = sc.nextInt();

        sc.close();

        floyedTriangle(row);
    }
}
