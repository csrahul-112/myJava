import java.util.*;
public class InputInJava {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);


        String name = sc.next();

        String fName = sc.nextLine();

        int number =  sc.nextInt();

        float Fnumber = sc.nextFloat();

        double Dnumber = sc.nextDouble();

        short Snumber = sc.nextShort();

        byte Bnumber = sc.nextByte();

        long Lnumber = sc.nextLong();

        sc.close();
        
        System.out.println(name);
        System.out.println(fName);
        System.out.println(number);
        System.out.println(Fnumber);
        System.out.println(Dnumber);
        System.out.println(Snumber);
        System.out.println(Bnumber);
        System.out.println(Lnumber);


    }
}
