import java.util.*;

public class ContinueLetterPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numOfLines = sc.nextInt();

        sc.close();

        int letter = 'A';
        char letterC = 'A';

        for(int i = 1; i <= numOfLines; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(letter + " ");
                letter++;
            }
            System.out.println();
        }
        for(int i = 1; i <= numOfLines; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(letterC + " ");
                letterC++;
            }
            System.out.println();
        }
        for(int i = 1; i <= numOfLines; i++){
            char letterA = 'A';
            for(int j = 1; j<=i; j++){
                System.out.print(letterA + " ");
                letterA++;
            }
            System.out.println();
        }
    }
}
