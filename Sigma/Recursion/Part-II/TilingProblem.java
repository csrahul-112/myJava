public class TilingProblem {
    public static int tilingProblem(int n){
        //BaseCase
        if(n==0 || n ==1){
            return 1;
        }
        //kaam & inner call
        //vertical choice is tilingproblem(n-1) & horizontal is tilingProblem(n-2)
        return tilingProblem(n-1) + tilingProblem(n-2);
    }
    public static void main(String args[]){
        int n = 4;
        System.out.println(tilingProblem(n));
    }
}
