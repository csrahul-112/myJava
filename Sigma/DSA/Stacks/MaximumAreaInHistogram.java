import java.util.Stack;

public class MaximumAreaInHistogram {
    public static int[] nextSmallerRight(int[] arr){
        Stack<Integer> s = new Stack<>();
        int nextSmallerR[] = new int[arr.length];

        for(int i = arr.length - 1; i >= 0; i--){
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (!s.isEmpty()) {
                nextSmallerR[i] = s.peek();
            }else{
                nextSmallerR[i] = arr.length;
            }
            s.push(i);
        }

        return nextSmallerR;
    }
    public static int[] nextSmallerLeft(int[] arr){
        int[] nextSmallerL = new int[arr.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < arr.length; i++){
            while (!s.isEmpty() && arr[i] <= arr[s.peek()]) {
                s.pop();
            }
            if (!s.isEmpty()) {
                nextSmallerL[i] = s.peek();
            }else{
                nextSmallerL[i] = -1;
            }
            s.push(i);
        }
        return nextSmallerL;

    }
    public static int maximumAreaInHistogram(int[] arr){
        int[] nextSmallerR = nextSmallerRight(arr);
        int[] nextSmallerL = nextSmallerLeft(arr);
        int maxArea = 0;
        for(int i = 0; i < arr.length; i++){
            int height = arr[i];
            int width = nextSmallerR[i] - nextSmallerL[i] - 1;
            int currArea = height * width;
            maxArea = Math.max(maxArea, currArea);
        }
        return maxArea;
    }
    public static void main(String args[]){
        int arr[] = {2, 1, 5, 6, 2, 3};
        System.out.println("MAximum area of the histogram is :\n" +maximumAreaInHistogram(arr));

    }
}
