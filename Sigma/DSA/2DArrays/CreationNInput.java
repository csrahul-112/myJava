import java.util.*;

public class CreationNInput {
    
    public static void searchInArray(int matrix[][], int key) {
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == key) {
                    System.out.println("The element is present at : " + i + " " + j);
                }
                
            }
        }
    }

    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);

        int n = matrix.length, m = matrix[1].length;

        System.out.println("Enter the element of the matrix : ");
        //input in 2D array
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();

            }
        }

        //output of 2D array
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
                
            }
            System.out.println();
        }

        System.out.print("Enter the element to look into in the array : ");
        int key = sc.nextInt();

        sc.close();
        
        searchInArray(matrix, key);
    }
}
