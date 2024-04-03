import java.util.Stack;

public class NextGreater {

    public static int[] nextGreater(int[] arr){
        int[] nextGreaterArray = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length - 1; i >= 0; i--){
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            if (s.isEmpty()) {
                nextGreaterArray[i] = -1;
            }else{
                nextGreaterArray[i] = arr[s.peek()];
            }
            s.push(i);    //pushing i because its better to track by index
        }

        return nextGreaterArray;
    }
    public static void main(String args[]){
        int arr[] = {6,8,0,1,3};

        int nextGreat[] =  nextGreater(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(nextGreat[i] + " ");
        }



    }
}
