import java.util.*;

public class AreaOfCircle {
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();

        sc.close();

        double area = 3.14*radius*radius;

        System.out.println(area);


    }
}
