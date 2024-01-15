import java.util.*;

public class Number1ToN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();

        sc.close();


        int j = 1;
        while(j <= n){
            System.out.print(j + " ");
            j++;
        }

        System.out.println();

        //For Loop

        for(int i = 1; i <= n; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        //Do While Loop
        int k = 1;
        do{
            System.out.print(k + " ");
            k++;
        }while(k <= n);

        System.out.println();  
    }
}
