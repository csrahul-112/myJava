import java.util.*;

public class ReturningSubstring {

    public static String returningSubstring(String str, int si, int ei){
        String subStr = "";
        for(int i = si; i < ei; i++){
            subStr += str.charAt(i);
        }

        return subStr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = "HelloWorld";
        System.out.println("Enter the starting index of string of length " + str.length() + " to get a Substring");
        int si = sc.nextInt();
        System.out.println("Enter the ending index of string of length " + str.length() + " to get a Substring");
        int ei = sc.nextInt();

        sc.close();

        System.out.println(returningSubstring(str, si, ei));

        //Inbuild function for same or inbuild substring function
        System.out.println(str.substring(si, ei));
    }
}
