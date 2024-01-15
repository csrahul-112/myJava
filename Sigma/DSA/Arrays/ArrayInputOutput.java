import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String args[]){
        int marks[] = new int[50];

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks : ");
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        sc.close();

        System.out.println("index 0 : " + marks[0] + ", index 1 : " + marks[1] + ", index 2 : " + marks[2]);

        //Updateing Value

        marks[0] = 99;
        
        System.out.println("Updated marks at index 0 : " + marks[0]);

        //Updating again but diff

        marks[1] = marks[1] + 1;

        System.out.println("index 0 : " + marks[0] + ", Updated index 1 : " + marks[1] + ", Updated index 2 : " + marks[2]);

        //Calculating Percentage 

        float percentage = (marks[0] + marks[1] + marks[2])/3;
        System.out.println("Percentage : " + percentage + "% ");

        System.out.println("Length of the Array marks : " + marks.length);

        


    }
}
