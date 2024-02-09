public class numberOfSeven {
    public static int numberOFSeven(int arr[][]){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                if (arr[i][j] == 7) {
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String args[]){
        int arr[][] = {{1,2,3},
                       {3,7,4},
                       {7,7,1},
                       {7,7,7}

                      };
        System.out.println(numberOFSeven(arr));
    }
}
