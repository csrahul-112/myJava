import java.util.*;

public class DecToBin {

    public static void decToBin(int x){
        int binNum = 0;
        int num = 1;
        while(x > 0){
            int rem = x % 2;
            binNum = binNum + (rem * num);
            x = x / 2;
            num = num * 10;
        }
        System.out.println("The Given Decimal in Binary is : " + binNum);

    }
    public static void main(String args[]){
        System.out.print("Enter The Decimal Nummber to convert in Binary : ");
        Scanner sc = new Scanner(System.in);
        int decNum = sc.nextInt();

        sc.close();

        decToBin(decNum);
    }
}
