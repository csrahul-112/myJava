import java.util.*;

public class BinaryToDecimal {

    public static void binaryToDecimal(int x){
        int convertedDecimal = 0;
        int pw = 0;
        while(x > 0){
            int lastDigit = x % 10;
            convertedDecimal = convertedDecimal + (lastDigit * (int)Math.pow(2,  pw));
            x /= 10;
            pw++;

        }
        System.out.println(convertedDecimal);
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary number to convert in Decimal : ");
        int binNum = sc.nextInt();

        sc.close();

        binaryToDecimal(binNum);

    }
}
