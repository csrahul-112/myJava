public class DiagonalSum {

    public static int diagonalSumBF(int[][] arr){
        int n = arr.length, sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    sum += arr[i][j];
                }else if(i + j == n - 1){
                    sum += arr[i][j];
                }
            }
        }

        return sum;
    }

    public static int diagonalSumOptimized(int[][] arr){
        int n = arr.length, sum = 0;

        for(int i = 0; i < n; i++){
            //PD
            sum += arr[i][i];

            //SD & if for the condition where n is odd and centre element is repeated
            if(i != n - i - 1){
                sum += arr[i][n-i-1];
            }
            
        }
        
        
        
        
        return sum;

    }
    
    public static void main (String[] args) {
        int arr[][] = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}
                       };
        
        System.out.println(diagonalSumBF(arr));
        System.out.println(diagonalSumOptimized(arr));

        

    }
}
