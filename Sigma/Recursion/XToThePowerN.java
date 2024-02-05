public class XToThePowerN {
    public static int xToThePowerN(int x, int n){
        if(n == 1){
            return x;
        }
        return x * xToThePowerN(x, n-1);
    }
    public static void main(String args[]) {
        int x = 2;
        System.out.println(xToThePowerN(x, 10));
    }
}
