import java.util.Stack;

public class StockSpanProblem {

    public static void stockSpanProblem(int[] stock, int[] span){
        Stack<Integer> idx = new Stack<>();
        span[0] = 1;
        idx.push(0);

        for(int i = 1; i < stock.length; i++){
            int currPrice = stock[i];
            while (!idx.isEmpty() && currPrice >= stock[idx.peek()]) {
                idx.pop();
            }
            if (idx.isEmpty()) {
                span[i] = i+1;
            }else{
                int prevHigh = idx.peek();
                span[i] = i - prevHigh;
            }
            idx.push(i);
        }
    }
    public static void main(String args[]){
        int[] stock= {100, 80, 60, 70, 85, 100};
        int[] span = new int[stock.length];

        stockSpanProblem(stock, span);

        for(int i = 0; i < span.length; i++){
            System.out.print(span[i] + ", ");
        }
    }
}
