import java.util.*;

public class IsEven {

    public static boolean isEven(int x){
        if (x % 2 == 0) {
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number :");
        int num = sc.nextInt();

        sc.close();

        System.out.println(isEven(num));

    }
}
