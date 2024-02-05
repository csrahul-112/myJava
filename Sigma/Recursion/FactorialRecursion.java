public class FactorialRecursion {
    public static int factorialByRecursion(int n){
        if (n == 0) {
            return 1;
        }
        int fact = n * factorialByRecursion(n-1);
        return fact;
    }
    public static void main(String args[]){
        int n = 6;
        System.out.println(factorialByRecursion(n));
    }
}
