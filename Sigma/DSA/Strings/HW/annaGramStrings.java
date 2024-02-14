import java.util.Arrays;
import java.util.Scanner;

public class annaGramStrings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first String");
        String str1 = sc.nextLine();
        System.out.println("Enter your another String");
        String str2 = sc.nextLine();

        sc.close();

        //Converting to lowercase so that we don't have to explicitly check for copital letters
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();



        if(str1.length() == str2.length()){
            //Converting String Array To Char Array
            char arr1[] = str1.toCharArray();
            char arr2[] = str2.toCharArray();

            //Sorting the char array and then will compare them both
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean isAnagram = Arrays.equals(arr1, arr2);

            if (isAnagram) {
                System.out.println(str1 + " " + str2 + " are Anagram of each other");
            }else{
                System.out.println("Not Anagrams");
            }

        }else{
            System.out.println("Not annagrams");
        }
    }
}
