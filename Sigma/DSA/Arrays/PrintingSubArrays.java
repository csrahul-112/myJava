public class PrintingSubArrays{

    public static void printingSubArrays(int arr[]){
        //int start = 0;
        int end = (arr.length - 1);
        int ts = 0;
        for(int i = 0; i <= end; i++){
            //System.out.print("{" + arr[i] + " }");
            for(int j = i; j <= end; j++){
                System.out.print("{");
                for(int k = i; k <= j; k++){
                    if(k != j){
                        System.out.print(arr[k] + ", ");
                    }else
                    System.out.print(" " + arr[k] + " ");
                }
                System.out.print("}; ");
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total SubArrays = " + ts);
    }

    public static void printingSAandSum(int arr[]){
        int end = (arr.length - 1);
        int ts = 0;
        for(int i = 0; i <= end; i++){
            //System.out.print("{" + arr[i] + " }");
            int sum = 0;
            for(int j = i; j <= end; j++){
                System.out.print("{");
                for(int k = i; k <= j; k++){
                    if(k != j){
                        System.out.print(arr[k] + ", ");
                    }else{
                    System.out.print(" " + arr[k] + " ");
                    }
                    sum += arr[k];
                }
                System.out.print("}; ");
                ts++;
                System.out.println("the sum of this Subarray is = " + sum);
            }
            System.out.println();
        }
        
        System.out.println("Total SubArrays = " + ts);
    }

    public static void main(String args[]){
        int arr[] = {2, 4, 6, 8, 10};

        printingSubArrays(arr);
        printingSAandSum(arr);
    }
}