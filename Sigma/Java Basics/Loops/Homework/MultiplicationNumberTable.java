import java.util.*;

public class MultiplicationNumberTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number you want the Table of : ");
        int num = sc.nextInt();

        sc.close();

        for(int i = 1; i <= 10; i++){
            System.out.println(num * i);
        }
    }
}
