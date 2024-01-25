public class BuySellStocks {

    public static int buySellStocks(int[] arr){
        int maxProfit = 0;
        int buyingPrice = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++){
            if(buyingPrice < arr[i]){
                int profit = arr[i] - buyingPrice;
                maxProfit = profit < maxProfit ? maxProfit : profit;
            }else{
                buyingPrice = arr[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]) {
        int prices[] = {7, 1, 5, 3, 6, 4};

        System.out.println("The maximum profit is : " + buySellStocks(prices));
    }
}
