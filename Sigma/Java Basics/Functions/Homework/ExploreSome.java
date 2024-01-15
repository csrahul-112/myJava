//import java.math.*;
//import java.lang.Math;

public class ExploreSome {
    public static double avg(int a, int b, int c, int d){
        int avg = (a + b + c + d) / 4;
        return avg;
    }
    public static void main(String args[]){
        int x = 4200;
        double a = 43.19802;
        System.out.println(Math.abs(x));
        System.out.println(Math.abs(a));//
        System.out.println(Math.max(x, a));
        System.out.println(Math.sqrt(2300.41));
        System.out.println(Math.min(x, a));
        System.out.println(Math.pow(12, 5));
        System.out.println(avg(5, 15, 100, 12));
        //avg is not defined
    }
}
