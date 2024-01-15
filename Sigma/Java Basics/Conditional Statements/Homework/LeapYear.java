import java.util.*;

public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year you want to verify:");
        int Year = sc.nextInt();

        sc.close();

        if ((Year % 4 == 0) && (Year % 100 != 0)) {
            System.out.println(Year + " is a Leap Year");
            
        }else if ((Year % 4 == 0) && (Year % 100 == 0) && (Year % 400 == 0)){
            System.out.println(Year + " is a Leap Year");
        }else {
            System.out.println(Year + " is not a Leap Year");
        }

    }
}
