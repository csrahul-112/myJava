import java.util.*;

public class CreatingString {
    public static void main(String args[]) {
    //
    //Strings Are IMMUTABLE 
    //

    Scanner sc = new Scanner(System.in);

    String str = "This is a string";

    String str2 = "This is " + "also a string";

    String str3 = str + " " + str2;

    System.out.println("Enter a word : ");
    String str4 = sc.next();

    sc.nextLine();//we need to use it because while using sc.nextLine after sc.next, as it takes word and then a next line as input which get stored in sc.nextInt's var so to able to take input we are using this sc.nextLine();

    System.out.println("Enter a line as a string : ");
    String str5 = sc.next();

    sc.close();

    System.out.println(str + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n" + str5);

    
    //String length func
    System.out.println(str.length());
        
    }
    
}
