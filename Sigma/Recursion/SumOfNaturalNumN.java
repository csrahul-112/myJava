public class SumOfNaturalNumN {
    public static int printSumTillN(int n){
        if (n == 0) {
            return 0;
        }
        int sum = n + printSumTillN(n-1);
        return sum;
    }
    public static void main(String[] args){
        int n = 5;
        System.out.println(printSumTillN(n));
    }
}
