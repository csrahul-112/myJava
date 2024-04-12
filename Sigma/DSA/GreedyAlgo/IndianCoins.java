import java.util.*;

public class IndianCoins {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
    Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000}; //this should be of Integer class to use reverseOrder to reverse sort the array
    System.out.println("Enter the amount to Pay: ");
    int amountToPay = sc.nextInt();

    Arrays.sort(coins, Comparator.reverseOrder());

    ArrayList<Integer> ans = new ArrayList<>();

    int notes = 0;
    for(int i = 0; i < coins.length; i++){
        if (coins[i] <= amountToPay) {
            while(coins[i] <= amountToPay){
                notes++;
                ans.add(coins[i]);
                amountToPay -= coins[i];
            }
        }
    }

    System.out.println("Total Notes paid : " + notes);
    System.out.println(ans);
    }

}
