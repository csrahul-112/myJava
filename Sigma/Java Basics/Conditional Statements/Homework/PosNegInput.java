import java.util.*;
public class PosNegInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Number = sc.nextInt();

        sc.close();

        if(Number > 0){
            System.out.println("positive");

        }
        else if( Number < 0){
            System.out.println("Ngative");
        }
        else{
            System.out.println("invalid input" );
        }
    }
}