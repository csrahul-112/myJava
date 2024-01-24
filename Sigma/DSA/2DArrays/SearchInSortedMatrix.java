import java.util.*;

public class SearchInSortedMatrix {

    public static void searchInSortedMatrix(int[][] arr, int key){
        int i = 0, n = arr.length;
        while(true){
            if( n > 0 && i < arr.length-1  && key < arr[i][n-1]){
                n--;
            }else if( n > 0 && i < arr.length - 1 && key > arr[i][n-1]){
                i++;
            }else if(n > 0 && i < arr.length - 1 && key == arr[i][n-1]){
                System.out.print("the element is present at ("+i+","+(n-1)+")");
                break;
            }else{
                System.out.println("The enetred element is not in the matrix :(");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{10, 20, 30 ,40},
                       {15, 25, 35, 45},
                       {27, 29, 37, 48},
                       {32, 33, 42, 50}
                      };
        System.out.println("Enter the number you wanna look for in the array : ");
        int key = sc.nextInt();

        sc.close();


        searchInSortedMatrix(arr, key);
    }
    
}
