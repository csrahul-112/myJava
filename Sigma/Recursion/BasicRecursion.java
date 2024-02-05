public class BasicRecursion {
    public static void printDecNum(int num){
        if(num == 1){
            System.out.println(num);
            return;
        }
        System.out.print(num + " ");
        printDecNum(num-1);
    }
    public static void main(String args[]){
        printDecNum(10);
    }
}
