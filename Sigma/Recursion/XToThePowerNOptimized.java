public class XToThePowerNOptimized {
    public static int xToThePowerNOptimized(int x, int n){
        if(n == 0){
            return 1;
        }
        int halfPowerToN = xToThePowerNOptimized(x, n/2) * xToThePowerNOptimized(x, n/2);

        if(n % 2 != 0){
            halfPowerToN = x * halfPowerToN;
        }

        return halfPowerToN;
    }
    public static void main(String[] args){
        int x = 2;
        System.out.println(xToThePowerNOptimized(x, 10));
    }
}
