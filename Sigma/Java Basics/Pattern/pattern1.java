//star pattern triangle
import java.util.*;

public class pattern1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numOfLines = sc.nextInt();

        sc.close();

        for(int i = 0; i < numOfLines; i++){
            for(int j = 0; j <= i ; j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
