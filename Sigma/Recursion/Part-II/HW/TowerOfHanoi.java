public class TowerOfHanoi {
    public static void towerOfHanoi(int n, int A, int C, int B){
        if(n == 0){
            return;
        }
        towerOfHanoi(n-1, A, B, C);
        System.out.println("moving disk " + n + " from " + A + " to " + C);

        towerOfHanoi(n-1, B, C, A);
    }
    public static void main(String args[]){
        towerOfHanoi(3, 1, 3, 2);
    }
}
