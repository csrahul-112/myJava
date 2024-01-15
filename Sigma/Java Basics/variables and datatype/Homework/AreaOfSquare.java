import java.util.*;

public class AreaOfSquare {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the Square:");
        double side = sc.nextDouble();

        sc.close();

        double Area = side * side;

        System.out.println("The Area of the Square:\n" + Area);

    }
    
}
