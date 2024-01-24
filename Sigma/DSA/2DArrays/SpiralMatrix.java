public class SpiralMatrix {
    
    public static void spiralMatrix(int[][] matrix){
        int sRow = 0, sCol = 0, eRow = matrix.length-1, eCol = matrix[0].length-1;

        while(sRow <= eRow && sCol <= eCol){
            //Top line
            for(int j = sCol; j <= eCol; j++){
                System.out.print(matrix[sRow][j] + " ");
            }

            //Right line
            for(int i = sRow + 1; i <= eRow; i++){
                System.out.print(matrix[i][eCol] + " ");
            }

            //Bottom Line
            for(int j = eCol - 1; j >= sCol; j--){
                if(sRow == eRow){
                    break;
                }
                System.out.print(matrix[eRow][j] + " ");
            }

            //Left line
            for(int i = eRow - 1; i >= sRow + 1; i--){
                if(sCol == eCol){
                    break;
                }
                System.out.print(matrix[i][sCol] + " ");
            }
            

            sCol++ ; sRow++ ; eRow-- ; eCol-- ;
        }

    }

    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6 ,7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}
    
                        };

        int arr[][] = { {1,2,3}, {4, 5, 6}, {7, 8, 9}

        };

        int arr1[][] = { {1,2,3,4,5},
                         {6,7,8,9,10}

        };
        int arr2[][] = {{1,2},
                        {3,4},
                        {5,6},
                        {7,8},
                        {9,0}
                       };
        int arr3[][] = {
                        { 1, 2, 3, 4, 5, 6, 7},
                        { 8, 9,10,11,12,13,14},
                        {15,16,17,18,19,20,21},
                        {22,23,24,25,26,27,28},
                        {29,30,31,32,33,34,35},
                        {36,37,38,39,40,41,42},
                        {43,44,45,46,47,48,49}
        };



        spiralMatrix(matrix);
        System.out.println();
        spiralMatrix(arr);
        System.out.println();
        spiralMatrix(arr1);
        System.out.println();
        spiralMatrix(arr2);
        System.out.println();
        spiralMatrix(arr3);
    }
}
