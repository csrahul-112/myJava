import java.util.*;

import javax.sound.sampled.SourceDataLine;

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

    sc.nextLine();

    System.out.println("Enter a line as a string : ");
    String str5 = sc.next();

    sc.close();

    System.out.println(str + "\n" + str2 + "\n" + str3 + "\n" + str4 + "\n" + str5);
        
    }
    
}
