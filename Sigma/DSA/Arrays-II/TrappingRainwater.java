public class TrappingRainwater {
    public static void trappingRainwater(int arr[]){
        int n = arr.length;
        int iN = n - 1;
        //auxiliary arrya for LMB
        int[] LMB = new int[n];
        LMB[0] = arr[0];
        for(int i = 1; i < n; i++){
            LMB[i] = Math.max(LMB[i-1], arr[i]);
        }
        for(int i = 0; i < n; i++){
            System.out.print(LMB[i] + ", ");
        }
        System.out.println();

        //auxiliary array for RMB
        int[] RMB = new int[n];
        RMB[iN] = arr[iN];
        for(int i = iN - 1; i >= 0; i--){
            RMB[i] = Math.max(RMB[i+1], arr[i]);
        }
        for(int i = 0; i < n; i++){
            System.out.print(RMB[i] + ", ");
        }
        System.out.println();

        //Calculating trapped water
        int wTrapped = 0;
        for(int i = 0; i < n; i++){
            int wHeight = Math.min(LMB[i], RMB[i]);
            wTrapped= wTrapped + (wHeight - arr[i]);

        }
        System.out.println("Total water trapped = " + wTrapped);
    }

    public static void main(String args[]){
        int arr[] = {4, 2, 0, 6, 3, 2, 5};
        int Arr[] = {1, 2, 3, 4, 5, 6, 7};

        trappingRainwater(arr);
        trappingRainwater(Arr);
    }
}
