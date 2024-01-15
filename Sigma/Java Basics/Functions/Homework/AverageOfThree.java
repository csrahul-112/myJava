import java.util.*;

public class AverageOfThree {

    public static float averageOfThree(int x, int y, int z){
        float avg = (x + y + z) / 3;
        System.out.println(avg);
        return avg;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the Second number : ");
        int b = sc.nextInt();
        System.out.print("Enter the Third number : ");
        int c = sc.nextInt();

        sc.close();

        averageOfThree(a, b, c);
        System.out.println(averageOfThree(a, b, c));

    }
}
