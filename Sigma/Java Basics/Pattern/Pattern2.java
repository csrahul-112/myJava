//star pattern inverted triangle
import java.util.Scanner;

public class Pattern2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numOfLines = sc.nextInt();

        sc.close();

        int st = numOfLines;
        for(int i = 0; i < numOfLines; i++){
            for(int j = st; j > 0; j--){
                System.out.print("* ");
                
            }
            st--;
            System.out.println();
        }
          
        for(int i = 1; i <= numOfLines; i++){
            for(int j = 1; j <= numOfLines - i +1; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        } 

        for(int i = 0; i < numOfLines; i++){
            for(int j = 0; j < numOfLines - i; j++ ){
                System.out.print("* ");
            }
            System.out.println();
        } 




            
    }
}


