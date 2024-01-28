import java.util.*;

public class ShortestPath {
    public static void shortestPath(String str){
        int n = str.length(), i = 0, x = 0, y = 0;
        while(i < n){
            if(str.charAt(i) == 'N'){
                y++;
            }else if(str.charAt(i) == 'S'){
                y--;
            }else if(str.charAt(i) == 'W'){
                x--;
            }else{
                x++;
            }
            i++;
        }
        double dist = Math.sqrt((Math.pow((x-0), 2))+(Math.pow((y-0), 2)));
        System.out.println("The shortest Distange bw origin and point reached after following given path is : " + dist);

    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String for travel : ");
    String str = sc.next();

    sc.close();

    shortestPath(str);


    }
}
