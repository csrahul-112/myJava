public class BuySellStockBT {

    public static void buySellStockBT(int[] arr ){
        int maxProfit = 0;
        int bPrice = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(bPrice < arr[i]){//Profit
                int profit = arr[i] - bPrice;//Today's Profit
                maxProfit = profit > maxProfit ? profit : maxProfit;//Global Profit
            }else{
                bPrice = arr[i];
            }
        }
        System.out.println("The Maximum Profit is = " + maxProfit);
    }

    public static void main(String args[]){
        int StockPrices[] = {7, 1, 5, 3, 6, 4};

        buySellStockBT(StockPrices);

    }
}
