public class ClimbingStairs {

    public static int facto(int n){
        int fact = 1;
        if(n == 0 ){
            return fact;
        }else{
            for(int i = 1; i <= n; i++){
                fact = fact * i;
            }
        }

        return fact;
    }

    public static int climbingStairs(int n){
        int ways = 0;

        return ways;
    }

    public static void main(String[] args){
        System.out.println(facto(5));

    }
}
