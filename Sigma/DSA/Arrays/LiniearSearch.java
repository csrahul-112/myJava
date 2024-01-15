import java.util.*;

public class LiniearSearch {
    
    public static void linearSearch(int marks[], int key){
        for(int i = 0; i < marks.length; i++){
            if(marks[i] == key){
                System.out.println("The index of the key is : " + i);
            }else if (marks[i] != key && i == (marks.length - 1)){
                System.out.println(-1);
            }
        }
        System.out.println();

        return;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks to get it's index in array : ");
        int key = sc.nextInt();

        sc.close();

        int marks[] = {95, 91, 94, 88, 89, 98};
        linearSearch(marks, key);

        System.out.println("if -1 is printed then the entered marks is not present in arrya.");




    }
}
