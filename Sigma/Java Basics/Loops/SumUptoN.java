import java.util.*;



public class SumUptoN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the value of n:");
        int n = sc.nextInt();

        sc.close();

        int sum = 0;

        for(int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    
    }

    
}
