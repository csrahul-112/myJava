public class TransposeOfMatrix {
    public static void transposeOfMatrix(int arr[][]){
        int arrT[][] = new int[(arr[0].length)][arr.length];
        for(int i = 0 ; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arrT[j][i] = arr[i][j]; 
            }
        }
        for(int i = 0 ; i < arrT.length; i++){
            for(int j = 0; j < arrT[0].length; j++){
                System.out.print(arrT[i][j] + " ");
            }
            System.out.println();
        }
        return;
        
    }
    public static void main(String args[]){
        int arr[][] = {{2, 3, 7},
                       {5, 6, 7}
                      };
        transposeOfMatrix(arr);
        // System.out.println(arr[0].length);
        System.out.println(arr.length);


    }
}
