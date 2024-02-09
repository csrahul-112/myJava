public class SumOfRow {
    public static int sumOfNthRow(int arr[][], int row){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(i == row){//because i is constant for every row
                    sum += arr[i][j];
                }
            }
        }

        return sum;
    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3},
                       {7,8,9},
                       {1,5,9}};
        System.out.println(sumOfNthRow(arr, 1));
    }
}
