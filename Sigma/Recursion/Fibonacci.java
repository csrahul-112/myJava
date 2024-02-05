public class Fibonacci {
    public static int nthFibonacci(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fnm1 = nthFibonacci(n-1);
        int fnm2 = nthFibonacci(n-2);
        
        int fib = fnm1 + fnm2;

        return fib;
        
    }
    public static void main(String args[]){
        int n = 6;
        System.out.println(nthFibonacci(n));
        
    }
}
